const RNA = [ 'C', 'G', 'A', 'U', '' ];
const DNA = [ 'G', 'C', 'T', 'A', '' ];
export const toRna = function(dna) {

  let result = "";
  [...dna].forEach(function(d) {
    let i = DNA.indexOf(d);
    if (i === -1) { throw new Error('Invalid input DNA.')};
    result += RNA[i];
  });
  return result;
}
