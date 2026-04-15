.class public final Le9/c;
.super Lr7/a;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final synthetic c:I

.field public final d:Lf9/f;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    iput p1, p0, Le9/c;->c:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/16 p1, 0xb

    .line 7
    .line 8
    const/16 v0, 0xc

    .line 9
    .line 10
    invoke-direct {p0, p1, v0}, Lr7/a;-><init>(II)V

    .line 11
    .line 12
    .line 13
    new-instance p1, Lf9/f;

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    invoke-direct {p1, v0}, Lf9/f;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Le9/c;->d:Lf9/f;

    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    const/16 p1, 0x9

    .line 23
    .line 24
    const/16 v0, 0xa

    .line 25
    .line 26
    invoke-direct {p0, p1, v0}, Lr7/a;-><init>(II)V

    .line 27
    .line 28
    .line 29
    new-instance p1, Lf9/f;

    .line 30
    .line 31
    const/4 v0, 0x6

    .line 32
    invoke-direct {p1, v0}, Lf9/f;-><init>(I)V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Le9/c;->d:Lf9/f;

    .line 36
    .line 37
    return-void

    .line 38
    :pswitch_1
    const/16 p1, 0x8

    .line 39
    .line 40
    const/16 v0, 0x9

    .line 41
    .line 42
    invoke-direct {p0, p1, v0}, Lr7/a;-><init>(II)V

    .line 43
    .line 44
    .line 45
    new-instance p1, Lf9/f;

    .line 46
    .line 47
    const/4 v0, 0x5

    .line 48
    invoke-direct {p1, v0}, Lf9/f;-><init>(I)V

    .line 49
    .line 50
    .line 51
    iput-object p1, p0, Le9/c;->d:Lf9/f;

    .line 52
    .line 53
    return-void

    .line 54
    :pswitch_2
    const/4 p1, 0x7

    .line 55
    const/16 v0, 0x8

    .line 56
    .line 57
    invoke-direct {p0, p1, v0}, Lr7/a;-><init>(II)V

    .line 58
    .line 59
    .line 60
    new-instance p1, Lf9/f;

    .line 61
    .line 62
    const/4 v0, 0x4

    .line 63
    invoke-direct {p1, v0}, Lf9/f;-><init>(I)V

    .line 64
    .line 65
    .line 66
    iput-object p1, p0, Le9/c;->d:Lf9/f;

    .line 67
    .line 68
    return-void

    .line 69
    :pswitch_3
    const/4 p1, 0x5

    .line 70
    const/4 v0, 0x6

    .line 71
    invoke-direct {p0, p1, v0}, Lr7/a;-><init>(II)V

    .line 72
    .line 73
    .line 74
    new-instance p1, Lf9/f;

    .line 75
    .line 76
    const/4 v0, 0x3

    .line 77
    invoke-direct {p1, v0}, Lf9/f;-><init>(I)V

    .line 78
    .line 79
    .line 80
    iput-object p1, p0, Le9/c;->d:Lf9/f;

    .line 81
    .line 82
    return-void

    .line 83
    :pswitch_4
    const/4 p1, 0x3

    .line 84
    const/4 v0, 0x4

    .line 85
    invoke-direct {p0, p1, v0}, Lr7/a;-><init>(II)V

    .line 86
    .line 87
    .line 88
    new-instance p1, Lf9/f;

    .line 89
    .line 90
    const/4 v0, 0x2

    .line 91
    invoke-direct {p1, v0}, Lf9/f;-><init>(I)V

    .line 92
    .line 93
    .line 94
    iput-object p1, p0, Le9/c;->d:Lf9/f;

    .line 95
    .line 96
    return-void

    .line 97
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method


