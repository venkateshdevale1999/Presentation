package org.th.b84;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Customer {
    private int custId;
    private String custName;
    private Address address;
    private Accounts account;


    //IOC through Constructor......
    public Customer(Address address)
    {
        this.address=address;
    }

    public Customer(Accounts account){
        this.account=account;
    }
}


