const Matrix = function(sentence) {
  this.rows = [];
  this.columns = [];

  this.rows = sentence.trim().split('\n').map(row => row.split(' ').map(item => Number(item)));
  // let theSentence = sentence.split('\n');
  // for (let i = 0; i<theSentence.length; i+=1){
  //   this.rows[i]=theSentence[i].split(' ');
  //   for (let n =0; n<this.rows[i].length; n+=1){
  //     this.rows[i][n] = Number(this.rows[i][n]);
  //   }
  // }
  // this.columns = this.rows[0].map((col, c) => this.array.map((row, r) => this.array[r][c]));
  for (let i=0; i<this.rows.length; i++){
    for (let ii=0; ii<this.rows[i].length; ii++){
      if (i==0){
        this.columns[ii]=[this.rows[i][ii]];
      } else{
        this.columns[ii].push(this.rows[i][ii]);
      }
    }
  }
}

module.exports = Matrix;
