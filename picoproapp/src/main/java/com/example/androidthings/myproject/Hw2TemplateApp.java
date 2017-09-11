package com.example.androidthings.myproject;

import android.content.res.AssetManager;
import android.graphics.Color;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.widget.EditText;

import android.text.style.ForegroundColorSpan;

import com.google.android.things.pio.Gpio;
import com.example.androidthings.myproject.SetTrie;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import java.util.ArrayList;
/**
 * Template for IDD Fall 2017 HW2 (text entry device)
 * Created by bjoern on 9/5/17.
 */

public class Hw2TemplateApp extends SimplePicoPro {

    Set<Gpio> leftHandDown, rightHandDown;
    int leftReleasedCount, rightReleasedCount;
    SetTrie dict;
    String screentext;

    Gpio[] right_pin_list = {GPIO_10, GPIO_32, GPIO_33, GPIO_34, GPIO_35};
    Gpio[] left_pin_list = {GPIO_37, GPIO_39, GPIO_128};

    public Hw2TemplateApp(){
        String wordlist = "the of and to a in for is on that by this with i you it not or be are from at as your all have new more an was we will home can us about if page my has search free but our one other do no information time they site he up may what which their news out use any there see only so his when contact here business who web also now help get pm view online c e first am been would how were me s services some these click its like service x than find price date back top people had list name just over state year day into email two health n world re next used go b work last most products music buy data make them should product system post her city t add policy number such please available copyright support message after best software then jan good video well d where info rights public books high school through m each links she review years order very privacy book items company r read group need many user said de does set under general research university january mail full map reviews program life know games way days management p part could great united hotel real f item international center ebay must store travel comments made development report off member details line terms before hotels did send right type because local those using results office education national car design take posted internet address community within states area want phone dvd shipping reserved subject between forum family l long based w code show o even black check special prices website index being women much sign file link open today technology south case project same pages uk version section own found sports house related security both g county american photo game members power while care network down computer systems three total place end following download h him without per access think north resources current posts big media law control water history pictures size art personal since including guide shop directory board location change white text small rating rate government children during usa return students v shopping account times sites level digital profile previous form events love old john main call hours image department title description non k y insurance another why shall property class cd still money quality every listing content country private little visit save tools low reply customer december compare movies include college value article york man card jobs provide j food source author different press u learn sale around print course job canada process teen room stock training too credit point join science men categories advanced west sales look english left team estate box conditions select windows photos gay thread week category note live large gallery table register however june october november market library really action start series model features air industry plan human provided tv yes required second hot accessories cost movie forums march la september better say questions july yahoo going medical test friend come dec server pc study application cart staff articles san feedback again play looking issues april never users complete street topic comment financial things working against standard tax person below mobile less got blog party payment equipment login student let programs offers legal above recent park stores side act problem red give memory performance social q august quote language story sell options experience rates create key body young america important field few east paper single ii age activities club example girls additional password z latest something road gift question changes night ca hard texas oct pay four poker status browse issue range building seller court february always result audio light write war nov offer blue groups al easy given files event release analysis request fax china making picture needs possible might professional yet month major star areas future space committee hand sun cards problems london washington meeting rss become interest id child keep enter california share similar garden schools million added reference companies listed baby learning energy run delivery net popular term film stories put computers journal reports co try welcome central images president notice original head radio until cell color self council away includes track australia discussion archive once others entertainment agreement format least society months log safety friends sure faq trade edition cars messages marketing tell further updated association able having provides david fun already green studies close common drive specific several gold feb living sep collection called short arts lot ask display limited powered solutions means director daily beach past natural whether due et electronics five upon period planning database says official weather mar land average done technical window france pro region island record direct microsoft conference environment records st district calendar costs style url front statement update parts aug ever downloads early miles sound resource present applications either ago document word works material bill apr written talk federal hosting rules final adult tickets thing centre requirements via cheap kids finance true minutes else mark third rock gifts europe reading topics bad individual tips plus auto cover usually edit together videos percent fast function fact unit getting global tech meet far economic en player projects lyrics often subscribe submit germany amount watch included feel though bank risk thanks everything deals various words linux jul production commercial james weight town heart advertising received choose treatment newsletter archives points knowledge magazine error camera jun girl currently construction toys registered clear golf receive domain methods chapter makes protection policies loan wide beauty manager india position taken sort listings models michael known half cases step engineering florida simple quick none wireless license paul friday lake whole annual published later basic sony shows corporate google church method purchase customers active response practice hardware figure materials fire holiday chat enough designed along among death writing speed html countries loss face brand discount higher effects created remember standards oil bit yellow political increase advertise kingdom base near environmental thought stuff french storage oh japan doing loans shoes entry stay nature orders availability africa summary turn mean growth notes agency king monday european activity copy although drug pics western income force cash employment overall bay river commission ad package contents seen players engine port album regional stop supplies started administration bar institute views plans double dog build screen exchange types soon sponsored lines electronic continue across benefits needed season apply someone held ny anything printer condition effective believe organization effect asked eur mind sunday selection casino pdf lost tour menu volume cross anyone mortgage hope silver corporation wish inside solution mature role rather weeks addition came supply nothing certain usr executive running lower necessary union jewelry according dc clothing mon com particular fine names robert homepage hour gas skills six bush islands advice career military rental decision leave british teens pre huge sat woman facilities zip bid kind sellers middle move cable opportunities taking values division coming tuesday object lesbian appropriate machine logo length actually nice score statistics client ok returns capital follow sample investment sent shown saturday christmas england culture band flash ms lead george choice went starting registration fri thursday courses consumer hi airport foreign artist outside furniture levels channel letter mode phones ideas wednesday structure fund summer allow degree contract button releases wed homes super male matter custom virginia almost took located multiple asian distribution editor inn industrial cause potential song cnet ltd los hp focus late fall featured idea rooms female responsible inc communications win associated thomas primary cancer numbers reason tool browser spring foundation answer voice eg friendly schedule documents communication purpose feature bed comes police everyone independent ip approach cameras brown physical operating hill maps medicine deal hold ratings chicago forms glass happy tue smith wanted developed thank safe unique survey prior telephone sport ready feed animal sources mexico population pa regular secure navigation operations therefore simply evidence station christian round paypal favorite understand option master valley recently probably thu rentals sea built publications blood cut worldwide improve connection publisher hall larger anti networks earth parents nokia impact transfer introduction kitchen strong tel carolina wedding properties hospital ground overview ship accommodation owners disease tx excellent paid italy perfect hair opportunity kit classic basis command cities william express award distance tree peter assessment ensure thus wall ie involved el extra especially interface partners budget rated guides success maximum ma operation existing quite selected boy amazon patients restaurants beautiful warning wine locations horse vote forward flowers stars significant lists technologies owner retail animals useful directly manufacturer ways est son providing rule mac housing takes iii gmt bring catalog searches max trying mother authority considered told xml traffic programme joined input strategy feet agent valid bin modern senior ireland teaching door grand testing trial charge units instead canadian cool normal wrote enterprise ships entire educational md leading metal positive fl fitness chinese opinion mb asia football abstract uses output funds mr greater likely develop employees artists alternative processing responsibility resolution java guest seems publication pass relations trust van contains session multi photography republic fees components vacation century academic assistance completed skin graphics indian prev ads mary il expected ring grade dating pacific mountain organizations pop filter mailing vehicle longer consider int northern behind panel floor german buying match proposed default require iraq boys outdoor deep morning otherwise allows rest protein plant reported hit transportation mm pool mini politics partner disclaimer authors boards faculty parties fish membership mission eye string sense modified pack released stage internal goods recommended born unless richard detailed japanese race approved background target except character usb maintenance ability maybe functions ed moving brands places php pretty trademarks phentermine spain southern yourself etc winter battery youth pressure submitted boston debt keywords medium television interested core break purposes throughout sets dance wood msn itself defined papers playing awards fee studio reader virtual device established answers rent las remote dark programming external apple le regarding instructions min offered theory enjoy remove aid surface minimum visual host variety teachers isbn martin manual block subjects agents increased repair fair civil steel understanding songs fixed wrong beginning hands associates finally az updates desktop classes paris ohio gets sector capacity requires jersey un fat fully father electric saw instruments quotes officer driver businesses dead respect unknown specified restaurant mike trip pst worth mi procedures poor teacher eyes relationship workers farm georgia peace traditional campus tom showing creative coast benefit progress funding devices lord grant sub agree fiction hear sometimes watches careers beyond goes families led museum themselves fan transport interesting blogs wife evaluation accepted former implementation ten hits zone complex th cat galleries references die presented jack flat flow agencies literature respective parent spanish michigan columbia setting dr scale stand economy highest helpful monthly critical frame musical definition secretary angeles networking path australian employee chief gives kb bottom magazines packages detail francisco laws changed pet heard begin individuals colorado royal clean switch russian largest african guy titles relevant guidelines justice connect bible dev cup basket applied weekly vol installation described demand pp suite vegas na square chris attention advance skip diet army auction gear lee os difference allowed correct charles nation selling lots piece sheet firm seven older illinois regulations elements species jump cells module resort facility random pricing dvds certificate minister motion looks fashion directions visitors documentation monitor trading forest calls whose coverage couple giving chance vision ball ending clients actions listen discuss accept automotive naked goal successful sold wind communities clinical situation sciences markets lowest highly publishing appear emergency developing lives currency leather determine temperature palm announcements patient actual historical stone bob commerce ringtones perhaps persons difficult scientific satellite fit tests village accounts amateur ex met pain xbox particularly factors coffee www settings buyer cultural steve easily oral ford poster edge functional root au fi closed holidays ice pink zealand balance monitoring graduate replies shot nc architecture initial label thinking scott llc sec recommend canon league waste minute bus provider optional dictionary cold accounting manufacturing sections chair fishing effort phase fields bag fantasy po letters motor va professor context install shirt apparel generally continued foot mass crime count breast techniques ibm rd johnson sc quickly dollars websites religion claim driving permission surgery patch heat wild measures generation kansas miss chemical doctor task reduce brought himself nor component enable exercise bug santa mid guarantee leader diamond israel se processes soft servers alone meetings seconds jones arizona keyword interests flight congress fuel username walk produced italian paperback classifieds wait supported pocket saint rose freedom argument competition creating jim drugs joint premium providers fresh characters attorney upgrade di factor growing thousands km stream apartments pick hearing eastern auctions therapy entries dates generated signed upper administrative serious prime samsung limit began louis steps errors shops del efforts informed ga ac thoughts creek ft worked quantity urban practices sorted reporting essential myself tours platform load affiliate labor immediately admin nursing defense machines designated tags heavy covered recovery joe guys integrated configuration merchant comprehensive expert universal protect drop solid cds presentation languages became orange compliance vehicles prevent theme rich im campaign marine improvement vs guitar finding pennsylvania examples ipod saying spirit ar claims challenge motorola acceptance strategies mo seem affairs touch intended towards sa goals hire election suggest branch charges serve affiliates reasons magic mount smart talking gave ones latin multimedia xp avoid certified manage corner rank computing oregon element birth virus abuse interactive requests separate quarter procedure leadership tables define racing religious facts breakfast kong column plants faith chain developer identify avenue missing died approximately domestic sitemap recommendations moved houston reach comparison mental viewed moment extended sequence inch attack sorry centers opening damage lab reserve recipes cvs gamma plastic produce snow placed truth counter failure follows eu weekend dollar camp ontario automatically des minnesota films bridge native fill williams movement printing baseball owned approval draft chart played contacts cc jesus readers clubs lcd wa jackson equal adventure matching offering shirts profit leaders posters institutions assistant variable ave dj advertisement expect parking headlines yesterday compared determined wholesale workshop russia gone codes kinds extension seattle statements golden completely teams fort cm wi lighting senate forces funny brother gene turned portable tried electrical applicable disc returned pattern ct boat named theatre laser earlier manufacturers sponsor classical icon warranty dedicated indiana direction harry basketball objects ends delete evening assembly nuclear taxes mouse signal criminal issued brain sexual wisconsin powerful dream obtained false da cast flower felt personnel passed supplied identified falls pic soul aids opinions promote stated stats hawaii professionals appears carry flag decided nj covers hr em advantage hello designs maintain tourism priority newsletters adults clips savings iv graphic atom payments rw estimated binding brief ended winning eight anonymous iron straight script served wants miscellaneous prepared void dining alert integration atlanta dakota tag interview mix framework disk installed queen vhs credits clearly fix handle sweet desk criteria pubmed dave massachusetts diego hong vice associate ne truck behavior enlarge ray frequently revenue measure changing votes du duty looked discussions bear gain festival laboratory ocean flights experts signs lack depth iowa whatever logged laptop vintage train exactly dry explore maryland spa concept nearly eligible checkout reality forgot handling origin knew gaming feeds billion destination scotland faster intelligence dallas bought con ups nations route followed specifications broken tripadvisor frank alaska zoom blow battle residential anime speak decisions industries protocol query clip partnership editorial nt expression es equity provisions speech wire principles suggestions rural shared sounds replacement tape strategic judge spam economics acid bytes cent forced compatible fight apartment height null zero speaker filed gb netherlands obtain bc consulting recreation offices designer remain managed pr failed marriage roll korea banks fr participants secret bath aa kelly leads negative austin favorites toronto theater springs missouri andrew var perform healthy translation estimates font assets injury mt joseph ministry drivers lawyer figures married protected proposal sharing philadelphia portal waiting birthday beta fail gratis banking officials brian toward won slightly assist conduct contained lingerie legislation calling parameters jazz serving bags profiles miami comics matters houses doc postal relationships tennessee wear controls breaking combined ultimate wales representative frequency introduced minor finish departments residents noted displayed mom reduced physics rare spent performed extreme samples davis daniel bars reviewed row oz forecast removed helps singles administrator cycle amounts contain accuracy dual rise usd sleep mg bird pharmacy brazil creation static scene hunter addresses lady crystal famous writer chairman violence fans oklahoma speakers drink academy dynamic gender eat permanent agriculture dell cleaning constitutes portfolio practical delivered collectibles infrastructure exclusive seat concerns colour vendor originally intel utilities philosophy regulation officers reduction aim bids referred supports nutrition recording regions junior toll les cape ann rings meaning tip secondary wonderful mine ladies henry ticket announced guess agreed prevention whom ski soccer math import posting presence instant mentioned automatic healthcare viewing maintained ch increasing majority connected christ dan dogs sd directors aspects austria ahead moon participation scheme utility preview fly manner matrix containing combination devel amendment despite strength guaranteed turkey libraries proper distributed degrees singapore enterprises delta fear seeking inches phoenix rs convention shares principal daughter standing comfort colors wars cisco ordering kept alpha appeal cruise bonus certification previously hey bookmark buildings specials beat disney household batteries adobe smoking bbc becomes drives arms alabama tea improved trees avg achieve positions dress subscription dealer contemporary sky utah nearby rom carried happen exposure panasonic hide permalink signature gambling refer miller provision outdoors clothes caused luxury babes frames certainly indeed newspaper toy circuit layer printed slow removal easier src liability trademark hip printers faqs nine adding kentucky mostly eric spot taylor trackback prints spend factory interior revised grow americans optical promotion relative amazing clock dot hiv identity suites conversion feeling hidden reasonable victoria serial relief revision broadband influence ratio pda importance rain onto dsl planet webmaster copies recipe zum permit seeing proof dna diff tennis bass prescription bedroom empty instance hole pets ride licensed orlando specifically tim bureau maine sql represent conservation pair ideal specs recorded don pieces finished parks dinner lawyers sydney stress cream ss runs trends yeah discover ap patterns boxes louisiana hills javascript fourth nm advisor mn marketplace nd evil aware wilson shape evolution irish certificates objectives stations suggested gps op remains acc greatest firms concerned euro operator structures generic encyclopedia usage cap ink charts continuing mixed census interracial peak tn competitive exist wheel transit suppliers salt compact poetry lights tracking angel bell keeping preparation attempt receiving matches accordance width noise engines forget array discussed accurate stephen elizabeth climate reservations pin playstation alcohol greek instruction managing annotation sister raw differences walking explain smaller newest establish gnu happened expressed jeff extent sharp lesbians ben lane paragraph kill mathematics aol compensation ce export managers aircraft modules sweden conflict conducted versions employer occur percentage knows mississippi describe concern backup requested citizens connecticut heritage personals immediate holding trouble spread coach kevin agricultural expand supporting audience assigned jordan collections ages participate plug specialist cook affect virgin experienced investigation raised hat institution directed dealers searching sporting helping perl affected lib bike totally plate expenses indicate blonde ab proceedings favourite transmission anderson utc characteristics der lose organic seek experiences albums cheats extremely verzeichnis contracts guests hosted diseases concerning developers equivalent chemistry tony neighborhood nevada kits thailand variables agenda anyway continues tracks advisory cam curriculum logic template prince circle soil grants anywhere psychology responses atlantic wet circumstances edward investor identification ram leaving wildlife appliances matt elementary cooking speaking sponsors fox unlimited respond sizes plain exit entered iran arm keys launch wave checking costa belgium printable holy acts guidance mesh trail enforcement symbol crafts highway buddy hardcover observed dean setup poll booking glossary fiscal celebrity styles denver unix filled bond channels ericsson appendix notify blues chocolate pub portion scope hampshire supplier cables cotton bluetooth controlled requirement authorities biology dental killed border ancient debate representatives starts pregnancy causes arkansas biography leisure attractions learned transactions notebook explorer historic attached opened tm husband disabled authorized crazy upcoming britain concert retirement scores financing efficiency sp comedy adopted efficient weblog linear commitment specialty bears jean hop carrier edited constant visa mouth jewish meter linked portland interviews concepts nh gun reflect pure deliver wonder lessons fruit begins qualified reform lens alerts treated discovery draw mysql classified relating assume confidence alliance fm confirm warm neither lewis howard offline leaves engineer lifestyle consistent replace clearance connections inventory converter organisation babe checks reached becoming safari objective indicated sugar crew legs sam stick securities allen pdt relation enabled genre slide montana volunteer tested rear democratic enhance switzerland exact bound parameter adapter processor node formal dimensions contribute lock hockey storm micro colleges laptops mile showed challenges editors mens threads bowl supreme brothers recognition presents ref tank submission dolls estimate encourage navy kid regulatory inspection consumers cancel limits territory transaction manchester weapons paint delay pilot outlet contributions continuous db czech resulting cambridge initiative novel pan execution disability increases ultra winner idaho contractor ph episode examination potter dish plays bulletin ia pt indicates modify oxford adam truly epinions painting committed extensive affordable universe candidate databases patent slot psp outstanding ha eating perspective planned watching lodge messenger mirror tournament consideration ds discounts sterling sessions kernel stocks buyers journals gray catalogue ea jennifer antonio charged broad taiwan und chosen demo greece lg swiss sarah clark labour hate terminal publishers nights behalf caribbean liquid rice nebraska loop salary reservation foods gourmet guard properly orleans saving nfl remaining empire resume twenty newly raise prepare avatar gary depending illegal expansion vary hundreds rome arab lincoln helped premier tomorrow purchased milk decide consent drama visiting performing downtown keyboard contest collected nw bands boot suitable ff absolutely millions lunch audit push chamber guinea findings muscle featuring iso implement clicking scheduled polls typical tower yours sum misc calculator significantly chicken temporary attend shower alan sending jason tonight dear sufficient holdem shell province catholic oak vat awareness vancouver governor beer seemed contribution measurement swimming spyware formula constitution packaging solar jose catch jane pakistan ps reliable consultation northwest sir doubt earn finder unable periods classroom tasks democracy attacks kim wallpaper merchandise const resistance doors symptoms resorts biggest memorial visitor twin forth insert baltimore gateway ky dont alumni drawing candidates charlotte ordered biological fighting transition happens preferences spy romance instrument bruce split themes powers heaven br bits pregnant twice classification focused egypt physician hollywood bargain wikipedia cellular norway vermont asking blocks normally lo spiritual hunting diabetes suit ml shift chip res sit bodies photographs cutting wow simon writers marks flexible loved favourites mapping numerous relatively birds satisfaction represents char indexed pittsburgh superior preferred saved paying cartoon shots intellectual moore granted choices carbon spending comfortable magnetic interaction listening effectively registry crisis outlook massive denmark employed bright treat header cs poverty formed piano echo que grid sheets patrick experimental puerto revolution consolidation displays plasma allowing earnings voip mystery landscape dependent mechanical journey delaware bidding consultants risks banner applicant charter fig barbara cooperation counties acquisition ports implemented sf directories recognized dreams blogger notification kg licensing stands teach occurred textbooks rapid pull hairy diversity cleveland ut reverse deposit seminar investments latina nasa wheels sexcam specify accessibility dutch sensitive templates formats tab depends boots holds router concrete si editing poland folder womens css completion upload pulse universities technique contractors milfhunter voting courts notices subscriptions calculate mc detroit alexander broadcast converted metro toshiba anniversary improvements strip specification pearl accident nick accessible accessory resident plot qty possibly airline typically representation regard pump exists arrangements smooth conferences uniprotkb strike consumption birmingham flashing lp narrow afternoon threat surveys sitting putting consultant controller ownership committees legislative researchers vietnam trailer anne castle gardens missed malaysia unsubscribe antique labels willing bio molecular acting heads stored exam logos residence attorneys milfs antiques density hundred ryan operators strange sustainable philippines statistical beds mention innovation pcs employers grey parallel honda amended operate bills bold bathroom stable opera definitions von doctors lesson cinema asset ag scan elections drinking reaction blank enhanced entitled severe generate stainless newspapers hospitals vi deluxe humor aged monitors exception lived duration bulk successfully indonesia pursuant sci fabric edt visits primarily tight domains capabilities pmid contrast recommendation flying recruitment sin berlin cute organized ba para siemens adoption improving cr expensive meant capture pounds buffalo organisations plane pg explained seed programmes desire expertise mechanism camping ee jewellery meets welfare peer caught eventually marked driven measured medline bottle agreements considering innovative marshall massage rubber conclusion closing tampa thousand meat legend grace susan ing ks adams python monster alex bang villa bone columns disorders bugs collaboration hamilton detection ftp cookies inner formation tutorial med engineers entity cruises gate holder proposals moderator sw tutorials settlement portugal lawrence roman duties valuable tone collectables ethics forever dragon busy captain fantastic imagine brings heating leg neck hd wing governments purchasing scripts abc stereo appointed taste dealing commit tiny operational rail airlines liberal livecam jay trips gap sides tube turns corresponding descriptions cache belt jacket determination animation oracle er matthew lease productions aviation hobbies proud excess disaster console commands jr telecommunications instructor giant achieved injuries shipped seats approaches biz alarm voltage anthony nintendo usual loading stamps appeared franklin angle rob vinyl highlights mining designers melbourne ongoing worst imaging betting scientists liberty wyoming blackjack argentina era convert possibility analyst commissioner dangerous garage exciting reliability thongs gcc unfortunately respectively volunteers attachment ringtone finland morgan derived pleasure honor asp oriented eagle desktops pants columbus nurse prayer appointment workshops hurricane quiet luck postage producer represented mortgages dial responsibilities cheese comic carefully jet productivity investors crown par underground diagnosis maker crack principle picks vacations gang semester calculated fetish applies casinos appearance smoke apache filters incorporated nv craft cake notebooks apart fellow blind lounge mad algorithm semi coins andy gross strongly cafe valentine hilton ken proteins horror su exp familiar capable douglas debian till involving pen investing christopher admission epson shoe elected carrying victory sand madison terrorism joy editions cpu mainly ethnic ran parliament actor finds seal situations fifth allocated citizen vertical corrections structural municipal describes prize sr occurs jon absolute disabilities consists anytime substance prohibited addressed lies pipe soldiers nr guardian lecture simulation layout initiatives ill concentration classics lbs lay interpretation horses lol dirty deck wayne donate taught bankruptcy mp worker optimization alive temple substances prove discovered wings breaks genetic restrictions participating waters promise thin exhibition prefer ridge cabinet modem harris mph bringing sick dose evaluate tiffany tropical collect bet composition toyota streets nationwide vector definitely shaved turning buffer purple existence commentary larry limousines developments def immigration destinations lets mutual pipeline necessarily syntax li attribute prison skill chairs nl everyday apparently surrounding mountains moves popularity inquiry ethernet checked exhibit throw trend sierra visible cats desert postposted ya oldest rhode nba coordinator obviously mercury steven handbook greg navigate worse summit victims epa spaces fundamental burning escape coupons somewhat receiver substantial tr progressive cialis bb boats glance scottish championship arcade richmond sacramento impossible ron russell tells obvious fiber depression graph covering platinum judgment bedrooms talks filing foster modeling passing awarded testimonials trials tissue nz memorabilia clinton masters bonds cartridge alberta explanation folk org commons cincinnati subsection fraud electricity permitted spectrum arrival okay pottery emphasis roger aspect workplace awesome mexican confirmed counts priced wallpapers hist crash lift desired inter closer assumes heights shadow riding infection firefox lisa expense grove eligibility venture clinic korean healing princess mall entering packet spray studios involvement dad buttons placement observations vbulletin funded thompson winners extend roads subsequent pat dublin rolling fell motorcycle yard disclosure establishment memories nelson te arrived creates faces tourist av mayor murder sean adequate senator yield presentations grades cartoons pour digest reg lodging tion dust hence wiki entirely replaced radar rescue undergraduate losses combat reducing stopped occupation lakes donations associations citysearch closely radiation diary seriously kings shooting kent adds nsw ear flags pci baker launched elsewhere pollution conservative guestbook shock effectiveness walls abroad ebony tie ward drawn arthur ian visited roof walker demonstrate atmosphere suggests kiss beast ra operated experiment targets overseas purchases dodge counsel federation pizza invited yards assignment chemicals gordon mod farmers rc queries bmw rush ukraine absence nearest cluster vendors mpeg whereas yoga serves woods surprise lamp rico partial shoppers phil everybody couples nashville ranking jokes cst http ceo simpson twiki sublime counseling palace acceptable satisfied glad wins measurements verify globe trusted copper milwaukee rack medication warehouse shareware ec rep dicke kerry receipt supposed ordinary nobody ghost violation configure stability mit applying southwest boss pride institutional expectations independence knowing reporter metabolism keith champion cloudy linda ross personally chile anna plenty solo sentence throat ignore maria uniform excellence wealth tall rm somewhere vacuum dancing attributes recognize brass writes plaza pdas outcomes survival quest publish sri screening toe thumbnail trans jonathan whenever nova lifetime api pioneer booty forgotten acrobat plates acres venue athletic thermal essays behaviour vital telling fairly coastal config cf charity intelligent edinburgh vt excel modes obligation campbell wake stupid harbor hungary traveler urw segment realize regardless lan enemy puzzle rising aluminum wells wishlist opens insight sms restricted republican secrets lucky latter merchants thick trailers repeat syndrome philips attendance penalty drum glasses enables nec iraqi builder vista jessica chips terry flood foto ease arguments amsterdam arena adventures pupils stewart announcement tabs outcome appreciate expanded casual grown polish lovely extras gm centres jerry clause smile lands ri troops indoor bulgaria armed broker charger regularly believed pine cooling tend gulf rt rick trucks cp mechanisms divorce laura shopper tokyo partly nikon customize tradition candy pills tiger donald folks sensor exposed telecom hunt angels deputy indicators sealed thai emissions physicians loaded fred complaint scenes experiments afghanistan dd boost spanking scholarship governance mill founded supplements chronic icons moral den catering aud finger keeps pound locate camcorder pl trained burn implementing roses labs ourselves bread tobacco wooden motors tough roberts incident gonna dynamics lie crm rf conversation decrease cumshots chest pension billy revenues emerging worship capability ak fe craig herself producing churches precision damages reserves contributed solve shorts reproduction minority td diverse amp ingredients sb ah johnny sole franchise recorder complaints facing sm nancy promotions tones passion rehabilitation maintaining sight laid clay defence patches weak refund usc towns environments trembl divided blvd reception amd wise emails cyprus wv odds correctly insider seminars consequences makers hearts geography appearing integrity worry ns discrimination eve carter legacy marc pleased danger vitamin widely processed phrase genuine raising implications functionality paradise hybrid reads roles intermediate emotional sons leaf pad glory platforms ja bigger billing diesel versus combine overnight geographic exceed bs rod saudi fault cuba hrs preliminary ";
        dict = new SetTrie();
        dict.loadWhitespaced(wordlist);
        screentext = "devi";
        println("Initializing app?");
        leftHandDown = new HashSet<>();
        rightHandDown = new HashSet<>();
        leftReleasedCount = 0;
        rightReleasedCount = 0;
    }

