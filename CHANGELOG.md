# Spark Changelog

## 2.6.3 -- July 1st, 2011 Highlights: 

*   Bug Fixes only

### Bug fix 

*   [[SPARK-615][4]] - Fixed issue with XMPP URI conference chats.
*   [[SPARK-740][5]] - XMPP URI not working in IE
*   [[SPARK-1379][6]] - Support for XEP-0147
*   [[SPARK-1383][7]] - Login screen shows disabled fields.
*   [[SPARK-1392][8]] - Check if Spark is really checking for updates even if that option is turned off
*   [[SPARK-1394][9]] - Search in history is not working
*   [[SPARK-1395][10]] - NPE when exiting a chat window with ESC 
*   [[SPARK-1396][11]] - Send Broadcast Window doesn't show when not using JTattoo
*   [[SPARK-1398][12]] - scrollToBottom causes UiThreadingViolationException when using Substance Skins 

## 2.6.2 Hot Fix -- June 23rd, 2011 Highlights: 

*   Support XMPP servers without ability to manage privacy lists

### Bug fix 

*   [[SMACK-338][13]] - IBB filetransfer doesn't work as expected

## 2.6.1 all resolved issues in Spark and Smack -- June 22nd, 2011 Highlights: 

*   File transfer bug resolved
*   Standard Mac Look and Feel on that very plattform
*   OTR (off the record) encryption for chat
*   I18n updates
*   New notification mechanism (Roar)
*   Clean up and enhancements for look and feel

### Bug fixes (35 bugs %2B 3 SMACK related) 

 
*   [[SMACK-338][13]] - IBB filetransfer doesn't work as expected  
*   [[SMACK-273][14]] - Bug in RoomListenerMultiplexor.java  
*   [[SMACK-329][15]] - XHTMLText uses improper format for br tag 
*   [[SPARK-791][16]] - Vcard cache not expiring 
*   [[SPARK-1067][17]] - System Look and Feel option should be using system theme highlighting colors 
*   [[SPARK-1080][18]] - IzPack uninstaller doesnt remove Spark entries from Programs and Features list 
*   [[SPARK-1095][19]] - Nested groups are not sorted by name 
*   [[SPARK-1164][20]] - Chat window doesnt scroll to bottom when opened 
*   [[SPARK-1177][21]] - Memory leak ChatRoom 
*   [[SPARK-1198][22]] - Spark has no button for Send Files or Capture in message window on MAC OS X 
*   [[SPARK-1200][23]] - Context menu doesn't show up in chat input area on Windows 7 
*   [[SPARK-1207][24]] - Linux version of Spark quits when doing logout 
*   [[SPARK-1253][25]] - Transport icons disappear after saving preferences 
*   [[SPARK-1274][26]] - Reverse alphabetical sorting of participants in the group chat 
*   [[SPARK-1275][27]] - contact add loses connection when no username provided 
*   [[SPARK-1280][28]] - Crtl-Backspace doe not work in Chat Windows 
*   [[SPARK-1281][29]] - Spark doesn't goes online after auto away when using Remote Desktop connection 
*   [[SPARK-1283][30]] - File transfer between 2.5.8 and 2.6.0_12222 is broken 
*   [[SPARK-1294][31]] - Spark 2.6 RC2 No Phone Call Button 
*   [[SPARK-1324][32]] - SparkToaster showing avatars in real size 
*   [[SPARK-1325][33]] - Spark File Transfer. Let spark find the right IP 
*   [[SPARK-1331][34]] - Spark-&gt;Preferences-&gt;Appearance: Null Pointer exception when no emoticon set is available 
*   [[SPARK-1336][35]] - NPE In getContactGroupByJID 
*   [[SPARK-1338][36]] - Spark 12384 is not starting with old profile 
*   [[SPARK-1340][37]] - Spark login profile picker doesn't show profiles with same names but different servers 
*   [[SPARK-1350][38]] - File transfer and windows network path 
*   [[SPARK-1351][39]] - Remove plugins does not remove plugins 
*   [[SPARK-1357][40]] - When in fullscreen mode and switching to smaller screen, spark doesnt rezise to fit smaller screen 
*   [[SPARK-1364][41]] - Investigate the Spark automatic update from the site issue 
*   [[SPARK-1366][42]] - Review padlock icon usage 
*   [[SPARK-1373][43]] - Bring Reversi back, please! 
*   [[SPARK-1375][44]] - Context Menue in roster dows not allow a broadcast to the selected user 
*   [[SPARK-1376][45]] - Fix the "Check for new version" Function 
*   [[SPARK-1383][7]] - Login screen shows disabled fields. 
*   [[SPARK-1385][46]] - Format Bug in Transcript 
*   [[SPARK-1387][47]] - Reversi is not starting 
*   [[SPARK-1388][48]] - Typo in spark i18n - avtivate 
*   [[SPARK-1389][49]] - History is diplayed twice 

### New Features, Improvements, Tasks (55 issues) 

*   [[SPARK-548][50]] - Add support for animated gifs as avatars 
*   [[SPARK-884][51]] - OTR support for chat 
*   [[SPARK-1277][52]] - Installer should include Java 1.6.0 (build 10) or higher 
*   [[SPARK-1278][53]] - Allow Nimbus Skinning 
*   [[SPARK-1303][54]] - Preferences: Automatically join Groupchat (muc) on invite 
*   [[SPARK-1323][55]] - Allow larger VCard Images 
*   [[SPARK-1342][56]] - MotD opens in Fullscreen since Spark 2.6.0 update 
*   [[SPARK-1344][57]] - Add some more plugins to 2.6.1 
*   [[SPARK-1345][58]] - Reduce the delivered skins to the usable ones 
*   [[SPARK-1352][59]] - Prevent messages from the server to be stored in Client history 
*   [[SPARK-1354][60]] - Force 32 bit execution on Mac Plattfom 
*   [[SPARK-1359][61]] - Plugin Blacklist 
*   [[SPARK-1367][62]] - Speelchecker default Language 
*   [[SPARK-1369][63]] - When debugger enabled should be able to send raw packets somehow 
*   [[SPARK-1379][6]] - Support for XEP-0147 
*   [[SPARK-948][64]] - Bring window to front shouldnt steal focus 
*   [[SPARK-984][65]] - Should be an option to disable username color randomizer in MUC 
*   [[SPARK-1218][66]] - Make Room Configuration dialog translatable 
*   [[SPARK-1220][67]] - Create FlashWindow.dll 64-bit version 
*   [[SPARK-1235][68]] - Add context menu to Ctrl-F, Ctrl-E, Ctrl-T dialogs 
*   [[SPARK-1254][69]] - Select Spellchecker Language in Chatwindow 
*   [[SPARK-1316][70]] - Privacy Plugin needs refactoring 
*   [[SPARK-1332][71]] - Make possible to translate hardcoded strings 
*   [[SPARK-1333][72]] - Update Lithuanian translation 
*   [[SPARK-1334][73]] - Add the login server as STUN server to spark.properties 
*   [[SPARK-1335][74]] - Spark should save received broadcast messages in the chat history 
*   [[SPARK-1341][75]] - Profile picker button should have a button design (with a border) 
*   [[SPARK-1343][76]] - Broadcast window covers whole screen if message is longer than {1*10^x , x?R&gt;5} characters 
*   [[SPARK-1346][77]] - PluginLoader should get a 1.x.x_xx tag 
*   [[SPARK-1347][78]] - apple plugin needs configurable behaviour 
*   [[SPARK-1348][79]] - Make possible to set Join on startup from other interface 
*   [[SPARK-1349][80]] - Option to disable translator plugin 
*   [[SPARK-1361][81]] - If History has more than 5000 Messages it takes forever to load 
*   [[SPARK-1372][82]] - Clicking the [X] in the contact subscription request should be the same as "Decline" 
*   [[SPARK-1230][83]] - Masterticket: Translations 
*   [[SPARK-1298][84]] - Clean Up Spark UI 
*   [[SPARK-1322][85]] - Rename Debian package 
*   [[SPARK-1360][86]] - Check FMJ lib for revision 
*   [[SPARK-1368][87]] - Check Spark 2.6.1 on W7 without admin rights 
*   [[SPARK-1380][88]] - Exchange of the Spark Spash Screen 
*   [[SPARK-1384][89]] - Change XMPP Ressource String 
*   [[SPARK-1386][90]] - Privacy Plugin shouldn't load if not supported 
*   [[SPARK-1390][91]] - Remove games from the release 
*   [[SPARK-804][92]] - MSN Offline users in roster 
*   [[SPARK-854][93]] - reconect hangs within "Reconnecting ..." 
*   [[SPARK-1167][94]] - New chat window steals focus when Spark receives new message 
*   [[SPARK-1265][95]] - Fix tabs stacking direction and tabs size with multirow tabbar 
*   [[SPARK-1290][96]] - Redesign "Invisible" Button 
*   [[SPARK-1304][97]] - Allow to hide the conference tab in the Spark screen 
*   [[SPARK-1337][98]] - Create Button to login with other Profiles in LoginDialog 
*   [[SPARK-1353][99]] - JTattoo Render Error 
*   [[SPARK-1358][100]] - Add features to default.properties FILE\_TRANSFER\_WARNING\_SIZE and FILE\_TRANSFER\_MAXIMUM\_SIZE 
*   [[SPARK-1370][101]] - W7 64 Bit: Plugin's are missing 
*   [[SPARK-1371][102]] - Add tooltip to button in chat window 
*   [[SPARK-1374][103]] - Spark freezes on close 

## 2.6.0 all resolved issues in Spark and Smack -- May 6th, 2011 Highlights: 

*   Large parts of the code were licenced as Apache 2.0
*   Commercial packages were removed in favour of open source solutions
*   Updated Smack library to 3.2
*   Fixes for roster management and reconnection mechanisms
*   Reworked look and feel
*   New skinning library
*   I18n updates
*   Clean error log after startup
*   Support for privacy mode
*   Spark does not call hard coded fallback servers for STUN services anymore
*   Major feature updates for conference rooms
*   More preferences
*   Ability to set default data in ini files for corporate customizing 

### New Features &amp; Improvements (more than 190 issues)

*   [[SMACK-137][104]] - File Transfer Settings
*   [[SMACK-156][105]] - Add the ability to register for roster events before logging in
*   [[SMACK-175][106]] - fix UNSUBsCRIPTION_PENDING in RosterPacket
*   [[SMACK-235][107]] - Improve performance of Roster class
*   [[SMACK-240][108]] - Update Jingle implementation to newest version
*   [[SMACK-241][109]] - Update Base64 implementation to match Openfire's
*   [[SMACK-244][110]] - Update JSTUN to 0.7.2
*   [[SMACK-245][111]] - Update Jingle implementation to newest version
*   [[SMACK-246][112]] - Improve Jingle logging using commons-logging
*   [[SMACK-247][113]] - Keep Jingle compliant with on-going protocol development.
*   [[SMACK-254][114]] - Offer an alternative to loading the Roster on login
*   [[SMACK-261][115]] - Minor Jingle cleanup to better support Jingle in Spark
*   [[SMACK-277][116]] - Update XMLUnit to the latest version
*   [[SMACK-282][117]] - Support SASL-related error conditions.
*   [[SMACK-285][118]] - Add support for Nicks
*   [[SMACK-289][119]] - There is no way of retrieving items from a pubsub node when the user has multiple subscriptions.
*   [[SMACK-294][120]] - Handle empty roster groups and no goups in the same way
*   [[SMACK-295][121]] - Fire reconnectionSuccessful event when session is established
*   [[SMACK-297][122]] - add configuration for local Socks5 proxy
*   [[SMACK-298][123]] - Respond to all incoming Socks5 bytestream requests
*   [[SMACK-299][124]] - Improve accepting of Socks5 bytestream requests
*   [[SMACK-300][125]] - improve local Socks5 proxy implemetation
*   [[SMACK-301][126]] - support for bytestream packets to query Socks5 proxy for network address
*   [[SMACK-302][127]] - Improve establishing of Socks5 bytestreams
*   [[SMACK-303][128]] - integrate of the extracted Socks5 bytestream API in file transfer API
*   [[SMACK-304][129]] - Extend the IQ API to create empty IQ results and IQ error response packets
*   [[SMACK-307][130]] - Improve Message Parser Robustness and Message Body I18N
*   [[SMACK-309][131]] - Fully implement XEP-0047 In-Band Bytestreams
*   [[SMACK-310][132]] - Add Support for Localized Message Subjects
*   [[SMACK-317][133]] - PrivacyItem class changes
*   [[SMACK-142][134]] - Add support for Kerberos/NTLM
*   [[SMACK-210][135]] - Support MD5 SASL
*   [[SMACK-226][136]] - Need to add in http/socks proxy support to XMLConnection.
*   [[SMACK-242][137]] - Add support for JEP-50: ad-hoc commands
*   [[SMACK-251][138]] - Add support for XEP-0163: Personal Eventing Protocol
*   [[SMACK-255][139]] - Add ability to set mime type for avatar
*   [[SMACK-256][140]] - Add support for new sophisticated TLS mechanisms including SmartCard and Apple's KeychainStore
*   [[SMACK-272][141]] - Add support for pubsub (XEP-0060)
*   [[SMACK-296][142]] - Add support for XEP-0224: Attention
*   [[SMACK-319][143]] - Add common interfaces for SOCKS5 Bytestreams and In-Band Bytestreams
*   [[SMACK-279][144]] - SMACK-187 Create a abstract connection class to allow other implementations connecting to a XMPP server.
*   [[SMACK-280][145]] - SMACK-187 The authentification should use the Connection#sendPacket method and work transparent with packets and packet listeners.
*   [[SMACK-281][146]] - SMACK-187 Move IQ and stream error parsing from PacketReader which depends on the connection type to PacketParserUtils.
*   [[SMACK-259][147]] - Update XPP library to latest version
*   [[SMACK-283][148]] - Investigate why Jingle is connecting to stun.xten.net
*   [SPARK-1321] - Update Smack to final release 3.2
*   [SPARK-1319] - Review Tray Icon of Spark on Windows
*   [SPARK-1318] - STUN fallback in error log
*   [SPARK-1317] - Privacy Plugin causes error log entry at startup
*   [SPARK-1312] - Load plugins before Login page and workspace are initialized
*   [SPARK-1308] - JTattoo menubar decoration
*   [SPARK-1307] - Update build.xml to support Ant 1.8
*   [SPARK-1300] - Remove Buttons from Spark
*   [SPARK-1293] - Include JGoodies as LaF
*   [SPARK-1103] - Add an option to register with conference room
*   [SPARK-1091] - Create an installer for Mac OS X
*   [SPARK-1060] - Spark should remember Preferences window (and others) position on the screen
*   [SPARK-1050] - Create a horizontal scrollbar in the emoticons picker for large emoticons packages
*   [SPARK-1037] - Timing issue prevents contact list from updating correctly
*   [SPARK-1035] - Add ability to have an invisible presence
*   [SPARK-764] - Auto-reconnect does not send available presence or ask for roster
*   [SPARK-744] - Spark fails to login after restore from Hibernation
*   [SPARK-726] - Spark needs to use the users presence prior to reconnect.
*   [SPARK-533] - Buzz feature improvements
*   [[SPARK-915][149]] - Tab completion of conference room nicknames
*   [[SPARK-1105][150]] - Spark should indicate different permissions in MUC with additional icons or colors
*   [[SPARK-1187][151]] - Auto tab completion in Spark
*   [[SPARK-1261][152]] - Default properties should be stored visible in the Spark bin directory
*   [[SPARK-1264][153]] - Show Transports in tab
*   [[SPARK-1090][154]] - Spark should show time stamps in the full history
*   [[SPARK-1175][155]] - label.message shows &amp; in most translations
*   [[SPARK-1222][156]] - [Patch ready to commit] Update Lithuanian translation
*   [[SPARK-1259][157]] - Add to i18n new strings in Codecs menu
*   [[SPARK-1124][158]] - Chat window is not flashing when receiving new message
*   [[SPARK-1009][159]] - Make gateway icons more transparent to fit with new theme
*   [[SPARK-1010][160]] - On toast popup from a MUC show the nickname of whoever said the comment
*   [[SPARK-1012][161]] - Update Jingle implementation to latest in Smack
*   [[SPARK-1024][162]] - Add finish translation
*   [[SPARK-1025][163]] - Make rename global and not limited to just the contact list
*   [[SPARK-1032][164]] - Improve the downloading class
*   [[SPARK-1036][165]] - Refactor JinglePlugin to correctly utilize the latest Smack/Jingle library
*   [[SPARK-1040][166]] - Need to release a new SmackLib that includes part of the changes needed to make Jingle work in Spark
*   [[SPARK-1043][167]] - Should automatically set Away status when Desktop is locked
*   [[SPARK-1044][168]] - Replace spellchecker with new multi-language spellchecker
*   [[SPARK-1047][169]] - Improve support of transparent avatars
*   [[SPARK-1054][170]] - Swedish translation
*   [[SPARK-1065][171]] - Change Library from JMF to FMJ
*   [[SPARK-1070][172]] - Spark should have a faster reaction on mouse movements when changing status
*   [[SPARK-1077][173]] - Add localization support for hardcoded strings in the GUI
*   [[SPARK-1086][174]] - Change the title of the broadcast message sent from the server
*   [[SPARK-1090][154]] - Spark should show time stamps in the full history
*   [[SPARK-1093][175]] - Add Expand/Collapse all Groups to shared groups
*   [[SPARK-1102][176]] - Updated Russion translation for spark &amp; spellchecker plugin
*   [[SPARK-1107][177]] - Updated Chinese translation
*   [[SPARK-1115][178]] - Update build.properties with external resources information
*   [[SPARK-1119][179]] - Spark should parse /me in toast popup
*   [[SPARK-1120][180]] - Spark should show who has changed room's topic
*   [[SPARK-1121][181]] - Should be a way to copy URL without selecting the whole URL text
*   [[SPARK-1123][182]] - Linux system tray improvements
*   [[SPARK-1125][183]] - Make deb package compatible with Ubuntu 9.10
*   [[SPARK-1127][184]] - Correction of lithuanian translation
*   [[SPARK-1128][185]] - Add a divider between recent conversation and current conversation in a chat window
*   [[SPARK-1136][186]] - Add i18n file to FastPath plugin
*   [[SPARK-1137][187]] - Improve latencies in softphone DTMF tone soundings
*   [[SPARK-1139][188]] - Improved linux startup.sh
*   [[SPARK-1142][189]] - Replace synthetica with substance
*   [[SPARK-1145][190]] - Add Korean language
*   [[SPARK-1156][191]] - Remove double happy emoticon in default set
*   [[SPARK-1157][192]] - Cleaned up resource bundle for Spark
*   [[SPARK-1159][193]] - improve error logging
*   [[SPARK-1174][194]] - Korean translation update
*   [[SPARK-1178][195]] - Update turkish translation
*   [[SPARK-1184][196]] - Make Spark search for a profile in old profile location
*   [[SPARK-1190][197]] - "Alert when user is available" should open a new chat window
*   [[SPARK-1208][198]] - Change the default file transfer save path
*   [[SPARK-1220][67]] - Create FlashWindow.dll 64-bit version
*   [[SPARK-1247][199]] - Fix naming of the new setting about showing muc roles icons
*   [[SPARK-1259][157]] - Add to i18n new strings in Codecs menu
*   [[SPARK-229][200]] - Combine username and server into a single field
*   [[SPARK-251][201]] - Conference button in one-to-one Chat Does Not Show Feedback to the User
*   [[SPARK-254][202]] - Chat History needs to be seperated into two files.
*   [[SPARK-372][203]] - change "Force Old SSL" to "Force TLS" within the advanced options
*   [[SPARK-373][204]] - move SysTray code into a plugin
*   [[SPARK-375][205]] - allow to select the language during installation or later
*   [[SPARK-38][206]] - Add support for configuring the list of owners, admins, ban list and members list
*   [[SPARK-389][207]] - MUC, direct chat: chat history uses room name and not user name
*   [[SPARK-412][208]] - improve "Refresh" in "Browse Conference Rooms" window
*   [[SPARK-413][209]] - improve display of buttons in "Browse Conference Rooms"
*   [[SPARK-431][210]] - add "Save / Apply" and a "Cancel" button to Preferences Dialog
*   [[SPARK-496][211]] - Add preference to change look and feel
*   [[SPARK-671][212]] - hide "show chat history" button if chat history is disabled
*   [[SPARK-677][213]] - Hide Offline Users option in the roster
*   [[SPARK-678][214]] - Alphabetize offline users in the roster
*   [[SPARK-700][215]] - Add an option to turn off Spark's update-checking feature
*   [[SPARK-849][216]] - "[ ] Enable Emotions" should disable more
*   [[SPARK-87][217]] - Add ability to view users VCard in Group Chat.
*   [[SPARK-912][218]] - Localization improvements w/ bonus other improvements
*   [[SPARK-930][219]] - Offline contacts in broadcast window
*   [[SPARK-933][220]] - Should show avatars in roster instead of transport icons
*   [[SPARK-934][221]] - SysTray icon behaviour on click, double click
*   [[SPARK-940][222]] - Startup registry entry and Preferences setting issue
*   [[SPARK-954][223]] - Need an option to disable showing previous conversation in chat window
*   [[SPARK-959][224]] - Broadcast dialog input field should do text wrapping
*   [[SPARK-963][225]] - Should be an option to switch to 24h time format in chat window
*   [[SPARK-970][226]] - Improve highliting of tabs
*   [[SPARK-975][227]] - Add an option to delete entries in Tasks permanently
*   [[SPARK-980][228]] - Add an option to disable vcard popups
*   [[SPARK-993][229]] - Improve the GUI
*   [[SPARK-1011][230]] - When someone says my name in an MUC, show a custom toast popup if enabled
*   [[SPARK-1018][231]] - Add options to expand and collapse all groups together
*   [[SPARK-1049][232]] - Turkish Language Pack
*   [[SPARK-1052][233]] - Create a new ant target to make an IzPack and RPM Installer
*   [[SPARK-1057][234]] - Add an option to suppress join/leave messages in the group chat
*   [[SPARK-1072][235]] - Add an option to make chat window always stay on top
*   [[SPARK-1076][236]] - Add lithuanian translation
*   [[SPARK-1078][237]] - Add Lithuanian Spelling option
*   [[SPARK-1105][150]] - Spark should indicate different permissions in MUC with additional icons or colors
*   [[SPARK-1108][238]] - Spark Kirghiz translation
*   [[SPARK-1110][239]] - Jingle and Flashing plugin Chinese (CHN) translation
*   [[SPARK-1135][240]] - Add Korean translation
*   [[SPARK-1141][241]] - Allow to disable the add contact feature
*   [[SPARK-1143][242]] - Add Plugin Dependencies
*   [[SPARK-1146][243]] - Fastpath Brasilian translation
*   [[SPARK-1147][244]] - Phonebook for SIPClient
*   [[SPARK-1148][245]] - Support Speex and iLBC Codec
*   [[SPARK-1149][246]] - Allow to disable and reorder sip codecs
*   [[SPARK-1187][151]] - Auto tab completion in Spark
*   [[SPARK-1201][247]] - Create a plugin to add Send button to chat input area
*   [[SPARK-1246][248]] - Publish smack.packet.PrivacyItem class setOrder() for RC2
*   [[SPARK-1250][249]] - Scroll Bar does not scroll for a window
*   [[SPARK-1261][152]] - Default properties should be stored visible in the Spark bin directory
*   [[SPARK-409][250]] - option to disable the password change fields
*   [[SPARK-448][251]] - show offline users in their group and not in offline group
*   [[SPARK-467][252]] - Persist search information when doing user searches on multiple search services.
*   [[SPARK-640][253]] - File Transfer detection with disabling if necessary
*   [[SPARK-724][254]] - Reorder tabs in chat window
*   [[SPARK-730][255]] - Skin: Need to key account login from users Enterprise License.
*   [[SPARK-736][256]] - Set Spark away when workstation is locked.
*   [[SPARK-739][257]] - Need to add a turkish translation to Spark.
*   [[SPARK-799][258]] - Server is editable on failed login
*   [[SPARK-801][259]] - Add a SpellChecker in other languages
*   [[SPARK-877][260]] - Add a Re-Detect Audio Devices to SparkPhone
*   [[SPARK-896][261]] - Spark chat logs should be searchable
*   [[SPARK-915][149]] - Tab completion of conference room nicknames
*   [[SPARK-928][262]] - Hide Offline group option
*   [[SPARK-943][263]] - Add an option to read and copy contact's status message
*   [[SPARK-947][264]] - Add QQ transport support?
*   [[SPARK-961][265]] - Option to leave nickname blank by default in add contact window
*   [[SPARK-971][266]] - System Tray notification about incoming messages
*   [[SPARK-972][267]] - Typing Notification in System Tray
*   [[SPARK-991][268]] - Group Chat Highlighting

