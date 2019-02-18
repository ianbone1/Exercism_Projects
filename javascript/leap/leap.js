export const isLeap = (theYear) => {
  let leapYear = true;
  theYear % 4 === 0 ? leapYear = true : leapYear = false;
  if (leapYear) {
    (theYear % 100 !== 0 || theYear % 400 ===0) ? leapYear = true : leapYear = false;
  }
  return leapYear;
};
