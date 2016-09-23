$(document).ready(function() {
	$('#ul-l').click(dropdownClickHandler);
});

function dropdownClickHandler(evt) {
	$('#location').html();
	console.log($(evt.target).attr("value"));
	
	$.getJSON('/weather/local/MD/' + $(evt.target).attr("value"), weather);
	
	$('#location').html($(evt.target).attr("value"));
}

function weather(response) {
	
	$('#weather').html("");
	$('#weather').append(
			"<li>Weather: " + response.success.current_observation.weather
					+ "</li>");
	$('#weather').append(
			"<li>Temperature: " + response.success.current_observation.temp_f
					+ "F</li>");
	$('#weather').append(
			"<li>Wind Direction: "
					+ response.success.current_observation.wind_dir + "</li>");
	$('#weather').append(
			"<li>Wind Speed: " + response.success.current_observation.wind_mph
					+ "mph</li>");
	$('#weather').append(
			"<li>Humidity: "
					+ response.success.current_observation.relative_humidity
					+ "</li>");

};