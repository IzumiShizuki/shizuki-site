.class public abstract Lw9/e;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final a:Lf1/f;

.field public static final b:Lf1/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lt9/h;

    .line 2
    .line 3
    const/16 v1, 0xb

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lt9/h;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lf1/f;

    .line 9
    .line 10
    const v2, -0x1dcde007

    .line 11
    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-direct {v1, v0, v2, v3}, Lf1/f;-><init>(Ljava/lang/Object;IZ)V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lw9/e;->a:Lf1/f;

    .line 18
    .line 19
    new-instance v0, Lt9/h;

    .line 20
    .line 21
    const/16 v1, 0xc

    .line 22
    .line 23
    invoke-direct {v0, v1}, Lt9/h;-><init>(I)V

    .line 24
    .line 25
    .line 26
    new-instance v1, Lf1/f;

    .line 27
    .line 28
    const v2, -0x525e6c9e

    .line 29
    .line 30
    .line 31
    invoke-direct {v1, v0, v2, v3}, Lf1/f;-><init>(Ljava/lang/Object;IZ)V

    .line 32
    .line 33
    .line 34
    sput-object v1, Lw9/e;->b:Lf1/f;

    .line 35
    .line 36
    return-void
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
.end method

.method public static final a(Lx0/w0;JLic/k;Lx0/o;I)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-wide/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v4, p3

    .line 6
    .line 7
    move-object/from16 v11, p4

    .line 8
    .line 9
    const-string v0, "show"

    .line 10
    .line 11
    invoke-static {v1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v0, "onConfirm"

    .line 15
    .line 16
    invoke-static {v4, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const v0, 0x4e741178

    .line 20
    .line 21
    .line 22
    invoke-virtual {v11, v0}, Lx0/o;->Y(I)Lx0/o;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v11, v2, v3}, Lx0/o;->e(J)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    const/16 v0, 0x20

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/16 v0, 0x10

    .line 35
    .line 36
    :goto_0
    or-int v0, p5, v0

    .line 37
    .line 38
    and-int/lit16 v5, v0, 0x93

    .line 39
    .line 40
    const/16 v6, 0x92

    .line 41
    .line 42
    const/4 v7, 0x1

    .line 43
    if-eq v5, v6, :cond_1

    .line 44
    .line 45
    const/4 v5, 0x1

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    const/4 v5, 0x0

    .line 48
    :goto_1
    and-int/2addr v0, v7

    .line 49
    invoke-virtual {v11, v0, v5}, Lx0/o;->N(IZ)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_4

    .line 54
    .line 55
    invoke-interface {v1}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, Ljava/lang/Boolean;

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_2

    .line 66
    .line 67
    invoke-virtual {v11}, Lx0/o;->r()Lx0/p1;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    if-eqz v7, :cond_5

    .line 72
    .line 73
    new-instance v0, Lw9/b;

    .line 74
    .line 75
    const/4 v6, 0x0

    .line 76
    move/from16 v5, p5

    .line 77
    .line 78
    invoke-direct/range {v0 .. v6}, Lw9/b;-><init>(Lx0/w0;JLic/k;II)V

    .line 79
    .line 80
    .line 81
    :goto_2
    iput-object v0, v7, Lx0/p1;->d:Lic/n;

    .line 82
    .line 83
    return-void

    .line 84
    :cond_2
    move-object v14, v1

    .line 85
    move-wide v0, v2

    .line 86
    move-object v15, v4

    .line 87
    invoke-virtual {v11}, Lx0/o;->K()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    sget-object v3, Lx0/k;->a:Lx0/r0;

    .line 92
    .line 93
    if-ne v2, v3, :cond_3

    .line 94
    .line 95
    new-instance v2, Lma/c;

    .line 96
    .line 97
    const/16 v3, 0x1d

    .line 98
    .line 99
    invoke-direct {v2, v14, v3}, Lma/c;-><init>(Lx0/w0;I)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v11, v2}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    :cond_3
    check-cast v2, Lic/a;

    .line 106
    .line 107
    new-instance v3, Lw9/b;

    .line 108
    .line 109
    invoke-direct {v3, v0, v1, v14, v15}, Lw9/b;-><init>(JLx0/w0;Lic/k;)V

    .line 110
    .line 111
    .line 112
    const v4, -0x570127d0

    .line 113
    .line 114
    .line 115
    invoke-static {v4, v3, v11}, Lf1/g;->f(ILub/e;Lx0/o;)Lf1/f;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    const/16 v12, 0x30

    .line 120
    .line 121
    const/16 v13, 0x1fc

    .line 122
    .line 123
    move-object v0, v2

    .line 124
    const/4 v2, 0x0

    .line 125
    move-object v1, v3

    .line 126
    const/4 v3, 0x0

    .line 127
    const/4 v4, 0x0

    .line 128
    const/4 v5, 0x0

    .line 129
    const-wide/16 v6, 0x0

    .line 130
    .line 131
    const-wide/16 v8, 0x0

    .line 132
    .line 133
    const/4 v10, 0x0

    .line 134
    invoke-static/range {v0 .. v13}, La2/c;->c(Lic/a;Lf1/f;Lj1/q;Lic/n;Lic/n;Lq1/l0;JJLj3/q;Lx0/o;II)V

    .line 135
    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_4
    move-object v14, v1

    .line 139
    move-object v15, v4

    .line 140
    invoke-virtual/range {p4 .. p4}, Lx0/o;->Q()V

    .line 141
    .line 142
    .line 143
    :goto_3
    invoke-virtual/range {p4 .. p4}, Lx0/o;->r()Lx0/p1;

    .line 144
    .line 145
    .line 146
    move-result-object v7

    .line 147
    if-eqz v7, :cond_5

    .line 148
    .line 149
    new-instance v0, Lw9/b;

    .line 150
    .line 151
    const/4 v6, 0x2

    .line 152
    move-wide/from16 v2, p1

    .line 153
    .line 154
    move/from16 v5, p5

    .line 155
    .line 156
    move-object v1, v14

    .line 157
    move-object v4, v15

    .line 158
    invoke-direct/range {v0 .. v6}, Lw9/b;-><init>(Lx0/w0;JLic/k;II)V

    .line 159
    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_5
    return-void
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
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
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
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
.end method

