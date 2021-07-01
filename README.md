
## notification-box ##

available for android

apk published exclusively on github


## releases ##

* stable

[notification-box-0.0.2](https://github.com/TurquoiseSpace/notification-box/releases/download/0.0.2/notification-box-0.0.2.apk)

* not working / failing / buggy

[notification-box-0.0.3](https://github.com/TurquoiseSpace/notification-box/releases/download/0.0.3/notification-box-0.0.3.apk)


## repository ##

* browse

https://github.com/TurquoiseSpace/notification-box

* download zip

https://github.com/TurquoiseSpace/notification-box/archive/refs/heads/master.zip


## clone ##

* https

	```git clone https://github.com/TurquoiseSpace/notification-box.git```

* ssh

	```git clone git@github.com:TurquoiseSpace/notification-box.git```

* github cli

	```gh repo clone TurquoiseSpace/notification-box```


## android app instructions ##

1)
download the apk
directly onto your mobile device
or
onto your laptop / desktop, then copy it onto your mobile device 

2)
in your android mobile device, go to settings and enable `allow installing apps from external sources`

3)
install the apk, in your mobile device

4)
open the app with name `Firebase Cloud Messaging`

5)
click on the "LOG TOKEN" button
it will generate the `FCM Registration Token`
this is a client specific token, which would be used to send the push notifications to this particular android device client app
which would look something like this

	```dlSGYt8MQ5a-HG4ZZbmBPE:APA91bHh9aNqos0H0Fw3OmTlAtXoC4bryB-9Ws5m6_f7WzDARiM_1a6XkKwN3WMchGFrEN-olCw8Uo65k7bm-g4aXOdklM0Dglb-3-3nS0LahtTWG38vlgY4y5PaREz25Prhp0b5pJgo```

6)
click on the "COPY TOKEN" button

7)
open your email, via gmail or any other email service, in app or browser, in your mobile
send yourself this token, on email
so you can access this token, on your laptop or desktop


## sending push notification instructions ##

1)
on your desktop or laptop, open your email, in which you had shared your `FCM Registration Token`
copy this token

2)
open Postman, and paste this FCM registration token in the `raw` `JSON` Request Body, as the value of `to` attribute
the request body would look something like this

	```
	{
	   "to":"dlSGYt8MQ5a-HG4ZZbmBPE:APA91bHh9aNqos0H0Fw3OmTlAtXoC4bryB-9Ws5m6_f7WzDARiM_1a6XkKwN3WMchGFrEN-olCw8Uo65k7bm-g4aXOdklM0Dglb-3-3nS0LahtTWG38vlgY4y5PaREz25Prhp0b5pJgo",
	   "data":{
	      "title":"testing",
	      "message":"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
	      "json_key":"json_value",
	      "json_key_2":"json_value_2"
	   }
	}
	```

3)
in the request url, copy paste the below

	```https://fcm.googleapis.com/fcm/send```

4)
set the HTTP Method as

	```POST```

5)
in the Request Headers, copy paste the following header

	```Authorization:key=AAAAucpu21Y:APA91bEYxJ6XGquZzAxqJnyUYeSwi7ocOWO4iJwi676vXnRXrDn-TazsJmESzQHHv5Dx2OO3HFOk5moxzpvEPCMCv3UA5ZopDnVFBK6lOeE1qWQugDVabmN229DAXd3G7tdul7mmlYpF```

where the header name is `Authorization` and the header value is `key=AAAAucpu21Y:APA91bEYxJ6XGquZzAxqJnyUYeSwi7ocOWO4iJwi676vXnRXrDn-TazsJmESzQHHv5Dx2OO3HFOk5moxzpvEPCMCv3UA5ZopDnVFBK6lOeE1qWQugDVabmN229DAXd3G7tdul7mmlYpF`

the value of this header contains the `Access Key` of this project which is registered with the `Google Cloud Platform`

6)
click on `Send` button

7)
Voila !
You should have received the Push Notification in your Android Client


## Reference Link ##

console.cloud.google.com/


## Contact Info ##

notification-box@googlegroups.com

Feel free to drop us an email



