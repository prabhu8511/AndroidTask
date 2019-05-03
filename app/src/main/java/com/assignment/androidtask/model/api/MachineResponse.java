package com.assignment.androidtask.model.api;

import java.util.List;

/**
 * Created by Admin on 03-05-2019.
 */

public class MachineResponse {

    /**
     * data : {"assets":[{"id":2,"name":"Multicar M27 - Geräteträger","company_id":2,"check_list_id":17,"image_id":2,"status":"ACTIVE","availability":"CHECKED_IN","inventory_number":null,"serial_number":null,"check_list":{"id":17,"name":"PKW / LKW","company_id":2,"status":"ACTIVE","updated_at":"2018-08-14 15:39:17"},"image":{"id":2,"url":"https://klickcheck-production.s3.eu-central-1.amazonaws.com/original-image/image-1534253818.png","small_url":"https://klickcheck-production.s3.eu-central-1.amazonaws.com/small-image/image-1534253818.png","is_deleted":0}},{"id":158,"name":"BMW M2","company_id":2,"check_list_id":17,"image_id":1045,"status":"ACTIVE","availability":"CHECKED_OUT","inventory_number":null,"serial_number":null,"check_list":{"id":17,"name":"PKW / LKW","company_id":2,"status":"ACTIVE","updated_at":"2018-08-14 15:39:17"},"image":{"id":1045,"url":"https://klickcheck-production.s3.eu-central-1.amazonaws.com/original-image/image-1539978609965.jpeg","small_url":"https://klickcheck-production.s3.eu-central-1.amazonaws.com/small-image/image-1539978609965.jpeg","is_deleted":0}},{"id":213,"name":"Sarahs Rüttelstampfer","company_id":2,"check_list_id":17,"image_id":1378,"status":"ACTIVE","availability":"CHECKED_OUT","inventory_number":null,"serial_number":null,"check_list":{"id":17,"name":"PKW / LKW","company_id":2,"status":"ACTIVE","updated_at":"2018-08-14 15:39:17"},"image":{"id":1378,"url":"https://klickcheck-production.s3.eu-central-1.amazonaws.com/original-image/image-1541515435617.jpeg","small_url":"https://klickcheck-production.s3.eu-central-1.amazonaws.com/small-image/image-1541515435617.jpeg","is_deleted":0}}]}
     * links : {"first":"https://backend.klickcheck.com/api/assets?company_id=2&page=1","last":"https://backend.klickcheck.com/api/assets?company_id=2&page=1","prev":null,"next":null}
     * meta : {"current_page":1,"from":1,"last_page":1,"path":"https://backend.klickcheck.com/api/assets","per_page":25,"to":3,"total":3}
     * status : 1
     * message : Successfully found assets.
     */

    private DataBean data;
    private LinksBean links;
    private MetaBean meta;
    private int status;
    private String message;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public LinksBean getLinks() {
        return links;
    }

    public void setLinks(LinksBean links) {
        this.links = links;
    }

    public MetaBean getMeta() {
        return meta;
    }

    public void setMeta(MetaBean meta) {
        this.meta = meta;
    }

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

    public static class DataBean {
        private List<AssetsBean> assets;

        public List<AssetsBean> getAssets() {
            return assets;
        }

        public void setAssets(List<AssetsBean> assets) {
            this.assets = assets;
        }

        public static class AssetsBean {
            /**
             * id : 2
             * name : Multicar M27 - Geräteträger
             * company_id : 2
             * check_list_id : 17
             * image_id : 2
             * status : ACTIVE
             * availability : CHECKED_IN
             * inventory_number : null
             * serial_number : null
             * check_list : {"id":17,"name":"PKW / LKW","company_id":2,"status":"ACTIVE","updated_at":"2018-08-14 15:39:17"}
             * image : {"id":2,"url":"https://klickcheck-production.s3.eu-central-1.amazonaws.com/original-image/image-1534253818.png","small_url":"https://klickcheck-production.s3.eu-central-1.amazonaws.com/small-image/image-1534253818.png","is_deleted":0}
             */

            private int id;
            private String name;
            private int company_id;
            private int check_list_id;
            private int image_id;
            private String status;
            private String availability;
            private Object inventory_number;
            private Object serial_number;
            private CheckListBean check_list;
            private ImageBean image;

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

