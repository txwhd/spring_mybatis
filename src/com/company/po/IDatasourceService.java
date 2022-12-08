package com.company.po;
@RemoteCall(value = "iuap-boot-starter-example-provider")
public interface IDatasourceService {

    public void insertData();

    public void insertRollbackData();
}
