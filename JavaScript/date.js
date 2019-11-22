var todayDate=new Date();
console.log('todays date',todayDate)
console.log('todays month',todayDate.getMonth())
console.log('todays day',todayDate.getDay())
console.log('todays year',todayDate.getFullYear())
console.log('todays date',todayDate.getDate())
console.log('todays hour',todayDate.getHours())
console.log('todays minutes',todayDate.getMinutes())
console.log('.................................')
console.log('.................................')
console.log('.................................')
console.log('costructor overloading')
var todayDate=new Date();
console.log('todays date empty constrctor',todayDate)
var todayDate1=new Date('jan 10');
console.log('todays date string constructor',todayDate1)
var todayDate2=new Date(2019,8);
console.log('todays date 2 parameter constructor',todayDate2)
var todayDate3=new Date(2019);
console.log('todays date single parameter',todayDate3)
var todayDate4=new Date(89000000);
console.log('todays date for milliseconds ',todayDate4)