### Bug Fixes (more than 250 issues)

*   [[SMACK-330][269]] - Added missing node attribute in the item element for pubsub.
*   [[SMACK-325][270]] - Reconnection Manager can be running twice
*   [[SMACK-334][271]] - Error in form for FileTransferNegotiator
*   [[SMACK-163][272]] - Fix NPE in RoomInfo when subject has not value
*   [[SMACK-207][273]] - Parsing of messages may disconnect Smack/Spark
*   [[SMACK-225][274]] - Improper handeling of DNS SRV records
*   [[SMACK-232][275]] - Better handling of Roster error
*   [[SMACK-236][276]] - Rename stanza error "unexpected-condition" to "unexpected-request"
*   [[SMACK-243][277]] - Packet with wrong date format makes Smack to disconnect
*   [[SMACK-258][278]] - Fix disconnection issue when parsing SASL success that contains a payload
*   [[SMACK-260][279]] - error presence packets when server is down
*   [[SMACK-264][280]] - fix for NPE in SASLMechanism.java
*   [[SMACK-269][281]] - Smack 3.1.0 creates a new chat for every incoming message
*   [[SMACK-271][282]] - Deadlock in XMPPConnection while login and parsing stream features
*   [[SMACK-275][283]] - Patch: Fix for broken SASL DIGEST-MD5 implementation
*   [[SMACK-288][284]] - The parsing of the result for a LeafNode.getItems() call is incorrect. It creates a DefaultPacketExtension instead of an Item for every other item in the result.
*   [[SMACK-290][285]] - Deadlock while getting Roster before it's initialized
*   [[SMACK-291][286]] - RosterGroup modifications should depend on roster push
*   [[SMACK-293][287]] - Support optional roster subscription attribute
*   [[SMACK-305][288]] - RosterEntry#getGroups causing a roster reload
*   [[SMACK-308][289]] - Multiple errors in pubsub GetItemsRequest
*   [[SMACK-312][290]] - Only fire RosterListener#entriesUpdated for RosterEntries that changed
*   [[SMACK-313][291]] - Pubsub library doesn't allow the packet id to be specified.
*   [[SMACK-316][292]] - Smack FromMatchesFilter behaves wrong with chats with similar names
*   [[SMACK-321][293]] - Usage of SimpleDateFormat is not threadsafe
*   [[SMACK-327][294]] - getFeatures() method on DiscoverInfo is improperly set to be package protected instead of public
*   [[SMACK-328][295]] - Number format exception while parsing dates.
*   [[SMACK-332][296]] - Smack 3.2.0b2 shows wrong version in Smack Dubugger Window
*   [SPARK-1320] - Errors in privacy plugin i18n string
*   [[SPARK-1315][297]] - Spark cannot find spark.jar to load different languages
*   [[SPARK-1310][298]] - Local users are loading slowly
*   [[SPARK-1309][299]] - Colorsettings are possibly outdated if profile not cleaned regularly and colors.tab is deactivated
*   [[SPARK-1305][300]] - No rooms are shown in room browser
*   [[SPARK-1295][301]] - Left menu panel in Preferences gets squeezed
*   [[SPARK-1294][31]] - Spark 2.6 RC2 No Phone Call Button
*   [[SPARK-743][302]] - Changes in the user.home directory
*   [[SPARK-1130][303]] - Spark behaves wrong with chats with similar names
*   [[SPARK-1270][304]] - Name Completion on Shared Rosters without Vcards causes NPE
*   [[SPARK-1268][305]] - Cursor changes to hand after sending a message
*   [[SPARK-1267][306]] - Set a default size for Preferences window for new profiles
*   [[SPARK-1183][307]] - Spellchecker is not working normally
*   [[SPARK-1161][308]] - Set a default minimum size of a tab
*   [[SPARK-1068][309]] - Spark is not reacting to outside keyboard events when setting the auto Away status 
*   [[SPARK-1209][310]] - Agent names are missing in Fastpath Online Agents tab
*   [[SPARK-1260][311]] - Search Dialog error
*   [[SPARK-1262][312]] - BUG: spark\_2\_6\_0\_12103 : spark download folder not working
*   [[SPARK-618][313]] - Fixed multiple message issue with Broadcast.
*   [[SPARK-1004][314]] - if a username is too long then it gets cut off
*   [[SPARK-1016][315]] - Spark should preserve custom status between automatic changes of presence
*   [[SPARK-1019][316]] - Spark IRC support passing wrong variable for nickname
*   [[SPARK-102][317]] - Changing temp conf room name to permanent name leads to odd behavior
*   [[SPARK-1020][318]] - is part of SPARK-1228 Spark shows wrong popup upon receiving group chat invitation
*   [[SPARK-1022][319]] - Linux Tray Icon not appearing
*   [[SPARK-1023][320]] - Add remove button to call history
*   [[SPARK-1027][321]] - Prevent duplicate conferences
*   [[SPARK-1028][322]] - Spark is still showing null avatars/display pictures
*   [[SPARK-1029][323]] - Clicking the information button will send the chat text field
*   [[SPARK-1034][324]] - Spark 2.6.0b2 Does not display the entire preference window.
*   [[SPARK-1038][325]] - Spark does not currently build on OS X
*   [[SPARK-1039][326]] - Fastpath does not compile against latest Smack
*   [[SPARK-1041][327]] - Update Spanish translation
*   [[SPARK-1046][328]] - Log out with reason not work on other langauges
*   [[SPARK-1048][329]] - Correct accuracy of screenshot
*   [[SPARK-1055][330]] - is part of SPARK-1224 Make an option to supress the reconnection popup
*   [[SPARK-1056][331]] - Save Spark window positions on non-primary screen
*   [[SPARK-1059][332]] - Show a toast popup when "Alert when available" is selected
*   [[SPARK-1061][333]] - Show new messages in systemtray option is not working
*   [[SPARK-1063][334]] - Spark is not reacting to keyboard events when setting the auto Away status
*   [[SPARK-1064][335]] - Scratchpad (Tasks) Dialog has graphical errors
*   [[SPARK-1069][336]] - Spark continuos flashing continues to flash after the chat window gets focus
*   [[SPARK-1081][337]] - Spark is now showing APPLICATION_NAME in the tooltip
*   [[SPARK-1082][338]] - Spark is showing 2 systray icons on 64-bit Windows 7
*   [[SPARK-1083][339]] - Fix gateway icons toolbar initialization
*   [[SPARK-1085][340]] - Add Fastpath plugin to a Spark build
*   [[SPARK-1089][341]] - Spark should show 24h time stamps in a previous conversation history
*   [[SPARK-1092][342]] - Spark is not showing Canned responses stored on the server and cant create new ones
*   [[SPARK-1096][343]] - Custom status messages should be sorted by name
*   [[SPARK-1097][344]] - Delete the obsolete Available translation string from the i18n file
*   [[SPARK-1099][345]] - Spark is showing received message twice in MUC private chat
*   [[SPARK-1101][346]] - Fix typos in Russian translation file
*   [[SPARK-1109][347]] - incorrect charset in method MediaPreferencePanel.scanDevices on Windows 2000(CHN)
*   [[SPARK-1111][348]] - Recent conversation is still showing after history cleaning with not english GUI language
*   [[SPARK-1112][349]] - Minor visual issues with history cleaning
*   [[SPARK-1116][350]] - Private chat history in MUC is not saving
*   [[SPARK-1117][351]] - Can't change priority field of a custom status
*   [[SPARK-1118][352]] - Not possible to resize text input area in the chat window
*   [[SPARK-1122][353]] - Spark is not sending typing notifications
*   [[SPARK-1124][158]] - is part of SPARK-1228 Chat window is not flashing when receiving new message
*   [[SPARK-1126][354]] - Chat window doesnt appear upon receiving new message
*   [[SPARK-1129][355]] - Idle Enabled shouldn't override a custom Away status
*   [[SPARK-1130][303]] - Spark behaves wrong with chats with similar names
*   [[SPARK-1131][356]] - Log out stopped working in the latest SVN
*   [[SPARK-1132][357]] - Couldn't Get all contact items from ContactList
*   [[SPARK-1133][358]] - Contact list issue
*   [[SPARK-1138][359]] - Softphone panel not redisplaying after close
*   [[SPARK-1140][360]] - Change to Apache 2.0 license
*   [[SPARK-1144][361]] - Ant buildscript should not check for explicit Ant version numbers
*   [[SPARK-1151][362]] - Taskbar Flashing and Spellchecker tabs not available in Preferences
*   [[SPARK-1152][363]] - Startup.sh doesn't work on Ubuntu 10.04
*   [[SPARK-1153][364]] - Wrong contacts count on reconnect
*   [[SPARK-1154][365]] - Linux version doesn't have Log out option
*   [[SPARK-1155][366]] - Empty messages in Group Chat
*   [[SPARK-1158][367]] - Group title doesn't updates after moving ContactItem from one group to another
*   [[SPARK-1163][368]] - Spark displays wrong error when nickname change is forbidden
*   [[SPARK-1164][20]] - Chat window is not positioning at the last history message when opening window
*   [[SPARK-1166][369]] - Spark is not showing a progress of file transfer
*   [[SPARK-1168][370]] - Offline users are shown on login when option is set to not to show them
*   [[SPARK-1169][371]] - is part of SPARK-1229 Spark shows offline roster after reconnecting
*   [[SPARK-1171][372]] - Chat window is not drawn correctly when opened on a primary monitor
*   [[SPARK-1172][373]] - Flashing and Spellchecker options are absent in Preferences
*   [[SPARK-1173][374]] - Reconnection with new and different IP fails after network loss
*   [[SPARK-1180][375]] - Fix the placement of the Bookmarks menu
*   [[SPARK-1182][376]] - File path for a URL bookmark is not working
*   [[SPARK-1186][377]] - Ctrl %2B W not working as expected in chat window
*   [[SPARK-1189][378]] - Spark systray menu is overlapped by vertical taskbar
*   [[SPARK-1194][379]] - Move/copy contact item to new group don't check item into new group offline contacts
*   [[SPARK-1196][380]] - is part of SPARK-1223 Spellchecker Bug: Java AWT-EventQueue-1 - null pointer exception
*   [[SPARK-1206][381]] - is part of SPARK-1228 New chat window is not opened while receiving offline messages on login
*   [[SPARK-1211][382]] - Spark doesn't show room in the rooms list
*   [[SPARK-1212][383]] - Shouldn't be able to search for yourself and add yourself to a roster
*   [[SPARK-1213][384]] - Spark duplicates rooms in the conference browser when hitting Refresh button fast
*   [[SPARK-1216][385]] - Upgrade Smack in Trunk to Smack 3.2 beta 2
*   [[SPARK-1217][386]] - Locales prevent Plugins from loading
*   [[SPARK-1219][387]] - is part of SPARK-1230 Polish translation
*   [[SPARK-1221][388]] - is part of SPARK-1223 Bookmark Plugin causes error in error log
*   [[SPARK-1225][389]] - is part of SPARK-1223 Warning Log4J: No appenders could be found for logger
*   [[SPARK-1226][390]] - is part of SPARK-1223 SIP Codec causes error on load
*   [[SPARK-1227][391]] - is part of SPARK-1223 [Patch] Remove sound driver report from error log
*   [[SPARK-1229][392]] - Masterticket: Roster Management
*   [[SPARK-1231][393]] - Wrong time on loading history messages in conferences
*   [[SPARK-1233][394]] - [Patch ready to commit] Mouse Click on Avatar in VCard Preview opens another VCard Preview
*   [[SPARK-1237][395]] - Remove stun.xten.net as fixed URL for STUN fall back from Jingle. This should be set in spark.properties
*   [[SPARK-1240][396]] - Spark is not saving "Show empty groups" setting between restarts
*   [[SPARK-1241][397]] - is part of SPARK-1223 UiThreadingViolationException when loading Flashing Plugin
*   [[SPARK-1242][398]] - Group disappears after a rename.
*   [[SPARK-1248][399]] - is part of SPARK-1223 ArrayIndexOutOfBoundsException in javax.swing.plaf.basic.BasicListUI.updateLayoutState
*   [[SPARK-1249][400]] - is part of SPARK-902 item-not-found(404) in PrivacyManager
*   [[SPARK-1251][401]] - is part of SPARK-902 PrivacyPlugin causes NullPointerE. when clicking on "block contact"
*   [[SPARK-1252][402]] - is part of SPARK-902 PrivcyPlugin No rightclick menu on ContactGroups
*   [[SPARK-1255][403]] - Translator plugin is not working
*   [[SPARK-1256][404]] - Remove &amp; from Check for updates menu entry
*   [[SPARK-158][405]] - Unable to open files after file transfer.
*   [[SPARK-210][406]] - Kicked out user gets incomplete message, and upon re-entry, doesn't see other room participants
*   [[SPARK-237][407]] - Add debug mode to allow for full debugging capabilities on startup.
*   [[SPARK-24][408]] - Memory does not decrease after closing chat window.
*   [[SPARK-261][409]] - Paste in ChatWindow does not work as expected.
*   [[SPARK-278][410]] - URL parser issues
*   [[SPARK-284][411]] - Same Alt-? hotkeys set for different options on the same menu
*   [[SPARK-286][412]] - unicode display bug / window title
*   [[SPARK-311][413]] - File Transfer Not Possible Unless User Is in Contact List
*   [[SPARK-340][414]] - is part of SPARK-1229 Duplicate text entries appear when reconnecting Spark
*   [[SPARK-349][415]] - MUC / Create Room: fix strange behaviour
*   [[SPARK-381][416]] - Users with European characters in their JID can not login
*   [[SPARK-404][417]] - Chat history should be saved on a timer and on shutdown.
*   [[SPARK-421][418]] - Add new file transfer within HTML Viewer.
*   [[SPARK-423][419]] - Need a default Spark Theme for the Chat Window themes.
*   [[SPARK-455][420]] - Auto away status does not work in LInux version of Spark
*   [[SPARK-458][421]] - Add support for 64 bit machines
*   [[SPARK-475][422]] - Spark 2.0.8 custom skin w/ wildfire spark version set, always thinks there's a newer version
*   [[SPARK-547][423]] - Decrease screenshot memory usage
*   [[SPARK-570][424]] - display all received chat messages
*   [[SPARK-572][425]] - Custom status messages under "On Phone" status now show as phone icon.
*   [[SPARK-575][426]] - Spark does not un-escape usernames properly
*   [[SPARK-581][427]] - Fix cut and paste issue in Chat Window.
*   [[SPARK-586][428]] - remove top-left JMC window
*   [[SPARK-608][429]] - Updated Spark to use latest workgroup api.
*   [[SPARK-619][430]] - On Linux a user does not come back from the "Away due to idle" to "Available"
*   [[SPARK-624][431]] - ChatRoomNotFoundException receiving a broadcast
*   [[SPARK-625][432]] - Fixes for Jingle on Linux
*   [[SPARK-627][433]] - Fixes for SIP on Debian
*   [[SPARK-631][434]] - Fix layout for long names in roster
*   [[SPARK-632][435]] - Small "Join Conference Room" windows in Linux and Vista
*   [[SPARK-637][436]] - BUZZ highlight chat tab
*   [[SPARK-64][437]] - some animated avatars don't work
*   [[SPARK-657][438]] - Improvements for Private Chats from a Conference Room
*   [[SPARK-667][439]] - Spark should only transform first /me
*   [[SPARK-690][440]] - JMF cannot find formats on VISTA
*   [[SPARK-692][441]] - multiple bugs with 64-bit OS on LInux
*   [[SPARK-696][442]] - Roster gets out of order over time
*   [[SPARK-697][443]] - Unable to load plugin TranslatorPlugin
*   [[SPARK-699][444]] - Spark is sending multiple, duplicate, inconsistent Disco Info responses
*   [[SPARK-706][445]] - Usernames need to be escaped when looking up profiles.
*   [[SPARK-708][446]] - Need to remove any network calls when opening a chat room.
*   [[SPARK-71][447]] - Custom status messages should be available in system tray
*   [[SPARK-710][448]] - Right-click on URL link inside transcript window causes browser to be invoked.
*   [[SPARK-712][449]] - Groupchat List can become corrupted.
*   [[SPARK-713][450]] - URLs with commas break before first comma
*   [[SPARK-715][451]] - Login screen uses password from memory if it exists and not the login field.
*   [[SPARK-720][452]] - Communication end is not interpreted
*   [[SPARK-721][453]] - Rejecting a SIP call in Spark does not reject the hard phone call
*   [[SPARK-734][454]] - Error: Couldn't find per display information - JDK 1.6 on Linux
*   [[SPARK-741][455]] - Incorrect list of people in the group chat
*   [[SPARK-749][456]] - Ctrl%2BF does not sort user names
*   [[SPARK-750][457]] - chat history not saved
*   [[SPARK-756][458]] - Users Leave and Rejoin Groupchat Causes Them to Not Appear in User List
*   [[SPARK-762][459]] - Can Receive Multiple Invitations To The Same Room
*   [[SPARK-765][460]] - Messages without type attribute are displayed twice (broadcasts)
*   [[SPARK-769][461]] - is part of SPARK-1229 Autoreconnect does not always complete the "session establishment" and does not request users' presence
*   [[SPARK-772][462]] - registration / JID escaping
*   [[SPARK-776][463]] - Remove systray icon after close
*   [[SPARK-777][464]] - is part of SPARK-1229 Hidden Empty Groups do not become visible
*   [[SPARK-780][465]] - is part of SPARK-1224 Cannot load contacts on reconnection
*   [[SPARK-788][466]] - Some avatars are not correctly displayed
*   [[SPARK-789][467]] - Some text not internationalized
*   [[SPARK-806][468]] - Chat text box does not have a scroll when the text to send is large
*   [[SPARK-814][469]] - is part of SPARK-1155 Empty Conversations in Group Chat
*   [[SPARK-815][470]] - Local time is not completed in the Client Version
*   [[SPARK-816][471]] - The google talk emoticon: m/ is not translated to gif
*   [[SPARK-824][472]] - Group Chat Messages from blocked users are displayed in the Toast Popup
*   [[SPARK-835][473]] - Update translations inside Spark
*   [[SPARK-841][474]] - Spark does not notify a user when they are removed from the room.
*   [[SPARK-848][475]] - Jabber:IQ:Time not showing up on request.
*   [[SPARK-861][476]] - Spark skinning windows installer requires MSVCR71.dll
*   [[SPARK-872][477]] - Skinned spark does not handle xmpp: addresses
*   [[SPARK-878][478]] - Linux idle plugin not properly handling coming back from idle
*   [[SPARK-879][479]] - Double contacts appear in roster.
*   [[SPARK-883][480]] - Control%2BT window shows no data
*   [[SPARK-886][481]] - Reconnection logic not working properly
*   [[SPARK-889][482]] - New tab/window focus does not cause focus to be in typing area of window
*   [[SPARK-892][483]] - is part of SPARK-1224 Spark should automatically reconnect you to chatrooms after a reconnection
*   [[SPARK-897][484]] - PARK-874 still seems to be occuring
*   [[SPARK-898][485]] - org/jivesoftware/spark/ui/RetryPanel.java uses non-standard Smack
*   [[SPARK-901][486]] - Fix JVM crash when using Jingle on the Mac OS X
*   [[SPARK-903][487]] - Removing a bookmark doesn't remove it from the bookmarks menu in os x, maybe others
*   [[SPARK-906][488]] - Spark's build should unpack .pack'd files at build time, not at first startup
*   [[SPARK-908][489]] - Messages sent by pressing the View Profile Icon
*   [[SPARK-909][490]] - Spark Crashes after ending a Muted Call
*   [[SPARK-910][491]] - Some avatars are not displayed
*   [[SPARK-913][492]] - Settings not always being saved after changes made
*   [[SPARK-914][493]] - Spark does not handle messages with subjects very well
*   [[SPARK-917][494]] - Spark Phone is not Unregistering on Spark Logout
*   [[SPARK-921][495]] - Sometimes Spark can't change to Available automatically
*   [[SPARK-922][496]] - is part of SPARK-1228 Broadcast window resizing should be fixed
*   [[SPARK-923][497]] - Fix room topic change tooltip
*   [[SPARK-924][498]] - Fix incoming message notification tooltip showing wrong presence status
*   [[SPARK-925][499]] - Should receive offline broadcasts after logging in
*   [[SPARK-926][500]] - Custom status editing no longer working in trunk
*   [[SPARK-937][501]] - Wrong notification popup upon receiving a file
*   [[SPARK-941][502]] - Pressing Cancel in "Log out with reason" window shouldnt log out
*   [[SPARK-944][503]] - After language change should be "Exit now?", not "Restart now?"
*   [[SPARK-950][504]] - Spark is not showing /" chars in chat window
*   [[SPARK-952][505]] - Links will not open from chat windows under Linux
*   [[SPARK-960][506]] - Spark does not remember group state.
*   [[SPARK-962][507]] - Spark gets confused when multiple conference services are available
*   [[SPARK-969][508]] - When someone performs a file transfer or non-message related event, the last message before it is shown in growl notifications
*   [[SPARK-978][509]] - Buzz delay should not reset after closing chat window
*   [[SPARK-988][510]] - DoS (disconnect of other clients)
*   [[SPARK-990][511]] - View Downloads doesn't pop-up Downloads window
*   [[SPARK-994][512]] - Bookmarks menu is not refreshing immediately
*   [[SPARK-997][513]] - An error occurs when enetering no Gateway username

