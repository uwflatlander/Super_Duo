package barqsoft.footballscores;

import android.content.Context;

/**
 * Created by yehya khaled on 3/3/2015.
 */
public class Utilies
{
    public static final int SERIE_A = 357;
    public static final int PREMIER_LEGAUE = 354;
    public static final int CHAMPIONS_LEAGUE = 362;
    public static final int PRIMERA_DIVISION = 358;
    public static final int BUNDESLIGA = 351;
    public static String getLeague(int league_num, Context context)
    {
        int stringId;
        switch (league_num)
        {
            case SERIE_A :
                stringId = R.string.seriaa;
                break;
            case PREMIER_LEGAUE :
                stringId = R.string.premierleague;
                break;
            case CHAMPIONS_LEAGUE :
                stringId = R.string.champions_league;
                break;
            case PRIMERA_DIVISION :
                stringId = R.string.primeradivison;
                break;
            case BUNDESLIGA :
                stringId = R.string.bundesliga;
                break;
            default: stringId = R.string.league_not_known;
        }
        return context.getString(stringId);
    }
    public static String getMatchDay(int match_day,int league_num, Context context)
    {
        int stringId;
        if(league_num == CHAMPIONS_LEAGUE)
        {
            if (match_day <= 6)
            {
                stringId = R.string.group_stages_matchday_6;
            }
            else if(match_day == 7 || match_day == 8)
            {
                stringId = R.string.first_knockout_round;
            }
            else if(match_day == 9 || match_day == 10)
            {
                stringId = R.string.quarter_final;
            }
            else if(match_day == 11 || match_day == 12)
            {
                stringId = R.string.semi_final;
            }
            else
            {
                stringId = R.string.final_text;
            }
        }
        else
        {
            return context.getString(R.string.matchday_number,String.valueOf(match_day));
        }

        return context.getString(stringId);
    }

    public static String getScores(int home_goals,int awaygoals, Context context)
    {
        if(home_goals < 0 || awaygoals < 0)
        {
            return context.getString(R.string.current_score,"","");
        }
        else
        {
            return context.getString(R.string.current_score,String.valueOf(home_goals),String.valueOf(awaygoals));
        }
    }

    public static int getTeamCrestByTeamName (String teamname)
    {
        if (teamname==null){return R.drawable.no_icon;}
        switch (teamname)
        { //This is the set of icons that are currently in the app. Feel free to find and add more
            //as you go.
            case "Arsenal London FC" : return R.drawable.arsenal;
            case "Manchester United FC" : return R.drawable.manchester_united;
            case "Swansea City" : return R.drawable.swansea_city_afc;
            case "Leicester City" : return R.drawable.leicester_city_fc_hd_logo;
            case "Everton FC" : return R.drawable.everton_fc_logo1;
            case "West Ham United FC" : return R.drawable.west_ham;
            case "Tottenham Hotspur FC" : return R.drawable.tottenham_hotspur;
            case "West Bromwich Albion" : return R.drawable.west_bromwich_albion_hd_logo;
            case "Sunderland AFC" : return R.drawable.sunderland;
            case "Stoke City FC" : return R.drawable.stoke_city;
            default: return R.drawable.no_icon;
        }
    }
}
