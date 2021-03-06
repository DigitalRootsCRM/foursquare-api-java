/*
 * FoursquareAPI - Foursquare API for Java
 * Copyright (C) 2008 - 2011 Antti Leppä / Foyt
 * http://www.foyt.fi
 * 
 * License: 
 * 
 * Licensed under GNU Lesser General Public License Version 3 or later (the "LGPL")
 * http://www.gnu.org/licenses/lgpl.html
 */

package fi.foyt.foursquare.api.entities;

/**
 * Class representing Photo entity
 * 
 * @see <a href="https://developer.foursquare.com/docs/responses/photo.html" target="_blank">https://developer.foursquare.com/docs/responses/photo.html</a>
 * 
 * @author Antti Leppä
 */
public class Photo extends MiniPhoto {

  private static final long serialVersionUID = -6641038454071667700L;

  /**
   * Returns photo's id
   * 
   * @return photo's id
   */
  public String getId() {
    return id;
  }
  
  /**
   * Returns seconds since epoch when this photo was created.
   * 
   * @return seconds since epoch when this photo was created.
   */
  public Long getCreatedAt() {
    return createdAt;
  }
  
  /**
   * Returns source of the image (Application)
   * 
   * @return source of the image 
   */
  public Source getSource() {
    return source;
  }
  
  /**
   * Returns user that uploaded the image
   * 
   * @return user that uploaded the image
   */
  public CompactUser getUser() {
    return user;
  }
  
  /**
   * Returns venue where photo was taken
   * 
   * @return venue where photo was taken
   */
  public CompactVenue getVenue() {
    return venue;
  }
  
  /**
   * Returns tip in which photo is related to
   * 
   * @return tip in which photo is related to
   */
  public CompleteTip getTip() {
    return tip;
  }
  
  /**
   * Returns checkin in which photo is related to
   * 
   * @return checkin in which photo is related to
   */
  public Checkin getCheckin() {
    return checkin;
  }
  
  public Integer getWidth() {
	return width;
  }

  public Integer getHeight() {
	return height;
  }

  /*
   * Returns visibility setting for this photo. 
   * Valid values: public, friends
   */
  public String getVisibility() {
	return visibility;
  }

  private String id;
  private Long createdAt;
  private Source source;
  private CompactUser user;
  private CompactVenue venue;
  private CompleteTip tip;
  private Checkin checkin;
  /* Undocumented */
  private Integer width;
  /* Undocumented */
  private Integer height;
  /* Undocumented */
  private String visibility;
}
