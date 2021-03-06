package e3mall.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbItem implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_item.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_item.title
     *
     * @mbggenerated
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_item.sell_point
     *
     * @mbggenerated
     */
    private String sellPoint;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_item.price
     *
     * @mbggenerated
     */
    private Long price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_item.num
     *
     * @mbggenerated
     */
    private Integer num;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_item.barcode
     *
     * @mbggenerated
     */
    private String barcode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_item.image
     *
     * @mbggenerated
     */
    private String image;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_item.cid
     *
     * @mbggenerated
     */
    private Long cid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_item.status
     *
     * @mbggenerated
     */
    private Byte status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_item.created
     *
     * @mbggenerated
     */
    private Date created;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_item.updated
     *
     * @mbggenerated
     */
    private Date updated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_item
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_item.id
     *
     * @return the value of tb_item.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_item.id
     *
     * @param id the value for tb_item.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_item.title
     *
     * @return the value of tb_item.title
     *
     * @mbggenerated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_item.title
     *
     * @param title the value for tb_item.title
     *
     * @mbggenerated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_item.sell_point
     *
     * @return the value of tb_item.sell_point
     *
     * @mbggenerated
     */
    public String getSellPoint() {
        return sellPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_item.sell_point
     *
     * @param sellPoint the value for tb_item.sell_point
     *
     * @mbggenerated
     */
    public void setSellPoint(String sellPoint) {
        this.sellPoint = sellPoint == null ? null : sellPoint.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_item.price
     *
     * @return the value of tb_item.price
     *
     * @mbggenerated
     */
    public Long getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_item.price
     *
     * @param price the value for tb_item.price
     *
     * @mbggenerated
     */
    public void setPrice(Long price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_item.num
     *
     * @return the value of tb_item.num
     *
     * @mbggenerated
     */
    public Integer getNum() {
        return num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_item.num
     *
     * @param num the value for tb_item.num
     *
     * @mbggenerated
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_item.barcode
     *
     * @return the value of tb_item.barcode
     *
     * @mbggenerated
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_item.barcode
     *
     * @param barcode the value for tb_item.barcode
     *
     * @mbggenerated
     */
    public void setBarcode(String barcode) {
        this.barcode = barcode == null ? null : barcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_item.image
     *
     * @return the value of tb_item.image
     *
     * @mbggenerated
     */
    public String getImage() {
        return image;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_item.image
     *
     * @param image the value for tb_item.image
     *
     * @mbggenerated
     */
    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_item.cid
     *
     * @return the value of tb_item.cid
     *
     * @mbggenerated
     */
    public Long getCid() {
        return cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_item.cid
     *
     * @param cid the value for tb_item.cid
     *
     * @mbggenerated
     */
    public void setCid(Long cid) {
        this.cid = cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_item.status
     *
     * @return the value of tb_item.status
     *
     * @mbggenerated
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_item.status
     *
     * @param status the value for tb_item.status
     *
     * @mbggenerated
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_item.created
     *
     * @return the value of tb_item.created
     *
     * @mbggenerated
     */
    public Date getCreated() {
        return created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_item.created
     *
     * @param created the value for tb_item.created
     *
     * @mbggenerated
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_item.updated
     *
     * @return the value of tb_item.updated
     *
     * @mbggenerated
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_item.updated
     *
     * @param updated the value for tb_item.updated
     *
     * @mbggenerated
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TbItem other = (TbItem) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getSellPoint() == null ? other.getSellPoint() == null : this.getSellPoint().equals(other.getSellPoint()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getNum() == null ? other.getNum() == null : this.getNum().equals(other.getNum()))
            && (this.getBarcode() == null ? other.getBarcode() == null : this.getBarcode().equals(other.getBarcode()))
            && (this.getImage() == null ? other.getImage() == null : this.getImage().equals(other.getImage()))
            && (this.getCid() == null ? other.getCid() == null : this.getCid().equals(other.getCid()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreated() == null ? other.getCreated() == null : this.getCreated().equals(other.getCreated()))
            && (this.getUpdated() == null ? other.getUpdated() == null : this.getUpdated().equals(other.getUpdated()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getSellPoint() == null) ? 0 : getSellPoint().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getNum() == null) ? 0 : getNum().hashCode());
        result = prime * result + ((getBarcode() == null) ? 0 : getBarcode().hashCode());
        result = prime * result + ((getImage() == null) ? 0 : getImage().hashCode());
        result = prime * result + ((getCid() == null) ? 0 : getCid().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreated() == null) ? 0 : getCreated().hashCode());
        result = prime * result + ((getUpdated() == null) ? 0 : getUpdated().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", sellPoint=").append(sellPoint);
        sb.append(", price=").append(price);
        sb.append(", num=").append(num);
        sb.append(", barcode=").append(barcode);
        sb.append(", image=").append(image);
        sb.append(", cid=").append(cid);
        sb.append(", status=").append(status);
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}