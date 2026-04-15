.class public abstract Lna/o;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final a:Ljava/util/ArrayList;

.field public static final b:Ljava/util/ArrayList;

.field public static final c:Ljava/util/ArrayList;

.field public static final d:Ljava/util/ArrayList;

.field public static final e:Lub/p;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 1
    invoke-static {}, Lbg/u;->values()[Lbg/u;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    array-length v2, v0

    .line 8
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 9
    .line 10
    .line 11
    array-length v2, v0

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x0

    .line 14
    :goto_0
    const/4 v5, 0x1

    .line 15
    if-ge v4, v2, :cond_2

    .line 16
    .line 17
    aget-object v6, v0, v4

    .line 18
    .line 19
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 20
    .line 21
    .line 22
    move-result v7

    .line 23
    if-eqz v7, :cond_1

    .line 24
    .line 25
    if-ne v7, v5, :cond_0

    .line 26
    .line 27
    const v5, 0x7f0c0063

    .line 28
    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    new-instance v0, Lce/j0;

    .line 32
    .line 33
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 34
    .line 35
    .line 36
    throw v0

    .line 37
    :cond_1
    const v5, 0x7f0c0014

    .line 38
    .line 39
    .line 40
    :goto_1
    invoke-static {v5}, Lna/q;->g(I)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    new-instance v7, Lub/k;

    .line 45
    .line 46
    invoke-direct {v7, v6, v5}, Lub/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    add-int/lit8 v4, v4, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    sput-object v1, Lna/o;->a:Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-static {}, Lbg/e2;->values()[Lbg/e2;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    new-instance v1, Ljava/util/ArrayList;

    .line 62
    .line 63
    array-length v2, v0

    .line 64
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 65
    .line 66
    .line 67
    array-length v2, v0

    .line 68
    const/4 v4, 0x0

    .line 69
    :goto_2
    const v6, 0x7f0c0171

    .line 70
    .line 71
    .line 72
    const v7, 0x7f0c0170

    .line 73
    .line 74
    .line 75
    const v8, 0x7f0c016a

    .line 76
    .line 77
    .line 78
    const v9, 0x7f0c0172

    .line 79
    .line 80
    .line 81
    const v10, 0x7f0c016c

    .line 82
    .line 83
    .line 84
    if-ge v4, v2, :cond_3

    .line 85
    .line 86
    aget-object v11, v0, v4

    .line 87
    .line 88
    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    .line 89
    .line 90
    .line 91
    move-result v12

    .line 92
    const v13, 0x7f0c0169

    .line 93
    .line 94
    .line 95
    packed-switch v12, :pswitch_data_0

    .line 96
    .line 97
    .line 98
    new-instance v0, Lce/j0;

    .line 99
    .line 100
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 101
    .line 102
    .line 103
    throw v0

    .line 104
    :pswitch_0
    const v6, 0x7f0c016e

    .line 105
    .line 106
    .line 107
    goto :goto_3

    .line 108
    :pswitch_1
    const v6, 0x7f0c016c

    .line 109
    .line 110
    .line 111
    goto :goto_3

    .line 112
    :pswitch_2
    const v6, 0x7f0c016b

    .line 113
    .line 114
    .line 115
    goto :goto_3

    .line 116
    :pswitch_3
    const v6, 0x7f0c0172

    .line 117
    .line 118
    .line 119
    goto :goto_3

    .line 120
    :pswitch_4
    const v6, 0x7f0c016f

    .line 121
    .line 122
    .line 123
    goto :goto_3

    .line 124
    :pswitch_5
    const v6, 0x7f0c016d

    .line 125
    .line 126
    .line 127
    goto :goto_3

    .line 128
    :pswitch_6
    const v6, 0x7f0c016a

    .line 129
    .line 130
    .line 131
    goto :goto_3

    .line 132
    :pswitch_7
    const v6, 0x7f0c0170

    .line 133
    .line 134
    .line 135
    goto :goto_3

    .line 136
    :pswitch_8
    const v6, 0x7f0c0169

    .line 137
    .line 138
    .line 139
    :goto_3
    :pswitch_9
    invoke-static {v6}, Lna/q;->g(I)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v6

    .line 143
    new-instance v7, Lub/k;

    .line 144
    .line 145
    invoke-direct {v7, v11, v6}, Lub/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    add-int/lit8 v4, v4, 0x1

    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_3
    sput-object v1, Lna/o;->b:Ljava/util/ArrayList;

    .line 155
    .line 156
    invoke-static {}, Lbg/p0;->values()[Lbg/p0;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    new-instance v1, Ljava/util/ArrayList;

    .line 161
    .line 162
    array-length v2, v0

    .line 163
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 164
    .line 165
    .line 166
    array-length v2, v0

    .line 167
    const/4 v4, 0x0

    .line 168
    :goto_4
    const/4 v11, 0x4

    .line 169
    const/4 v12, 0x3

    .line 170
    const/4 v13, 0x2

    .line 171
    if-ge v4, v2, :cond_a

    .line 172
    .line 173
    aget-object v14, v0, v4

    .line 174
    .line 175
    invoke-virtual {v14}, Ljava/lang/Enum;->ordinal()I

    .line 176
    .line 177
    .line 178
    move-result v15

    .line 179
    if-eqz v15, :cond_9

    .line 180
    .line 181
    if-eq v15, v5, :cond_8

    .line 182
    .line 183
    if-eq v15, v13, :cond_7

    .line 184
    .line 185
    if-eq v15, v12, :cond_6

    .line 186
    .line 187
    if-eq v15, v11, :cond_5

    .line 188
    .line 189
    const/4 v11, 0x5

    .line 190
    if-ne v15, v11, :cond_4

    .line 191
    .line 192
    const v11, 0x7f0c016c

    .line 193
    .line 194
    .line 195
    goto :goto_5

    .line 196
    :cond_4
    new-instance v0, Lce/j0;

    .line 197
    .line 198
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 199
    .line 200
    .line 201
    throw v0

    .line 202
    :cond_5
    const v11, 0x7f0c016a

    .line 203
    .line 204
    .line 205
    goto :goto_5

    .line 206
    :cond_6
    const v11, 0x7f0c0172

    .line 207
    .line 208
    .line 209
    goto :goto_5

    .line 210
    :cond_7
    const v11, 0x7f0c0171

    .line 211
    .line 212
    .line 213
    goto :goto_5

    .line 214
    :cond_8
    const v11, 0x7f0c0170

    .line 215
    .line 216
    .line 217
    goto :goto_5

    .line 218
    :cond_9
    const v11, 0x7f0c0174

    .line 219
    .line 220
    .line 221
    :goto_5
    invoke-static {v11}, Lna/q;->g(I)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v11

    .line 225
    new-instance v12, Lub/k;

    .line 226
    .line 227
    invoke-direct {v12, v14, v11}, Lub/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v1, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    add-int/lit8 v4, v4, 0x1

    .line 234
    .line 235
    goto :goto_4

    .line 236
    :cond_a
    sput-object v1, Lna/o;->c:Ljava/util/ArrayList;

    .line 237
    .line 238
    invoke-static {}, Lbg/d;->values()[Lbg/d;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    new-instance v1, Ljava/util/ArrayList;

    .line 243
    .line 244
    array-length v2, v0

    .line 245
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 246
    .line 247
    .line 248
    array-length v2, v0

    .line 249
    :goto_6
    if-ge v3, v2, :cond_10

    .line 250
    .line 251
    aget-object v4, v0, v3

    .line 252
    .line 253
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 254
    .line 255
    .line 256
    move-result v6

    .line 257
    if-eqz v6, :cond_f

    .line 258
    .line 259
    if-eq v6, v5, :cond_e

    .line 260
    .line 261
    if-eq v6, v13, :cond_d

    .line 262
    .line 263
    if-eq v6, v12, :cond_c

    .line 264
    .line 265
    if-ne v6, v11, :cond_b

    .line 266
    .line 267
    const v6, 0x7f0c00eb

    .line 268
    .line 269
    .line 270
    goto :goto_7

    .line 271
    :cond_b
    new-instance v0, Lce/j0;

    .line 272
    .line 273
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 274
    .line 275
    .line 276
    throw v0

    .line 277
    :cond_c
    const v6, 0x7f0c00ec

    .line 278
    .line 279
    .line 280
    goto :goto_7

    .line 281
    :cond_d
    const v6, 0x7f0c00e8

    .line 282
    .line 283
    .line 284
    goto :goto_7

    .line 285
    :cond_e
    const v6, 0x7f0c00e9

    .line 286
    .line 287
    .line 288
    goto :goto_7

    .line 289
    :cond_f
    const v6, 0x7f0c00ea

    .line 290
    .line 291
    .line 292
    :goto_7
    invoke-static {v6}, Lna/q;->g(I)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v6

    .line 296
    new-instance v7, Lub/k;

    .line 297
    .line 298
    invoke-direct {v7, v4, v6}, Lub/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    add-int/lit8 v3, v3, 0x1

    .line 305
    .line 306
    goto :goto_6

    .line 307
    :cond_10
    sput-object v1, Lna/o;->d:Ljava/util/ArrayList;

    .line 308
    .line 309
    new-instance v0, Li9/f;

    .line 310
    .line 311
    const/16 v1, 0x16

    .line 312
    .line 313
    invoke-direct {v0, v1}, Li9/f;-><init>(I)V

    .line 314
    .line 315
    .line 316
    invoke-static {v0}, Lub/a;->d(Lic/a;)Lub/p;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    sput-object v0, Lna/o;->e:Lub/p;

    .line 321
    .line 322
    return-void

    .line 323
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
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
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
.end method

.method public static final a(Lbg/p;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lbg/p;->f:Ljava/lang/String;

    .line 7
    .line 8
    const-string v0, "__SYS_PLAYLIST_LIKED"

    .line 9
    .line 10
    invoke-static {p0, v0}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const p0, 0x7f0c0184

    .line 17
    .line 18
    .line 19
    invoke-static {p0}, Lna/q;->g(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :cond_0
    const-string v0, "__SYS_PLAYLIST_MARKED"

    .line 25
    .line 26
    invoke-static {p0, v0}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    const p0, 0x7f0c0185

    .line 33
    .line 34
    .line 35
    invoke-static {p0}, Lna/q;->g(I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    :cond_1
    return-object p0
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
.end method