## 2.5.8 -- November 14th, 2007

### New Features

*   [[SPARK-820][514]] - Empty roster items now show jid instead of blank.
*   [[SPARK-856][515]] - Updated avatar size in contact list, also selectable from three choices.
*   [[SPARK-867][516]] - GaduGadu, IRC, and SIMPLE transports now supported.
*   [[SPARK-868][517]] - Entire status message now displayed with word/line wrapping on tooltip.
*   SIP Phone plugin is now open source.

### Bug Fixes

*   [[SPARK-618][313]] - Fixed multiple message issue with Broadcast.
*   [[SPARK-857][518]] - Fixed language selection menu is not displaying.
*   [[SPARK-860][519]] - Show offline users in broadcast window.
*   [[SPARK-855][520]] - Allowed mainWindowHeight to have low values.
*   [[SPARK-869][521]] - Gateway icons are now lightning up properly.
*   [[SPARK-870][522]] - Window positions/sizes are being saved upon window close now.
*   [[SPARK-874][523]] - Spark is now able to handle the new conference search capability of Openfire 3.4.1

## 2.5.7 -- September 20th, 2007

### New Features

*   [[SPARK-792][524]] - Add Language Selection to Spark Installation
*   [[SPARK-846][525]] - Allow option to show avatars in Contact List.

### Bug Fixes

*   [[SPARK-782][526]] - Fixed system tray with limited users and on linux.
*   [[SPARK-818][527]] - Improvements to reconnection code.
*   [[SPARK-825][528]] - Fixed sip stack sending superfluous REGISTER Packet
*   [[SPARK-827][529]] - Fixed limited users issue.l
*   [[SPARK-829][530]] - Fixed XMPP URI in registry.
*   [[SPARK-830][531]] - Fixed start on startup issue with installer.
*   [[SPARK-831][532]] - Fixed XMPP URI not starting conversations when spark is not running.
*   [[SPARK-832][533]] - Fixed offline messages not showing up in certain situations.
*   [[SPARK-833][534]] - Fixed bad MSI installer.
*   [[SPARK-834][535]] - Upgraded to the latest SMACK.
*   [[SPARK-836][536]] - JNIWrapper is now being included with the linux distro.
*   [[SPARK-838][537]] - Fixed gateway issue on initial roster loading.pear.
*   [[SPARK-839][538]] - Fixed loading of spark in system tray.
*   [[SPARK-840][539]] - Added chinese translation to Spark

## 2.5.6 -- August 23rd, 2007

### Bug Fixes

*   [[SPARK-767][540]] - Fixed roster not populating offline users in their respective groups.
*   [[SPARK-807][541]] - Fixed sending of empty broadcast messages.
*   [[SPARK-810][542]] - Added in system tray for linux (requires Java 1.6)
*   [[SPARK-811][543]] - Fixed spark not loading JMF Native libraries
*   [[SPARK-813][544]] - Added GTalk and XMPP gateways.
*   [[SPARK-819][545]] - Fixed issue with file picker hanging spark.
*   [[SPARK-821][546]] - Fixed timestamps in conference rooms.
*   [[SPARK-823][547]] - Explicit loading of plugins no longer fails due to wrong classloader.

## 2.5.5 -- August 5th, 2007

### Bug Fixes

*   [[SPARK-719][548]] - Fixed communication time in Phone.
*   [[SPARK-755][549]] - Fixed Spark crash after login with latest jvm build 1.6.0_01-b06
*   [[SPARK-773][550]] - Fixed file transfer issue after reconnection.
*   [[SPARK-774][551]] - Fixed search service issue after reconnection.
*   [[SPARK-781][552]] - Fixed one to one conversation in group chat room using a single user.
*   [[SPARK-782][526]] - Fixed system tray not appearing on certain users computers.
*   [[SPARK-784][553]] - Update spanish translation file.
*   [[SPARK-786][554]] - Updated the italian translation.
*   [[SPARK-790][555]] - Fixed toaster not timing with Fastpath notifications.
*   [[SPARK-793][556]] - Fixed bookmarks causing NPE on room discovery.
*   [[SPARK-797][557]] - Spark should not show presence updates in chat window if the user is still online.
*   [[SPARK-798][558]] - Fixed chat window not opening when Timer is cancelled.
*   [[SPARK-800][559]] - Increased File Transfer timeout time.

## 2.5.4 Beta 1 -- June 11th, 2007

### Bug Fixes

*   [[SPARK-759][560]] - Fixed File transfer issue on Mac OSX.
*   [[SPARK-763][561]] - Moving all native code to plugin for better linux support.
*   [[SPARK-766][562]] - One to one conversation in group chat room always sending to same user.
*   [[SPARK-770][563]] - Need to fix minor i18n German translation issues.
*   [[SPARK-771][564]] - Multiple offline contacts showing up in roster after reconnection.

## 2.5.3 Beta 2 -- May 28th, 2007

### Bug Fixes

*   [[SPARK-748][565]] - Ctrl-f does not pick up different users with same contact name.
*   [[SPARK-753][566]] - FRAME_IMAGE not found
*   [[SPARK-757][567]] - Upgrade smack to fix SRV DNS issue in SASL.
*   [[SPARK-758][568]] - Spark needs to send messages to full jid on opening of chat room.

## 2.5.3 Beta 1 -- May 11th, 2007

### New Features

*   [[SPARK-111][569]] - Users can now select contact items from multiple groups, which allows for better broadcast handling.
*   [[SPARK-662][570]] - Add new emoticons to default emoticon pack.
*   [[SPARK-725][571]] - Added Single Sign-ON (SSO) support.
*   [[SPARK-727][572]] - Added new Spark Users Guide
*   [[SPARK-729][573]] - Skin: Added option for SSO boolean. If selected Spark just tries to connect to the given server as an SSO situation.
*   [[SPARK-735][574]] - Added integrated sso - smack code into Spark.

### Bug Fixes

*   [[SPARK-718][575]] - Fixed small asterisk-IM issue.
*   [[SPARK-732][576]] - Fixed conference room participant list issue when renaming nickname.
*   [[SPARK-742][577]] - Jingle now uses preffered codec.
*   [[SPARK-746][578]] - Fixed issue with Update checker not updating users from beta to release.
*   [[SPARK-748][565]] - Fixed CTRL%2BF issue handling multiple matching nicknames.

## 2.5.2 -- May 3rd, 2007

### New Features

*   [[SPARK-2][579]] - Spark now display offline status information.
*   [[SPARK-399][580]] - Added new color randomizer for user names in group chat rooms.
*   [[SPARK-401][581]] - Added better error handling during conference room creation.
*   [[SPARK-609][582]] - Added a new Conference invitation ui.
*   [[SPARK-661][583]] - Updated the Italian translation.
*   [[SPARK-664][584]] - Added beta release support to the upgrade notification system.
*   [[SPARK-665][585]] - Change update checks to weekly.
*   [[SPARK-674][586]] - Added RTP Media Listening for jingle, improving connectivity check.
*   [[SPARK-679][587]] - Improved notifications when user comes online/offline.
*   [[SPARK-691][588]] - Improved UI for contact list groups.
*   [[SPARK-701][589]] - Added Japanese translation.

### Bug Fixes

*   [[SPARK-598][590]] - MSI now supports automatic upgrades.
*   [[SPARK-626][591]] - Added in missing jars to classpath on linux.
*   [[SPARK-659][592]] - Socks5 proxy not uses the username and password.
*   [[SPARK-666][593]] - Fixed file transfer timeout issue.
*   [[SPARK-669][594]] - Fixed issue with invalid title showing up in contact info.
*   [[SPARK-682][595]] - Dialing an invalid number is now handled properly by Spark
*   [[SPARK-693][596]] - Changed the buzz icon tool tip.
*   [[SPARK-704][597]] - Users are now able to create new conference rooms when using limited permissions for Group Chat.
*   [[SPARK-714][598]] - SparkPhone handles registration failures properly.

## 2.5.2 Beta 1 -- April 20th, 2007

### New Features

*   [[SPARK-399][580]] - Added color randomizer for user names in group chat rooms.
*   [[SPARK-609][582]] - Added new Conference Invitation UI.
*   [[SPARK-674][586]] - Added RTP Media Listening for jingle, improving connectivity check.
*   [[SPARK-691][588]] - Improved UI for contact list groups.
*   [[SPARK-701][589]] - Added Japanese translation.

### Bug Fixes

