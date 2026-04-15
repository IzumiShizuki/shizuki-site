.class public final Lbg/n;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lwf/c0;


# static fields
.field public static final a:Lbg/n;

.field public static final synthetic b:Lwf/b1;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lbg/n;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lbg/n;->a:Lbg/n;

    .line 7
    .line 8
    new-instance v1, Lwf/b1;

    .line 9
    .line 10
    const-string v2, "loli.ball.asmr.bean.PlayList"

    .line 11
    .line 12
    const/16 v3, 0xd

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, Lwf/b1;-><init>(Ljava/lang/String;Lwf/c0;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "id"

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "user_name"

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "privacy"

    .line 29
    .line 30
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "locale"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string v0, "playback_count"

    .line 39
    .line 40
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    const-string v0, "name"

    .line 44
    .line 45
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    const-string v0, "description"

    .line 49
    .line 50
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    const-string v0, "created_at"

    .line 54
    .line 55
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 56
    .line 57
    .line 58
    const-string v0, "updated_at"

    .line 59
    .line 60
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 61
    .line 62
    .line 63
    const-string v0, "works_count"

    .line 64
    .line 65
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 66
    .line 67
    .line 68
    const-string v0, "exist"

    .line 69
    .line 70
    const/4 v2, 0x1

    .line 71
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 72
    .line 73
    .line 74
    const-string v0, "latestWorkID"

    .line 75
    .line 76
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 77
    .line 78
    .line 79
    const-string v0, "mainCoverUrl"

    .line 80
    .line 81
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 82
    .line 83
    .line 84
    sput-object v1, Lbg/n;->b:Lwf/b1;

    .line 85
    .line 86
    return-void
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
    sget-object v0, Lbg/n;->b:Lwf/b1;

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
    .locals 23

    .line 1
    sget-object v0, Lbg/n;->b:Lwf/b1;

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
    const-wide/16 v5, 0x0

    .line 13
    .line 14
    move-object v9, v4

    .line 15
    move-object v10, v9

    .line 16
    move-object v12, v10

    .line 17
    move-object v14, v12

    .line 18
    move-object v15, v14

    .line 19
    move-object/from16 v16, v15

    .line 20
    .line 21
    move-object/from16 v17, v16

    .line 22
    .line 23
    move-wide/from16 v20, v5

    .line 24
    .line 25
    const/4 v5, 0x1

    .line 26
    const/4 v8, 0x0

    .line 27
    const/4 v11, 0x0

    .line 28
    const/4 v13, 0x0

    .line 29
    const/16 v18, 0x0

    .line 30
    .line 31
    const/16 v19, 0x0

    .line 32
    .line 33
    :goto_0
    if-eqz v5, :cond_0

    .line 34
    .line 35
    invoke-interface {v1, v0}, Lvf/a;->b(Luf/g;)I

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    packed-switch v6, :pswitch_data_0

    .line 40
    .line 41
    .line 42
    new-instance v0, Lsf/l;

    .line 43
    .line 44
    invoke-direct {v0, v6}, Lsf/l;-><init>(I)V

    .line 45
    .line 46
    .line 47
    throw v0

    .line 48
    :pswitch_0
    sget-object v6, Lwf/n1;->a:Lwf/n1;

    .line 49
    .line 50
    const/16 v7, 0xc

    .line 51
    .line 52
    invoke-interface {v1, v0, v7, v6, v4}, Lvf/a;->a(Luf/g;ILsf/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    or-int/lit16 v8, v8, 0x1000

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :pswitch_1
    const/16 v6, 0xb

    .line 60
    .line 61
    invoke-interface {v1, v0, v6}, Lvf/a;->y(Luf/g;I)J

    .line 62
    .line 63
    .line 64
    move-result-wide v20

    .line 65
    or-int/lit16 v8, v8, 0x800

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :pswitch_2
    const/16 v6, 0xa

    .line 69
    .line 70
    invoke-interface {v1, v0, v6}, Lvf/a;->o(Luf/g;I)Z

    .line 71
    .line 72
    .line 73
    move-result v19

    .line 74
    or-int/lit16 v8, v8, 0x400

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :pswitch_3
    const/16 v6, 0x9

    .line 78
    .line 79
    invoke-interface {v1, v0, v6}, Lvf/a;->t(Luf/g;I)I

    .line 80
    .line 81
    .line 82
    move-result v18

    .line 83
    or-int/lit16 v8, v8, 0x200

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :pswitch_4
    const/16 v6, 0x8

    .line 87
    .line 88
    invoke-interface {v1, v0, v6}, Lvf/a;->q(Luf/g;I)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v17

    .line 92
    or-int/lit16 v8, v8, 0x100

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :pswitch_5
    const/4 v6, 0x7

    .line 96
    invoke-interface {v1, v0, v6}, Lvf/a;->q(Luf/g;I)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v16

    .line 100
    or-int/lit16 v8, v8, 0x80

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :pswitch_6
    const/4 v6, 0x6

    .line 104
    invoke-interface {v1, v0, v6}, Lvf/a;->q(Luf/g;I)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v15

    .line 108
    or-int/lit8 v8, v8, 0x40

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :pswitch_7
    const/4 v6, 0x5

    .line 112
    invoke-interface {v1, v0, v6}, Lvf/a;->q(Luf/g;I)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v14

    .line 116
    or-int/lit8 v8, v8, 0x20

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :pswitch_8
    const/4 v6, 0x4

    .line 120
    invoke-interface {v1, v0, v6}, Lvf/a;->t(Luf/g;I)I

    .line 121
    .line 122
    .line 123
    move-result v13

    .line 124
    or-int/lit8 v8, v8, 0x10

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :pswitch_9
    const/4 v6, 0x3

    .line 128
    invoke-interface {v1, v0, v6}, Lvf/a;->q(Luf/g;I)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v12

    .line 132
    or-int/lit8 v8, v8, 0x8

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :pswitch_a
    const/4 v6, 0x2

    .line 136
    invoke-interface {v1, v0, v6}, Lvf/a;->t(Luf/g;I)I

    .line 137
    .line 138
    .line 139
    move-result v11

    .line 140
    or-int/lit8 v8, v8, 0x4

    .line 141
    .line 142
    goto :goto_0

    .line 143
    :pswitch_b
    invoke-interface {v1, v0, v2}, Lvf/a;->q(Luf/g;I)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v10

    .line 147
    or-int/lit8 v8, v8, 0x2

    .line 148
    .line 149
    goto :goto_0

    .line 150
    :pswitch_c
    invoke-interface {v1, v0, v3}, Lvf/a;->q(Luf/g;I)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v9

    .line 154
    or-int/lit8 v8, v8, 0x1

    .line 155
    .line 156
    goto :goto_0

    .line 157
    :pswitch_d
    const/4 v5, 0x0

    .line 158
    goto :goto_0

    .line 159
    :cond_0
    invoke-interface {v1, v0}, Lvf/a;->j(Luf/g;)V

    .line 160
    .line 161
    .line 162
    new-instance v7, Lbg/p;

    .line 163
    .line 164
    move-object/from16 v22, v4

    .line 165
    .line 166
    check-cast v22, Ljava/lang/String;

    .line 167
    .line 168
    invoke-direct/range {v7 .. v22}, Lbg/p;-><init>(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZJLjava/lang/String;)V

    .line 169
    .line 170
    .line 171
    return-object v7

    .line 172
    nop

    .line 173
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
    .locals 5

    .line 1
    sget-object v0, Lwf/n1;->a:Lwf/n1;

    .line 2
    .line 3
    invoke-static {v0}, Ln7/b0;->o(Lsf/a;)Lsf/a;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/16 v2, 0xd

    .line 8
    .line 9
    new-array v2, v2, [Lsf/a;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    aput-object v0, v2, v3

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    aput-object v0, v2, v3

    .line 16
    .line 17
    sget-object v3, Lwf/k0;->a:Lwf/k0;

    .line 18
    .line 19
    const/4 v4, 0x2

    .line 20
    aput-object v3, v2, v4

    .line 21
    .line 22
    const/4 v4, 0x3

    .line 23
    aput-object v0, v2, v4

    .line 24
    .line 25
    const/4 v4, 0x4

    .line 26
    aput-object v3, v2, v4

    .line 27
    .line 28
    const/4 v4, 0x5

    .line 29
    aput-object v0, v2, v4

    .line 30
    .line 31
    const/4 v4, 0x6

    .line 32
    aput-object v0, v2, v4

    .line 33
    .line 34
    const/4 v4, 0x7

    .line 35
    aput-object v0, v2, v4

    .line 36
    .line 37
    const/16 v4, 0x8

    .line 38
    .line 39
    aput-object v0, v2, v4

    .line 40
    .line 41
    const/16 v0, 0x9

    .line 42
    .line 43
    aput-object v3, v2, v0

    .line 44
    .line 45
    sget-object v0, Lwf/g;->a:Lwf/g;

    .line 46
    .line 47
    const/16 v3, 0xa

    .line 48
    .line 49
    aput-object v0, v2, v3

    .line 50
    .line 51
    sget-object v0, Lwf/p0;->a:Lwf/p0;

    .line 52
    .line 53
    const/16 v3, 0xb

    .line 54
    .line 55
    aput-object v0, v2, v3

    .line 56
    .line 57
    const/16 v0, 0xc

    .line 58
    .line 59
    aput-object v1, v2, v0

    .line 60
    .line 61
    return-object v2
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
    .locals 7

    .line 1
    check-cast p2, Lbg/p;

    .line 2
    .line 3
    const-string v0, "value"

    .line 4
    .line 5
    invoke-static {p2, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Lbg/n;->b:Lwf/b1;

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lyf/t;->a(Luf/g;)Lyf/t;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-object v1, p2, Lbg/p;->m:Ljava/lang/String;

    .line 15
    .line 16
    iget-wide v2, p2, Lbg/p;->l:J

    .line 17
    .line 18
    iget-boolean v4, p2, Lbg/p;->k:Z

    .line 19
    .line 20
    iget-object v5, p2, Lbg/p;->a:Ljava/lang/String;

    .line 21
    .line 22
    const/4 v6, 0x0

    .line 23
    invoke-virtual {p1, v0, v6, v5}, Lyf/t;->v(Luf/g;ILjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 v5, 0x1

    .line 27
    iget-object v6, p2, Lbg/p;->b:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {p1, v0, v5, v6}, Lyf/t;->v(Luf/g;ILjava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 v5, 0x2

    .line 33
    iget v6, p2, Lbg/p;->c:I

    .line 34
    .line 35
    invoke-virtual {p1, v5, v6, v0}, Lyf/t;->m(IILuf/g;)V

    .line 36
    .line 37
    .line 38
    const/4 v5, 0x3

    .line 39
    iget-object v6, p2, Lbg/p;->d:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {p1, v0, v5, v6}, Lyf/t;->v(Luf/g;ILjava/lang/String;)V

    .line 42
    .line 43
    .line 44
    const/4 v5, 0x4

    .line 45
    iget v6, p2, Lbg/p;->e:I

    .line 46
    .line 47
    invoke-virtual {p1, v5, v6, v0}, Lyf/t;->m(IILuf/g;)V

    .line 48
    .line 49
    .line 50
    const/4 v5, 0x5

    .line 51
    iget-object v6, p2, Lbg/p;->f:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {p1, v0, v5, v6}, Lyf/t;->v(Luf/g;ILjava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const/4 v5, 0x6

    .line 57
    iget-object v6, p2, Lbg/p;->g:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {p1, v0, v5, v6}, Lyf/t;->v(Luf/g;ILjava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const/4 v5, 0x7

    .line 63
    iget-object v6, p2, Lbg/p;->h:Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {p1, v0, v5, v6}, Lyf/t;->v(Luf/g;ILjava/lang/String;)V

    .line 66
    .line 67
    .line 68
    const/16 v5, 0x8

    .line 69
    .line 70
    iget-object v6, p2, Lbg/p;->i:Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {p1, v0, v5, v6}, Lyf/t;->v(Luf/g;ILjava/lang/String;)V

    .line 73
    .line 74
    .line 75
    const/16 v5, 0x9

    .line 76
    .line 77
    iget p2, p2, Lbg/p;->j:I

    .line 78
    .line 79
    invoke-virtual {p1, v5, p2, v0}, Lyf/t;->m(IILuf/g;)V

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
    if-eqz v4, :cond_1

    .line 90
    .line 91
    :goto_0
    const/16 p2, 0xa

    .line 92
    .line 93
    invoke-virtual {p1, v0, p2, v4}, Lyf/t;->c(Luf/g;IZ)V

    .line 94
    .line 95
    .line 96
    :cond_1
    invoke-virtual {p1, v0}, Lyf/t;->x(Luf/g;)Z

    .line 97
    .line 98
    .line 99
    move-result p2

    .line 100
    if-eqz p2, :cond_2

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_2
    const-wide/16 v4, 0x0

    .line 104
    .line 105
    cmp-long p2, v2, v4

    .line 106
    .line 107
    if-eqz p2, :cond_3

    .line 108
    .line 109
    :goto_1
    const/16 p2, 0xb

    .line 110
    .line 111
    invoke-virtual {p1, v0, p2, v2, v3}, Lyf/t;->o(Luf/g;IJ)V

    .line 112
    .line 113
    .line 114
    :cond_3
    invoke-virtual {p1, v0}, Lyf/t;->x(Luf/g;)Z

    .line 115
    .line 116
    .line 117
    move-result p2

    .line 118
    if-eqz p2, :cond_4

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_4
    if-eqz v1, :cond_5

    .line 122
    .line 123
    :goto_2
    sget-object p2, Lwf/n1;->a:Lwf/n1;

    .line 124
    .line 125
    const/16 v2, 0xc

    .line 126
    .line 127
    invoke-virtual {p1, v0, v2, p2, v1}, Lyf/t;->q(Luf/g;ILsf/a;Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    :cond_5
    invoke-virtual {p1, v0}, Lyf/t;->w(Luf/g;)V

    .line 131
    .line 132
    .line 133
    return-void
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
