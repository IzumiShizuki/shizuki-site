.class public final synthetic Lna/d;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lwf/c0;


# static fields
.field public static final a:Lna/d;

.field private static final descriptor:Luf/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lna/d;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lna/d;->a:Lna/d;

    .line 7
    .line 8
    new-instance v1, Lwf/b1;

    .line 9
    .line 10
    const-string v2, "com.cnl.kikoeru.utils.Asset"

    .line 11
    .line 12
    const/16 v3, 0xc

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, Lwf/b1;-><init>(Ljava/lang/String;Lwf/c0;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "url"

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "id"

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "node_id"

    .line 29
    .line 30
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "name"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string v0, "uploader"

    .line 39
    .line 40
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    const-string v0, "content_type"

    .line 44
    .line 45
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    const-string v0, "state"

    .line 49
    .line 50
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    const-string v0, "size"

    .line 54
    .line 55
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 56
    .line 57
    .line 58
    const-string v0, "download_count"

    .line 59
    .line 60
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 61
    .line 62
    .line 63
    const-string v0, "created_at"

    .line 64
    .line 65
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 66
    .line 67
    .line 68
    const-string v0, "updated_at"

    .line 69
    .line 70
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 71
    .line 72
    .line 73
    const-string v0, "browser_download_url"

    .line 74
    .line 75
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 76
    .line 77
    .line 78
    sput-object v1, Lna/d;->descriptor:Luf/g;

    .line 79
    .line 80
    return-void
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
    sget-object v0, Lna/d;->descriptor:Luf/g;

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
    .locals 19

    .line 1
    sget-object v0, Lna/d;->descriptor:Luf/g;

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
    const/4 v4, 0x0

    .line 11
    move-object v7, v4

    .line 12
    move-object v9, v7

    .line 13
    move-object v10, v9

    .line 14
    move-object v11, v10

    .line 15
    move-object v12, v11

    .line 16
    move-object v13, v12

    .line 17
    move-object/from16 v16, v13

    .line 18
    .line 19
    move-object/from16 v17, v16

    .line 20
    .line 21
    move-object/from16 v18, v17

    .line 22
    .line 23
    const/4 v4, 0x1

    .line 24
    const/4 v6, 0x0

    .line 25
    const/4 v8, 0x0

    .line 26
    const/4 v14, 0x0

    .line 27
    const/4 v15, 0x0

    .line 28
    :goto_0
    if-eqz v4, :cond_0

    .line 29
    .line 30
    invoke-interface {v1, v0}, Lvf/a;->b(Luf/g;)I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    packed-switch v5, :pswitch_data_0

    .line 35
    .line 36
    .line 37
    new-instance v0, Lsf/l;

    .line 38
    .line 39
    invoke-direct {v0, v5}, Lsf/l;-><init>(I)V

    .line 40
    .line 41
    .line 42
    throw v0

    .line 43
    :pswitch_0
    const/16 v5, 0xb

    .line 44
    .line 45
    invoke-interface {v1, v0, v5}, Lvf/a;->q(Luf/g;I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v18

    .line 49
    or-int/lit16 v6, v6, 0x800

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :pswitch_1
    const/16 v5, 0xa

    .line 53
    .line 54
    invoke-interface {v1, v0, v5}, Lvf/a;->q(Luf/g;I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v17

    .line 58
    or-int/lit16 v6, v6, 0x400

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :pswitch_2
    const/16 v5, 0x9

    .line 62
    .line 63
    invoke-interface {v1, v0, v5}, Lvf/a;->q(Luf/g;I)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v16

    .line 67
    or-int/lit16 v6, v6, 0x200

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :pswitch_3
    const/16 v5, 0x8

    .line 71
    .line 72
    invoke-interface {v1, v0, v5}, Lvf/a;->t(Luf/g;I)I

    .line 73
    .line 74
    .line 75
    move-result v15

    .line 76
    or-int/lit16 v6, v6, 0x100

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :pswitch_4
    const/4 v5, 0x7

    .line 80
    invoke-interface {v1, v0, v5}, Lvf/a;->t(Luf/g;I)I

    .line 81
    .line 82
    .line 83
    move-result v14

    .line 84
    or-int/lit16 v6, v6, 0x80

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :pswitch_5
    const/4 v5, 0x6

    .line 88
    invoke-interface {v1, v0, v5}, Lvf/a;->q(Luf/g;I)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v13

    .line 92
    or-int/lit8 v6, v6, 0x40

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :pswitch_6
    const/4 v5, 0x5

    .line 96
    invoke-interface {v1, v0, v5}, Lvf/a;->q(Luf/g;I)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v12

    .line 100
    or-int/lit8 v6, v6, 0x20

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :pswitch_7
    sget-object v5, Lna/x;->a:Lna/x;

    .line 104
    .line 105
    const/4 v3, 0x4

    .line 106
    invoke-interface {v1, v0, v3, v5, v11}, Lvf/a;->g(Luf/g;ILsf/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    move-object v11, v3

    .line 111
    check-cast v11, Lna/z;

    .line 112
    .line 113
    or-int/lit8 v6, v6, 0x10

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :pswitch_8
    const/4 v3, 0x3

    .line 117
    invoke-interface {v1, v0, v3}, Lvf/a;->q(Luf/g;I)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v10

    .line 121
    or-int/lit8 v6, v6, 0x8

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :pswitch_9
    const/4 v3, 0x2

    .line 125
    invoke-interface {v1, v0, v3}, Lvf/a;->q(Luf/g;I)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v9

    .line 129
    or-int/lit8 v6, v6, 0x4

    .line 130
    .line 131
    goto :goto_0

    .line 132
    :pswitch_a
    invoke-interface {v1, v0, v2}, Lvf/a;->t(Luf/g;I)I

    .line 133
    .line 134
    .line 135
    move-result v8

    .line 136
    or-int/lit8 v6, v6, 0x2

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :pswitch_b
    const/4 v3, 0x0

    .line 140
    invoke-interface {v1, v0, v3}, Lvf/a;->q(Luf/g;I)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v7

    .line 144
    or-int/lit8 v6, v6, 0x1

    .line 145
    .line 146
    goto :goto_0

    .line 147
    :pswitch_c
    const/4 v3, 0x0

    .line 148
    const/4 v4, 0x0

    .line 149
    goto :goto_0

    .line 150
    :cond_0
    invoke-interface {v1, v0}, Lvf/a;->j(Luf/g;)V

    .line 151
    .line 152
    .line 153
    new-instance v5, Lna/f;

    .line 154
    .line 155
    invoke-direct/range {v5 .. v18}, Lna/f;-><init>(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Lna/z;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    return-object v5

    .line 159
    :pswitch_data_0
    .packed-switch -0x1
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
    .locals 5

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    new-array v0, v0, [Lsf/a;

    .line 4
    .line 5
    sget-object v1, Lwf/n1;->a:Lwf/n1;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    aput-object v1, v0, v2

    .line 9
    .line 10
    sget-object v2, Lwf/k0;->a:Lwf/k0;

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    aput-object v2, v0, v3

    .line 14
    .line 15
    const/4 v3, 0x2

    .line 16
    aput-object v1, v0, v3

    .line 17
    .line 18
    const/4 v3, 0x3

    .line 19
    aput-object v1, v0, v3

    .line 20
    .line 21
    sget-object v3, Lna/x;->a:Lna/x;

    .line 22
    .line 23
    const/4 v4, 0x4

    .line 24
    aput-object v3, v0, v4

    .line 25
    .line 26
    const/4 v3, 0x5

    .line 27
    aput-object v1, v0, v3

    .line 28
    .line 29
    const/4 v3, 0x6

    .line 30
    aput-object v1, v0, v3

    .line 31
    .line 32
    const/4 v3, 0x7

    .line 33
    aput-object v2, v0, v3

    .line 34
    .line 35
    const/16 v3, 0x8

    .line 36
    .line 37
    aput-object v2, v0, v3

    .line 38
    .line 39
    const/16 v2, 0x9

    .line 40
    .line 41
    aput-object v1, v0, v2

    .line 42
    .line 43
    const/16 v2, 0xa

    .line 44
    .line 45
    aput-object v1, v0, v2

    .line 46
    .line 47
    const/16 v2, 0xb

    .line 48
    .line 49
    aput-object v1, v0, v2

    .line 50
    .line 51
    return-object v0
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
    .locals 4

    .line 1
    check-cast p2, Lna/f;

    .line 2
    .line 3
    const-string v0, "value"

    .line 4
    .line 5
    invoke-static {p2, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Lna/d;->descriptor:Luf/g;

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lyf/t;->a(Luf/g;)Lyf/t;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-object v1, p2, Lna/f;->a:Ljava/lang/String;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-virtual {p1, v0, v2, v1}, Lyf/t;->v(Luf/g;ILjava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    iget v2, p2, Lna/f;->b:I

    .line 22
    .line 23
    invoke-virtual {p1, v1, v2, v0}, Lyf/t;->m(IILuf/g;)V

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x2

    .line 27
    iget-object v2, p2, Lna/f;->c:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {p1, v0, v1, v2}, Lyf/t;->v(Luf/g;ILjava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 v1, 0x3

    .line 33
    iget-object v2, p2, Lna/f;->d:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {p1, v0, v1, v2}, Lyf/t;->v(Luf/g;ILjava/lang/String;)V

    .line 36
    .line 37
    .line 38
    sget-object v1, Lna/x;->a:Lna/x;

    .line 39
    .line 40
    iget-object v2, p2, Lna/f;->e:Lna/z;

    .line 41
    .line 42
    const/4 v3, 0x4

    .line 43
    invoke-virtual {p1, v0, v3, v1, v2}, Lyf/t;->r(Luf/g;ILsf/a;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    const/4 v1, 0x5

    .line 47
    iget-object v2, p2, Lna/f;->f:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {p1, v0, v1, v2}, Lyf/t;->v(Luf/g;ILjava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const/4 v1, 0x6

    .line 53
    iget-object v2, p2, Lna/f;->g:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {p1, v0, v1, v2}, Lyf/t;->v(Luf/g;ILjava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const/4 v1, 0x7

    .line 59
    iget v2, p2, Lna/f;->h:I

    .line 60
    .line 61
    invoke-virtual {p1, v1, v2, v0}, Lyf/t;->m(IILuf/g;)V

    .line 62
    .line 63
    .line 64
    const/16 v1, 0x8

    .line 65
    .line 66
    iget v2, p2, Lna/f;->i:I

    .line 67
    .line 68
    invoke-virtual {p1, v1, v2, v0}, Lyf/t;->m(IILuf/g;)V

    .line 69
    .line 70
    .line 71
    const/16 v1, 0x9

    .line 72
    .line 73
    iget-object v2, p2, Lna/f;->j:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {p1, v0, v1, v2}, Lyf/t;->v(Luf/g;ILjava/lang/String;)V

    .line 76
    .line 77
    .line 78
    const/16 v1, 0xa

    .line 79
    .line 80
    iget-object v2, p2, Lna/f;->k:Ljava/lang/String;

    .line 81
    .line 82
    invoke-virtual {p1, v0, v1, v2}, Lyf/t;->v(Luf/g;ILjava/lang/String;)V

    .line 83
    .line 84
    .line 85
    const/16 v1, 0xb

    .line 86
    .line 87
    iget-object p2, p2, Lna/f;->l:Ljava/lang/String;

    .line 88
    .line 89
    invoke-virtual {p1, v0, v1, p2}, Lyf/t;->v(Luf/g;ILjava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1, v0}, Lyf/t;->w(Luf/g;)V

    .line 93
    .line 94
    .line 95
    return-void
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
