
/*
 * サッカー選手のパフォーマンス分析ができるシステムがあり、
 * 世界のトップクラブはこれを使って優秀なプレイヤーとそうでないプレイヤーを測っています。
 * 
 * 今、イギリスリーグのとあるクラブが新しい戦力補強のためにこのシステムを使ってゴール数が多いプレイヤーを
 * 獲得しようとしています。
 * 欲しいプレイヤーの条件は、「ゴール数が 20 ゴール以上、昨シーズンにビッグクラブ相手にゴールを決めている数が
 * 5 回以上」です。
 * ビッグクラブの条件は、昨シーズンの順位が 4 位以内のチームです。
 * 
 * 上記の条件に合うプレイヤー一覧を取得してください。表示カラムは、プレイヤー id（player_id）、
 * プレイヤー名（player_name）、ゴール数（goal_count）、ビッグクラブ相手のゴール数（big_team_goal_count）、
 * 所属チーム（team_name）、所属リーグ（league_name）で、順序はゴール数が多い順にしてください
 */
public class Problem553 {
/*
 * 
SELECT
    player.id,
    player.first_name || ' ' || player.last_name, 
    goals.player_goal,
    against_goal.bigclub_against_goal,
    team.team_name,
    team.league_name
    -- first_name || ' ' || last_name AS 'プレイヤー名'
FROM
    players player
LEFT OUTER JOIN
    (
        SELECT
            player_id,
            count(scored_at) AS player_goal
        FROM
            goals
        GROUP BY
            player_id
    )goals
ON
    goals.player_id = player.id
INNER JOIN
    (
        SELECT
            player_id,
            count(*) AS bigclub_against_goal
        FROM
            goals goal
        INNER JOIN
            teams team
        ON
            goal.against_team_id = team.id
        WHERE
            team.last_season_rank < 5
        GROUP BY
            player_id 
        HAVING 
            count(*) >= 5
    )against_goal
ON
    against_goal.player_id = player.id
LEFT JOIN
    (
        SELECT
            teams.id,
            teams.name AS 'team_name',
            teams.league_id,
            leagues.name AS 'league_name'
        FROM
            teams
        INNER JOIN
            leagues
        ON
            teams.league_id = leagues.id
        GROUP BY
            teams.id,
            teams.league_id
    )team
ON
    team.id = player.team_id
WHERE
    goals.player_goal >= 20
ORDER BY 
    goals.player_goal DESC
 */
}
