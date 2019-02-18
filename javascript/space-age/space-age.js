export const age = function(planet, theSeconds){
  const solarYears={
    'earth': 31557600,
    'mercury': 0.2408467,
    'venus': 0.61519726,
    'mars':1.8808158,
    'jupiter':11.862615,
    'saturn':29.447498,
    'uranus':84.016846,
    'neptune':164.79132
  }
  let result = 0;
  if (planet==='earth') {
    result = theSeconds/solarYears[planet];
  } else {
    result = (theSeconds/solarYears['earth'])/solarYears[planet]
  }
  return parseFloat(result.toFixed(2));
};
