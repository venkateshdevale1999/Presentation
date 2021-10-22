package th_b84.SpringTrainJDBC;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class BookDAO1  implements CRUDOperations{
       private JdbcTemplate jdbcTemplate;
	
	public BookDAO1(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	@Override
	public void insert(Book book) {
		
		if (null != book) {

         // Prepared statement in JDBC : insert statement below 			
			jdbcTemplate.update(
					"insert into trains values(?,?,?,?,?)",
					new Object[] {book.getTrain_no(),book.getTrain_name(),book.getSource_name(),
							book.getdestination(),book.getTicket_price()});
		
	}
		
	}
	
	
public List<Book> selectAll(){
		
		return	jdbcTemplate.query("select * from trains", new RowMapper<Book>() {
            // ResultSet rs = st.executeQuery("Select * from employee");
			
			
			@Override
			public Book mapRow(ResultSet resultSet, int arg1) throws SQLException {
				Book book = new Book();
				book.setTrain_no(resultSet.getInt(1));
				book.setTrain_name(resultSet.getString(2));
				book.setSource_name(resultSet.getString(3));
				book.setdestination(resultSet.getString(4));
				book.setTicket_price(resultSet.getInt(5));

				return book;
				

			}
		});
		}




			public Book select(int train_no) {
				return (Book) jdbcTemplate.queryForObject(
						"SELECT * FROM trains WHERE train_no=?",
						new Object[] { Integer.valueOf(train_no) },
						new RowMapper<Book>() {
			
							@Override
							public Book mapRow(ResultSet resultSet, int arg1)
									throws SQLException {
								Book book = new Book();
								book.setTrain_no(resultSet.getInt(1));
								book.setTrain_name(resultSet.getString(2));
								book.setSource_name(resultSet.getString(3));
								book.setdestination(resultSet.getString(4));
								book.setTicket_price(resultSet.getInt(5));
								return book;
							}
						});
}

}
