function route(handle, pathname , req , res) {  
  if (typeof handle[pathname] === 'function') {  
    return handle[pathname](req , res);  
  } else { 
	return pathname + ' is not defined';
  }  
}  
exports.route = route;  