            public int getCompany_id() {
                return company_id;
            }

            public void setCompany_id(int company_id) {
                this.company_id = company_id;
            }

            public int getCheck_list_id() {
                return check_list_id;
            }

            public void setCheck_list_id(int check_list_id) {
                this.check_list_id = check_list_id;
            }

            public int getImage_id() {
                return image_id;
            }

            public void setImage_id(int image_id) {
                this.image_id = image_id;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getAvailability() {
                return availability;
            }

            public void setAvailability(String availability) {
                this.availability = availability;
            }

            public Object getInventory_number() {
                return inventory_number;
            }

            public void setInventory_number(Object inventory_number) {
                this.inventory_number = inventory_number;
            }

            public Object getSerial_number() {
                return serial_number;
            }

            public void setSerial_number(Object serial_number) {
                this.serial_number = serial_number;
            }

            public CheckListBean getCheck_list() {
                return check_list;
            }

            public void setCheck_list(CheckListBean check_list) {
                this.check_list = check_list;
            }

            public ImageBean getImage() {
                return image;
            }

            public void setImage(ImageBean image) {
                this.image = image;
            }

            public static class CheckListBean {
                /**
                 * id : 17
                 * name : PKW / LKW
                 * company_id : 2
                 * status : ACTIVE
                 * updated_at : 2018-08-14 15:39:17
                 */

                private int id;
                private String name;
                private int company_id;
                private String status;
                private String updated_at;

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

                public int getCompany_id() {
                    return company_id;
                }

                public void setCompany_id(int company_id) {
                    this.company_id = company_id;
                }

                public String getStatus() {
                    return status;
                }

                public void setStatus(String status) {
                    this.status = status;
                }

                public String getUpdated_at() {
                    return updated_at;
                }

                public void setUpdated_at(String updated_at) {
                    this.updated_at = updated_at;
                }
            }

            public static class ImageBean {
                /**
                 * id : 2
                 * url : https://klickcheck-production.s3.eu-central-1.amazonaws.com/original-image/image-1534253818.png
                 * small_url : https://klickcheck-production.s3.eu-central-1.amazonaws.com/small-image/image-1534253818.png
                 * is_deleted : 0
                 */

                private int id;
                private String url;
                private String small_url;
                private int is_deleted;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getSmall_url() {
                    return small_url;
                }

                public void setSmall_url(String small_url) {
                    this.small_url = small_url;
                }

                public int getIs_deleted() {
                    return is_deleted;
                }

                public void setIs_deleted(int is_deleted) {
                    this.is_deleted = is_deleted;
                }
            }
        }
    }

    public static class LinksBean {
        /**
         * first : https://backend.klickcheck.com/api/assets?company_id=2&page=1
         * last : https://backend.klickcheck.com/api/assets?company_id=2&page=1
         * prev : null
         * next : null
         */

        private String first;
        private String last;
        private Object prev;
        private Object next;

        public String getFirst() {
            return first;
        }

        public void setFirst(String first) {
            this.first = first;
        }

        public String getLast() {
            return last;
        }

        public void setLast(String last) {
            this.last = last;
        }

        public Object getPrev() {
            return prev;
        }

        public void setPrev(Object prev) {
            this.prev = prev;
        }

        public Object getNext() {
            return next;
        }

        public void setNext(Object next) {
            this.next = next;
        }
    }

    public static class MetaBean {
        /**
         * current_page : 1
         * from : 1
         * last_page : 1
         * path : https://backend.klickcheck.com/api/assets
         * per_page : 25
         * to : 3
         * total : 3
         */

        private int current_page;
        private int from;
        private int last_page;
        private String path;
        private int per_page;
        private int to;
        private int total;

        public int getCurrent_page() {
            return current_page;
        }

        public void setCurrent_page(int current_page) {
            this.current_page = current_page;
        }

        public int getFrom() {
            return from;
        }

        public void setFrom(int from) {
            this.from = from;
        }

        public int getLast_page() {
            return last_page;
        }

        public void setLast_page(int last_page) {
            this.last_page = last_page;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public int getPer_page() {
            return per_page;
        }

        public void setPer_page(int per_page) {
            this.per_page = per_page;
        }

        public int getTo() {
            return to;
        }

        public void setTo(int to) {
            this.to = to;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }
    }
}
