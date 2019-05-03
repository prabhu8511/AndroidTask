package com.assignment.androidtask.model.api;

/**
 * Created by Admin on 03-05-2019.
 */

public class LoginResponse {

    /**
     * status : 1
     * message : Successfully logged in.
     * data : {"user":{"id":7,"salutation":"Mr","title":null,"first_name":"Apple Test","last_name":"Account","email":"christoph.halang+apple@z-lab.com","phone":null,"role":"TECHNICIAN","hash_id":"59bbdb4832e8346b61981b1428709c16","status":"ACTIVE","created_at":"2018-08-13 14:14:32","company":{"id":2,"name":"Apple Inc.","email":"info+apple@klickcheck.com","address":"Somewhere In\r\n12345 California","provide_invoice":0,"invoice_name":"Invoice number","status":"ACTIVE","current_invoice_no":0,"send_email_to_user":0,"company_logo":null,"protocol_bg_color":"00aaef","protocol_txt_color":"ffffff"}},"token":"eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImp0aSI6ImEzZThiNWU2OTdmNDY4MmFjNWUyMTZiMmVmYjEzNWYwMTk5MDkxNDEwZmViNjlmNjUxMWYyY2EzZDFjMTZkNjIwYTlmNGE4MGUyNTQ2NjU2In0.eyJhdWQiOiIzIiwianRpIjoiYTNlOGI1ZTY5N2Y0NjgyYWM1ZTIxNmIyZWZiMTM1ZjAxOTkwOTE0MTBmZWI2OWY2NTExZjJjYTNkMWMxNmQ2MjBhOWY0YTgwZTI1NDY2NTYiLCJpYXQiOjE1NTY4NzEzNDMsIm5iZiI6MTU1Njg3MTM0MywiZXhwIjoxNTg4NDkzNzQzLCJzdWIiOiI3Iiwic2NvcGVzIjpbXX0.ax2cPArtMt6qkj6-VK8jjsn6NjhkIeTjpRaue7Sq9YgT2YVDhQ471c-nRZe-aFqaSCRMH-EkekMAnDXNlFGvrFHcmHTmUNvR-8KlkMvlMVNCacQQqWD8i_SzIeyp92TGORkxJ2l59gBYLpuFyxtMBmLROTUaoRAVN0CH99TX7ztyZfu5tJjdwVS9J6G-ZAxY8sfKA2SotyOvw4S81M94DlIfwjpnnWl20b2hkBe1t0EXZ3sfwcR8w5ZwKLwTvkp2ga5jKYH8YJTsEMHTr5wjPyr1CZ6u_q_vt1H_7oyHjVlUpyl7tdBGqV2DeZHVmvdwvzETiXPuQPbmUj5RQXoGa-CuyZkS1ZGYjqKgD3qQmf-T512_qPMqm-rrQaV-h21l7SJLiuivEoN4rgzCPw2hIYvsEjoHrgUW-IsiYqC2MhVA6s8bFxQ_OIriyAIqihACywCE87PuLtSVqzF0kgFXKV7PxgCgKfIZyPNNOv4sSvP9IaPLlcoBuyYskaedfCuzGrbnNRO-pVpwqrmfdlMuWk46WV8b5zSlOE4sj8_PY59jEwlYCmSuB5UNeWz7azNobql8q0pWJAKMz8a0JsrzMxgygaVY6agKefHjqDWBlGuIeRSWohiXEYbcRQoGYuFMRpQ1W-oQ61JjRePDWw6fcXQ6jIBKN78Y7uEmy88P-c4"}
     */

    private int status;
    private String message;
    private DataBean data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * user : {"id":7,"salutation":"Mr","title":null,"first_name":"Apple Test","last_name":"Account","email":"christoph.halang+apple@z-lab.com","phone":null,"role":"TECHNICIAN","hash_id":"59bbdb4832e8346b61981b1428709c16","status":"ACTIVE","created_at":"2018-08-13 14:14:32","company":{"id":2,"name":"Apple Inc.","email":"info+apple@klickcheck.com","address":"Somewhere In\r\n12345 California","provide_invoice":0,"invoice_name":"Invoice number","status":"ACTIVE","current_invoice_no":0,"send_email_to_user":0,"company_logo":null,"protocol_bg_color":"00aaef","protocol_txt_color":"ffffff"}}
         * token : eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImp0aSI6ImEzZThiNWU2OTdmNDY4MmFjNWUyMTZiMmVmYjEzNWYwMTk5MDkxNDEwZmViNjlmNjUxMWYyY2EzZDFjMTZkNjIwYTlmNGE4MGUyNTQ2NjU2In0.eyJhdWQiOiIzIiwianRpIjoiYTNlOGI1ZTY5N2Y0NjgyYWM1ZTIxNmIyZWZiMTM1ZjAxOTkwOTE0MTBmZWI2OWY2NTExZjJjYTNkMWMxNmQ2MjBhOWY0YTgwZTI1NDY2NTYiLCJpYXQiOjE1NTY4NzEzNDMsIm5iZiI6MTU1Njg3MTM0MywiZXhwIjoxNTg4NDkzNzQzLCJzdWIiOiI3Iiwic2NvcGVzIjpbXX0.ax2cPArtMt6qkj6-VK8jjsn6NjhkIeTjpRaue7Sq9YgT2YVDhQ471c-nRZe-aFqaSCRMH-EkekMAnDXNlFGvrFHcmHTmUNvR-8KlkMvlMVNCacQQqWD8i_SzIeyp92TGORkxJ2l59gBYLpuFyxtMBmLROTUaoRAVN0CH99TX7ztyZfu5tJjdwVS9J6G-ZAxY8sfKA2SotyOvw4S81M94DlIfwjpnnWl20b2hkBe1t0EXZ3sfwcR8w5ZwKLwTvkp2ga5jKYH8YJTsEMHTr5wjPyr1CZ6u_q_vt1H_7oyHjVlUpyl7tdBGqV2DeZHVmvdwvzETiXPuQPbmUj5RQXoGa-CuyZkS1ZGYjqKgD3qQmf-T512_qPMqm-rrQaV-h21l7SJLiuivEoN4rgzCPw2hIYvsEjoHrgUW-IsiYqC2MhVA6s8bFxQ_OIriyAIqihACywCE87PuLtSVqzF0kgFXKV7PxgCgKfIZyPNNOv4sSvP9IaPLlcoBuyYskaedfCuzGrbnNRO-pVpwqrmfdlMuWk46WV8b5zSlOE4sj8_PY59jEwlYCmSuB5UNeWz7azNobql8q0pWJAKMz8a0JsrzMxgygaVY6agKefHjqDWBlGuIeRSWohiXEYbcRQoGYuFMRpQ1W-oQ61JjRePDWw6fcXQ6jIBKN78Y7uEmy88P-c4
         */

