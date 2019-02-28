/* eslint-disable no-unused-vars */
//
// This is only a SKELETON file for the 'Bob' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export const hey = (message) => {
  let regexAlpha = /[a-zA-Z]/g
  message = message.replace('\n','');
  message = message.trim();
  if (message[message.length-1]==".") {
    return "Whatever."
  } else if (message.trim() == "") {
    return 'Fine. Be that way!'
  } else if ((!(message.match(regexAlpha))) && (message[message.length-1]=="?")) {
    return 'Sure.'
  } else if ((message.toUpperCase()==message) && (message[message.length-1]=="?")) {
    return 'Calm down, I know what I\'m doing!'
  } else if (!(message.match(regexAlpha))) {
    return 'Whatever.'
  } else if (message.toUpperCase()==message) {
    return 'Whoa, chill out!'
  } else if (message[message.length-1]=="?") {
    return "Sure."
  } else if (message[message.length-1]=="!") {
    return "Whatever."
  } else if ((message.toUpperCase()==message) && (message[message.length-1]=="?")) {
    return 'Calm down, I know what I\'m doing!'
  } else if (message == "") {
    return 'Fine. Be that way!'
  } else {
    return 'Whatever.'
  }

};
