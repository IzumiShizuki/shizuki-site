.class public final Lag/m;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lwf/c0;


# static fields
.field public static final a:Lag/m;

.field public static final synthetic b:Lwf/b1;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lag/m;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lag/m;->a:Lag/m;

    .line 7
    .line 8
    new-instance v1, Lwf/b1;

    .line 9
    .line 10
    const-string v2, "loli.ball.asmr.AsmrOneApi.PopularBean"

    .line 11
    .line 12
    const/4 v3, 0x7

    .line 13
    invoke-direct {v1, v2, v0, v3}, Lwf/b1;-><init>(Ljava/lang/String;Lwf/c0;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "keyword"

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "localSubtitledWorks"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    const-string v0, "page"

    .line 28
    .line 29
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    const-string v0, "subtitle"

    .line 33
    .line 34
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    const-string v0, "withPlaylistStatus"

    .line 38
    .line 39
    const/4 v2, 0x1

    .line 40
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    const-string v0, "recommenderUuid"

    .line 44
    .line 45
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    const-string v0, "itemId"

    .line 49
    .line 50
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    sput-object v1, Lag/m;->b:Lwf/b1;

    .line 54
    .line 55
    return-void
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
.end method


# virtual methods
.method public final a()Luf/g;
    .locals 1

    .line 1
    sget-object v0, Lag/m;->b:Lwf/b1;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public final b(Lvf/b;)Ljava/lang/Object;
    .locals 16

    .line 1
    sget-object v0, Lag/m;->b:Lwf/b1;

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-interface {v1, v0}, Lvf/b;->i(Luf/g;)Lvf/a;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x0

    .line 12
    move-object v5, v4

    .line 13
    move-object v6, v5

    .line 14
    move-object v7, v6

    .line 15
    move-object v8, v7

    .line 16
    const/4 v9, 0x1

    .line 17
    const/4 v10, 0x0

    .line 18
    const/4 v11, 0x0

    .line 19
    const/4 v12, 0x0

    .line 20
    :goto_0
    if-eqz v9, :cond_0

    .line 21
    .line 22
    invoke-interface {v1, v0}, Lvf/a;->b(Luf/g;)I

    .line 23
    .line 24
    .line 25
    move-result v13

    .line 26
    packed-switch v13, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    new-instance v0, Lsf/l;

    .line 30
    .line 31
    invoke-direct {v0, v13}, Lsf/l;-><init>(I)V

    .line 32
    .line 33
    .line 34
    throw v0

    .line 35
    :pswitch_0
    sget-object v13, Lwf/n1;->a:Lwf/n1;

    .line 36
    .line 37
    const/4 v14, 0x6

    .line 38
    invoke-interface {v1, v0, v14, v13, v8}, Lvf/a;->a(Luf/g;ILsf/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v8

    .line 42
    or-int/lit8 v10, v10, 0x40

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :pswitch_1
    sget-object v13, Lwf/n1;->a:Lwf/n1;

    .line 46
    .line 47
    const/4 v14, 0x5

    .line 48
    invoke-interface {v1, v0, v14, v13, v6}, Lvf/a;->a(Luf/g;ILsf/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    or-int/lit8 v10, v10, 0x20

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :pswitch_2
    new-instance v13, Lwf/d;

    .line 56
    .line 57
    sget-object v14, Lwf/n1;->a:Lwf/n1;

    .line 58
    .line 59
    const/4 v15, 0x0

    .line 60
    invoke-direct {v13, v14, v15}, Lwf/d;-><init>(Lsf/a;I)V

    .line 61
    .line 62
    .line 63
    const/4 v14, 0x4

    .line 64
    invoke-interface {v1, v0, v14, v13, v5}, Lvf/a;->g(Luf/g;ILsf/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    or-int/lit8 v10, v10, 0x10

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :pswitch_3
    const/4 v12, 0x3

    .line 72
    invoke-interface {v1, v0, v12}, Lvf/a;->t(Luf/g;I)I

    .line 73
    .line 74
    .line 75
    move-result v12

    .line 76
    or-int/lit8 v10, v10, 0x8

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :pswitch_4
    const/4 v11, 0x2

    .line 80
    invoke-interface {v1, v0, v11}, Lvf/a;->t(Luf/g;I)I

    .line 81
    .line 82
    .line 83
    move-result v11

    .line 84
    or-int/lit8 v10, v10, 0x4

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :pswitch_5
    new-instance v13, Lwf/d;

    .line 88
    .line 89
    sget-object v14, Lwf/n1;->a:Lwf/n1;

    .line 90
    .line 91
    const/4 v15, 0x0

    .line 92
    invoke-direct {v13, v14, v15}, Lwf/d;-><init>(Lsf/a;I)V

    .line 93
    .line 94
    .line 95
    invoke-interface {v1, v0, v2, v13, v4}, Lvf/a;->g(Luf/g;ILsf/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    or-int/lit8 v10, v10, 0x2

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :pswitch_6
    invoke-interface {v1, v0, v3}, Lvf/a;->q(Luf/g;I)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v7

    .line 106
    or-int/lit8 v10, v10, 0x1

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :pswitch_7
    const/4 v9, 0x0

    .line 110
    goto :goto_0

    .line 111
    :cond_0
    invoke-interface {v1, v0}, Lvf/a;->j(Luf/g;)V

    .line 112
    .line 113
    .line 114
    move-object v0, v5

    .line 115
    new-instance v5, Lag/o;

    .line 116
    .line 117
    check-cast v4, Ljava/util/List;

    .line 118
    .line 119
    check-cast v0, Ljava/util/List;

    .line 120
    .line 121
    check-cast v6, Ljava/lang/String;

    .line 122
    .line 123
    move-object v13, v8

    .line 124
    check-cast v13, Ljava/lang/String;

    .line 125
    .line 126
    move v8, v12

    .line 127
    move-object v12, v6

    .line 128
    move v6, v10

    .line 129
    move v10, v8

    .line 130
    move-object v8, v4

    .line 131
    move v9, v11

    .line 132
    move-object v11, v0

    .line 133
    invoke-direct/range {v5 .. v13}, Lag/o;-><init>(ILjava/lang/String;Ljava/util/List;IILjava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    return-object v5

    .line 137
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
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

.method public final c()[Lsf/a;
    .locals 7

    .line 1
    sget-object v0, Lwf/n1;->a:Lwf/n1;

    .line 2
    .line 3
    new-instance v1, Lwf/d;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, v0, v2}, Lwf/d;-><init>(Lsf/a;I)V

    .line 7
    .line 8
    .line 9
    new-instance v3, Lwf/d;

    .line 10
    .line 11
    invoke-direct {v3, v0, v2}, Lwf/d;-><init>(Lsf/a;I)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Ln7/b0;->o(Lsf/a;)Lsf/a;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    invoke-static {v0}, Ln7/b0;->o(Lsf/a;)Lsf/a;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    const/4 v6, 0x7

    .line 23
    new-array v6, v6, [Lsf/a;

    .line 24
    .line 25
    aput-object v0, v6, v2

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    aput-object v1, v6, v0

    .line 29
    .line 30
    sget-object v0, Lwf/k0;->a:Lwf/k0;

    .line 31
    .line 32
    const/4 v1, 0x2

    .line 33
    aput-object v0, v6, v1

    .line 34
    .line 35
    const/4 v1, 0x3

    .line 36
    aput-object v0, v6, v1

    .line 37
    .line 38
    const/4 v0, 0x4

    .line 39
    aput-object v3, v6, v0

    .line 40
    .line 41
    const/4 v0, 0x5

    .line 42
    aput-object v4, v6, v0

    .line 43
    .line 44
    const/4 v0, 0x6

    .line 45
    aput-object v5, v6, v0

    .line 46
    .line 47
    return-object v6
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
.end method

.method public final d(Lyf/t;Ljava/lang/Object;)V
    .locals 8

    .line 1
    check-cast p2, Lag/o;

    .line 2
    .line 3
    const-string v0, "value"

    .line 4
    .line 5
    invoke-static {p2, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Lag/m;->b:Lwf/b1;

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lyf/t;->a(Luf/g;)Lyf/t;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-object v1, p2, Lag/o;->g:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v2, p2, Lag/o;->f:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v3, p2, Lag/o;->e:Ljava/util/List;

    .line 19
    .line 20
    iget-object v4, p2, Lag/o;->a:Ljava/lang/String;

    .line 21
    .line 22
    const/4 v5, 0x0

    .line 23
    invoke-virtual {p1, v0, v5, v4}, Lyf/t;->v(Luf/g;ILjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    new-instance v4, Lwf/d;

    .line 27
    .line 28
    sget-object v5, Lwf/n1;->a:Lwf/n1;

    .line 29
    .line 30
    const/4 v6, 0x0

    .line 31
    invoke-direct {v4, v5, v6}, Lwf/d;-><init>(Lsf/a;I)V

    .line 32
    .line 33
    .line 34
    iget-object v6, p2, Lag/o;->b:Ljava/util/List;

    .line 35
    .line 36
    const/4 v7, 0x1

    .line 37
    invoke-virtual {p1, v0, v7, v4, v6}, Lyf/t;->r(Luf/g;ILsf/a;Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    const/4 v4, 0x2

    .line 41
    iget v6, p2, Lag/o;->c:I

    .line 42
    .line 43
    invoke-virtual {p1, v4, v6, v0}, Lyf/t;->m(IILuf/g;)V

    .line 44
    .line 45
    .line 46
    const/4 v4, 0x3

    .line 47
    iget p2, p2, Lag/o;->d:I

    .line 48
    .line 49
    invoke-virtual {p1, v4, p2, v0}, Lyf/t;->m(IILuf/g;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, v0}, Lyf/t;->x(Luf/g;)Z

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    if-eqz p2, :cond_0

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    sget-object p2, Lvb/r;->a:Lvb/r;

    .line 60
    .line 61
    invoke-static {v3, p2}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    if-nez p2, :cond_1

    .line 66
    .line 67
    :goto_0
    new-instance p2, Lwf/d;

    .line 68
    .line 69
    const/4 v4, 0x0

    .line 70
    invoke-direct {p2, v5, v4}, Lwf/d;-><init>(Lsf/a;I)V

    .line 71
    .line 72
    .line 73
    const/4 v4, 0x4

    .line 74
    invoke-virtual {p1, v0, v4, p2, v3}, Lyf/t;->r(Luf/g;ILsf/a;Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    :cond_1
    invoke-virtual {p1, v0}, Lyf/t;->x(Luf/g;)Z

    .line 78
    .line 79
    .line 80
    move-result p2

    .line 81
    if-eqz p2, :cond_2

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_2
    if-eqz v2, :cond_3

    .line 85
    .line 86
    :goto_1
    const/4 p2, 0x5

    .line 87
    invoke-virtual {p1, v0, p2, v5, v2}, Lyf/t;->q(Luf/g;ILsf/a;Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    :cond_3
    invoke-virtual {p1, v0}, Lyf/t;->x(Luf/g;)Z

    .line 91
    .line 92
    .line 93
    move-result p2

    .line 94
    if-eqz p2, :cond_4

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_4
    if-eqz v1, :cond_5

    .line 98
    .line 99
    :goto_2
    const/4 p2, 0x6

    .line 100
    invoke-virtual {p1, v0, p2, v5, v1}, Lyf/t;->q(Luf/g;ILsf/a;Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    :cond_5
    invoke-virtual {p1, v0}, Lyf/t;->w(Luf/g;)V

    .line 104
    .line 105
    .line 106
    return-void
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
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
.end method
