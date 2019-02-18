export const isPangram = function(sentence){
  let pangram = true;
  sentence.length<26 ? pangram = false : pangram = true;
  const alphabet='abcdefghijklmnopqrstuvwxyz';
  for (let l of alphabet) {
    if (pangram) {
      pangram = sentence.toLowerCase().includes(l);
    }
  }
  return pangram;
}