# virtual methods
.method public final a(Lz7/a;)V
    .locals 1

    .line 1
    iget v0, p0, Le9/c;->c:I

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
    const-string v0, "ALTER TABLE `HistoryBean` ADD COLUMN `sourceId` TEXT NOT NULL DEFAULT \'\'"

    .line 12
    .line 13
    invoke-static {p1, v0}, Lud/n;->g(Lz7/a;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "ALTER TABLE `HistoryBean` ADD COLUMN `workJson` TEXT NOT NULL DEFAULT \'\'"

    .line 17
    .line 18
    invoke-static {p1, v0}, Lud/n;->g(Lz7/a;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "ALTER TABLE `DownloadBean` ADD COLUMN `sourceId` TEXT NOT NULL DEFAULT \'\'"

    .line 22
    .line 23
    invoke-static {p1, v0}, Lud/n;->g(Lz7/a;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "ALTER TABLE `DownloadBean` ADD COLUMN `workJson` TEXT NOT NULL DEFAULT \'\'"

    .line 27
    .line 28
    invoke-static {p1, v0}, Lud/n;->g(Lz7/a;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v0, "ALTER TABLE `ManualLRCBean` ADD COLUMN `sourceId` TEXT NOT NULL DEFAULT \'\'"

    .line 32
    .line 33
    invoke-static {p1, v0}, Lud/n;->g(Lz7/a;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v0, "ALTER TABLE `LyricBean` ADD COLUMN `sourceId` TEXT NOT NULL DEFAULT \'\'"

    .line 37
    .line 38
    invoke-static {p1, v0}, Lud/n;->g(Lz7/a;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Le9/c;->d:Lf9/f;

    .line 42
    .line 43
    invoke-static {v0, p1}, Lq/t0;->b(Lf9/f;Lz7/a;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :pswitch_0
    const-string v0, "connection"

    .line 48
    .line 49
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const-string v0, "ALTER TABLE `LyricBean` ADD COLUMN `nameEnc` TEXT DEFAULT NULL"

    .line 53
    .line 54
    invoke-static {p1, v0}, Lud/n;->g(Lz7/a;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const-string v0, "ALTER TABLE `LyricBean` ADD COLUMN `lyricEnc` TEXT DEFAULT NULL"

    .line 58
    .line 59
    invoke-static {p1, v0}, Lud/n;->g(Lz7/a;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, Le9/c;->d:Lf9/f;

    .line 63
    .line 64
    invoke-static {v0, p1}, Lq/t0;->b(Lf9/f;Lz7/a;)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :pswitch_1
    const-string v0, "connection"

    .line 69
    .line 70
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const-string v0, "CREATE TABLE IF NOT EXISTS `LyricBean` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `rj` INTEGER NOT NULL, `nameBin` BLOB NOT NULL, `lyricBin` BLOB NOT NULL, `duration` INTEGER NOT NULL, `documentUri` TEXT NOT NULL, `zipInnerPath` TEXT NOT NULL DEFAULT \'\')"

    .line 74
    .line 75
    invoke-static {p1, v0}, Lud/n;->g(Lz7/a;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    iget-object v0, p0, Le9/c;->d:Lf9/f;

    .line 79
    .line 80
    invoke-static {v0, p1}, Lq/t0;->b(Lf9/f;Lz7/a;)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :pswitch_2
    const-string v0, "connection"

    .line 85
    .line 86
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    const-string v0, "CREATE TABLE IF NOT EXISTS `AccountBean` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `server` TEXT NOT NULL, `username` TEXT NOT NULL, `password` TEXT NOT NULL, `token` TEXT NOT NULL, `timestamp` INTEGER NOT NULL)"

    .line 90
    .line 91
    invoke-static {p1, v0}, Lud/n;->g(Lz7/a;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    iget-object v0, p0, Le9/c;->d:Lf9/f;

    .line 95
    .line 96
    invoke-static {v0, p1}, Lq/t0;->b(Lf9/f;Lz7/a;)V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :pswitch_3
    const-string v0, "connection"

    .line 101
    .line 102
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    const-string v0, "ALTER TABLE `HistoryBean` ADD COLUMN `nsfw` INTEGER NOT NULL DEFAULT 1"

    .line 106
    .line 107
    invoke-static {p1, v0}, Lud/n;->g(Lz7/a;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    const-string v0, "ALTER TABLE `HistoryBean` ADD COLUMN `has_subtitle` INTEGER NOT NULL DEFAULT 0"

    .line 111
    .line 112
    invoke-static {p1, v0}, Lud/n;->g(Lz7/a;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    const-string v0, "ALTER TABLE `DownloadBean` ADD COLUMN `nsfw` INTEGER NOT NULL DEFAULT 1"

    .line 116
    .line 117
    invoke-static {p1, v0}, Lud/n;->g(Lz7/a;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    const-string v0, "ALTER TABLE `DownloadBean` ADD COLUMN `has_subtitle` INTEGER NOT NULL DEFAULT 0"

    .line 121
    .line 122
    invoke-static {p1, v0}, Lud/n;->g(Lz7/a;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    iget-object v0, p0, Le9/c;->d:Lf9/f;

    .line 126
    .line 127
    invoke-static {v0, p1}, Lq/t0;->b(Lf9/f;Lz7/a;)V

    .line 128
    .line 129
    .line 130
    return-void

    .line 131
    :pswitch_4
    const-string v0, "connection"

    .line 132
    .line 133
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    iget-object v0, p0, Le9/c;->d:Lf9/f;

    .line 137
    .line 138
    invoke-static {v0, p1}, Lq/t0;->b(Lf9/f;Lz7/a;)V

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    nop

    .line 143
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
.end method