*   [[SPARK-2][579]] - Spark now displays offline status messages.
*   [[SPARK-401][581]] - Added better error handling during MUC creation.
*   [[SPARK-598][590]] - Fixed issue with upgrades and MSI builds.
*   [[SPARK-626][591]] - Fixed issue with missing jars from the classpath in Linux.
*   [[SPARK-659][592]] - Socks5 proxy now uses specified username and password.
*   [[SPARK-661][583]] - Updated Italian translation.
*   [[SPARK-664][584]] - Add beta releases to the upgrade notification system
*   [[SPARK-665][585]] - Changed update check to check only once a week and not on every log in.
*   [[SPARK-666][593]] - Fixed file transfer on Mac.
*   [[SPARK-669][594]] - Fixed issue with VCard info showing up for the wrong contact.
*   [[SPARK-679][587]] - Improved notification when user comes online.
*   [[SPARK-682][595]] - Dialing an invalid number is now handled properly by Spark.
*   [[SPARK-693][596]] - Fixed buzz icon tooltip.
*   [[SPARK-714][598]] - Fixed issue with SparkPhone opening 2 Phone Panel after several registration fails and many disconnections

## 2.5.1 -- April 14th, 2007

### No Changes.

## 2.5.1 Beta 1 -- April 9th, 2007

### New Features

*   [[SPARK-2][579]] - Show offline status information

### Bug Fixes

*   [[SPARK-623][599]] - Fixed error when trying to establish a voice communication.
*   [[SPARK-633][600]] - Fixed screenshot issue on Linux.
*   [[SPARK-644][601]] - Fixed timing issue with Jingle calls and UI.
*   [[SPARK-645][602]] - Fix tab switching issue on Mac.
*   [[SPARK-647][603]] - Fixed growl issue on Mac.
*   [[SPARK-649][604]] - Fixed screenshot tool on Mac.
*   [[SPARK-650][605]] - Improved descriptive text for Jingle calls.s
*   [[SPARK-652][606]] - Fixed issue with missing icon when viewing plugin information.
*   [[SPARK-654][607]] - Fixed issue registering soft phone on Mac.
*   [[SPARK-655][608]] - Fixed buzz icon and placement
*   [[SPARK-656][609]] - Installer is now adding desktop shortcuts.
*   [[SPARK-658][610]] - Added in missing emoticons.
*   [[SPARK-660][611]] - Emoticon packs can now be unzipped without admin rights.
*   [[SPARK-668][612]] - Fixed issue where first message would be dropped.
*   [[SPARK-673][613]] - Fixed logic with update checker and beta/alpha releases.
*   [[SPARK-681][614]] - Spark now closes a Jingle Session if it establish and don't receive media for more than X(20) seconds
*   [[SPARK-689][615]] - Fixed jingle binding issue on Vista.

## 2.5.0 -- March 30th, 2007

### New Features

*   [[SPARK-2][579]] - Now show status of offline users.
*   [[SPARK-382][616]] - Added ctrl%2Be to display last 10 conversations.
*   [[SPARK-410][617]] - Now all plugins to be operating-system specific
*   [[SPARK-559][618]] - Refactored ContactList, ContactGroup and ContactItem to allow all event operations to run through the ContactList itself.
*   [[SPARK-561][619]] - Added new tray notification for incoming fastpath chat requests.
*   [[SPARK-567][620]] - Added Pack200 support to lower the overall deployment size of Spark.
*   [[SPARK-568][621]] - Added typing notification for Fastpath Conference chats.
*   [[SPARK-571][622]] - Added client to client VOIP support.
*   [[SPARK-255][623]] - Added drag and drop contacts into conference rooms to invite.
*   [[SPARK-452][624]] - Added IRC-Style Shortcuts
*   [[SPARK-200][625]] - Allow drag and drop out of the chat window before and after file transfer
*   [[SPARK-517][626]] - Simplified the viewing of users vCard information.
*   [[SPARK-519][627]] - Bookmarks are now located in the Spark main window menu bar.
*   [[SPARK-515][628]] - Spark now has an Enhanced Look and Feel.
*   [[SPARK-518][629]] - Added new auto-grow send field box.
*   [[SPARK-523][630]] - Added support for chat and email options in contact tooltips.
*   [[SPARK-524][631]] - Spark now shows full address of conference room.
*   [[SPARK-528][632]] - Message history is now grouped by Day, Month, Year.
*   [[SPARK-531][633]] - Added the new "Buzz" feature, which allows users to give others a little nudge.
*   [[SPARK-485][634]] - Added preference to specify tabs on top or bottom of Chat Room.
*   [[SPARK-562][635]] - Added Workgroup to Workgroup transfer.
*   [[SPARK-563][636]] - Added in Queue To Queue transfer.
*   [[SPARK-610][637]] - Added OSX dock notification with new incoming messages.

### Bug Fixes

*   [[SPARK-453][638]] - Linux distribution no longer depends on the windows dir.
*   [[SPARK-471][639]] - Fixed presence issue inside chat rooms.
*   [[SPARK-510][640]] - Conference Invitation page needs UI improvements.
*   [[SPARK-551][641]] - Handle gateway jids and adding of gateway users more gracefully.
*   [[SPARK-552][642]] - Added new error handling UI for Soft Phone.
*   [[SPARK-553][643]] - Presence now changes back to normal presence when hanging up phone call.
*   [[SPARK-554][644]] - Opening of a chat room now hides contact tooltip.
*   [[SPARK-555][645]] - Usernames with escapeable characters are now handled correctly in history.
*   [[SPARK-556][646]] - VCardManager now caches invalid vCards to prevent network abuse. 
*   [[SPARK-557][647]] - Soft Phone only loads vCards if the user is registered.
*   [[SPARK-558][648]] - IRC-Style Shortcuts are now displayed in history.
*   [[SPARK-565][649]] - Users are now notified that they need to reconnect to a conference room when disconnected.
*   [[SPARK-314][650]] - Fixed Apple-W to close a chat tab/window.
*   [[SPARK-376][651]] - Fixed problem with usernames with characters like / : * ? " &lt; &gt; | in their name.
*   [[SPARK-455][652]] - Fixed auto away issue on linux.
*   [[SPARK-456][653]] - Fix issue with links in send area.
*   [[SPARK-463][654]] - Fixed issue with spaces in gateway contact names.
*   [[SPARK-472][655]] - Fixed double messages with broadcasts.
*   [[SPARK-478][656]] - Fixed issue with losing conference invitations after Spark reconnects.
*   [[SPARK-481][657]] - Fixed reconnect issue with idle.
*   [[SPARK-486][658]] - Timestamps are no correct when running on Vista.
*   [[SPARK-487][659]] - Users can now send screen shots when running Spark on Vista
*   [[SPARK-488][660]] - Fixed file transfer on Vista
*   [[SPARK-500][661]] - Fixed gateway presence change when user is disconnected causes Spark crash.
*   [[SPARK-501][662]] - Fixed Ctrl%2BF issue on OSX.
*   [[SPARK-502][663]] - Turned off DTD validation in EmoticonManager.
*   [[SPARK-503][664]] - Fixed grin emoticon not showing issue.
*   [[SPARK-509][665]] - Fixed multiple presences being sent issue on VCard change.
*   [[SPARK-511][666]] - No longer put users in invalid conference room.
*   [[SPARK-532][667]] - Spark now alert users when there is no program associated with a file a user is trying to open after File Transfer.
*   [[SPARK-534][668]] - Linux build is no longer corrupted.
*   [[SPARK-535][669]] - Spark no longer validates DTD for Emoticons.plist.
*   [[SPARK-536][670]] - MSI files now contain the Spark.exe file.
*   [[SPARK-537][671]] - Added a universal binary of the JavaApplicationStub for Spark.
*   [[SPARK-538][672]] - Fastpath auto-logs in after disconnect.
*   [[SPARK-540][673]] - Improved error message on login failure.
*   [[SPARK-542][674]] - HTTPS Proxy is now working.
*   [[SPARK-543][675]] - Notifications can now be disabled.
*   [[SPARK-544][676]] - Roster window shows nickname option if specified in Profile.
*   [[SPARK-545][677]] - Clearing avatar takes immeditate effect.
*   [[SPARK-546][678]] - Chat History now shows approriate nicknmes when possible.
*   [[SPARK-549][679]] - [Mac] Starting new conversations no longer fails to bring the message window to the front
*   [[SPARK-550][680]] - Fixed notification issue with tray popups and bring to front.
*   [[SPARK-497][681]] - Fixed "Away due to idle" on/off preference issue.
*   [[SPARK-499][682]] - Fixed error occuring when choosing invalid emoticon packs.
*   [[SPARK-505][683]] - Fixed loading of cached vcard when editing personal profile.
*   [[SPARK-508][684]] - Conference rooms jids are now escaped.
*   [[SPARK-513][685]] - Fixed inconsistent behavior in tab notifications.
*   [[SPARK-514][686]] - Fixed loading of file chooser in avatar panel.
*   [[SPARK-516][687]] - Spark now uses default look and feel when running on Windows Vista.
*   [[SPARK-520][688]] - Fixed hanging of Spark when adding new contacts.
*   [[SPARK-521][689]] - Group chat rooms now ignore presences with type error.
*   [[SPARK-522][690]] - Tabs within Spark are now easier to determine active/inactive.
*   [[SPARK-525][691]] - Spark no longer persists password if user requests password to not be saved.
*   [[SPARK-526][692]] - Fixed "Join on startup" in Conference room tab.
*   [[SPARK-527][693]] - Auto-joined rooms now display spell-checker and emoticon picklist.
*   [[SPARK-529][694]] - Conference invitation dialog now shows names in alphabetical order along with their presence.
*   [[SPARK-235][695]] - Spark now supports Adium emoticon packs.
*   [[SPARK-390][696]] - Fixed presence issue caused by installed gateways.
*   [[SPARK-405][697]] - Conference bookmarks are now persisted on the server.
*   [[SPARK-420][698]] - Fixed window repainting on tab transitions.
*   [[SPARK-424][699]] - Fixed contact list error occuring on reconnect.
*   [[SPARK-427][700]] - Spark now allows for actions to occur on tooltips.
*   [[SPARK-473][701]] - Fixed presence issue in group chat rooms.
*   [[SPARK-483][702]] - Update logic in show/away actions on tray icon.
*   [[SPARK-484][703]] - Auto Login into conference rooms causes chat room buttons to not appear.
*   [[SPARK-491][704]] - Bookmarks are now persisted to the server.
*   [[SPARK-492][705]] - Spark now defaults presence priority to 1 rather than 0.
*   [[SPARK-493][706]] - Chat history broken
*   [[SPARK-494][707]] - Transcripts were being corrupted when persisting Unicode.
*   [[SPARK-506][708]] - Fixed send field resize issue when chat frame was resized.
*   [[SPARK-507][709]] - Fixed asterisks plugin. Asterisks is now fully functional.
*   [[SPARK-530][710]] - Improved performance of loading and persisting of transcripts.
*   [[SPARK-569][711]] - Jingle doesn't detect when other client supports Jingle
*   [[SPARK-574][712]] - Workgroup now accepts AgentSession status change.
*   [[SPARK-576][713]] - Typing in chat window disabled after re-connect
*   [[SPARK-577][714]] - Fixed softphone issue when preferecnes could not be loaded.
*   [[SPARK-578][715]] - Available Contacts does not display properly in OSX.
*   [[SPARK-579][716]] - Jingle UI will now show regardless of volume control settings.
*   [[SPARK-580][717]] - MSI build now uses pack200 builds.
*   [[SPARK-582][718]] - Growl notifications in OSX are now working properly.
*   [[SPARK-583][719]] - Fixed Typing notification in ContactList
*   [[SPARK-584][720]] - Ctrl-x and cut now work correctly in send area.
*   [[SPARK-585][721]] - Fixed VCard viewer close button issue.
*   [[SPARK-587][722]] - Update file pickers within Spark
*   [[SPARK-588][723]] - Window controls will not go away
*   [[SPARK-589][724]] - Fixed issue with fastpath tabs turning red without having any new messages.
*   [[SPARK-590][725]] - Fixed layout setting of chat window.
*   [[SPARK-591][726]] - Disconnected spark no longer attempts online activities.
*   [[SPARK-592][727]] - Fixed stale chats.
*   [[SPARK-593][728]] - Updated ringing sound file.
*   [[SPARK-594][729]] - Added notification in Jingle rooms when negotiating call.
*   [[SPARK-595][730]] - Fixed SIP Regsitration on computers with VMWare.
*   [[SPARK-596][731]] - Removed contact info options in tooltip.
*   [[SPARK-597][732]] - Added new icon to represent Jingle calls.
*   [[SPARK-599][733]] - Gateways are no longer loaded on the event thread.
*   [[SPARK-600][734]] - Broadcast button in wrong place
*   [[SPARK-601][735]] - Ending SIP calls does not work properly
*   [[SPARK-602][736]] - Last activity on unsupported clients is handled more gracefully.
*   [[SPARK-603][737]] - SIP: Caller ID missing from incoming call notification
*   [[SPARK-604][738]] - SIP: wrong icon in missed calls list
*   [[SPARK-605][739]] - SIP: two bugs in call history
*   [[SPARK-606][740]] - SIP: escape button doesn't work on dedicated call tab
*   [[SPARK-607][741]] - SIP: voicemail button should always show number of messages
*   [[SPARK-611][742]] - Fixed layout of command buttons on OSX.
*   [[SPARK-612][743]] - Spark now displays notifications from Gateways.
*   [[SPARK-613][744]] - Gateway icons now display disconnection from gateways.
*   [[SPARK-614][745]] - Fixed issue with reconnection.
*   [[SPARK-616][746]] - Fixed issue with redial in Soft Phone.
*   [[SPARK-617][747]] - Send correct presence upon reconnection.,
*   [[SPARK-618][313]] - Fixed multiple message issue with Broadcast.
*   [[SPARK-620][748]] - Mute does not work
*   [[SPARK-621][749]] - Clicking on a user's avatar, then view full profile brings up "edit profile information"
*   [[SPARK-622][750]] - Error at reconnection - no users are connected
*   [[SPARK-628][751]] - No room found answering a SIP call
*   [[SPARK-629][752]] - Fixed incoming Jingle call ui when user has no vcard.
*   [[SPARK-630][753]] - Updated Spark message icon.
*   [[SPARK-641][754]] - Fix User Home Directory in Linux to ".Spark"
*   [[SPARK-646][755]] - SIP Previous Conversations List is in reverse order

## 2.0.8 -- January 23rd, 2007

### New Features

*   [[SPARK-462][756]] - Added notification preferences for user presence.

### Bug Fixes

*   [[SPARK-449][757]] - Fix chat transcript parsing error with UTF-8
*   [[SPARK-450][758]] - Fixed tab refreshing problem.
*   [[SPARK-460][759]] - Remove old icons from group chat room.
*   [[SPARK-461][760]] - Improved Toaster popup UI
*   [[SPARK-465][761]] - Conference Participant list becomes corrupted on presence changes.
*   [[SPARK-468][762]] - Logging out with Chat windows open does not save chat transcript.
*   [[SPARK-469][763]] - Spark needs to do update checks against the new Ignite site.
*   [[SPARK-470][764]] - VCard loading for email chat info should not be in own thread.
*   [[SPARK-475][765]] - Spark 2.0.8 custom skin w/ wildfire spark version set, always thinks there's a newer version
*   [[SPARK-476][766]] - Asterisks plugin is fully functional.
*   [[SPARK-477][767]] - Users are being removed from the participant list on presence change.
*   [[SPARK-479][768]] - VCard caching not updating avatar.
*   [[SPARK-480][769]] - Stale chats logic removes incoming message notification.

## 2.0.7 -- December 4th, 2006

### New Features

*   [[SPARK-444][770]] - Added one-click hide from system tray.
*   [[SPARK-445][771]] - Added simple log viewer.
*   [[SPARK-447][772]] - Added Typing notification to individual tabs and Frame.
*   [[SPARK-398][773]] - Nicknames should be sortable in group chat rooms.

### Bug Fixes

*   [[SPARK-428][774]] - Fixed issue with removing start on startup in preferences.
*   [[SPARK-435][775]] - Setting presence to DND works correctly.
*   [[SPARK-436][776]] - Verify new JID escaping with transports works correctly.
*   [[SPARK-437][777]] - Auto reconnect to notify each connection manager to reset themselves.
*   [[SPARK-438][778]] - Rooms need to be active when Reconnection was successfull
*   [[SPARK-439][779]] - Yahoo! Logo shows up in vcard popup for offline users
*   [[SPARK-440][780]] - No longer sending presence to Gateway if not signed in.
*   [[SPARK-441][781]] - Chat room send field no longer becomes disabled.
*   [[SPARK-442][782]] - Logging out causes temporary blank spark to appear.
*   [[SPARK-443][783]] - The Translator plug-in does not work
*   [[SPARK-446][784]] - No longer show toast popups when a message has an error.

## 2.0.6 -- November 20, 2006

### Bug Fixes

*   [[SPARK-414][785]] - Added Grabber icon to the bottom right of each frame.
*   [[SPARK-415][786]] - Removed background from JButtons for better UI on OSX.
*   [[SPARK-416][787]] - Replaced old icon for menu tray.
*   [[SPARK-418][788]] - Improved upon Members Only Group Chats.
*   [[SPARK-419][789]] - Fixed MSI build.
*   [[SPARK-425][790]] - Creating account with in-band registration caused NPE in spark.
*   [[SPARK-426][791]] - Improve compatibility with GTalk.
*   [[SPARK-428][774]] - Fixed issue with removing start on startup in preferences.
*   [[SPARK-429][792]] - Improved Gateway tooltips.
*   [[SPARK-430][793]] - MSN roster invites work.
*   [[SPARK-432][794]] - Adding new users will not offer gateway if the user is not from an external system.
*   [[SPARK-433][795]] - Fixed lost message issue with GTalk users.
*   [[SPARK-353][796]] - Improved upon conference invitations.

## 2.0.5 -- October 30, 2006

### New Features

*   [[SPARK-358][797]] - Added a beta version of the MSI installer.
*   [[SPARK-402][798]] - Added ability to add new contacts through transports.

### Bug Fixes

*   [[SPARK-393][799]] - Fixed blank tab on MAC OSX when presence changed.
*   [[SPARK-400][800]] - Spark now checks for available real estate on monitor.
*   [[SPARK-403][801]] - Fixed private chats in group chat rooms.

## 2.0.4 -- October 18, 2006

### Bug Fixes

*   [[SPARK-394][802]] - Fixed user search.
*   [[SPARK-395][803]] - Fixed issue with broadcasts.
*   [[SPARK-396][804]] - Auto discovery is now working with SRV lookup.
*   [[SPARK-397][805]] - Fixed some minor issues with group chat rooms.

