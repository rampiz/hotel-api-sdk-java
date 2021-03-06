/**
 * Autogenerated code by SdkModelGenerator.
 * Do not edit. Any modification on this file will be removed automatically after project build
 *
 */
package com.hotelbeds.hotelapimodel.auto.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.hotelbeds.hotelapimodel.auto.common.SimpleTypes.HotelCodeType;
import java.util.List;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.AllArgsConstructor;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
@ToString
@NoArgsConstructor
@Data
@AllArgsConstructor
public class HotelsFilter {

	@XmlElement(name = "hotel")
	@JsonProperty("hotel")
	@Size(min = 0, max = 2000, message = "{javax.validation.constraints.Size.message}") 
	private List<Integer> hotels;
	@XmlAttribute
	private Boolean included;
	@XmlAttribute
	private HotelCodeType type;


}