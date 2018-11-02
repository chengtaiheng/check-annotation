package annotation.validate.application.domain;

import check.annotation.IsMobile;

import java.io.Serializable;

public class CheckPhoneModle implements Serializable {

    private static final long serialVersionUID = -6236328694613328459L;

    private String name;

    @IsMobile
    private String phone;

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "name:"+name+"phone:"+phone;
    }
}