## 2.0.3 -- October 11, 2006

### New Features

*   [[SPARK-364][806]] - Added French translation to Spark.
*   [[SPARK-385][807]] - Added Italian translation to Spark.
*   [[SPARK-386][808]] - Added Dutch translation to Spark.

### Bug Fixes

*   [[SPARK-379][809]] - Fixed exception that occured when services could be loaded from the server.
*   [[SPARK-383][810]] - Gateway information is now based on disco and not the subdomain name.
*   [[SPARK-387][811]] - Fixed disconnect on illegal error packet.
*   [[SPARK-388][812]] - Fixed flaky gateway detection in contact list
*   [[SPARK-392][813]] - Fixed removal of sames user in multiple rooms.

## 2.0.2 -- September 28, 2006

### New Features

*   [[SPARK-363][814]] - Added screen selection capability to the screenshot feature.
*   [[SPARK-356][815]] - Added German translation to Spark.
*   [[SPARK-359][816]] - Updated icons and text in Spark to reflect functionallity better.
*   [[SPARK-370][817]] - Added sound preference for incoming chat invitations.
*   [[SPARK-374][818]] - Improved message notifications using sounds and toasters.

### Bug Fixes

*   [[SPARK-357][819]] - Spark Manager now handles the online spark distribution correctly.
*   [[SPARK-360][820]] - Added missing i18n properties.
*   [[SPARK-361][821]] - Fixed case where users were showing up as offline when they are online.
*   [[SPARK-362][822]] - Allow passwords with leading and trailing spaces.
*   [[SPARK-365][823]] - File transfers through a proxy no longer fails.
*   [[SPARK-366][824]] - Show login failure when Spark is in the system tray and login fails.
*   [[SPARK-367][825]] - Spark can now run with limited operating system permissions.
*   [[SPARK-368][826]] - Fixed error with wildcard searchs.
*   [[SPARK-369][827]] - Fixed connection issue with Facetime and Akonix.
*   [[SPARK-371][828]] - Added back ctrl%2Bn (now ctrl%2Bf) for user searching within contact list and chat window.

## 2.0.1 -- September 11, 2006

### New Features

*   [[SPARK-350][829]] - Added icons and registration for ICQ gateways.

### Bug Fixes

*   [[SPARK-341][830]] - Changed online installer to require JRE 1.5.
*   [[SPARK-342][831]] - Spark will not start if the language settings do not match i18n.
*   [[SPARK-343][832]] - Spark handles upgrades with the online tag.
*   [[SPARK-344][833]] - Fixed invalid paths with sound preference.
*   [[SPARK-345][834]] - XMPP URI mapping now registers correctly with the registry.
*   [[SPARK-346][835]] - Search no longer crashes in Spark
*   [[SPARK-347][836]] - Fixed multiple presence packets being sent on idle.
*   [[SPARK-348][837]] - Gateway plugin now checks the server on separate thread.
*   [[SPARK-351][838]] - Changed Spark to use default look and feel on OSX.
*   [[SPARK-352][839]] - Display correct message on uninstalls of plugins in the plugin viewer.

## 2.0.0 -- September 7, 2006

### New Features

*   **Initial release as an Open Source project!**
*   [[SPARK-5][840]] - Added resource bundle support so that Spark can support translations.
*   [[SPARK-28][841]] - Added ability to send a file transfer to an offline contact (file is sent when they become available).
*   [[SPARK-45][842]] - Added support for storing group chat bookmarks (JEP-0048).
*   [[SPARK-78][843]] - Improved tab management.
*   [[SPARK-162][844]] - Improved UI of chat history when opening window.
*   [[SPARK-169][845]] - Spark now stacks chat tabs instead of scrolling them.
*   [[SPARK-177][846]] - Added XMPP URI Mapping to Spark
*   [[SPARK-181][847]] - Improved the Mac installer.
*   [[SPARK-290][848]] - Added ability to resend files when transfer fails.
*   [[SPARK-291][849]] - Add file transfer timeout setting to preferences.
*   [[SPARK-292][850]] - starting conversations with "user" (not really a JID) is possible, Spark could attach "@server.com" to make it "user@server" 
*   [[SPARK-298][851]] - Presence updates now show timestamp.
*   [[SPARK-299][852]] - Incremental scroll units should be moved to 150 instead of 50.
*   [[SPARK-302][853]] - Added nested groups support.
*   [[SPARK-314][854]] - Apple-W now closes a chat tab/window on Mac.
*   [[SPARK-315][855]] - Improved Growl support on Mac.
*   [[SPARK-324][856]] - It's now possible to logout with a reason.
*   [[SPARK-330][857]] - The preferences dialog is no longer modal.
*   [[SPARK-332][858]] - Added activity monitoring for users typing, going offline and online to contact list.
*   [[SPARK-333][859]] - Added support for gateways.
*   [[SPARK-335][860]] - Added new notification preferences.

### Bug Fixes

*   [[SPARK-14][861]] - Spark no longer unchecks the auto-login feature on disconnects.
*   [[SPARK-88][862]] - The update process now checks to see if the update is already downloaded (in case the user never restarted Spark). 
*   [[SPARK-101][863]] - The chat window now has proper Mac OS X menus.
*   [[SPARK-208][864]] - Allow VM params to be set for graphics rendering options.
*   [[SPARK-218][865]] - Non-English characters were noe displayed correctly in vCards.
*   [[SPARK-221][866]] - Sparkplugs were not "sticking" after restart on the Mac.
*   [[SPARK-238][867]] - Setting download directory in Spark is now persisted on logout.
*   [[SPARK-240][868]] - Some commands should not be offered for workgroups in roster.
*   [[SPARK-245][869]] - 0 byte files were crashing Spark.
*   [[SPARK-253][870]] - GroupChatRoomInfo needs to support DBCS.
*   [[SPARK-279][871]] - Special characters in the away message could crash Spark.
*   [[SPARK-280][872]] - Spark was not showing avatars created in Google.
*   [[SPARK-281][873]] - Conference button hidden in chat room toolbar.
*   [[SPARK-282][874]] - Broadcast message functionallity is now dictated by the broadcast plugin in spark.
*   [[SPARK-283][875]] - In some cases, Spark was not starting due to an exception in Tray handling.
*   [[SPARK-285][876]] - The link-2-text filter was not matching all URL's correctly.
*   [[SPARK-288][877]] - Spark was ignoring error messages in certain cases.
*   [[SPARK-293][878]] - Cancel of Spark Manager download does was actually closing the input stream.
*   [[SPARK-294][879]] - Improved logic around avatar handling.
*   [[SPARK-297][880]] - Mac/Linux - conference invites were never received.
*   [[SPARK-300][881]] - Unsubscribe packet was triggering unsubscribe response.
*   [[SPARK-301][882]] - Offline messages were not saved in transcript history.
*   [[SPARK-303][883]] - Fixed memory leak in ChatRoom.
*   [[SPARK-304][884]] - Added chat history to the chat room window.
*   [[SPARK-305][885]] - Added a preference option to specify a download folder.
*   [[SPARK-306][886]] - The text ": - )" now shows a smiley.
*   [[SPARK-317][887]] - Fixed error when loading user history.
*   [[SPARK-318][888]] - Added a way to specify cleanly that a Sparkplug will fail when Spark API changes.
*   [[SPARK-321][889]] - Pending Presence subscription from other users were not showing up in Spark.
*   [[SPARK-322][890]] - Fixed error retrieving vCards from dJabberd
*   [[SPARK-323][891]] - The auto-away feature now changes presence priority to 0.
*   [[SPARK-326][892]] - Double clicking on a user search result was not starting a chat conversation.
*   [[SPARK-328][893]] - Fixed bug where Spark wouldn't start due to bad proxy config.
*   [[SPARK-331][894]] - Message of type HEADLINE can now popup as a toaster.

