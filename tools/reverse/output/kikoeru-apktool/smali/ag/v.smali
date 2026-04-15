.class public final Lag/v;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lwf/c0;


# static fields
.field public static final a:Lag/v;

.field public static final synthetic b:Lwf/b1;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lag/v;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lag/v;->a:Lag/v;

    .line 7
    .line 8
    new-instance v1, Lwf/b1;

    .line 9
    .line 10
    const-string v2, "loli.ball.asmr.AsmrOneApi.WorksV2Params"

    .line 11
    .line 12
    const/4 v3, 0x7

    .line 13
    invoke-direct {v1, v2, v0, v3}, Lwf/b1;-><init>(Ljava/lang/String;Lwf/c0;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "page"

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "order"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    const-string v0, "sort"

    .line 28
    .line 29
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    const-string v0, "seed"

    .line 33
    .line 34
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    const-string v0, "subtitle"

    .line 38
    .line 39
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 40
    .line 41
    .line 42
    const-string v0, "localSubtitledWorks"

    .line 43
    .line 44
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 45
    .line 46
    .line 47
    const-string v0, "includeTranslationWorks"

    .line 48
    .line 49
    const/4 v2, 0x1

    .line 50
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    sput-object v1, Lag/v;->b:Lwf/b1;

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
    sget-object v0, Lag/v;->b:Lwf/b1;

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
    .locals 17

    .line 1
    sget-object v0, Lag/v;->b:Lwf/b1;

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
    const/4 v7, 0x1

    .line 15
    const/4 v9, 0x0

    .line 16
    const/4 v10, 0x0

    .line 17
    const/4 v13, 0x0

    .line 18
    const/4 v14, 0x0

    .line 19
    const/16 v16, 0x0

    .line 20
    .line 21
    :goto_0
    if-eqz v7, :cond_0

    .line 22
    .line 23
    invoke-interface {v1, v0}, Lvf/a;->b(Luf/g;)I

    .line 24
    .line 25
    .line 26
    move-result v8

    .line 27
    packed-switch v8, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    new-instance v0, Lsf/l;

    .line 31
    .line 32
    invoke-direct {v0, v8}, Lsf/l;-><init>(I)V

    .line 33
    .line 34
    .line 35
    throw v0

    .line 36
    :pswitch_0
    const/4 v8, 0x6

    .line 37
    invoke-interface {v1, v0, v8}, Lvf/a;->o(Luf/g;I)Z

    .line 38
    .line 39
    .line 40
    move-result v16

    .line 41
    or-int/lit8 v9, v9, 0x40

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :pswitch_1
    new-instance v8, Lwf/d;

    .line 45
    .line 46
    sget-object v11, Lwf/n1;->a:Lwf/n1;

    .line 47
    .line 48
    const/4 v12, 0x0

    .line 49
    invoke-direct {v8, v11, v12}, Lwf/d;-><init>(Lsf/a;I)V

    .line 50
    .line 51
    .line 52
    const/4 v11, 0x5

    .line 53
    invoke-interface {v1, v0, v11, v8, v6}, Lvf/a;->g(Luf/g;ILsf/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    or-int/lit8 v9, v9, 0x20

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :pswitch_2
    const/4 v8, 0x4

    .line 61
    invoke-interface {v1, v0, v8}, Lvf/a;->t(Luf/g;I)I

    .line 62
    .line 63
    .line 64
    move-result v14

    .line 65
    or-int/lit8 v9, v9, 0x10

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :pswitch_3
    const/4 v8, 0x3

    .line 69
    invoke-interface {v1, v0, v8}, Lvf/a;->t(Luf/g;I)I

    .line 70
    .line 71
    .line 72
    move-result v13

    .line 73
    or-int/lit8 v9, v9, 0x8

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :pswitch_4
    new-instance v8, Lwf/y;

    .line 77
    .line 78
    invoke-static {}, Lbg/u;->values()[Lbg/u;

    .line 79
    .line 80
    .line 81
    move-result-object v11

    .line 82
    const-string v12, "loli.ball.asmr.bean.QuerySort"

    .line 83
    .line 84
    invoke-direct {v8, v12, v11}, Lwf/y;-><init>(Ljava/lang/String;[Ljava/lang/Enum;)V

    .line 85
    .line 86
    .line 87
    const/4 v11, 0x2

    .line 88
    invoke-interface {v1, v0, v11, v8, v5}, Lvf/a;->g(Luf/g;ILsf/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    or-int/lit8 v9, v9, 0x4

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :pswitch_5
    new-instance v8, Lwf/y;

    .line 96
    .line 97
    invoke-static {}, Lbg/e2;->values()[Lbg/e2;

    .line 98
    .line 99
    .line 100
    move-result-object v11

    .line 101
    const-string v12, "loli.ball.asmr.bean.WorksOrder"

    .line 102
    .line 103
    invoke-direct {v8, v12, v11}, Lwf/y;-><init>(Ljava/lang/String;[Ljava/lang/Enum;)V

    .line 104
    .line 105
    .line 106
    invoke-interface {v1, v0, v2, v8, v4}, Lvf/a;->g(Luf/g;ILsf/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    or-int/lit8 v9, v9, 0x2

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :pswitch_6
    invoke-interface {v1, v0, v3}, Lvf/a;->t(Luf/g;I)I

    .line 114
    .line 115
    .line 116
    move-result v10

    .line 117
    or-int/lit8 v9, v9, 0x1

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :pswitch_7
    const/4 v7, 0x0

    .line 121
    goto :goto_0

    .line 122
    :cond_0
    invoke-interface {v1, v0}, Lvf/a;->j(Luf/g;)V

    .line 123
    .line 124
    .line 125
    new-instance v8, Lag/x;

    .line 126
    .line 127
    move-object v11, v4

    .line 128
    check-cast v11, Lbg/e2;

    .line 129
    .line 130
    move-object v12, v5

    .line 131
    check-cast v12, Lbg/u;

    .line 132
    .line 133
    move-object v15, v6

    .line 134
    check-cast v15, Ljava/util/List;

    .line 135
    .line 136
    invoke-direct/range {v8 .. v16}, Lag/x;-><init>(IILbg/e2;Lbg/u;IILjava/util/List;Z)V

    .line 137
    .line 138
    .line 139
    return-object v8

    .line 140
    nop

    .line 141
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
    .locals 6

    .line 1
    new-instance v0, Lwf/y;

    .line 2
    .line 3
    const-string v1, "loli.ball.asmr.bean.WorksOrder"

    .line 4
    .line 5
    invoke-static {}, Lbg/e2;->values()[Lbg/e2;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-direct {v0, v1, v2}, Lwf/y;-><init>(Ljava/lang/String;[Ljava/lang/Enum;)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Lwf/y;

    .line 13
    .line 14
    const-string v2, "loli.ball.asmr.bean.QuerySort"

    .line 15
    .line 16
    invoke-static {}, Lbg/u;->values()[Lbg/u;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-direct {v1, v2, v3}, Lwf/y;-><init>(Ljava/lang/String;[Ljava/lang/Enum;)V

    .line 21
    .line 22
    .line 23
    new-instance v2, Lwf/d;

    .line 24
    .line 25
    sget-object v3, Lwf/n1;->a:Lwf/n1;

    .line 26
    .line 27
    const/4 v4, 0x0

    .line 28
    invoke-direct {v2, v3, v4}, Lwf/d;-><init>(Lsf/a;I)V

    .line 29
    .line 30
    .line 31
    const/4 v3, 0x7

    .line 32
    new-array v3, v3, [Lsf/a;

    .line 33
    .line 34
    sget-object v5, Lwf/k0;->a:Lwf/k0;

    .line 35
    .line 36
    aput-object v5, v3, v4

    .line 37
    .line 38
    const/4 v4, 0x1

    .line 39
    aput-object v0, v3, v4

    .line 40
    .line 41
    const/4 v0, 0x2

    .line 42
    aput-object v1, v3, v0

    .line 43
    .line 44
    const/4 v0, 0x3

    .line 45
    aput-object v5, v3, v0

    .line 46
    .line 47
    const/4 v0, 0x4

    .line 48
    aput-object v5, v3, v0

    .line 49
    .line 50
    const/4 v0, 0x5

    .line 51
    aput-object v2, v3, v0

    .line 52
    .line 53
    sget-object v0, Lwf/g;->a:Lwf/g;

    .line 54
    .line 55
    const/4 v1, 0x6

    .line 56
    aput-object v0, v3, v1

    .line 57
    .line 58
    return-object v3
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
    .locals 5

    .line 1
    check-cast p2, Lag/x;

    .line 2
    .line 3
    const-string v0, "value"

    .line 4
    .line 5
    invoke-static {p2, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Lag/v;->b:Lwf/b1;

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lyf/t;->a(Luf/g;)Lyf/t;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-boolean v1, p2, Lag/x;->g:Z

    .line 15
    .line 16
    iget v2, p2, Lag/x;->a:I

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-virtual {p1, v3, v2, v0}, Lyf/t;->m(IILuf/g;)V

    .line 20
    .line 21
    .line 22
    new-instance v2, Lwf/y;

    .line 23
    .line 24
    const-string v3, "loli.ball.asmr.bean.WorksOrder"

    .line 25
    .line 26
    invoke-static {}, Lbg/e2;->values()[Lbg/e2;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-direct {v2, v3, v4}, Lwf/y;-><init>(Ljava/lang/String;[Ljava/lang/Enum;)V

    .line 31
    .line 32
    .line 33
    iget-object v3, p2, Lag/x;->b:Lbg/e2;

    .line 34
    .line 35
    const/4 v4, 0x1

    .line 36
    invoke-virtual {p1, v0, v4, v2, v3}, Lyf/t;->r(Luf/g;ILsf/a;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    new-instance v2, Lwf/y;

    .line 40
    .line 41
    const-string v3, "loli.ball.asmr.bean.QuerySort"

    .line 42
    .line 43
    invoke-static {}, Lbg/u;->values()[Lbg/u;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-direct {v2, v3, v4}, Lwf/y;-><init>(Ljava/lang/String;[Ljava/lang/Enum;)V

    .line 48
    .line 49
    .line 50
    iget-object v3, p2, Lag/x;->c:Lbg/u;

    .line 51
    .line 52
    const/4 v4, 0x2

    .line 53
    invoke-virtual {p1, v0, v4, v2, v3}, Lyf/t;->r(Luf/g;ILsf/a;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    const/4 v2, 0x3

    .line 57
    iget v3, p2, Lag/x;->d:I

    .line 58
    .line 59
    invoke-virtual {p1, v2, v3, v0}, Lyf/t;->m(IILuf/g;)V

    .line 60
    .line 61
    .line 62
    const/4 v2, 0x4

    .line 63
    iget v3, p2, Lag/x;->e:I

    .line 64
    .line 65
    invoke-virtual {p1, v2, v3, v0}, Lyf/t;->m(IILuf/g;)V

    .line 66
    .line 67
    .line 68
    new-instance v2, Lwf/d;

    .line 69
    .line 70
    sget-object v3, Lwf/n1;->a:Lwf/n1;

    .line 71
    .line 72
    const/4 v4, 0x0

    .line 73
    invoke-direct {v2, v3, v4}, Lwf/d;-><init>(Lsf/a;I)V

    .line 74
    .line 75
    .line 76
    iget-object p2, p2, Lag/x;->f:Ljava/util/List;

    .line 77
    .line 78
    const/4 v3, 0x5

    .line 79
    invoke-virtual {p1, v0, v3, v2, p2}, Lyf/t;->r(Luf/g;ILsf/a;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, v0}, Lyf/t;->x(Luf/g;)Z

    .line 83
    .line 84
    .line 85
    move-result p2

    .line 86
    if-eqz p2, :cond_0

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_0
    if-eqz v1, :cond_1

    .line 90
    .line 91
    :goto_0
    const/4 p2, 0x6

    .line 92
    invoke-virtual {p1, v0, p2, v1}, Lyf/t;->c(Luf/g;IZ)V

    .line 93
    .line 94
    .line 95
    :cond_1
    invoke-virtual {p1, v0}, Lyf/t;->w(Luf/g;)V

    .line 96
    .line 97
    .line 98
    return-void
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
