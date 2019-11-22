
var da=['sun','mon', 'tues' ,'wed','thur','fri','sat'];
var mo=['jan','feb','mar','april','may','june','july','august','sep','oct','nov','dec'];
var today=new Date();
var day=today.getDay();
var mon=today.getMonth();
console.log('day/month/year');
console.log(da[day],mo[mon],today.getFullYear());