Copyright © Jive Software, 2006-2007

 [4]: http://issues.igniterealtime.org/browse/SPARK-615
 [5]: http://issues.igniterealtime.org/browse/SPARK-740
 [6]: http://issues.igniterealtime.org/browse/SPARK-1379
 [7]: http://issues.igniterealtime.org/browse/SPARK-1383
 [8]: http://issues.igniterealtime.org/browse/SPARK-1392
 [9]: http://issues.igniterealtime.org/browse/SPARK-1394
 [10]: http://issues.igniterealtime.org/browse/SPARK-1395
 [11]: http://issues.igniterealtime.org/browse/SPARK-1396
 [12]: http://issues.igniterealtime.org/browse/SPARK-1398
 [13]: http://issues.igniterealtime.org/browse/SMACK-338
 [14]: http://issues.igniterealtime.org/browse/SMACK-273
 [15]: http://issues.igniterealtime.org/browse/SMACK-329
 [16]: http://issues.igniterealtime.org/browse/SPARK-791
 [17]: http://issues.igniterealtime.org/browse/SPARK-1067
 [18]: http://issues.igniterealtime.org/browse/SPARK-1080
 [19]: http://issues.igniterealtime.org/browse/SPARK-1095
 [20]: http://issues.igniterealtime.org/browse/SPARK-1164
 [21]: http://issues.igniterealtime.org/browse/SPARK-1177
 [22]: http://issues.igniterealtime.org/browse/SPARK-1198
 [23]: http://issues.igniterealtime.org/browse/SPARK-1200
 [24]: http://issues.igniterealtime.org/browse/SPARK-1207
 [25]: http://issues.igniterealtime.org/browse/SPARK-1253
 [26]: http://issues.igniterealtime.org/browse/SPARK-1274
 [27]: http://issues.igniterealtime.org/browse/SPARK-1275
 [28]: http://issues.igniterealtime.org/browse/SPARK-1280
 [29]: http://issues.igniterealtime.org/browse/SPARK-1281
 [30]: http://issues.igniterealtime.org/browse/SPARK-1283
 [31]: http://issues.igniterealtime.org/browse/SPARK-1294
 [32]: http://issues.igniterealtime.org/browse/SPARK-1324
 [33]: http://issues.igniterealtime.org/browse/SPARK-1325
 [34]: http://issues.igniterealtime.org/browse/SPARK-1331
 [35]: http://issues.igniterealtime.org/browse/SPARK-1336
 [36]: http://issues.igniterealtime.org/browse/SPARK-1338
 [37]: http://issues.igniterealtime.org/browse/SPARK-1340
 [38]: http://issues.igniterealtime.org/browse/SPARK-1350
 [39]: http://issues.igniterealtime.org/browse/SPARK-1351
 [40]: http://issues.igniterealtime.org/browse/SPARK-1357
 [41]: http://issues.igniterealtime.org/browse/SPARK-1364
 [42]: http://issues.igniterealtime.org/browse/SPARK-1366
 [43]: http://issues.igniterealtime.org/browse/SPARK-1373
 [44]: http://issues.igniterealtime.org/browse/SPARK-1375
 [45]: http://issues.igniterealtime.org/browse/SPARK-1376
 [46]: http://issues.igniterealtime.org/browse/SPARK-1385
 [47]: http://issues.igniterealtime.org/browse/SPARK-1387
 [48]: http://issues.igniterealtime.org/browse/SPARK-1388
 [49]: http://issues.igniterealtime.org/browse/SPARK-1389
 [50]: http://issues.igniterealtime.org/browse/SPARK-548
 [51]: http://issues.igniterealtime.org/browse/SPARK-884
 [52]: http://issues.igniterealtime.org/browse/SPARK-1277
 [53]: http://issues.igniterealtime.org/browse/SPARK-1278
 [54]: http://issues.igniterealtime.org/browse/SPARK-1303
 [55]: http://issues.igniterealtime.org/browse/SPARK-1323
 [56]: http://issues.igniterealtime.org/browse/SPARK-1342
 [57]: http://issues.igniterealtime.org/browse/SPARK-1344
 [58]: http://issues.igniterealtime.org/browse/SPARK-1345
 [59]: http://issues.igniterealtime.org/browse/SPARK-1352
 [60]: http://issues.igniterealtime.org/browse/SPARK-1354
 [61]: http://issues.igniterealtime.org/browse/SPARK-1359
 [62]: http://issues.igniterealtime.org/browse/SPARK-1367
 [63]: http://issues.igniterealtime.org/browse/SPARK-1369
 [64]: http://issues.igniterealtime.org/browse/SPARK-948
 [65]: http://issues.igniterealtime.org/browse/SPARK-984
 [66]: http://issues.igniterealtime.org/browse/SPARK-1218
 [67]: http://issues.igniterealtime.org/browse/SPARK-1220
 [68]: http://issues.igniterealtime.org/browse/SPARK-1235
 [69]: http://issues.igniterealtime.org/browse/SPARK-1254
 [70]: http://issues.igniterealtime.org/browse/SPARK-1316
 [71]: http://issues.igniterealtime.org/browse/SPARK-1332
 [72]: http://issues.igniterealtime.org/browse/SPARK-1333
 [73]: http://issues.igniterealtime.org/browse/SPARK-1334
 [74]: http://issues.igniterealtime.org/browse/SPARK-1335
 [75]: http://issues.igniterealtime.org/browse/SPARK-1341
 [76]: http://issues.igniterealtime.org/browse/SPARK-1343
 [77]: http://issues.igniterealtime.org/browse/SPARK-1346
 [78]: http://issues.igniterealtime.org/browse/SPARK-1347
 [79]: http://issues.igniterealtime.org/browse/SPARK-1348
 [80]: http://issues.igniterealtime.org/browse/SPARK-1349
 [81]: http://issues.igniterealtime.org/browse/SPARK-1361
 [82]: http://issues.igniterealtime.org/browse/SPARK-1372
 [83]: http://issues.igniterealtime.org/browse/SPARK-1230
 [84]: http://issues.igniterealtime.org/browse/SPARK-1298
 [85]: http://issues.igniterealtime.org/browse/SPARK-1322
 [86]: http://issues.igniterealtime.org/browse/SPARK-1360
 [87]: http://issues.igniterealtime.org/browse/SPARK-1368
 [88]: http://issues.igniterealtime.org/browse/SPARK-1380
 [89]: http://issues.igniterealtime.org/browse/SPARK-1384
 [90]: http://issues.igniterealtime.org/browse/SPARK-1386
 [91]: http://issues.igniterealtime.org/browse/SPARK-1390
 [92]: http://issues.igniterealtime.org/browse/SPARK-804
 [93]: http://issues.igniterealtime.org/browse/SPARK-854
 [94]: http://issues.igniterealtime.org/browse/SPARK-1167
 [95]: http://issues.igniterealtime.org/browse/SPARK-1265
 [96]: http://issues.igniterealtime.org/browse/SPARK-1290
 [97]: http://issues.igniterealtime.org/browse/SPARK-1304
 [98]: http://issues.igniterealtime.org/browse/SPARK-1337
 [99]: http://issues.igniterealtime.org/browse/SPARK-1353
 [100]: http://issues.igniterealtime.org/browse/SPARK-1358
 [101]: http://issues.igniterealtime.org/browse/SPARK-1370
 [102]: http://issues.igniterealtime.org/browse/SPARK-1371
 [103]: http://issues.igniterealtime.org/browse/SPARK-1374
 [104]: http://issues.igniterealtime.org/browse/SMACK-137
 [105]: http://issues.igniterealtime.org/browse/SMACK-156
 [106]: http://issues.igniterealtime.org/browse/SMACK-175
 [107]: http://issues.igniterealtime.org/browse/SMACK-235
 [108]: http://issues.igniterealtime.org/browse/SMACK-240
 [109]: http://issues.igniterealtime.org/browse/SMACK-241
 [110]: http://issues.igniterealtime.org/browse/SMACK-244
 [111]: http://issues.igniterealtime.org/browse/SMACK-245
 [112]: http://issues.igniterealtime.org/browse/SMACK-246
 [113]: http://issues.igniterealtime.org/browse/SMACK-247
 [114]: http://issues.igniterealtime.org/browse/SMACK-254
 [115]: http://issues.igniterealtime.org/browse/SMACK-261
 [116]: http://issues.igniterealtime.org/browse/SMACK-277
 [117]: http://issues.igniterealtime.org/browse/SMACK-282
 [118]: http://issues.igniterealtime.org/browse/SMACK-285
 [119]: http://issues.igniterealtime.org/browse/SMACK-289
 [120]: http://issues.igniterealtime.org/browse/SMACK-294
 [121]: http://issues.igniterealtime.org/browse/SMACK-295
 [122]: http://issues.igniterealtime.org/browse/SMACK-297
 [123]: http://issues.igniterealtime.org/browse/SMACK-298
 [124]: http://issues.igniterealtime.org/browse/SMACK-299
 [125]: http://issues.igniterealtime.org/browse/SMACK-300
 [126]: http://issues.igniterealtime.org/browse/SMACK-301
 [127]: http://issues.igniterealtime.org/browse/SMACK-302
 [128]: http://issues.igniterealtime.org/browse/SMACK-303
 [129]: http://issues.igniterealtime.org/browse/SMACK-304
 [130]: http://issues.igniterealtime.org/browse/SMACK-307
 [131]: http://issues.igniterealtime.org/browse/SMACK-309
 [132]: http://issues.igniterealtime.org/browse/SMACK-310
 [133]: http://issues.igniterealtime.org/browse/SMACK-317
 [134]: http://issues.igniterealtime.org/browse/SMACK-142
 [135]: http://issues.igniterealtime.org/browse/SMACK-210
 [136]: http://issues.igniterealtime.org/browse/SMACK-226
 [137]: http://issues.igniterealtime.org/browse/SMACK-242
 [138]: http://issues.igniterealtime.org/browse/SMACK-251
 [139]: http://issues.igniterealtime.org/browse/SMACK-255
 [140]: http://issues.igniterealtime.org/browse/SMACK-256
 [141]: http://issues.igniterealtime.org/browse/SMACK-272
 [142]: http://issues.igniterealtime.org/browse/SMACK-296
 [143]: http://issues.igniterealtime.org/browse/SMACK-319
 [144]: http://issues.igniterealtime.org/browse/SMACK-279
 [145]: http://issues.igniterealtime.org/browse/SMACK-280
 [146]: http://issues.igniterealtime.org/browse/SMACK-281
 [147]: http://issues.igniterealtime.org/browse/SMACK-259
 [148]: http://issues.igniterealtime.org/browse/SMACK-283
 [149]: http://issues.igniterealtime.org/browse/SPARK-915
 [150]: http://issues.igniterealtime.org/browse/SPARK-1105
 [151]: http://issues.igniterealtime.org/browse/SPARK-1187
 [152]: http://issues.igniterealtime.org/browse/SPARK-1261
 [153]: http://issues.igniterealtime.org/browse/SPARK-1264
 [154]: http://issues.igniterealtime.org/browse/SPARK-1090
 [155]: http://issues.igniterealtime.org/browse/SPARK-1175
 [156]: http://issues.igniterealtime.org/browse/SPARK-1222
 [157]: http://issues.igniterealtime.org/browse/SPARK-1259
 [158]: http://issues.igniterealtime.org/browse/SPARK-1124
 [159]: http://issues.igniterealtime.org/browse/SPARK-1009
 [160]: http://issues.igniterealtime.org/browse/SPARK-1010
 [161]: http://issues.igniterealtime.org/browse/SPARK-1012
 [162]: http://issues.igniterealtime.org/browse/SPARK-1024
 [163]: http://issues.igniterealtime.org/browse/SPARK-1025
 [164]: http://issues.igniterealtime.org/browse/SPARK-1032
 [165]: http://issues.igniterealtime.org/browse/SPARK-1036
 [166]: http://issues.igniterealtime.org/browse/SPARK-1040
 [167]: http://issues.igniterealtime.org/browse/SPARK-1043
 [168]: http://issues.igniterealtime.org/browse/SPARK-1044
 [169]: http://issues.igniterealtime.org/browse/SPARK-1047
 [170]: http://issues.igniterealtime.org/browse/SPARK-1054
 [171]: http://issues.igniterealtime.org/browse/SPARK-1065
 [172]: http://issues.igniterealtime.org/browse/SPARK-1070
 [173]: http://issues.igniterealtime.org/browse/SPARK-1077
 [174]: http://issues.igniterealtime.org/browse/SPARK-1086
 [175]: http://issues.igniterealtime.org/browse/SPARK-1093
 [176]: http://issues.igniterealtime.org/browse/SPARK-1102
 [177]: http://issues.igniterealtime.org/browse/SPARK-1107
 [178]: http://issues.igniterealtime.org/browse/SPARK-1115
 [179]: http://issues.igniterealtime.org/browse/SPARK-1119
 [180]: http://issues.igniterealtime.org/browse/SPARK-1120
 [181]: http://issues.igniterealtime.org/browse/SPARK-1121
 [182]: http://issues.igniterealtime.org/browse/SPARK-1123
 [183]: http://issues.igniterealtime.org/browse/SPARK-1125
 [184]: http://issues.igniterealtime.org/browse/SPARK-1127
 [185]: http://issues.igniterealtime.org/browse/SPARK-1128
 [186]: http://issues.igniterealtime.org/browse/SPARK-1136
 [187]: http://issues.igniterealtime.org/browse/SPARK-1137
 [188]: http://issues.igniterealtime.org/browse/SPARK-1139
 [189]: http://issues.igniterealtime.org/browse/SPARK-1142
 [190]: http://issues.igniterealtime.org/browse/SPARK-1145
 [191]: http://issues.igniterealtime.org/browse/SPARK-1156
 [192]: http://issues.igniterealtime.org/browse/SPARK-1157
 [193]: http://issues.igniterealtime.org/browse/SPARK-1159
 [194]: http://issues.igniterealtime.org/browse/SPARK-1174
 [195]: http://issues.igniterealtime.org/browse/SPARK-1178
 [196]: http://issues.igniterealtime.org/browse/SPARK-1184
 [197]: http://issues.igniterealtime.org/browse/SPARK-1190
 [198]: http://issues.igniterealtime.org/browse/SPARK-1208
 [199]: http://issues.igniterealtime.org/browse/SPARK-1247
 [200]: http://issues.igniterealtime.org/browse/SPARK-229
 [201]: http://issues.igniterealtime.org/browse/SPARK-251
 [202]: http://issues.igniterealtime.org/browse/SPARK-254
 [203]: http://issues.igniterealtime.org/browse/SPARK-372
 [204]: http://issues.igniterealtime.org/browse/SPARK-373
 [205]: http://issues.igniterealtime.org/browse/SPARK-375
 [206]: http://issues.igniterealtime.org/browse/SPARK-38
 [207]: http://issues.igniterealtime.org/browse/SPARK-389
 [208]: http://issues.igniterealtime.org/browse/SPARK-412
 [209]: http://issues.igniterealtime.org/browse/SPARK-413
 [210]: http://issues.igniterealtime.org/browse/SPARK-431
 [211]: http://issues.igniterealtime.org/browse/SPARK-496
 [212]: http://issues.igniterealtime.org/browse/SPARK-671
 [213]: http://issues.igniterealtime.org/browse/SPARK-677
 [214]: http://issues.igniterealtime.org/browse/SPARK-678
 [215]: http://issues.igniterealtime.org/browse/SPARK-700
 [216]: http://issues.igniterealtime.org/browse/SPARK-849
 [217]: http://issues.igniterealtime.org/browse/SPARK-87
 [218]: http://issues.igniterealtime.org/browse/SPARK-912
 [219]: http://issues.igniterealtime.org/browse/SPARK-930
 [220]: http://issues.igniterealtime.org/browse/SPARK-933
 [221]: http://issues.igniterealtime.org/browse/SPARK-934
 [222]: http://issues.igniterealtime.org/browse/SPARK-940
 [223]: http://issues.igniterealtime.org/browse/SPARK-954
 [224]: http://issues.igniterealtime.org/browse/SPARK-959
 [225]: http://issues.igniterealtime.org/browse/SPARK-963
 [226]: http://issues.igniterealtime.org/browse/SPARK-970
 [227]: http://issues.igniterealtime.org/browse/SPARK-975
 [228]: http://issues.igniterealtime.org/browse/SPARK-980
 [229]: http://issues.igniterealtime.org/browse/SPARK-993
 [230]: http://issues.igniterealtime.org/browse/SPARK-1011
 [231]: http://issues.igniterealtime.org/browse/SPARK-1018
 [232]: http://issues.igniterealtime.org/browse/SPARK-1049
 [233]: http://issues.igniterealtime.org/browse/SPARK-1052
 [234]: http://issues.igniterealtime.org/browse/SPARK-1057
 [235]: http://issues.igniterealtime.org/browse/SPARK-1072
 [236]: http://issues.igniterealtime.org/browse/SPARK-1076
 [237]: http://issues.igniterealtime.org/browse/SPARK-1078
 [238]: http://issues.igniterealtime.org/browse/SPARK-1108
 [239]: http://issues.igniterealtime.org/browse/SPARK-1110
 [240]: http://issues.igniterealtime.org/browse/SPARK-1135
 [241]: http://issues.igniterealtime.org/browse/SPARK-1141
 [242]: http://issues.igniterealtime.org/browse/SPARK-1143
 [243]: http://issues.igniterealtime.org/browse/SPARK-1146
 [244]: http://issues.igniterealtime.org/browse/SPARK-1147
 [245]: http://issues.igniterealtime.org/browse/SPARK-1148
 [246]: http://issues.igniterealtime.org/browse/SPARK-1149
 [247]: http://issues.igniterealtime.org/browse/SPARK-1201
 [248]: http://issues.igniterealtime.org/browse/SPARK-1246
 [249]: http://issues.igniterealtime.org/browse/SPARK-1250
 [250]: http://issues.igniterealtime.org/browse/SPARK-409
 [251]: http://issues.igniterealtime.org/browse/SPARK-448
 [252]: http://issues.igniterealtime.org/browse/SPARK-467
 [253]: http://issues.igniterealtime.org/browse/SPARK-640
 [254]: http://issues.igniterealtime.org/browse/SPARK-724
 [255]: http://issues.igniterealtime.org/browse/SPARK-730
 [256]: http://issues.igniterealtime.org/browse/SPARK-736
 [257]: http://issues.igniterealtime.org/browse/SPARK-739
 [258]: http://issues.igniterealtime.org/browse/SPARK-799
 [259]: http://issues.igniterealtime.org/browse/SPARK-801
 [260]: http://issues.igniterealtime.org/browse/SPARK-877
 [261]: http://issues.igniterealtime.org/browse/SPARK-896
 [262]: http://issues.igniterealtime.org/browse/SPARK-928
 [263]: http://issues.igniterealtime.org/browse/SPARK-943
 [264]: http://issues.igniterealtime.org/browse/SPARK-947
 [265]: http://issues.igniterealtime.org/browse/SPARK-961
 [266]: http://issues.igniterealtime.org/browse/SPARK-971
 [267]: http://issues.igniterealtime.org/browse/SPARK-972
 [268]: http://issues.igniterealtime.org/browse/SPARK-991
 [269]: http://issues.igniterealtime.org/browse/SMACK-330
 [270]: http://issues.igniterealtime.org/browse/SMACK-325
 [271]: http://issues.igniterealtime.org/browse/SMACK-334
 [272]: http://issues.igniterealtime.org/browse/SMACK-163
 [273]: http://issues.igniterealtime.org/browse/SMACK-207
 [274]: http://issues.igniterealtime.org/browse/SMACK-225
 [275]: http://issues.igniterealtime.org/browse/SMACK-232
 [276]: http://issues.igniterealtime.org/browse/SMACK-236
 [277]: http://issues.igniterealtime.org/browse/SMACK-243
 [278]: http://issues.igniterealtime.org/browse/SMACK-258
 [279]: http://issues.igniterealtime.org/browse/SMACK-260
 [280]: http://issues.igniterealtime.org/browse/SMACK-264
 [281]: http://issues.igniterealtime.org/browse/SMACK-269
 [282]: http://issues.igniterealtime.org/browse/SMACK-271
 [283]: http://issues.igniterealtime.org/browse/SMACK-275
 [284]: http://issues.igniterealtime.org/browse/SMACK-288
 [285]: http://issues.igniterealtime.org/browse/SMACK-290
 [286]: http://issues.igniterealtime.org/browse/SMACK-291
 [287]: http://issues.igniterealtime.org/browse/SMACK-293
 [288]: http://issues.igniterealtime.org/browse/SMACK-305
 [289]: http://issues.igniterealtime.org/browse/SMACK-308
 [290]: http://issues.igniterealtime.org/browse/SMACK-312
 [291]: http://issues.igniterealtime.org/browse/SMACK-313
 [292]: http://issues.igniterealtime.org/browse/SMACK-316
 [293]: http://issues.igniterealtime.org/browse/SMACK-321
 [294]: http://issues.igniterealtime.org/browse/SMACK-327
 [295]: http://issues.igniterealtime.org/browse/SMACK-328
 [296]: http://issues.igniterealtime.org/browse/SMACK-332
 [297]: http://issues.igniterealtime.org/browse/SPARK-1315
 [298]: http://issues.igniterealtime.org/browse/SPARK-1310
 [299]: http://issues.igniterealtime.org/browse/SPARK-1309
 [300]: http://issues.igniterealtime.org/browse/SPARK-1305
 [301]: http://issues.igniterealtime.org/browse/SPARK-1295
 [302]: http://issues.igniterealtime.org/browse/SPARK-743
 [303]: http://issues.igniterealtime.org/browse/SPARK-1130
 [304]: http://issues.igniterealtime.org/browse/SPARK-1270
 [305]: http://issues.igniterealtime.org/browse/SPARK-1268
 [306]: http://issues.igniterealtime.org/browse/SPARK-1267
 [307]: http://issues.igniterealtime.org/browse/SPARK-1183
 [308]: http://issues.igniterealtime.org/browse/SPARK-1161
 [309]: http://issues.igniterealtime.org/browse/SPARK-1068
 [310]: http://issues.igniterealtime.org/browse/SPARK-1209
 [311]: http://issues.igniterealtime.org/browse/SPARK-1260
 [312]: http://issues.igniterealtime.org/browse/SPARK-1262
 [313]: http://www.igniterealtime.org/issues/browse/SPARK-618
 [314]: http://issues.igniterealtime.org/browse/SPARK-1004
 [315]: http://issues.igniterealtime.org/browse/SPARK-1016
 [316]: http://issues.igniterealtime.org/browse/SPARK-1019
 [317]: http://issues.igniterealtime.org/browse/SPARK-102
 [318]: http://issues.igniterealtime.org/browse/SPARK-1020
 [319]: http://issues.igniterealtime.org/browse/SPARK-1022
 [320]: http://issues.igniterealtime.org/browse/SPARK-1023
 [321]: http://issues.igniterealtime.org/browse/SPARK-1027
 [322]: http://issues.igniterealtime.org/browse/SPARK-1028
 [323]: http://issues.igniterealtime.org/browse/SPARK-1029
 [324]: http://issues.igniterealtime.org/browse/SPARK-1034
 [325]: http://issues.igniterealtime.org/browse/SPARK-1038
 [326]: http://issues.igniterealtime.org/browse/SPARK-1039
 [327]: http://issues.igniterealtime.org/browse/SPARK-1041
 [328]: http://issues.igniterealtime.org/browse/SPARK-1046
 [329]: http://issues.igniterealtime.org/browse/SPARK-1048
 [330]: http://issues.igniterealtime.org/browse/SPARK-1055
 [331]: http://issues.igniterealtime.org/browse/SPARK-1056
 [332]: http://issues.igniterealtime.org/browse/SPARK-1059
 [333]: http://issues.igniterealtime.org/browse/SPARK-1061
 [334]: http://issues.igniterealtime.org/browse/SPARK-1063
 [335]: http://issues.igniterealtime.org/browse/SPARK-1064
 [336]: http://issues.igniterealtime.org/browse/SPARK-1069
 [337]: http://issues.igniterealtime.org/browse/SPARK-1081
 [338]: http://issues.igniterealtime.org/browse/SPARK-1082
 [339]: http://issues.igniterealtime.org/browse/SPARK-1083
 [340]: http://issues.igniterealtime.org/browse/SPARK-1085
 [341]: http://issues.igniterealtime.org/browse/SPARK-1089
 [342]: http://issues.igniterealtime.org/browse/SPARK-1092
 [343]: http://issues.igniterealtime.org/browse/SPARK-1096
 [344]: http://issues.igniterealtime.org/browse/SPARK-1097
 [345]: http://issues.igniterealtime.org/browse/SPARK-1099
 [346]: http://issues.igniterealtime.org/browse/SPARK-1101
 [347]: http://issues.igniterealtime.org/browse/SPARK-1109
 [348]: http://issues.igniterealtime.org/browse/SPARK-1111
 [349]: http://issues.igniterealtime.org/browse/SPARK-1112
 [350]: http://issues.igniterealtime.org/browse/SPARK-1116
 [351]: http://issues.igniterealtime.org/browse/SPARK-1117
 [352]: http://issues.igniterealtime.org/browse/SPARK-1118
 [353]: http://issues.igniterealtime.org/browse/SPARK-1122
 [354]: http://issues.igniterealtime.org/browse/SPARK-1126
 [355]: http://issues.igniterealtime.org/browse/SPARK-1129
 [356]: http://issues.igniterealtime.org/browse/SPARK-1131
 [357]: http://issues.igniterealtime.org/browse/SPARK-1132
 [358]: http://issues.igniterealtime.org/browse/SPARK-1133
 [359]: http://issues.igniterealtime.org/browse/SPARK-1138
 [360]: http://issues.igniterealtime.org/browse/SPARK-1140
 [361]: http://issues.igniterealtime.org/browse/SPARK-1144
 [362]: http://issues.igniterealtime.org/browse/SPARK-1151
 [363]: http://issues.igniterealtime.org/browse/SPARK-1152
 [364]: http://issues.igniterealtime.org/browse/SPARK-1153
 [365]: http://issues.igniterealtime.org/browse/SPARK-1154
 [366]: http://issues.igniterealtime.org/browse/SPARK-1155
 [367]: http://issues.igniterealtime.org/browse/SPARK-1158
 [368]: http://issues.igniterealtime.org/browse/SPARK-1163
 [369]: http://issues.igniterealtime.org/browse/SPARK-1166
 [370]: http://issues.igniterealtime.org/browse/SPARK-1168
 [371]: http://issues.igniterealtime.org/browse/SPARK-1169
 [372]: http://issues.igniterealtime.org/browse/SPARK-1171
 [373]: http://issues.igniterealtime.org/browse/SPARK-1172
 [374]: http://issues.igniterealtime.org/browse/SPARK-1173
 [375]: http://issues.igniterealtime.org/browse/SPARK-1180
 [376]: http://issues.igniterealtime.org/browse/SPARK-1182
 [377]: http://issues.igniterealtime.org/browse/SPARK-1186
 [378]: http://issues.igniterealtime.org/browse/SPARK-1189
 [379]: http://issues.igniterealtime.org/browse/SPARK-1194
 [380]: http://issues.igniterealtime.org/browse/SPARK-1196
 [381]: http://issues.igniterealtime.org/browse/SPARK-1206
 [382]: http://issues.igniterealtime.org/browse/SPARK-1211
 [383]: http://issues.igniterealtime.org/browse/SPARK-1212
 [384]: http://issues.igniterealtime.org/browse/SPARK-1213
 [385]: http://issues.igniterealtime.org/browse/SPARK-1216
 [386]: http://issues.igniterealtime.org/browse/SPARK-1217
 [387]: http://issues.igniterealtime.org/browse/SPARK-1219
 [388]: http://issues.igniterealtime.org/browse/SPARK-1221
 [389]: http://issues.igniterealtime.org/browse/SPARK-1225
 [390]: http://issues.igniterealtime.org/browse/SPARK-1226
 [391]: http://issues.igniterealtime.org/browse/SPARK-1227
 [392]: http://issues.igniterealtime.org/browse/SPARK-1229
 [393]: http://issues.igniterealtime.org/browse/SPARK-1231
 [394]: http://issues.igniterealtime.org/browse/SPARK-1233
 [395]: http://issues.igniterealtime.org/browse/SPARK-1237
 [396]: http://issues.igniterealtime.org/browse/SPARK-1240
 [397]: http://issues.igniterealtime.org/browse/SPARK-1241
 [398]: http://issues.igniterealtime.org/browse/SPARK-1242
 [399]: http://issues.igniterealtime.org/browse/SPARK-1248
 [400]: http://issues.igniterealtime.org/browse/SPARK-1249
 [401]: http://issues.igniterealtime.org/browse/SPARK-1251
 [402]: http://issues.igniterealtime.org/browse/SPARK-1252
 [403]: http://issues.igniterealtime.org/browse/SPARK-1255
 [404]: http://issues.igniterealtime.org/browse/SPARK-1256
 [405]: http://issues.igniterealtime.org/browse/SPARK-158
 [406]: http://issues.igniterealtime.org/browse/SPARK-210
 [407]: http://issues.igniterealtime.org/browse/SPARK-237
 [408]: http://issues.igniterealtime.org/browse/SPARK-24
 [409]: http://issues.igniterealtime.org/browse/SPARK-261
 [410]: http://issues.igniterealtime.org/browse/SPARK-278
 [411]: http://issues.igniterealtime.org/browse/SPARK-284
 [412]: http://issues.igniterealtime.org/browse/SPARK-286
 [413]: http://issues.igniterealtime.org/browse/SPARK-311
 [414]: http://issues.igniterealtime.org/browse/SPARK-340
 [415]: http://issues.igniterealtime.org/browse/SPARK-349
 [416]: http://issues.igniterealtime.org/browse/SPARK-381
 [417]: http://issues.igniterealtime.org/browse/SPARK-404
 [418]: http://issues.igniterealtime.org/browse/SPARK-421
 [419]: http://issues.igniterealtime.org/browse/SPARK-423
 [420]: http://issues.igniterealtime.org/browse/SPARK-455
 [421]: http://issues.igniterealtime.org/browse/SPARK-458
 [422]: http://issues.igniterealtime.org/browse/SPARK-475
 [423]: http://issues.igniterealtime.org/browse/SPARK-547
 [424]: http://issues.igniterealtime.org/browse/SPARK-570
 [425]: http://issues.igniterealtime.org/browse/SPARK-572
 [426]: http://issues.igniterealtime.org/browse/SPARK-575
 [427]: http://issues.igniterealtime.org/browse/SPARK-581
 [428]: http://issues.igniterealtime.org/browse/SPARK-586
 [429]: http://issues.igniterealtime.org/browse/SPARK-608
 [430]: http://issues.igniterealtime.org/browse/SPARK-619
 [431]: http://issues.igniterealtime.org/browse/SPARK-624
 [432]: http://issues.igniterealtime.org/browse/SPARK-625
 [433]: http://issues.igniterealtime.org/browse/SPARK-627
 [434]: http://issues.igniterealtime.org/browse/SPARK-631
 [435]: http://issues.igniterealtime.org/browse/SPARK-632
 [436]: http://issues.igniterealtime.org/browse/SPARK-637
 [437]: http://issues.igniterealtime.org/browse/SPARK-64
 [438]: http://issues.igniterealtime.org/browse/SPARK-657
 [439]: http://issues.igniterealtime.org/browse/SPARK-667
 [440]: http://issues.igniterealtime.org/browse/SPARK-690
 [441]: http://issues.igniterealtime.org/browse/SPARK-692
 [442]: http://issues.igniterealtime.org/browse/SPARK-696
 [443]: http://issues.igniterealtime.org/browse/SPARK-697
 [444]: http://issues.igniterealtime.org/browse/SPARK-699
 [445]: http://issues.igniterealtime.org/browse/SPARK-706
 [446]: http://issues.igniterealtime.org/browse/SPARK-708
 [447]: http://issues.igniterealtime.org/browse/SPARK-71
 [448]: http://issues.igniterealtime.org/browse/SPARK-710
 [449]: http://issues.igniterealtime.org/browse/SPARK-712
 [450]: http://issues.igniterealtime.org/browse/SPARK-713
 [451]: http://issues.igniterealtime.org/browse/SPARK-715
 [452]: http://issues.igniterealtime.org/browse/SPARK-720
 [453]: http://issues.igniterealtime.org/browse/SPARK-721
 [454]: http://issues.igniterealtime.org/browse/SPARK-734
 [455]: http://issues.igniterealtime.org/browse/SPARK-741
 [456]: http://issues.igniterealtime.org/browse/SPARK-749
 [457]: http://issues.igniterealtime.org/browse/SPARK-750
 [458]: http://issues.igniterealtime.org/browse/SPARK-756
 [459]: http://issues.igniterealtime.org/browse/SPARK-762
 [460]: http://issues.igniterealtime.org/browse/SPARK-765
 [461]: http://issues.igniterealtime.org/browse/SPARK-769
 [462]: http://issues.igniterealtime.org/browse/SPARK-772
 [463]: http://issues.igniterealtime.org/browse/SPARK-776
 [464]: http://issues.igniterealtime.org/browse/SPARK-777
 [465]: http://issues.igniterealtime.org/browse/SPARK-780
 [466]: http://issues.igniterealtime.org/browse/SPARK-788
 [467]: http://issues.igniterealtime.org/browse/SPARK-789
 [468]: http://issues.igniterealtime.org/browse/SPARK-806
 [469]: http://issues.igniterealtime.org/browse/SPARK-814
 [470]: http://issues.igniterealtime.org/browse/SPARK-815
 [471]: http://issues.igniterealtime.org/browse/SPARK-816
 [472]: http://issues.igniterealtime.org/browse/SPARK-824
 [473]: http://issues.igniterealtime.org/browse/SPARK-835
 [474]: http://issues.igniterealtime.org/browse/SPARK-841
 [475]: http://issues.igniterealtime.org/browse/SPARK-848
 [476]: http://issues.igniterealtime.org/browse/SPARK-861
 [477]: http://issues.igniterealtime.org/browse/SPARK-872
 [478]: http://issues.igniterealtime.org/browse/SPARK-878
 [479]: http://issues.igniterealtime.org/browse/SPARK-879
 [480]: http://issues.igniterealtime.org/browse/SPARK-883
 [481]: http://issues.igniterealtime.org/browse/SPARK-886
 [482]: http://issues.igniterealtime.org/browse/SPARK-889
 [483]: http://issues.igniterealtime.org/browse/SPARK-892
 [484]: http://issues.igniterealtime.org/browse/SPARK-897
 [485]: http://issues.igniterealtime.org/browse/SPARK-898
 [486]: http://issues.igniterealtime.org/browse/SPARK-901
 [487]: http://issues.igniterealtime.org/browse/SPARK-903
 [488]: http://issues.igniterealtime.org/browse/SPARK-906
 [489]: http://issues.igniterealtime.org/browse/SPARK-908
 [490]: http://issues.igniterealtime.org/browse/SPARK-909
 [491]: http://issues.igniterealtime.org/browse/SPARK-910
 [492]: http://issues.igniterealtime.org/browse/SPARK-913
 [493]: http://issues.igniterealtime.org/browse/SPARK-914
 [494]: http://issues.igniterealtime.org/browse/SPARK-917
 [495]: http://issues.igniterealtime.org/browse/SPARK-921
 [496]: http://issues.igniterealtime.org/browse/SPARK-922
 [497]: http://issues.igniterealtime.org/browse/SPARK-923
 [498]: http://issues.igniterealtime.org/browse/SPARK-924
 [499]: http://issues.igniterealtime.org/browse/SPARK-925
 [500]: http://issues.igniterealtime.org/browse/SPARK-926
 [501]: http://issues.igniterealtime.org/browse/SPARK-937
 [502]: http://issues.igniterealtime.org/browse/SPARK-941
 [503]: http://issues.igniterealtime.org/browse/SPARK-944
 [504]: http://issues.igniterealtime.org/browse/SPARK-950
 [505]: http://issues.igniterealtime.org/browse/SPARK-952
 [506]: http://issues.igniterealtime.org/browse/SPARK-960
 [507]: http://issues.igniterealtime.org/browse/SPARK-962
 [508]: http://issues.igniterealtime.org/browse/SPARK-969
 [509]: http://issues.igniterealtime.org/browse/SPARK-978
 [510]: http://issues.igniterealtime.org/browse/SPARK-988
 [511]: http://issues.igniterealtime.org/browse/SPARK-990
 [512]: http://issues.igniterealtime.org/browse/SPARK-994
 [513]: http://issues.igniterealtime.org/browse/SPARK-997
 [514]: http://www.igniterealtime.org/issues/browse/SPARK-820
 [515]: http://www.igniterealtime.org/issues/browse/SPARK-856
 [516]: http://www.igniterealtime.org/issues/browse/SPARK-867
 [517]: http://www.igniterealtime.org/issues/browse/SPARK-868
 [518]: http://www.igniterealtime.org/issues/browse/SPARK-857
 [519]: http://www.igniterealtime.org/issues/browse/SPARK-860
 [520]: http://www.igniterealtime.org/issues/browse/SPARK-855
 [521]: http://www.igniterealtime.org/issues/browse/SPARK-869
 [522]: http://www.igniterealtime.org/issues/browse/SPARK-870
 [523]: http://www.igniterealtime.org/issues/browse/SPARK-874
 [524]: http://www.igniterealtime.org/issues/browse/SPARK-792
 [525]: http://www.igniterealtime.org/issues/browse/SPARK-846
 [526]: http://www.igniterealtime.org/issues/browse/SPARK-782
 [527]: http://www.igniterealtime.org/issues/browse/SPARK-818
 [528]: http://www.igniterealtime.org/issues/browse/SPARK-825
 [529]: http://www.igniterealtime.org/issues/browse/SPARK-827
 [530]: http://www.igniterealtime.org/issues/browse/SPARK-829
 [531]: http://www.igniterealtime.org/issues/browse/SPARK-830
 [532]: http://www.igniterealtime.org/issues/browse/SPARK-831
 [533]: http://www.igniterealtime.org/issues/browse/SPARK-832
 [534]: http://www.igniterealtime.org/issues/browse/SPARK-833
 [535]: http://www.igniterealtime.org/issues/browse/SPARK-834
 [536]: http://www.igniterealtime.org/issues/browse/SPARK-836
 [537]: http://www.igniterealtime.org/issues/browse/SPARK-838
 [538]: http://www.igniterealtime.org/issues/browse/SPARK-839
 [539]: http://www.igniterealtime.org/issues/browse/SPARK-840
 [540]: http://www.igniterealtime.org/issues/browse/SPARK-767
 [541]: http://www.igniterealtime.org/issues/browse/SPARK-807
 [542]: http://www.igniterealtime.org/issues/browse/SPARK-810
 [543]: http://www.igniterealtime.org/issues/browse/SPARK-811
 [544]: http://www.igniterealtime.org/issues/browse/SPARK-813
 [545]: http://www.igniterealtime.org/issues/browse/SPARK-819
 [546]: http://www.igniterealtime.org/issues/browse/SPARK-821
 [547]: http://www.igniterealtime.org/issues/browse/SPARK-823
 [548]: http://www.igniterealtime.org/issues/browse/SPARK-719
 [549]: http://www.igniterealtime.org/issues/browse/SPARK-755
 [550]: http://www.igniterealtime.org/issues/browse/SPARK-773
 [551]: http://www.igniterealtime.org/issues/browse/SPARK-774
 [552]: http://www.igniterealtime.org/issues/browse/SPARK-781
 [553]: http://www.igniterealtime.org/issues/browse/SPARK-784
 [554]: http://www.igniterealtime.org/issues/browse/SPARK-786
 [555]: http://www.igniterealtime.org/issues/browse/SPARK-790
 [556]: http://www.igniterealtime.org/issues/browse/SPARK-793
 [557]: http://www.igniterealtime.org/issues/browse/SPARK-797
 [558]: http://www.igniterealtime.org/issues/browse/SPARK-798
 [559]: http://www.igniterealtime.org/issues/browse/SPARK-800
 [560]: http://www.igniterealtime.org/issues/browse/SPARK-759
 [561]: http://www.igniterealtime.org/issues/browse/SPARK-763
 [562]: http://www.igniterealtime.org/issues/browse/SPARK-766
 [563]: http://www.igniterealtime.org/issues/browse/SPARK-770
 [564]: http://www.igniterealtime.org/issues/browse/SPARK-771
 [565]: http://www.igniterealtime.org/issues/browse/SPARK-748
 [566]: http://www.igniterealtime.org/issues/browse/SPARK-753
 [567]: http://www.igniterealtime.org/issues/browse/SPARK-757
 [568]: http://www.igniterealtime.org/issues/browse/SPARK-758
 [569]: http://www.igniterealtime.org/issues/browse/SPARK-111
 [570]: http://www.igniterealtime.org/issues/browse/SPARK-662
 [571]: http://www.igniterealtime.org/issues/browse/SPARK-725
 [572]: http://www.igniterealtime.org/issues/browse/SPARK-727
 [573]: http://www.igniterealtime.org/issues/browse/SPARK-729
 [574]: http://www.igniterealtime.org/issues/browse/SPARK-735
 [575]: http://www.igniterealtime.org/issues/browse/SPARK-718
 [576]: http://www.igniterealtime.org/issues/browse/SPARK-732
 [577]: http://www.igniterealtime.org/issues/browse/SPARK-742
 [578]: http://www.igniterealtime.org/issues/browse/SPARK-746
 [579]: http://www.igniterealtime.org/issues/browse/SPARK-2
 [580]: http://www.igniterealtime.org/issues/browse/SPARK-399
 [581]: http://www.igniterealtime.org/issues/browse/SPARK-401
 [582]: http://www.igniterealtime.org/issues/browse/SPARK-609
 [583]: http://www.igniterealtime.org/issues/browse/SPARK-661
 [584]: http://www.igniterealtime.org/issues/browse/SPARK-664
 [585]: http://www.igniterealtime.org/issues/browse/SPARK-665
 [586]: http://www.igniterealtime.org/issues/browse/SPARK-674
 [587]: http://www.igniterealtime.org/issues/browse/SPARK-679
 [588]: http://www.igniterealtime.org/issues/browse/SPARK-691
 [589]: http://www.igniterealtime.org/issues/browse/SPARK-701
 [590]: http://www.igniterealtime.org/issues/browse/SPARK-598
 [591]: http://www.igniterealtime.org/issues/browse/SPARK-626
 [592]: http://www.igniterealtime.org/issues/browse/SPARK-659
 [593]: http://www.igniterealtime.org/issues/browse/SPARK-666
 [594]: http://www.igniterealtime.org/issues/browse/SPARK-669
 [595]: http://www.igniterealtime.org/issues/browse/SPARK-682
 [596]: http://www.igniterealtime.org/issues/browse/SPARK-693
 [597]: http://www.igniterealtime.org/issues/browse/SPARK-704
 [598]: http://www.igniterealtime.org/issues/browse/SPARK-714
 [599]: http://www.igniterealtime.org/issues/browse/SPARK-623
 [600]: http://www.igniterealtime.org/issues/browse/SPARK-633
 [601]: http://www.igniterealtime.org/issues/browse/SPARK-644
 [602]: http://www.igniterealtime.org/issues/browse/SPARK-645
 [603]: http://www.igniterealtime.org/issues/browse/SPARK-647
 [604]: http://www.igniterealtime.org/issues/browse/SPARK-649
 [605]: http://www.igniterealtime.org/issues/browse/SPARK-650
 [606]: http://www.igniterealtime.org/issues/browse/SPARK-652
 [607]: http://www.igniterealtime.org/issues/browse/SPARK-654
 [608]: http://www.igniterealtime.org/issues/browse/SPARK-655
 [609]: http://www.igniterealtime.org/issues/browse/SPARK-656
 [610]: http://www.igniterealtime.org/issues/browse/SPARK-658
 [611]: http://www.igniterealtime.org/issues/browse/SPARK-660
 [612]: http://www.igniterealtime.org/issues/browse/SPARK-668
 [613]: http://www.igniterealtime.org/issues/browse/SPARK-673
 [614]: http://www.igniterealtime.org/issues/browse/SPARK-681
 [615]: http://www.igniterealtime.org/issues/browse/SPARK-689
 [616]: http://www.igniterealtime.org/issues/browse/SPARK-382
 [617]: http://www.igniterealtime.org/issues/browse/SPARK-410
 [618]: http://www.igniterealtime.org/issues/browse/SPARK-559
 [619]: http://www.igniterealtime.org/issues/browse/SPARK-561
 [620]: http://www.igniterealtime.org/issues/browse/SPARK-567
 [621]: http://www.igniterealtime.org/issues/browse/SPARK-568
 [622]: http://www.igniterealtime.org/issues/browse/SPARK-571
 [623]: http://www.igniterealtime.org/issues/browse/SPARK-255
 [624]: http://www.igniterealtime.org/issues/browse/SPARK-452
 [625]: http://www.igniterealtime.org/issues/browse/SPARK-200
 [626]: http://www.igniterealtime.org/issues/browse/SPARK-517
 [627]: http://www.igniterealtime.org/issues/browse/SPARK-519
 [628]: http://www.igniterealtime.org/issues/browse/SPARK-515
 [629]: http://www.igniterealtime.org/issues/browse/SPARK-518
 [630]: http://www.igniterealtime.org/issues/browse/SPARK-523
 [631]: http://www.igniterealtime.org/issues/browse/SPARK-524
 [632]: http://www.igniterealtime.org/issues/browse/SPARK-528
 [633]: http://www.igniterealtime.org/issues/browse/SPARK-531
 [634]: http://www.igniterealtime.org/issues/browse/SPARK-485
 [635]: http://www.igniterealtime.org/issues/browse/SPARK-562
 [636]: http://www.igniterealtime.org/issues/browse/SPARK-563
 [637]: http://www.igniterealtime.org/issues/browse/SPARK-610
 [638]: http://www.igniterealtime.org/issues/browse/SPARK-453
 [639]: http://www.igniterealtime.org/issues/browse/SPARK-471
 [640]: http://www.igniterealtime.org/issues/browse/SPARK-510
 [641]: http://www.igniterealtime.org/issues/browse/SPARK-551
 [642]: http://www.igniterealtime.org/issues/browse/SPARK-552
 [643]: http://www.igniterealtime.org/issues/browse/SPARK-553
 [644]: http://www.igniterealtime.org/issues/browse/SPARK-554
 [645]: http://www.igniterealtime.org/issues/browse/SPARK-555
 [646]: http://www.igniterealtime.org/issues/browse/SPARK-556
 [647]: http://www.igniterealtime.org/issues/browse/SPARK-557
 [648]: http://www.igniterealtime.org/issues/browse/SPARK-558
 [649]: http://www.igniterealtime.org/issues/browse/SPARK-565
 [650]: http://www.igniterealtime.org/issues/browse/SPARK-314
 [651]: http://www.igniterealtime.org/issues/browse/SPARK-376
 [652]: http://www.igniterealtime.org/issues/browse/SPARK-455
 [653]: http://www.igniterealtime.org/issues/browse/SPARK-456
 [654]: http://www.igniterealtime.org/issues/browse/SPARK-463
 [655]: http://www.igniterealtime.org/issues/browse/SPARK-472
 [656]: http://www.igniterealtime.org/issues/browse/SPARK-478
 [657]: http://www.igniterealtime.org/issues/browse/SPARK-481
 [658]: http://www.igniterealtime.org/issues/browse/SPARK-486
 [659]: http://www.igniterealtime.org/issues/browse/SPARK-487
 [660]: http://www.igniterealtime.org/issues/browse/SPARK-488
 [661]: http://www.igniterealtime.org/issues/browse/SPARK-500
 [662]: http://www.igniterealtime.org/issues/browse/SPARK-501
 [663]: http://www.igniterealtime.org/issues/browse/SPARK-502
 [664]: http://www.igniterealtime.org/issues/browse/SPARK-503
 [665]: http://www.igniterealtime.org/issues/browse/SPARK-509
 [666]: http://www.igniterealtime.org/issues/browse/SPARK-511
 [667]: http://www.igniterealtime.org/issues/browse/SPARK-532
 [668]: http://www.igniterealtime.org/issues/browse/SPARK-534
 [669]: http://www.igniterealtime.org/issues/browse/SPARK-535
 [670]: http://www.igniterealtime.org/issues/browse/SPARK-536
 [671]: http://www.igniterealtime.org/issues/browse/SPARK-537
 [672]: http://www.igniterealtime.org/issues/browse/SPARK-538
 [673]: http://www.igniterealtime.org/issues/browse/SPARK-540
 [674]: http://www.igniterealtime.org/issues/browse/SPARK-542
 [675]: http://www.igniterealtime.org/issues/browse/SPARK-543
 [676]: http://www.igniterealtime.org/issues/browse/SPARK-544
 [677]: http://www.igniterealtime.org/issues/browse/SPARK-545
 [678]: http://www.igniterealtime.org/issues/browse/SPARK-546
 [679]: http://www.igniterealtime.org/issues/browse/SPARK-549
 [680]: http://www.igniterealtime.org/issues/browse/SPARK-550
 [681]: http://www.igniterealtime.org/issues/browse/SPARK-497
 [682]: http://www.igniterealtime.org/issues/browse/SPARK-499
 [683]: http://www.igniterealtime.org/issues/browse/SPARK-505
 [684]: http://www.igniterealtime.org/issues/browse/SPARK-508
 [685]: http://www.igniterealtime.org/issues/browse/SPARK-513
 [686]: http://www.igniterealtime.org/issues/browse/SPARK-514
 [687]: http://www.igniterealtime.org/issues/browse/SPARK-516
 [688]: http://www.igniterealtime.org/issues/browse/SPARK-520
 [689]: http://www.igniterealtime.org/issues/browse/SPARK-521
 [690]: http://www.igniterealtime.org/issues/browse/SPARK-522
 [691]: http://www.igniterealtime.org/issues/browse/SPARK-525
 [692]: http://www.igniterealtime.org/issues/browse/SPARK-526
 [693]: http://www.igniterealtime.org/issues/browse/SPARK-527
 [694]: http://www.igniterealtime.org/issues/browse/SPARK-529
 [695]: http://www.igniterealtime.org/issues/browse/SPARK-235
 [696]: http://www.igniterealtime.org/issues/browse/SPARK-390
 [697]: http://www.igniterealtime.org/issues/browse/SPARK-405
 [698]: http://www.igniterealtime.org/issues/browse/SPARK-420
 [699]: http://www.igniterealtime.org/issues/browse/SPARK-424
 [700]: http://www.igniterealtime.org/issues/browse/SPARK-427
 [701]: http://www.igniterealtime.org/issues/browse/SPARK-473
 [702]: http://www.igniterealtime.org/issues/browse/SPARK-483
 [703]: http://www.igniterealtime.org/issues/browse/SPARK-484
 [704]: http://www.igniterealtime.org/issues/browse/SPARK-491
 [705]: http://www.igniterealtime.org/issues/browse/SPARK-492
 [706]: http://www.igniterealtime.org/issues/browse/SPARK-493
 [707]: http://www.igniterealtime.org/issues/browse/SPARK-494
 [708]: http://www.igniterealtime.org/issues/browse/SPARK-506
 [709]: http://www.igniterealtime.org/issues/browse/SPARK-507
 [710]: http://www.igniterealtime.org/issues/browse/SPARK-530
 [711]: http://www.igniterealtime.org/issues/browse/SPARK-569
 [712]: http://www.igniterealtime.org/issues/browse/SPARK-574
 [713]: http://www.igniterealtime.org/issues/browse/SPARK-576
 [714]: http://www.igniterealtime.org/issues/browse/SPARK-577
 [715]: http://www.igniterealtime.org/issues/browse/SPARK-578
 [716]: http://www.igniterealtime.org/issues/browse/SPARK-579
 [717]: http://www.igniterealtime.org/issues/browse/SPARK-580
 [718]: http://www.igniterealtime.org/issues/browse/SPARK-582
 [719]: http://www.igniterealtime.org/issues/browse/SPARK-583
 [720]: http://www.igniterealtime.org/issues/browse/SPARK-584
 [721]: http://www.igniterealtime.org/issues/browse/SPARK-585
 [722]: http://www.igniterealtime.org/issues/browse/SPARK-587
 [723]: http://www.igniterealtime.org/issues/browse/SPARK-588
 [724]: http://www.igniterealtime.org/issues/browse/SPARK-589
 [725]: http://www.igniterealtime.org/issues/browse/SPARK-590
 [726]: http://www.igniterealtime.org/issues/browse/SPARK-591
 [727]: http://www.igniterealtime.org/issues/browse/SPARK-592
 [728]: http://www.igniterealtime.org/issues/browse/SPARK-593
 [729]: http://www.igniterealtime.org/issues/browse/SPARK-594
 [730]: http://www.igniterealtime.org/issues/browse/SPARK-595
 [731]: http://www.igniterealtime.org/issues/browse/SPARK-596
 [732]: http://www.igniterealtime.org/issues/browse/SPARK-597
 [733]: http://www.igniterealtime.org/issues/browse/SPARK-599
 [734]: http://www.igniterealtime.org/issues/browse/SPARK-600
 [735]: http://www.igniterealtime.org/issues/browse/SPARK-601
 [736]: http://www.igniterealtime.org/issues/browse/SPARK-602
 [737]: http://www.igniterealtime.org/issues/browse/SPARK-603
 [738]: http://www.igniterealtime.org/issues/browse/SPARK-604
 [739]: http://www.igniterealtime.org/issues/browse/SPARK-605
 [740]: http://www.igniterealtime.org/issues/browse/SPARK-606
 [741]: http://www.igniterealtime.org/issues/browse/SPARK-607
 [742]: http://www.igniterealtime.org/issues/browse/SPARK-611
 [743]: http://www.igniterealtime.org/issues/browse/SPARK-612
 [744]: http://www.igniterealtime.org/issues/browse/SPARK-613
 [745]: http://www.igniterealtime.org/issues/browse/SPARK-614
 [746]: http://www.igniterealtime.org/issues/browse/SPARK-616
 [747]: http://www.igniterealtime.org/issues/browse/SPARK-617
 [748]: http://www.igniterealtime.org/issues/browse/SPARK-620
 [749]: http://www.igniterealtime.org/issues/browse/SPARK-621
 [750]: http://www.igniterealtime.org/issues/browse/SPARK-622
 [751]: http://www.igniterealtime.org/issues/browse/SPARK-628
 [752]: http://www.igniterealtime.org/issues/browse/SPARK-629
 [753]: http://www.igniterealtime.org/issues/browse/SPARK-630
 [754]: http://www.igniterealtime.org/issues/browse/SPARK-641
 [755]: http://www.igniterealtime.org/issues/browse/SPARK-646
 [756]: http://www.igniterealtime.org/issues/browse/SPARK-462
 [757]: http://www.igniterealtime.org/issues/browse/SPARK-449
 [758]: http://www.igniterealtime.org/issues/browse/SPARK-450
 [759]: http://www.igniterealtime.org/issues/browse/SPARK-460
 [760]: http://www.igniterealtime.org/issues/browse/SPARK-461
 [761]: http://www.igniterealtime.org/issues/browse/SPARK-465
 [762]: http://www.igniterealtime.org/issues/browse/SPARK-468
 [763]: http://www.igniterealtime.org/issues/browse/SPARK-469
 [764]: http://www.igniterealtime.org/issues/browse/SPARK-470
 [765]: http://www.igniterealtime.org/issues/browse/SPARK-475
 [766]: http://www.igniterealtime.org/issues/browse/SPARK-476
 [767]: http://www.igniterealtime.org/issues/browse/SPARK-477
 [768]: http://www.igniterealtime.org/issues/browse/SPARK-479
 [769]: http://www.igniterealtime.org/issues/browse/SPARK-480
 [770]: http://www.jivesoftware.org/issues/browse/SPARK-444
 [771]: http://www.jivesoftware.org/issues/browse/SPARK-445
 [772]: http://www.jivesoftware.org/issues/browse/SPARK-447
 [773]: http://www.jivesoftware.org/issues/browse/SPARK-398
 [774]: http://www.jivesoftware.org/issues/browse/SPARK-428
 [775]: http://www.jivesoftware.org/issues/browse/SPARK-435
 [776]: http://www.jivesoftware.org/issues/browse/SPARK-436
 [777]: http://www.jivesoftware.org/issues/browse/SPARK-437
 [778]: http://www.jivesoftware.org/issues/browse/SPARK-438
 [779]: http://www.jivesoftware.org/issues/browse/SPARK-439
 [780]: http://www.jivesoftware.org/issues/browse/SPARK-440
 [781]: http://www.jivesoftware.org/issues/browse/SPARK-441
 [782]: http://www.jivesoftware.org/issues/browse/SPARK-442
 [783]: http://www.jivesoftware.org/issues/browse/SPARK-443
 [784]: http://www.jivesoftware.org/issues/browse/SPARK-446
 [785]: http://www.jivesoftware.org/issues/browse/SPARK-414
 [786]: http://www.jivesoftware.org/issues/browse/SPARK-415
 [787]: http://www.jivesoftware.org/issues/browse/SPARK-416
 [788]: http://www.jivesoftware.org/issues/browse/SPARK-418
 [789]: http://www.jivesoftware.org/issues/browse/SPARK-419
 [790]: http://www.jivesoftware.org/issues/browse/SPARK-425
 [791]: http://www.jivesoftware.org/issues/browse/SPARK-426
 [792]: http://www.jivesoftware.org/issues/browse/SPARK-429
 [793]: http://www.jivesoftware.org/issues/browse/SPARK-430
 [794]: http://www.jivesoftware.org/issues/browse/SPARK-432
 [795]: http://www.jivesoftware.org/issues/browse/SPARK-433
 [796]: http://www.jivesoftware.org/issues/browse/SPARK-353
 [797]: http://www.jivesoftware.org/issues/browse/SPARK-358
 [798]: http://www.jivesoftware.org/issues/browse/SPARK-402
 [799]: http://www.jivesoftware.org/issues/browse/SPARK-393
 [800]: http://www.jivesoftware.org/issues/browse/SPARK-400
 [801]: http://www.jivesoftware.org/issues/browse/SPARK-403
 [802]: http://www.jivesoftware.org/issues/browse/SPARK-394
 [803]: http://www.jivesoftware.org/issues/browse/SPARK-395
 [804]: http://www.jivesoftware.org/issues/browse/SPARK-396
 [805]: http://www.jivesoftware.org/issues/browse/SPARK-397
 [806]: http://www.jivesoftware.org/issues/browse/SPARK-364
 [807]: http://www.jivesoftware.org/issues/browse/SPARK-385
 [808]: http://www.jivesoftware.org/issues/browse/SPARK-386
 [809]: http://www.jivesoftware.org/issues/browse/SPARK-379
 [810]: http://www.jivesoftware.org/issues/browse/SPARK-383
 [811]: http://www.jivesoftware.org/issues/browse/SPARK-387
 [812]: http://www.jivesoftware.org/issues/browse/SPARK-388
 [813]: http://www.jivesoftware.org/issues/browse/SPARK-392
 [814]: http://www.jivesoftware.org/issues/browse/SPARK-363
 [815]: http://www.jivesoftware.org/issues/browse/SPARK-356
 [816]: http://www.jivesoftware.org/issues/browse/SPARK-359
 [817]: http://www.jivesoftware.org/issues/browse/SPARK-370
 [818]: http://www.jivesoftware.org/issues/browse/SPARK-374
 [819]: http://www.jivesoftware.org/issues/browse/SPARK-357
 [820]: http://www.jivesoftware.org/issues/browse/SPARK-360
 [821]: http://www.jivesoftware.org/issues/browse/SPARK-361
 [822]: http://www.jivesoftware.org/issues/browse/SPARK-362
 [823]: http://www.jivesoftware.org/issues/browse/SPARK-365
 [824]: http://www.jivesoftware.org/issues/browse/SPARK-366
 [825]: http://www.jivesoftware.org/issues/browse/SPARK-367
 [826]: http://www.jivesoftware.org/issues/browse/SPARK-368
 [827]: http://www.jivesoftware.org/issues/browse/SPARK-369
 [828]: http://www.jivesoftware.org/issues/browse/SPARK-371
 [829]: http://www.jivesoftware.org/issues/browse/SPARK-350
 [830]: http://www.jivesoftware.org/issues/browse/SPARK-341
 [831]: http://www.jivesoftware.org/issues/browse/SPARK-342
 [832]: http://www.jivesoftware.org/issues/browse/SPARK-343
 [833]: http://www.jivesoftware.org/issues/browse/SPARK-344
 [834]: http://www.jivesoftware.org/issues/browse/SPARK-345
 [835]: http://www.jivesoftware.org/issues/browse/SPARK-346
 [836]: http://www.jivesoftware.org/issues/browse/SPARK-347
 [837]: http://www.jivesoftware.org/issues/browse/SPARK-348
 [838]: http://www.jivesoftware.org/issues/browse/SPARK-351
 [839]: http://www.jivesoftware.org/issues/browse/SPARK-352
 [840]: http://www.jivesoftware.org/issues/browse/SPARK-5
 [841]: http://www.jivesoftware.org/issues/browse/SPARK-28
 [842]: http://www.jivesoftware.org/issues/browse/SPARK-45
 [843]: http://www.jivesoftware.org/issues/browse/SPARK-78
 [844]: http://www.jivesoftware.org/issues/browse/SPARK-162
 [845]: http://www.jivesoftware.org/issues/browse/SPARK-169
 [846]: http://www.jivesoftware.org/issues/browse/SPARK-177
 [847]: http://www.jivesoftware.org/issues/browse/SPARK-181
 [848]: http://www.jivesoftware.org/issues/browse/SPARK-290
 [849]: http://www.jivesoftware.org/issues/browse/SPARK-291
 [850]: http://www.jivesoftware.org/issues/browse/SPARK-292
 [851]: http://www.jivesoftware.org/issues/browse/SPARK-298
 [852]: http://www.jivesoftware.org/issues/browse/SPARK-299
 [853]: http://www.jivesoftware.org/issues/browse/SPARK-302
 [854]: http://www.jivesoftware.org/issues/browse/SPARK-314
 [855]: http://www.jivesoftware.org/issues/browse/SPARK-315
 [856]: http://www.jivesoftware.org/issues/browse/SPARK-324
 [857]: http://www.jivesoftware.org/issues/browse/SPARK-330
 [858]: http://www.jivesoftware.org/issues/browse/SPARK-332
 [859]: http://www.jivesoftware.org/issues/browse/SPARK-333
 [860]: http://www.jivesoftware.org/issues/browse/SPARK-335
 [861]: http://www.jivesoftware.org/issues/browse/SPARK-14
 [862]: http://www.jivesoftware.org/issues/browse/SPARK-88
 [863]: http://www.jivesoftware.org/issues/browse/SPARK-101
 [864]: http://www.jivesoftware.org/issues/browse/SPARK-208
 [865]: http://www.jivesoftware.org/issues/browse/SPARK-218
 [866]: http://www.jivesoftware.org/issues/browse/SPARK-221
 [867]: http://www.jivesoftware.org/issues/browse/SPARK-238
 [868]: http://www.jivesoftware.org/issues/browse/SPARK-240
 [869]: http://www.jivesoftware.org/issues/browse/SPARK-245
 [870]: http://www.jivesoftware.org/issues/browse/SPARK-253
 [871]: http://www.jivesoftware.org/issues/browse/SPARK-279
 [872]: http://www.jivesoftware.org/issues/browse/SPARK-280
 [873]: http://www.jivesoftware.org/issues/browse/SPARK-281
 [874]: http://www.jivesoftware.org/issues/browse/SPARK-282
 [875]: http://www.jivesoftware.org/issues/browse/SPARK-283
 [876]: http://www.jivesoftware.org/issues/browse/SPARK-285
 [877]: http://www.jivesoftware.org/issues/browse/SPARK-288
 [878]: http://www.jivesoftware.org/issues/browse/SPARK-293
 [879]: http://www.jivesoftware.org/issues/browse/SPARK-294
 [880]: http://www.jivesoftware.org/issues/browse/SPARK-297
 [881]: http://www.jivesoftware.org/issues/browse/SPARK-300
 [882]: http://www.jivesoftware.org/issues/browse/SPARK-301
 [883]: http://www.jivesoftware.org/issues/browse/SPARK-303
 [884]: http://www.jivesoftware.org/issues/browse/SPARK-304
 [885]: http://www.jivesoftware.org/issues/browse/SPARK-305
 [886]: http://www.jivesoftware.org/issues/browse/SPARK-306
 [887]: http://www.jivesoftware.org/issues/browse/SPARK-317
 [888]: http://www.jivesoftware.org/issues/browse/SPARK-318
 [889]: http://www.jivesoftware.org/issues/browse/SPARK-321
 [890]: http://www.jivesoftware.org/issues/browse/SPARK-322
 [891]: http://www.jivesoftware.org/issues/browse/SPARK-323
 [892]: http://www.jivesoftware.org/issues/browse/SPARK-326
 [893]: http://www.jivesoftware.org/issues/browse/SPARK-328
 [894]: http://www.jivesoftware.org/issues/browse/SPARK-331  