.method public static final b(Ljava/lang/String;Ljava/lang/String;Lj1/q;JJZLx0/o;I)V
    .locals 28

    .line 1
    move-object/from16 v11, p8

    .line 2
    .line 3
    const v0, 0x796d1eb1

    .line 4
    .line 5
    .line 6
    invoke-virtual {v11, v0}, Lx0/o;->Y(I)Lx0/o;

    .line 7
    .line 8
    .line 9
    move-object/from16 v6, p1

    .line 10
    .line 11
    invoke-virtual {v11, v6}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/16 v7, 0x20

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/16 v0, 0x20

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/16 v0, 0x10

    .line 23
    .line 24
    :goto_0
    or-int v0, p9, v0

    .line 25
    .line 26
    const v1, 0x1b2180

    .line 27
    .line 28
    .line 29
    or-int/2addr v0, v1

    .line 30
    const v1, 0x92493

    .line 31
    .line 32
    .line 33
    and-int/2addr v1, v0

    .line 34
    const v2, 0x92492

    .line 35
    .line 36
    .line 37
    const/4 v8, 0x0

    .line 38
    if-eq v1, v2, :cond_1

    .line 39
    .line 40
    const/4 v1, 0x1

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const/4 v1, 0x0

    .line 43
    :goto_1
    and-int/lit8 v2, v0, 0x1

    .line 44
    .line 45
    invoke-virtual {v11, v2, v1}, Lx0/o;->N(IZ)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_d

    .line 50
    .line 51
    invoke-virtual {v11}, Lx0/o;->S()V

    .line 52
    .line 53
    .line 54
    and-int/lit8 v1, p9, 0x1

    .line 55
    .line 56
    const v2, -0xe001

    .line 57
    .line 58
    .line 59
    if-eqz v1, :cond_3

    .line 60
    .line 61
    invoke-virtual {v11}, Lx0/o;->x()Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_2

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_2
    invoke-virtual {v11}, Lx0/o;->Q()V

    .line 69
    .line 70
    .line 71
    and-int/2addr v0, v2

    .line 72
    move-object/from16 v10, p2

    .line 73
    .line 74
    move-wide/from16 v6, p5

    .line 75
    .line 76
    move/from16 v12, p7

    .line 77
    .line 78
    :goto_2
    move v13, v0

    .line 79
    const/16 v14, 0x20

    .line 80
    .line 81
    goto :goto_4

    .line 82
    :cond_3
    :goto_3
    sget-object v1, Lm0/c1;->a:Lx0/o2;

    .line 83
    .line 84
    invoke-virtual {v11, v1}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    check-cast v1, Lm0/b1;

    .line 89
    .line 90
    invoke-virtual {v1}, Lm0/b1;->c()J

    .line 91
    .line 92
    .line 93
    move-result-wide v3

    .line 94
    and-int/2addr v0, v2

    .line 95
    sget-object v1, Lj1/n;->a:Lj1/n;

    .line 96
    .line 97
    move-object v10, v1

    .line 98
    move-wide v6, v3

    .line 99
    const/4 v12, 0x1

    .line 100
    goto :goto_2

    .line 101
    :goto_4
    invoke-virtual {v11}, Lx0/o;->q()V

    .line 102
    .line 103
    .line 104
    invoke-static {}, Ly8/c;->e()Lx0/m1;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-virtual {v11, v0}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    check-cast v0, Lhg/a;

    .line 113
    .line 114
    invoke-virtual {v11}, Lx0/o;->K()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    sget-object v15, Lx0/k;->a:Lx0/r0;

    .line 119
    .line 120
    if-ne v1, v15, :cond_4

    .line 121
    .line 122
    invoke-static/range {p3 .. p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 127
    .line 128
    invoke-static {v2}, Ljc/z;->a(Ljava/lang/Class;)Lpc/v;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    move-object/from16 v3, p0

    .line 133
    .line 134
    invoke-static {v3, v1, v0, v8, v2}, Llc/b;->G(Ljava/lang/String;Ljava/lang/Object;Lhg/a;ZLpc/v;)Lfg/f;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    invoke-virtual {v11, v1}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    goto :goto_5

    .line 142
    :cond_4
    move-object/from16 v3, p0

    .line 143
    .line 144
    :goto_5
    move-object v0, v1

    .line 145
    check-cast v0, Lfg/f;

    .line 146
    .line 147
    invoke-virtual {v11}, Lx0/o;->K()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    if-ne v1, v15, :cond_5

    .line 152
    .line 153
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 154
    .line 155
    invoke-static {v1}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    invoke-virtual {v11, v1}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    :cond_5
    check-cast v1, Lx0/w0;

    .line 163
    .line 164
    invoke-virtual {v0}, Lfg/f;->getValue()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    check-cast v2, Ljava/lang/Number;

    .line 169
    .line 170
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 171
    .line 172
    .line 173
    move-result-wide v4

    .line 174
    invoke-static {v4, v5}, Lq1/h0;->e(J)J

    .line 175
    .line 176
    .line 177
    move-result-wide v4

    .line 178
    invoke-virtual {v11}, Lx0/o;->K()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    if-ne v2, v15, :cond_6

    .line 183
    .line 184
    new-instance v2, Lbd/a;

    .line 185
    .line 186
    const/16 v16, 0x1

    .line 187
    .line 188
    const/16 v9, 0x1d

    .line 189
    .line 190
    invoke-direct {v2, v9, v0}, Lbd/a;-><init>(ILjava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v11, v2}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    goto :goto_6

    .line 197
    :cond_6
    const/16 v16, 0x1

    .line 198
    .line 199
    :goto_6
    check-cast v2, Lic/k;

    .line 200
    .line 201
    move-object v3, v2

    .line 202
    move-wide/from16 v26, v4

    .line 203
    .line 204
    move-object v4, v0

    .line 205
    move-object v0, v1

    .line 206
    move-wide/from16 v1, v26

    .line 207
    .line 208
    const/16 v5, 0x186

    .line 209
    .line 210
    move-object v9, v4

    .line 211
    move-object v4, v11

    .line 212
    invoke-static/range {v0 .. v5}, Lw9/e;->a(Lx0/w0;JLic/k;Lx0/o;I)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v9}, Lfg/f;->getValue()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    check-cast v1, Ljava/lang/Number;

    .line 220
    .line 221
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 222
    .line 223
    .line 224
    move-result-wide v1

    .line 225
    invoke-static {v1, v2}, Lq1/h0;->e(J)J

    .line 226
    .line 227
    .line 228
    move-result-wide v1

    .line 229
    invoke-static {v1, v2}, Lq1/h0;->B(J)I

    .line 230
    .line 231
    .line 232
    move-result v1

    .line 233
    sget-object v2, Lef/f;->e:Lef/f;

    .line 234
    .line 235
    sget-object v3, Lef/c;->a:[I

    .line 236
    .line 237
    const-string v3, "format"

    .line 238
    .line 239
    invoke-static {v2, v3}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    iget-boolean v3, v2, Lef/f;->a:Z

    .line 243
    .line 244
    if-eqz v3, :cond_7

    .line 245
    .line 246
    const-string v3, "0123456789ABCDEF"

    .line 247
    .line 248
    goto :goto_7

    .line 249
    :cond_7
    const-string v3, "0123456789abcdef"

    .line 250
    .line 251
    :goto_7
    iget-object v2, v2, Lef/f;->c:Lef/e;

    .line 252
    .line 253
    iget-boolean v2, v2, Lef/e;->b:Z

    .line 254
    .line 255
    const/16 p2, 0x3

    .line 256
    .line 257
    const/16 v17, 0x4

    .line 258
    .line 259
    if-eqz v2, :cond_8

    .line 260
    .line 261
    shr-int/lit8 v2, v1, 0x1c

    .line 262
    .line 263
    and-int/lit8 v2, v2, 0xf

    .line 264
    .line 265
    invoke-virtual {v3, v2}, Ljava/lang/String;->charAt(I)C

    .line 266
    .line 267
    .line 268
    move-result v2

    .line 269
    shr-int/lit8 v14, v1, 0x18

    .line 270
    .line 271
    and-int/lit8 v14, v14, 0xf

    .line 272
    .line 273
    invoke-virtual {v3, v14}, Ljava/lang/String;->charAt(I)C

    .line 274
    .line 275
    .line 276
    move-result v14

    .line 277
    shr-int/lit8 v18, v1, 0x14

    .line 278
    .line 279
    const/16 p5, 0x2

    .line 280
    .line 281
    and-int/lit8 v5, v18, 0xf

    .line 282
    .line 283
    invoke-virtual {v3, v5}, Ljava/lang/String;->charAt(I)C

    .line 284
    .line 285
    .line 286
    move-result v5

    .line 287
    shr-int/lit8 v18, v1, 0x10

    .line 288
    .line 289
    const/16 v19, 0x0

    .line 290
    .line 291
    and-int/lit8 v8, v18, 0xf

    .line 292
    .line 293
    invoke-virtual {v3, v8}, Ljava/lang/String;->charAt(I)C

    .line 294
    .line 295
    .line 296
    move-result v8

    .line 297
    shr-int/lit8 v18, v1, 0xc

    .line 298
    .line 299
    and-int/lit8 v4, v18, 0xf

    .line 300
    .line 301
    invoke-virtual {v3, v4}, Ljava/lang/String;->charAt(I)C

    .line 302
    .line 303
    .line 304
    move-result v4

    .line 305
    shr-int/lit8 v18, v1, 0x8

    .line 306
    .line 307
    move/from16 p7, v2

    .line 308
    .line 309
    and-int/lit8 v2, v18, 0xf

    .line 310
    .line 311
    invoke-virtual {v3, v2}, Ljava/lang/String;->charAt(I)C

    .line 312
    .line 313
    .line 314
    move-result v2

    .line 315
    shr-int/lit8 v18, v1, 0x4

    .line 316
    .line 317
    move/from16 v20, v2

    .line 318
    .line 319
    and-int/lit8 v2, v18, 0xf

    .line 320
    .line 321
    invoke-virtual {v3, v2}, Ljava/lang/String;->charAt(I)C

    .line 322
    .line 323
    .line 324
    move-result v2

    .line 325
    and-int/lit8 v1, v1, 0xf

    .line 326
    .line 327
    invoke-virtual {v3, v1}, Ljava/lang/String;->charAt(I)C

    .line 328
    .line 329
    .line 330
    move-result v1

    .line 331
    const/16 v3, 0x8

    .line 332
    .line 333
    new-array v3, v3, [C

    .line 334
    .line 335
    aput-char p7, v3, v19

    .line 336
    .line 337
    aput-char v14, v3, v16

    .line 338
    .line 339
    aput-char v5, v3, p5

    .line 340
    .line 341
    aput-char v8, v3, p2

    .line 342
    .line 343
    aput-char v4, v3, v17

    .line 344
    .line 345
    const/4 v4, 0x5

    .line 346
    aput-char v20, v3, v4

    .line 347
    .line 348
    const/4 v4, 0x6

    .line 349
    aput-char v2, v3, v4

    .line 350
    .line 351
    const/4 v2, 0x7

    .line 352
    aput-char v1, v3, v2

    .line 353
    .line 354
    new-instance v1, Ljava/lang/String;

    .line 355
    .line 356
    invoke-direct {v1, v3}, Ljava/lang/String;-><init>([C)V

    .line 357
    .line 358
    .line 359
    move-wide/from16 v22, v6

    .line 360
    .line 361
    move-object/from16 p7, v15

    .line 362
    .line 363
    goto :goto_9

    .line 364
    :cond_8
    const/16 p5, 0x2

    .line 365
    .line 366
    const/16 v19, 0x0

    .line 367
    .line 368
    int-to-long v1, v1

    .line 369
    move-object/from16 p7, v15

    .line 370
    .line 371
    const/4 v4, 0x0

    .line 372
    int-to-long v14, v4

    .line 373
    add-long v20, v14, v14

    .line 374
    .line 375
    move-wide/from16 v22, v6

    .line 376
    .line 377
    const/16 v4, 0x8

    .line 378
    .line 379
    int-to-long v5, v4

    .line 380
    add-long v20, v20, v5

    .line 381
    .line 382
    add-long v4, v20, v14

    .line 383
    .line 384
    const-wide/16 v14, 0x0

    .line 385
    .line 386
    cmp-long v6, v14, v4

    .line 387
    .line 388
    if-gtz v6, :cond_c

    .line 389
    .line 390
    const-wide/32 v14, 0x7fffffff

    .line 391
    .line 392
    .line 393
    cmp-long v6, v4, v14

    .line 394
    .line 395
    if-gtz v6, :cond_c

    .line 396
    .line 397
    long-to-int v5, v4

    .line 398
    new-array v4, v5, [C

    .line 399
    .line 400
    const/4 v6, 0x0

    .line 401
    const/4 v7, 0x0

    .line 402
    const/16 v8, 0x20

    .line 403
    .line 404
    const/16 v14, 0x8

    .line 405
    .line 406
    :goto_8
    if-ge v6, v14, :cond_9

    .line 407
    .line 408
    add-int/lit8 v8, v8, -0x4

    .line 409
    .line 410
    shr-long v15, v1, v8

    .line 411
    .line 412
    const-wide/16 v20, 0xf

    .line 413
    .line 414
    move-wide/from16 v24, v1

    .line 415
    .line 416
    and-long v1, v15, v20

    .line 417
    .line 418
    long-to-int v2, v1

    .line 419
    add-int/lit8 v1, v7, 0x1

    .line 420
    .line 421
    invoke-virtual {v3, v2}, Ljava/lang/String;->charAt(I)C

    .line 422
    .line 423
    .line 424
    move-result v2

    .line 425
    aput-char v2, v4, v7

    .line 426
    .line 427
    add-int/lit8 v6, v6, 0x1

    .line 428
    .line 429
    move v7, v1

    .line 430
    move-wide/from16 v1, v24

    .line 431
    .line 432
    goto :goto_8

    .line 433
    :cond_9
    if-ne v7, v5, :cond_a

    .line 434
    .line 435
    new-instance v1, Ljava/lang/String;

    .line 436
    .line 437
    invoke-direct {v1, v4}, Ljava/lang/String;-><init>([C)V

    .line 438
    .line 439
    .line 440
    goto :goto_9

    .line 441
    :cond_a
    const/4 v1, 0x0

    .line 442
    invoke-static {v1, v7, v5}, Lua/j;->f(III)V

    .line 443
    .line 444
    .line 445
    new-instance v2, Ljava/lang/String;

    .line 446
    .line 447
    invoke-direct {v2, v4, v1, v7}, Ljava/lang/String;-><init>([CII)V

    .line 448
    .line 449
    .line 450
    move-object v1, v2

    .line 451
    :goto_9
    const-string v2, "#"

    .line 452
    .line 453
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v2

    .line 457
    invoke-virtual {v11}, Lx0/o;->K()Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object v1

    .line 461
    move-object/from16 v3, p7

    .line 462
    .line 463
    if-ne v1, v3, :cond_b

    .line 464
    .line 465
    new-instance v1, Lma/c;

    .line 466
    .line 467
    const/16 v3, 0x1c

    .line 468
    .line 469
    invoke-direct {v1, v0, v3}, Lma/c;-><init>(Lx0/w0;I)V

    .line 470
    .line 471
    .line 472
    invoke-virtual {v11, v1}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 473
    .line 474
    .line 475
    :cond_b
    move-object v5, v1

    .line 476
    check-cast v5, Lic/a;

    .line 477
    .line 478
    new-instance v0, Ls9/c;

    .line 479
    .line 480
    const/4 v1, 0x2

    .line 481
    invoke-direct {v0, v9, v1}, Ls9/c;-><init>(Lfg/f;I)V

    .line 482
    .line 483
    .line 484
    const v1, -0xb4e01d5

    .line 485
    .line 486
    .line 487
    invoke-static {v1, v0, v11}, Lf1/g;->f(ILub/e;Lx0/o;)Lf1/f;

    .line 488
    .line 489
    .line 490
    move-result-object v0

    .line 491
    shr-int/lit8 v1, v13, 0x3

    .line 492
    .line 493
    and-int/lit8 v1, v1, 0xe

    .line 494
    .line 495
    const v3, 0x36c36030

    .line 496
    .line 497
    .line 498
    or-int/2addr v1, v3

    .line 499
    const/16 v13, 0x8

    .line 500
    .line 501
    const/4 v3, 0x0

    .line 502
    const/4 v4, 0x1

    .line 503
    const/4 v9, 0x0

    .line 504
    move v8, v12

    .line 505
    move-wide/from16 v6, v22

    .line 506
    .line 507
    move v12, v1

    .line 508
    move-object v1, v10

    .line 509
    move-object v10, v0

    .line 510
    move-object/from16 v0, p1

    .line 511
    .line 512
    invoke-static/range {v0 .. v13}, Lz8/a;->a(Ljava/lang/String;Lj1/q;Ljava/lang/String;ZZLic/a;JZLic/n;Lic/n;Lx0/o;II)V

    .line 513
    .line 514
    .line 515
    move-object v4, v1

    .line 516
    move v9, v8

    .line 517
    move-wide v7, v6

    .line 518
    goto :goto_a

    .line 519
    :cond_c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 520
    .line 521
    new-instance v1, Ljava/lang/StringBuilder;

    .line 522
    .line 523
    const-string v2, "The resulting string length is too big: "

    .line 524
    .line 525
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 526
    .line 527
    .line 528
    const/16 v2, 0xa

    .line 529
    .line 530
    invoke-static {v2, v4, v5}, Lub/a;->h(IJ)Ljava/lang/String;

    .line 531
    .line 532
    .line 533
    move-result-object v2

    .line 534
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 535
    .line 536
    .line 537
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 538
    .line 539
    .line 540
    move-result-object v1

    .line 541
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 542
    .line 543
    .line 544
    throw v0

    .line 545
    :cond_d
    invoke-virtual/range {p8 .. p8}, Lx0/o;->Q()V

    .line 546
    .line 547
    .line 548
    move-object/from16 v4, p2

    .line 549
    .line 550
    move-wide/from16 v7, p5

    .line 551
    .line 552
    move/from16 v9, p7

    .line 553
    .line 554
    :goto_a
    invoke-virtual/range {p8 .. p8}, Lx0/o;->r()Lx0/p1;

    .line 555
    .line 556
    .line 557
    move-result-object v0

    .line 558
    if-eqz v0, :cond_e

    .line 559
    .line 560
    new-instance v1, Lw9/a;

    .line 561
    .line 562
    move-object/from16 v2, p0

    .line 563
    .line 564
    move-object/from16 v3, p1

    .line 565
    .line 566
    move-wide/from16 v5, p3

    .line 567
    .line 568
    move/from16 v10, p9

    .line 569
    .line 570
    invoke-direct/range {v1 .. v10}, Lw9/a;-><init>(Ljava/lang/String;Ljava/lang/String;Lj1/q;JJZI)V

    .line 571
    .line 572
    .line 573
    iput-object v1, v0, Lx0/p1;->d:Lic/n;

    .line 574
    .line 575
    :cond_e
    return-void
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
.end method
