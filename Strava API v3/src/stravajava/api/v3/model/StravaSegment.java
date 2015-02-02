package stravajava.api.v3.model;

import java.util.Date;

import stravajava.api.v3.model.reference.StravaClimbCategory;
import stravajava.api.v3.model.reference.StravaResourceState;
import stravajava.api.v3.model.reference.StravaSegmentActivityType;
import lombok.Data;

import com.google.gson.annotations.SerializedName;

/**
 * <p>{@link StravaSegment Segments} are specific sections of road. {@link StravaAthlete Athletes�} {@link StravaSegmentEffort} efforts are compared on these segments and leaderboards are created.</p>
 * 
 * @author Dan Shannon
 *
 */
@Data
public class StravaSegment {
	public StravaSegment() {
		// Required
		super();
	}
	
	private Integer id;
	private StravaResourceState resourceState;
	private String name;
	private StravaSegmentActivityType activityType;
	private Float distance;
	private Float averageGrade;
	private Float maximumGrade;
	private Float elevationHigh;
	private Float elevationLow;
	private StravaMapPoint startLatlng;
	private StravaMapPoint endLatlng;
	private StravaClimbCategory climbCategory;
	private String city;
	private String state;
	private String country;
	@SerializedName("private")
	private Boolean privateSegment; // is "private" in JSON API
	private Boolean starred; // true if authenticated athlete has starred segment
	private Date createdAt;
	private Date updatedAt;
	private Float totalElevationGain;
	private StravaMap map;
	private Integer effortCount;
	private Integer athleteCount;
	private Boolean hazardous;
	private Integer starCount;
	private StravaSegmentEffort athletePrEffort; // See {@link SegmentServices#listStarredSegments()}
}