    private int gpioToIntRight(Collection<Gpio> keys) {
        int count = 0;
        for (int i = 0; i < right_pin_list.length; i++) {
            if(keys.contains(right_pin_list[i])) {
                count |= 1 << i;
            }
        }
        println("right hand chord had value " + count);
        return count;
    }

    private int gpioToIntLeft(Collection<Gpio> keys) {
        int count = 0;
        for (int i = 0; i < left_pin_list.length; i++) {
            if(keys.contains(left_pin_list[i])) {
                count |= 1 << i;
            }
        }
        return count;
    }


    private boolean isLeftHand(Gpio pin) {
        for (Gpio left_pin: left_pin_list) {
            if (left_pin == pin) {
                return true;
            }
        }
        return  false;
    }


    private String getLastWord(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            String letter = text.substring(i, i+1);
            if(letter.equals(" ")) { return  sb.toString(); }
            sb.insert(0, letter);
        }
        return sb.toString();
    }

    private String getAutocomplete() {
        String last = getLastWord(screentext);
        String complete = dict.complete(last);
        String trimmed = complete.substring(last.length());
        println("Autocompleted to " + complete);
        return trimmed;

    }

    private void  writeTextToScreen() {
        EditText ed = getEditText();
        String tail = getAutocomplete();
        ForegroundColorSpan redSpan = new ForegroundColorSpan(Color.RED);
        Spannable sb = new SpannableString(screentext + tail);
        println("writing to screen: " + screentext + tail);
        sb.setSpan(redSpan, screentext.length(), screentext.length() + tail.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ed.setText(sb);
        ed.setSelection(ed.getText().length());
    }
    private void handleLeftChord() {
        println("handling left chord");
        int action = gpioToIntLeft(leftHandDown);
        println("Action was " + Integer.toString(action));
        leftHandDown.clear();
        leftReleasedCount = 0;
        switch (action) {
            case 1:
                // Autocomplete to do
                screentext = screentext + getAutocomplete();
                break;
            case 2:
                // Print space
                screentext = screentext + ' ';
                break;
            case 3:
                // Print period
                screentext = screentext + '.';
                break;
            case 4:
                // Backspace
                int length = screentext.length();
                screentext = screentext.substring(0, Math.max(0, length - 1));
                break;
            case 5:
                // Newline
                screentext = screentext + '\n';
                break;
            case 6:
                // tab
                screentext = screentext + '\t';
                break;
            case 7:
                screentext = "";
                // Clear screen
                break;
            default:
                println("Something went wrong with the left hand broh");
                break;
        }
        writeTextToScreen();
    }

    private void handleRightChord() {
        println("handling right chord");
        int newchar = gpioToIntRight(rightHandDown);
        newchar += (int) 'a' - 1;
        println("Action was " + (char) newchar);
        rightHandDown.clear();
        rightReleasedCount = 0;
        screentext = screentext + (char) newchar;
        writeTextToScreen();
    }

    @Override
    public void setup() {
        //set two GPIOs to input
        for (Gpio pin : left_pin_list) {
            pinMode(pin, Gpio.DIRECTION_IN);
            setEdgeTrigger(pin, Gpio.EDGE_BOTH);
        }
        for (Gpio pin : right_pin_list) {
            pinMode(pin, Gpio.DIRECTION_IN);
            setEdgeTrigger(pin, Gpio.EDGE_BOTH);
        }

        writeTextToScreen();
    }

    @Override
    public void loop() {
        //nothing to do here

    }

    @Override
    void digitalEdgeEvent(Gpio pin, boolean value) {

        println("digitalEdgeEvent"+pin+", "+value);

        if(isLeftHand(pin)){
            println("Is left hand");
            //Left hand key release
            if(value==HIGH){
                println("is release");
                leftReleasedCount++;
                if(leftReleasedCount == leftHandDown.size()) {
                    handleLeftChord();
                }
            }
            //Left hand key press
            else{
                println("is press");
                leftHandDown.add(pin);
            }
        }else{
            println("Is right hand");
            //Right hand key release
            if(value==HIGH){
                println("is release");
                rightReleasedCount++;
                if(rightReleasedCount == rightHandDown.size()) {
                    handleRightChord();
                }
            }
            //Right hand key press
            else{
                println("is press");
                rightHandDown.add(pin);
            }

        }
    }
}
