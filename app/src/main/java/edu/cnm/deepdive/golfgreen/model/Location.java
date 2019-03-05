package edu.cnm.deepdive.golfgreen.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;
import java.util.Date;

@Entity(foreignKeys = @ForeignKey(entity = User.class,
    parentColumns = "user_id", childColumns = "user_id",
    onDelete = ForeignKey.CASCADE)
)

public class Location {

  @ColumnInfo(name = "location_id")
  @PrimaryKey(autoGenerate = true)
  private long id;

  @NonNull

  @ColumnInfo(name = "latitude")
  private Long latitude;

  @ColumnInfo (name = "longitude")
  private Long longitude;

  @ColumnInfo(name = "city")
  private String city;

  @ColumnInfo (name = "zip")
  private Long zip;

  @ColumnInfo (name = "max_radius")
  private int maxRadius;

  @ColumnInfo(name = "time_stamp")
  private Date timeStamp;

  @ColumnInfo(name = "user_id")
  private long userId;

  public long getId(){
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }
  public Long getLatitude(){
    return latitude;
  }

  public void setLatitude(Long latitude) {
    this.latitude = latitude;
  }

  public Long getLongitude() {
    return longitude;
  }

  public void setLongitude(Long longitude) {
    this.longitude = longitude;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Long getZip() {
    return zip;
  }

  public void setZip(Long zip) {
    this.zip = zip;
  }

  public int getMaxRadius() {
    return maxRadius;
  }

  public void setMaxRadius(int maxRadius) {
    this.maxRadius = maxRadius;
  }

  public Date getTimeStamp() {
    return timeStamp;
  }

  public void setTimeStamp(Date timeStamp) {
    this.timeStamp = timeStamp;
  }

  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


}