        private UserBean user;
        private String token;

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public static class UserBean {
            /**
             * id : 7
             * salutation : Mr
             * title : null
             * first_name : Apple Test
             * last_name : Account
             * email : christoph.halang+apple@z-lab.com
             * phone : null
             * role : TECHNICIAN
             * hash_id : 59bbdb4832e8346b61981b1428709c16
             * status : ACTIVE
             * created_at : 2018-08-13 14:14:32
             * company : {"id":2,"name":"Apple Inc.","email":"info+apple@klickcheck.com","address":"Somewhere In\r\n12345 California","provide_invoice":0,"invoice_name":"Invoice number","status":"ACTIVE","current_invoice_no":0,"send_email_to_user":0,"company_logo":null,"protocol_bg_color":"00aaef","protocol_txt_color":"ffffff"}
             */

            private int id;
            private String salutation;
            private Object title;
            private String first_name;
            private String last_name;
            private String email;
            private Object phone;
            private String role;
            private String hash_id;
            private String status;
            private String created_at;
            private CompanyBean company;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getSalutation() {
                return salutation;
            }

            public void setSalutation(String salutation) {
                this.salutation = salutation;
            }

            public Object getTitle() {
                return title;
            }

            public void setTitle(Object title) {
                this.title = title;
            }

            public String getFirst_name() {
                return first_name;
            }

            public void setFirst_name(String first_name) {
                this.first_name = first_name;
            }

            public String getLast_name() {
                return last_name;
            }

            public void setLast_name(String last_name) {
                this.last_name = last_name;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public Object getPhone() {
                return phone;
            }

            public void setPhone(Object phone) {
                this.phone = phone;
            }

            public String getRole() {
                return role;
            }

            public void setRole(String role) {
                this.role = role;
            }

            public String getHash_id() {
                return hash_id;
            }

            public void setHash_id(String hash_id) {
                this.hash_id = hash_id;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getCreated_at() {
                return created_at;
            }

            public void setCreated_at(String created_at) {
                this.created_at = created_at;
            }

            public CompanyBean getCompany() {
                return company;
            }

            public void setCompany(CompanyBean company) {
                this.company = company;
            }

            public static class CompanyBean {
                /**
                 * id : 2
                 * name : Apple Inc.
                 * email : info+apple@klickcheck.com
                 * address : Somewhere In
                 12345 California
                 * provide_invoice : 0
                 * invoice_name : Invoice number
                 * status : ACTIVE
                 * current_invoice_no : 0
                 * send_email_to_user : 0
                 * company_logo : null
                 * protocol_bg_color : 00aaef
                 * protocol_txt_color : ffffff
                 */

                private int id;
                private String name;
                private String email;
                private String address;
                private int provide_invoice;
                private String invoice_name;
                private String status;
                private int current_invoice_no;
                private int send_email_to_user;
                private Object company_logo;
                private String protocol_bg_color;
                private String protocol_txt_color;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getEmail() {
                    return email;
                }

                public void setEmail(String email) {
                    this.email = email;
                }

                public String getAddress() {
                    return address;
                }

                public void setAddress(String address) {
                    this.address = address;
                }

                public int getProvide_invoice() {
                    return provide_invoice;
                }

                public void setProvide_invoice(int provide_invoice) {
                    this.provide_invoice = provide_invoice;
                }

                public String getInvoice_name() {
                    return invoice_name;
                }

                public void setInvoice_name(String invoice_name) {
                    this.invoice_name = invoice_name;
                }

                public String getStatus() {
                    return status;
                }

                public void setStatus(String status) {
                    this.status = status;
                }

                public int getCurrent_invoice_no() {
                    return current_invoice_no;
                }

                public void setCurrent_invoice_no(int current_invoice_no) {
                    this.current_invoice_no = current_invoice_no;
                }

                public int getSend_email_to_user() {
                    return send_email_to_user;
                }

                public void setSend_email_to_user(int send_email_to_user) {
                    this.send_email_to_user = send_email_to_user;
                }

                public Object getCompany_logo() {
                    return company_logo;
                }

                public void setCompany_logo(Object company_logo) {
                    this.company_logo = company_logo;
                }

                public String getProtocol_bg_color() {
                    return protocol_bg_color;
                }

                public void setProtocol_bg_color(String protocol_bg_color) {
                    this.protocol_bg_color = protocol_bg_color;
                }

                public String getProtocol_txt_color() {
                    return protocol_txt_color;
                }

                public void setProtocol_txt_color(String protocol_txt_color) {
                    this.protocol_txt_color = protocol_txt_color;
                }
            }
        }
    }
}
