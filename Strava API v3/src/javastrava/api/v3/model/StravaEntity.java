package javastrava.api.v3.model;

import javastrava.api.v3.model.reference.StravaResourceState;

/**
 * <p>
 * Things that implement this are part of the Strava data model
 * </p>
 *
 * @author Dan Shannon
 *
 */
public interface StravaEntity {
	/**
	 * @return Return the resource state of the entity
	 */
	public StravaResourceState getResourceState();
}
