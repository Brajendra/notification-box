

# Notification Box #

`notification-box` available for android

apk published exclusively on github


## Releases ##

* Stable

[notification-box-0.0.3](https://github.com/TurquoiseSpace/notification-box/releases/download/0.0.3/notification-box-0.0.3.apk)

* Tag / Tree

[0.0.3](https://github.com/TurquoiseSpace/notification-box/tree/3ee8745ecdce381bc0b3ec68f57d79e4927ada21)


## Repository ##

* Browse

https://github.com/TurquoiseSpace/notification-box

* Download ZIP

https://github.com/TurquoiseSpace/notification-box/archive/refs/heads/master.zip


## Clone ##

* HTTPS

	```git clone https://github.com/TurquoiseSpace/notification-box.git```

* SSH

	```git clone git@github.com:TurquoiseSpace/notification-box.git```

* GitHub CLI

	```gh repo clone TurquoiseSpace/notification-box```


## Usage Instructions ##


#### Notification Box - Android App - Initial / One Time Setup ####

1) download the apk,
directly onto your mobile device,
or,
onto your laptop / desktop, then copy it onto your mobile device 

2) in your android mobile device, go to settings and enable `allow installing apps from external sources`

3) install the apk, in your mobile device

4) open the app with name `Firebase Cloud Messaging` , having a green Android bot icon

<img src="https://github.com/TurquoiseSpace/notification-box/blob/master/assets/apk-0.0.3/Screenshot_2021-07-05-14-24-42-73.jpg" alt="Notification Box - Android - App Icon" width="50%" height="50%">

<img src="https://github.com/TurquoiseSpace/notification-box/blob/master/assets/apk-0.0.3/Screenshot_2021-07-05-14-24-46-61.jpg" alt="Notification Box - Android - App Home / Main Screen" width="50%" height="50%">

5) click on the "LOG TOKEN" button,
it will generate the `FCM Registration Token`,
this is a client specific token, which would be used to send the push notifications to this particular android device client app,
which would look something like this

	```cuo0-PvyQkO-lL5XsqHDAk:APA91bEmCznZGGnD-huqBrbNBhzyzUgkvMyFQoVJSDf4zYbuUGrghUT0DMSz3eVV2I7tINGJWw88qqS3Mx0rGVzVnRQpqqKbDqKvmEnN9z3aSRPUK4f1JTNoZ7JZ2rA_AFTCSjUhmRhn```

which would be different for you

<img src="https://github.com/TurquoiseSpace/notification-box/blob/master/assets/apk-0.0.3/Screenshot_2021-07-05-14-24-49-32.jpg" alt="Notification Box - Android - Log / Generate Token" width="50%" height="50%">

6) click on the "COPY TOKEN" button

<img src="https://github.com/TurquoiseSpace/notification-box/blob/master/assets/apk-0.0.3/Screenshot_2021-07-05-14-24-51-68.jpg" alt="Notification Box - Android - Copy Token" width="50%" height="50%">

7) open your email, via gmail or any other email service, in app or browser, in your mobile,
send yourself this token, on email,
so you can access this token, on your laptop or desktop

<img src="https://github.com/TurquoiseSpace/notification-box/blob/master/assets/apk-0.0.3/Screenshot_2021-07-05-14-25-45-83.jpg" alt="Gmail - Android - Compose / Send Email" width="50%" height="50%">


#### Sending Push Notification - Postman ####

1) on your desktop or laptop, open your email, in which you had shared your `FCM Registration Token`,
and copy that token

![Gmail - Web Browser](https://github.com/TurquoiseSpace/notification-box/blob/master/assets/apk-0.0.3/Screenshot%20from%202021-07-05%2016-06-19.png)

2) open Postman, and paste this FCM registration token in the `raw` `JSON` Request Body, as the value of `to` attribute,
the request body would look something like this

	```
	{
		"to" : "cuo0-PvyQkO-lL5XsqHDAk:APA91bEmCznZGGnD-huqBrbNBhzyzUgkvMyFQoVJSDf4zYbuUGrghUT0DMSz3eVV2I7tINGJWw88qqS3Mx0rGVzVnRQpqqKbDqKvmEnN9z3aSRPUK4f1JTNoZ7JZ2rA_AFTCSjUhmRhn",
		"data" : {
			"title" : "testing",
			"message" : "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.",
			"json_key" : "json_value",
			"array" : [
				"hola",
				"amigos",
				"and",
				"senoritas"
			],
			"object" : {
				"inner_json_key" : "inner_json_value"
			}
		}
	}
	```

