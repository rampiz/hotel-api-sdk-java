/**
 * Autogenerated code by SdkModelGenerator.
 * Do not edit. Any modification on this file will be removed automatically after project build
 *
 */
package com.hotelbeds.hotelapimodel.auto.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hotelbeds.hotelapimodel.auto.convert.json.DateSerializer;
import com.hotelbeds.hotelapimodel.auto.model.Hotel;
import java.time.LocalDate;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
@ToString
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper=false)
public class Hotels {

	@XmlElement(name = "hotel")
	private List<Hotel> hotels;
	@XmlAttribute
	@JsonProperty
	@JsonSerialize(using = DateSerializer.class)
	private LocalDate checkIn;
	@XmlAttribute
	@JsonProperty
	private Integer total;
	@XmlAttribute
	@JsonProperty
	@JsonSerialize(using = DateSerializer.class)
	private LocalDate checkOut;


}