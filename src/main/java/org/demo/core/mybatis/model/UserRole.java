package org.demo.core.mybatis.model;

public class UserRole {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column user_role.id
     * @mbg.generated  Wed Feb 15 15:36:42 CST 2017
     */
    private Integer id;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column user_role.r_code
     * @mbg.generated  Wed Feb 15 15:36:42 CST 2017
     */
    private String r_code;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column user_role.u_id
     * @mbg.generated  Wed Feb 15 15:36:42 CST 2017
     */
    private Integer u_id;

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column user_role.id
     * @return  the value of user_role.id
     * @mbg.generated  Wed Feb 15 15:36:42 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column user_role.id
     * @param id  the value for user_role.id
     * @mbg.generated  Wed Feb 15 15:36:42 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column user_role.r_code
     * @return  the value of user_role.r_code
     * @mbg.generated  Wed Feb 15 15:36:42 CST 2017
     */
    public String getR_code() {
        return r_code;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column user_role.r_code
     * @param r_code  the value for user_role.r_code
     * @mbg.generated  Wed Feb 15 15:36:42 CST 2017
     */
    public void setR_code(String r_code) {
        this.r_code = r_code;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column user_role.u_id
     * @return  the value of user_role.u_id
     * @mbg.generated  Wed Feb 15 15:36:42 CST 2017
     */
    public Integer getU_id() {
        return u_id;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column user_role.u_id
     * @param u_id  the value for user_role.u_id
     * @mbg.generated  Wed Feb 15 15:36:42 CST 2017
     */
    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }
}