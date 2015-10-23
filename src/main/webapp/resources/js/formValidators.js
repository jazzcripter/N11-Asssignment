/**
 * Created by rashakol on 21.10.2015.
 */

function checkSocialInput(){

    var inputArray=document.getElementById("socialForm").getElementsByTagName("input");
    var total=inputArray.length;




    for(var i=0;i<total;i++){
      if (!isNaN(parseInt(inputArray[i].value.charAt(0))) && inputArray[i].type=="text"){
            alert("Number cannot be used at start");
            return false;
        }
    }

    return true;

}