![Postman - Client - Request Body](https://github.com/TurquoiseSpace/notification-box/blob/master/assets/apk-0.0.3/Screenshot%20from%202021-07-05%2017-16-53.png)

3) in the request url, copy paste the below

	```https://fcm.googleapis.com/fcm/send```

4) set the HTTP Method as

	```POST```

5) in the Request Headers, copy paste the following header

	```Authorization:key=AAAAucpu21Y:APA91bEYxJ6XGquZzAxqJnyUYeSwi7ocOWO4iJwi676vXnRXrDn-TazsJmESzQHHv5Dx2OO3HFOk5moxzpvEPCMCv3UA5ZopDnVFBK6lOeE1qWQugDVabmN229DAXd3G7tdul7mmlYpF```

![Postman - Client - Request Header - Key Value Pair](https://github.com/TurquoiseSpace/notification-box/blob/master/assets/apk-0.0.3/Screenshot%20from%202021-07-05%2017-21-28.png)

where the header name is `Authorization` and the header value is `key=AAAAucpu21Y:APA91bEYxJ6XGquZzAxqJnyUYeSwi7ocOWO4iJwi676vXnRXrDn-TazsJmESzQHHv5Dx2OO3HFOk5moxzpvEPCMCv3UA5ZopDnVFBK6lOeE1qWQugDVabmN229DAXd3G7tdul7mmlYpF`

the value of this header contains the `API Access Key` of this project which is registered with the `Google Cloud Platform`

![Postman - Client - Request Header - Bulk Edit](https://github.com/TurquoiseSpace/notification-box/blob/master/assets/apk-0.0.3/Screenshot%20from%202021-07-05%2017-21-52.png)

6) click on `Send` button,
check the response status, must be `200 OK`,
also check the response body for `success` count as `1`

![Postman - Client - Response Status and Body](https://github.com/TurquoiseSpace/notification-box/blob/master/assets/apk-0.0.3/Screenshot%20from%202021-07-05%2017-23-57.png)

7) Voila !
You should have received the Push Notification in your Android Client


#### Receiving Push Notification - Notification Box - Android App ####

1) actual push notification

<img src="https://github.com/TurquoiseSpace/notification-box/blob/master/assets/apk-0.0.3/Screenshot_2021-07-05-17-33-20-73.jpg" alt="Notification Box - Android - Push Notification" width="50%" height="50%">

2) view the current and all the pervious push notifications, which are persisted, from the android client database

<img src="https://github.com/TurquoiseSpace/notification-box/blob/master/assets/apk-0.0.3/Screenshot_2021-07-05-17-33-28-31.jpg" alt="Notification Box - Android - Current and Previous Notifications" width="50%" height="50%">

when no push notifications are persent in the app database client

<img src="https://github.com/TurquoiseSpace/notification-box/blob/master/assets/apk-0.0.3/Screenshot_2021-07-05-14-24-56-64.jpg" alt="Notification Box - Android - No Previous Notifications" width="50%" height="50%">


## Reference Links ##

https://console.cloud.google.com/

https://guides.github.com/features/mastering-markdown/


## Git Commands ##

* List All Tags (Local)

	```git show-ref --tags```

* List All Tags (Remote)

	```git ls-remote --tags origin```

* Delete Tag (Local)

	```git tag -d <actual_tag>```

	```git tag -d 0.0.9```

* Delete Tag (Remote)

	```git push origin :<actual_tag>```

	```git push origin :0.0.9```

* Create Tag (Local)

	```git tag <actual_tag>```

	```git tag 0.0.9```

* Create Tag (Remote)

	```git push origin <actual_tag>```

	```git push origin 0.0.9```


## Contact Info ##

notification-box@googlegroups.com

Feel free to drop us an email



