.class public final Le9/b;
.super Lr7/a;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(III)V
    .locals 0

    .line 1
    iput p3, p0, Le9/b;->c:I

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lr7/a;-><init>(II)V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method


# virtual methods
.method public final a(Lz7/a;)V
    .locals 1

    .line 1
    iget v0, p0, Le9/b;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "connection"

    .line 7
    .line 8
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "ALTER TABLE `ManualLRCBean` ADD COLUMN `zipInnerPath` TEXT NOT NULL DEFAULT \'\'"

    .line 12
    .line 13
    invoke-static {p1, v0}, Lud/n;->g(Lz7/a;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    const-string v0, "connection"

    .line 18
    .line 19
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-string v0, "CREATE TABLE IF NOT EXISTS `ManualLRCBean` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `rj` INTEGER NOT NULL, `name` TEXT NOT NULL, `docName` TEXT NOT NULL, `documentUri` TEXT NOT NULL)"

    .line 23
    .line 24
    invoke-static {p1, v0}, Lud/n;->g(Lz7/a;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_1
    const-string v0, "connection"

    .line 29
    .line 30
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const-string v0, "CREATE TABLE IF NOT EXISTS `BlacklistBean` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `type` TEXT NOT NULL, `value` TEXT NOT NULL)"

    .line 34
    .line 35
    invoke-static {p1, v0}, Lud/n;->g(Lz7/a;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_2
    const-string v0, "connection"

    .line 40
    .line 41
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    const-string v0, "CREATE TABLE IF NOT EXISTS `_new_LyricBean` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `rj` INTEGER NOT NULL, `sourceId` TEXT NOT NULL DEFAULT \'\', `nameBin` BLOB NOT NULL, `nameEnc` TEXT, `lyricBin` BLOB NOT NULL, `lyricEnc` TEXT, `duration` INTEGER NOT NULL, `documentUri` TEXT NOT NULL, `zipInnerPath` TEXT NOT NULL DEFAULT \'\')"

    .line 45
    .line 46
    invoke-static {p1, v0}, Lud/n;->g(Lz7/a;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const-string v0, "INSERT INTO `_new_LyricBean` (`id`,`rj`,`sourceId`,`nameBin`,`nameEnc`,`lyricBin`,`lyricEnc`,`duration`,`documentUri`,`zipInnerPath`) SELECT `id`,`rj`,`sourceId`,`nameBin`,`nameEnc`,`lyricBin`,`lyricEnc`,`duration`,`documentUri`,`zipInnerPath` FROM `LyricBean`"

    .line 50
    .line 51
    invoke-static {p1, v0}, Lud/n;->g(Lz7/a;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const-string v0, "DROP TABLE `LyricBean`"

    .line 55
    .line 56
    invoke-static {p1, v0}, Lud/n;->g(Lz7/a;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const-string v0, "ALTER TABLE `_new_LyricBean` RENAME TO `LyricBean`"

    .line 60
    .line 61
    invoke-static {p1, v0}, Lud/n;->g(Lz7/a;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const-string v0, "CREATE INDEX IF NOT EXISTS `index_LyricBean_rj` ON `LyricBean` (`rj`)"

    .line 65
    .line 66
    invoke-static {p1, v0}, Lud/n;->g(Lz7/a;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method
