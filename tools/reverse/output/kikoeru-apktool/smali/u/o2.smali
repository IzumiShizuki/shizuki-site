.class public final Lu/o2;
.super Lac/h;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public c:F

.field public d:F

.field public e:F

.field public f:J

.field public g:I

.field public h:I

.field public i:I

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:Lba/e0;


# direct methods
.method public constructor <init>(Lba/e0;Lyb/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu/o2;->k:Lba/e0;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lac/h;-><init>(ILyb/c;)V

    .line 5
    .line 6
    .line 7
    return-void
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
.end method


# virtual methods
.method public final o(Ljava/lang/Object;Lyb/c;)Lyb/c;
    .locals 2

    .line 1
    new-instance v0, Lu/o2;

    .line 2
    .line 3
    iget-object v1, p0, Lu/o2;->k:Lba/e0;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lu/o2;-><init>(Lba/e0;Lyb/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lu/o2;->j:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
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
.end method

.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lc2/i0;

    .line 2
    .line 3
    check-cast p2, Lyb/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lu/o2;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lu/o2;

    .line 10
    .line 11
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lu/o2;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
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
.end method

.method public final u(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lu/o2;->i:I

    .line 4
    .line 5
    const/high16 v2, 0x3f800000    # 1.0f

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const-wide/16 v4, 0x0

    .line 9
    .line 10
    const/4 v6, 0x0

    .line 11
    const/4 v7, 0x0

    .line 12
    const/4 v8, 0x1

    .line 13
    sget-object v9, Lzb/a;->a:Lzb/a;

    .line 14
    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    if-eq v1, v8, :cond_1

    .line 18
    .line 19
    if-ne v1, v3, :cond_0

    .line 20
    .line 21
    iget v1, v0, Lu/o2;->h:I

    .line 22
    .line 23
    iget v10, v0, Lu/o2;->e:F

    .line 24
    .line 25
    iget v11, v0, Lu/o2;->g:I

    .line 26
    .line 27
    iget-wide v12, v0, Lu/o2;->f:J

    .line 28
    .line 29
    iget v14, v0, Lu/o2;->d:F

    .line 30
    .line 31
    iget v15, v0, Lu/o2;->c:F

    .line 32
    .line 33
    iget-object v3, v0, Lu/o2;->j:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v3, Lc2/i0;

    .line 36
    .line 37
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    move-object/from16 v2, p1

    .line 41
    .line 42
    const/high16 v17, 0x3f800000    # 1.0f

    .line 43
    .line 44
    goto/16 :goto_3

    .line 45
    .line 46
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw v1

    .line 54
    :cond_1
    iget v1, v0, Lu/o2;->h:I

    .line 55
    .line 56
    iget v3, v0, Lu/o2;->e:F

    .line 57
    .line 58
    iget v10, v0, Lu/o2;->g:I

    .line 59
    .line 60
    iget-wide v11, v0, Lu/o2;->f:J

    .line 61
    .line 62
    iget v13, v0, Lu/o2;->d:F

    .line 63
    .line 64
    iget v14, v0, Lu/o2;->c:F

    .line 65
    .line 66
    iget-object v15, v0, Lu/o2;->j:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v15, Lc2/i0;

    .line 69
    .line 70
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_2
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    iget-object v1, v0, Lu/o2;->j:Ljava/lang/Object;

    .line 78
    .line 79
    move-object v15, v1

    .line 80
    check-cast v15, Lc2/i0;

    .line 81
    .line 82
    invoke-virtual {v15}, Lc2/i0;->d()Lj2/z2;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-interface {v1}, Lj2/z2;->f()F

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    iput-object v15, v0, Lu/o2;->j:Ljava/lang/Object;

    .line 91
    .line 92
    iput v6, v0, Lu/o2;->c:F

    .line 93
    .line 94
    iput v2, v0, Lu/o2;->d:F

    .line 95
    .line 96
    iput-wide v4, v0, Lu/o2;->f:J

    .line 97
    .line 98
    iput v7, v0, Lu/o2;->g:I

    .line 99
    .line 100
    iput v3, v0, Lu/o2;->e:F

    .line 101
    .line 102
    iput v7, v0, Lu/o2;->h:I

    .line 103
    .line 104
    iput v8, v0, Lu/o2;->i:I

    .line 105
    .line 106
    const/4 v1, 0x2

    .line 107
    invoke-static {v15, v0, v1}, Lu/n2;->c(Lc2/i0;Lyb/c;I)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v10

    .line 111
    if-ne v10, v9, :cond_3

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_3
    move-wide v11, v4

    .line 115
    const/4 v1, 0x0

    .line 116
    const/4 v10, 0x0

    .line 117
    const/high16 v13, 0x3f800000    # 1.0f

    .line 118
    .line 119
    const/4 v14, 0x0

    .line 120
    :goto_0
    move/from16 v32, v10

    .line 121
    .line 122
    move v10, v3

    .line 123
    move-object v3, v15

    .line 124
    move v15, v14

    .line 125
    move v14, v13

    .line 126
    move-wide v12, v11

    .line 127
    move/from16 v11, v32

    .line 128
    .line 129
    :goto_1
    iput-object v3, v0, Lu/o2;->j:Ljava/lang/Object;

    .line 130
    .line 131
    iput v15, v0, Lu/o2;->c:F

    .line 132
    .line 133
    iput v14, v0, Lu/o2;->d:F

    .line 134
    .line 135
    iput-wide v12, v0, Lu/o2;->f:J

    .line 136
    .line 137
    iput v11, v0, Lu/o2;->g:I

    .line 138
    .line 139
    iput v10, v0, Lu/o2;->e:F

    .line 140
    .line 141
    iput v1, v0, Lu/o2;->h:I

    .line 142
    .line 143
    const/4 v2, 0x2

    .line 144
    const/high16 v17, 0x3f800000    # 1.0f

    .line 145
    .line 146
    iput v2, v0, Lu/o2;->i:I

    .line 147
    .line 148
    invoke-static {v3, v0}, La0/c;->y(Lc2/i0;Lac/a;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    if-ne v2, v9, :cond_4

    .line 153
    .line 154
    :goto_2
    return-object v9

    .line 155
    :cond_4
    :goto_3
    check-cast v2, Lc2/l;

    .line 156
    .line 157
    const/16 v18, 0x0

    .line 158
    .line 159
    iget-object v6, v2, Lc2/l;->a:Ljava/lang/Object;

    .line 160
    .line 161
    move-object/from16 v19, v6

    .line 162
    .line 163
    check-cast v19, Ljava/util/Collection;

    .line 164
    .line 165
    invoke-interface/range {v19 .. v19}, Ljava/util/Collection;->size()I

    .line 166
    .line 167
    .line 168
    move-result v4

    .line 169
    const/4 v5, 0x0

    .line 170
    :goto_4
    if-ge v5, v4, :cond_6

    .line 171
    .line 172
    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v19

    .line 176
    check-cast v19, Lc2/t;

    .line 177
    .line 178
    invoke-virtual/range {v19 .. v19}, Lc2/t;->b()Z

    .line 179
    .line 180
    .line 181
    move-result v19

    .line 182
    if-eqz v19, :cond_5

    .line 183
    .line 184
    const/4 v4, 0x1

    .line 185
    goto :goto_5

    .line 186
    :cond_5
    add-int/lit8 v5, v5, 0x1

    .line 187
    .line 188
    goto :goto_4

    .line 189
    :cond_6
    const/4 v4, 0x0

    .line 190
    :goto_5
    if-nez v4, :cond_1b

    .line 191
    .line 192
    invoke-static {v2, v8}, Lu/w1;->g(Lc2/l;Z)F

    .line 193
    .line 194
    .line 195
    move-result v5

    .line 196
    invoke-static {v2, v7}, Lu/w1;->g(Lc2/l;Z)F

    .line 197
    .line 198
    .line 199
    move-result v19

    .line 200
    cmpg-float v20, v5, v18

    .line 201
    .line 202
    if-nez v20, :cond_7

    .line 203
    .line 204
    goto :goto_6

    .line 205
    :cond_7
    cmpg-float v20, v19, v18

    .line 206
    .line 207
    if-nez v20, :cond_8

    .line 208
    .line 209
    :goto_6
    const/high16 v5, 0x3f800000    # 1.0f

    .line 210
    .line 211
    goto :goto_7

    .line 212
    :cond_8
    div-float v5, v5, v19

    .line 213
    .line 214
    :goto_7
    move-object/from16 v19, v6

    .line 215
    .line 216
    check-cast v19, Ljava/util/Collection;

    .line 217
    .line 218
    invoke-interface/range {v19 .. v19}, Ljava/util/Collection;->size()I

    .line 219
    .line 220
    .line 221
    move-result v7

    .line 222
    move/from16 p1, v1

    .line 223
    .line 224
    const/4 v1, 0x0

    .line 225
    const/4 v8, 0x0

    .line 226
    :goto_8
    if-ge v8, v7, :cond_a

    .line 227
    .line 228
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v21

    .line 232
    move-object/from16 v22, v3

    .line 233
    .line 234
    move-object/from16 v3, v21

    .line 235
    .line 236
    check-cast v3, Lc2/t;

    .line 237
    .line 238
    move/from16 v21, v4

    .line 239
    .line 240
    iget-boolean v4, v3, Lc2/t;->h:Z

    .line 241
    .line 242
    if-eqz v4, :cond_9

    .line 243
    .line 244
    iget-boolean v3, v3, Lc2/t;->d:Z

    .line 245
    .line 246
    if-eqz v3, :cond_9

    .line 247
    .line 248
    const/4 v3, 0x1

    .line 249
    goto :goto_9

    .line 250
    :cond_9
    const/4 v3, 0x0

    .line 251
    :goto_9
    add-int/2addr v1, v3

    .line 252
    add-int/lit8 v8, v8, 0x1

    .line 253
    .line 254
    move/from16 v4, v21

    .line 255
    .line 256
    move-object/from16 v3, v22

    .line 257
    .line 258
    goto :goto_8

    .line 259
    :cond_a
    move-object/from16 v22, v3

    .line 260
    .line 261
    move/from16 v21, v4

    .line 262
    .line 263
    const/4 v4, 0x2

    .line 264
    if-ge v1, v4, :cond_b

    .line 265
    .line 266
    move-object/from16 v23, v9

    .line 267
    .line 268
    move/from16 v28, v10

    .line 269
    .line 270
    move/from16 v29, v14

    .line 271
    .line 272
    move/from16 v30, v15

    .line 273
    .line 274
    const/4 v1, 0x1

    .line 275
    const/high16 v16, 0x43340000    # 180.0f

    .line 276
    .line 277
    :goto_a
    const/16 v25, 0x0

    .line 278
    .line 279
    goto/16 :goto_e

    .line 280
    .line 281
    :cond_b
    const/4 v1, 0x1

    .line 282
    invoke-static {v2, v1}, Lu/w1;->f(Lc2/l;Z)J

    .line 283
    .line 284
    .line 285
    move-result-wide v7

    .line 286
    const/4 v1, 0x0

    .line 287
    const/high16 v16, 0x43340000    # 180.0f

    .line 288
    .line 289
    invoke-static {v2, v1}, Lu/w1;->f(Lc2/l;Z)J

    .line 290
    .line 291
    .line 292
    move-result-wide v3

    .line 293
    invoke-interface/range {v19 .. v19}, Ljava/util/Collection;->size()I

    .line 294
    .line 295
    .line 296
    move-result v1

    .line 297
    move-object/from16 v23, v9

    .line 298
    .line 299
    const/4 v9, 0x0

    .line 300
    const/16 v24, 0x0

    .line 301
    .line 302
    const/16 v25, 0x0

    .line 303
    .line 304
    :goto_b
    if-ge v9, v1, :cond_f

    .line 305
    .line 306
    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v26

    .line 310
    move/from16 v27, v1

    .line 311
    .line 312
    move-object/from16 v1, v26

    .line 313
    .line 314
    check-cast v1, Lc2/t;

    .line 315
    .line 316
    move/from16 v26, v9

    .line 317
    .line 318
    iget-boolean v9, v1, Lc2/t;->d:Z

    .line 319
    .line 320
    if-eqz v9, :cond_e

    .line 321
    .line 322
    iget-boolean v9, v1, Lc2/t;->h:Z

    .line 323
    .line 324
    if-eqz v9, :cond_e

    .line 325
    .line 326
    move/from16 v28, v10

    .line 327
    .line 328
    iget-wide v9, v1, Lc2/t;->c:J

    .line 329
    .line 330
    move/from16 v29, v14

    .line 331
    .line 332
    move/from16 v30, v15

    .line 333
    .line 334
    iget-wide v14, v1, Lc2/t;->g:J

    .line 335
    .line 336
    invoke-static {v14, v15, v3, v4}, Lp1/b;->h(JJ)J

    .line 337
    .line 338
    .line 339
    move-result-wide v14

    .line 340
    invoke-static {v9, v10, v7, v8}, Lp1/b;->h(JJ)J

    .line 341
    .line 342
    .line 343
    move-result-wide v9

    .line 344
    invoke-static {v14, v15}, Lu/w1;->b(J)F

    .line 345
    .line 346
    .line 347
    move-result v1

    .line 348
    invoke-static {v9, v10}, Lu/w1;->b(J)F

    .line 349
    .line 350
    .line 351
    move-result v31

    .line 352
    sub-float v31, v31, v1

    .line 353
    .line 354
    invoke-static {v9, v10, v14, v15}, Lp1/b;->i(JJ)J

    .line 355
    .line 356
    .line 357
    move-result-wide v9

    .line 358
    invoke-static {v9, v10}, Lp1/b;->d(J)F

    .line 359
    .line 360
    .line 361
    move-result v1

    .line 362
    const/high16 v9, 0x40000000    # 2.0f

    .line 363
    .line 364
    div-float/2addr v1, v9

    .line 365
    const/high16 v9, 0x43b40000    # 360.0f

    .line 366
    .line 367
    cmpl-float v10, v31, v16

    .line 368
    .line 369
    if-lez v10, :cond_c

    .line 370
    .line 371
    sub-float v31, v31, v9

    .line 372
    .line 373
    goto :goto_c

    .line 374
    :cond_c
    const/high16 v10, -0x3ccc0000    # -180.0f

    .line 375
    .line 376
    cmpg-float v10, v31, v10

    .line 377
    .line 378
    if-gez v10, :cond_d

    .line 379
    .line 380
    add-float v31, v31, v9

    .line 381
    .line 382
    :cond_d
    :goto_c
    mul-float v31, v31, v1

    .line 383
    .line 384
    add-float v25, v31, v25

    .line 385
    .line 386
    add-float v24, v24, v1

    .line 387
    .line 388
    goto :goto_d

    .line 389
    :cond_e
    move/from16 v28, v10

    .line 390
    .line 391
    move/from16 v29, v14

    .line 392
    .line 393
    move/from16 v30, v15

    .line 394
    .line 395
    :goto_d
    add-int/lit8 v9, v26, 0x1

    .line 396
    .line 397
    move/from16 v1, v27

    .line 398
    .line 399
    move/from16 v10, v28

    .line 400
    .line 401
    move/from16 v14, v29

    .line 402
    .line 403
    move/from16 v15, v30

    .line 404
    .line 405
    goto :goto_b

    .line 406
    :cond_f
    move/from16 v28, v10

    .line 407
    .line 408
    move/from16 v29, v14

    .line 409
    .line 410
    move/from16 v30, v15

    .line 411
    .line 412
    cmpg-float v1, v24, v18

    .line 413
    .line 414
    if-nez v1, :cond_10

    .line 415
    .line 416
    const/4 v1, 0x1

    .line 417
    goto/16 :goto_a

    .line 418
    .line 419
    :cond_10
    div-float v25, v25, v24

    .line 420
    .line 421
    const/4 v1, 0x1

    .line 422
    :goto_e
    invoke-static {v2, v1}, Lu/w1;->f(Lc2/l;Z)J

    .line 423
    .line 424
    .line 425
    move-result-wide v3

    .line 426
    const-wide v7, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    invoke-static {v3, v4, v7, v8}, Lp1/b;->c(JJ)Z

    .line 432
    .line 433
    .line 434
    move-result v1

    .line 435
    if-eqz v1, :cond_11

    .line 436
    .line 437
    const/4 v1, 0x0

    .line 438
    const-wide/16 v3, 0x0

    .line 439
    .line 440
    goto :goto_f

    .line 441
    :cond_11
    const/4 v1, 0x0

    .line 442
    invoke-static {v2, v1}, Lu/w1;->f(Lc2/l;Z)J

    .line 443
    .line 444
    .line 445
    move-result-wide v7

    .line 446
    invoke-static {v3, v4, v7, v8}, Lp1/b;->h(JJ)J

    .line 447
    .line 448
    .line 449
    move-result-wide v3

    .line 450
    :goto_f
    if-nez v11, :cond_15

    .line 451
    .line 452
    mul-float v14, v29, v5

    .line 453
    .line 454
    add-float v15, v30, v25

    .line 455
    .line 456
    invoke-static {v12, v13, v3, v4}, Lp1/b;->i(JJ)J

    .line 457
    .line 458
    .line 459
    move-result-wide v12

    .line 460
    invoke-static {v2, v1}, Lu/w1;->g(Lc2/l;Z)F

    .line 461
    .line 462
    .line 463
    move-result v7

    .line 464
    const/4 v1, 0x1

    .line 465
    int-to-float v8, v1

    .line 466
    sub-float/2addr v8, v14

    .line 467
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    .line 468
    .line 469
    .line 470
    move-result v8

    .line 471
    mul-float v8, v8, v7

    .line 472
    .line 473
    const v9, 0x40490fdb    # (float)Math.PI

    .line 474
    .line 475
    .line 476
    mul-float v9, v9, v15

    .line 477
    .line 478
    mul-float v9, v9, v7

    .line 479
    .line 480
    div-float v9, v9, v16

    .line 481
    .line 482
    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    .line 483
    .line 484
    .line 485
    move-result v7

    .line 486
    invoke-static {v12, v13}, Lp1/b;->d(J)F

    .line 487
    .line 488
    .line 489
    move-result v9

    .line 490
    cmpl-float v8, v8, v28

    .line 491
    .line 492
    if-gtz v8, :cond_13

    .line 493
    .line 494
    cmpl-float v8, v7, v28

    .line 495
    .line 496
    if-gtz v8, :cond_13

    .line 497
    .line 498
    cmpl-float v8, v9, v28

    .line 499
    .line 500
    if-lez v8, :cond_12

    .line 501
    .line 502
    goto :goto_10

    .line 503
    :cond_12
    move/from16 v7, p1

    .line 504
    .line 505
    goto :goto_12

    .line 506
    :cond_13
    :goto_10
    cmpg-float v7, v7, v28

    .line 507
    .line 508
    if-gez v7, :cond_14

    .line 509
    .line 510
    const/4 v7, 0x1

    .line 511
    goto :goto_11

    .line 512
    :cond_14
    const/4 v7, 0x0

    .line 513
    :goto_11
    const/4 v11, 0x1

    .line 514
    goto :goto_12

    .line 515
    :cond_15
    const/4 v1, 0x1

    .line 516
    move/from16 v7, p1

    .line 517
    .line 518
    move/from16 v14, v29

    .line 519
    .line 520
    move/from16 v15, v30

    .line 521
    .line 522
    :goto_12
    if-eqz v11, :cond_1a

    .line 523
    .line 524
    const/4 v8, 0x0

    .line 525
    invoke-static {v2, v8}, Lu/w1;->f(Lc2/l;Z)J

    .line 526
    .line 527
    .line 528
    move-result-wide v9

    .line 529
    if-eqz v7, :cond_16

    .line 530
    .line 531
    const/4 v2, 0x0

    .line 532
    goto :goto_13

    .line 533
    :cond_16
    move/from16 v2, v25

    .line 534
    .line 535
    :goto_13
    cmpg-float v8, v2, v18

    .line 536
    .line 537
    if-nez v8, :cond_17

    .line 538
    .line 539
    cmpg-float v8, v5, v17

    .line 540
    .line 541
    if-nez v8, :cond_17

    .line 542
    .line 543
    move/from16 p1, v2

    .line 544
    .line 545
    const-wide/16 v1, 0x0

    .line 546
    .line 547
    invoke-static {v3, v4, v1, v2}, Lp1/b;->c(JJ)Z

    .line 548
    .line 549
    .line 550
    move-result v8

    .line 551
    if-nez v8, :cond_18

    .line 552
    .line 553
    goto :goto_14

    .line 554
    :cond_17
    move/from16 p1, v2

    .line 555
    .line 556
    :goto_14
    new-instance v1, Lp1/b;

    .line 557
    .line 558
    invoke-direct {v1, v9, v10}, Lp1/b;-><init>(J)V

    .line 559
    .line 560
    .line 561
    new-instance v2, Lp1/b;

    .line 562
    .line 563
    invoke-direct {v2, v3, v4}, Lp1/b;-><init>(J)V

    .line 564
    .line 565
    .line 566
    new-instance v3, Ljava/lang/Float;

    .line 567
    .line 568
    invoke-direct {v3, v5}, Ljava/lang/Float;-><init>(F)V

    .line 569
    .line 570
    .line 571
    new-instance v4, Ljava/lang/Float;

    .line 572
    .line 573
    move/from16 v5, p1

    .line 574
    .line 575
    invoke-direct {v4, v5}, Ljava/lang/Float;-><init>(F)V

    .line 576
    .line 577
    .line 578
    iget-object v5, v0, Lu/o2;->k:Lba/e0;

    .line 579
    .line 580
    invoke-virtual {v5, v1, v2, v3, v4}, Lba/e0;->l(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 581
    .line 582
    .line 583
    :cond_18
    invoke-interface/range {v19 .. v19}, Ljava/util/Collection;->size()I

    .line 584
    .line 585
    .line 586
    move-result v1

    .line 587
    const/4 v2, 0x0

    .line 588
    :goto_15
    if-ge v2, v1, :cond_1a

    .line 589
    .line 590
    invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 591
    .line 592
    .line 593
    move-result-object v3

    .line 594
    check-cast v3, Lc2/t;

    .line 595
    .line 596
    const/4 v8, 0x0

    .line 597
    invoke-static {v3, v8}, Lc2/s;->f(Lc2/t;Z)J

    .line 598
    .line 599
    .line 600
    move-result-wide v4

    .line 601
    const-wide/16 v9, 0x0

    .line 602
    .line 603
    invoke-static {v4, v5, v9, v10}, Lp1/b;->c(JJ)Z

    .line 604
    .line 605
    .line 606
    move-result v4

    .line 607
    if-nez v4, :cond_19

    .line 608
    .line 609
    invoke-virtual {v3}, Lc2/t;->a()V

    .line 610
    .line 611
    .line 612
    :cond_19
    add-int/lit8 v2, v2, 0x1

    .line 613
    .line 614
    goto :goto_15

    .line 615
    :cond_1a
    const/4 v8, 0x0

    .line 616
    const-wide/16 v9, 0x0

    .line 617
    .line 618
    move v1, v7

    .line 619
    goto :goto_16

    .line 620
    :cond_1b
    move/from16 p1, v1

    .line 621
    .line 622
    move-object/from16 v22, v3

    .line 623
    .line 624
    move/from16 v21, v4

    .line 625
    .line 626
    move-object/from16 v23, v9

    .line 627
    .line 628
    move/from16 v28, v10

    .line 629
    .line 630
    move/from16 v29, v14

    .line 631
    .line 632
    move/from16 v30, v15

    .line 633
    .line 634
    const/4 v8, 0x0

    .line 635
    const-wide/16 v9, 0x0

    .line 636
    .line 637
    :goto_16
    if-nez v21, :cond_1d

    .line 638
    .line 639
    move-object v2, v6

    .line 640
    check-cast v2, Ljava/util/Collection;

    .line 641
    .line 642
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 643
    .line 644
    .line 645
    move-result v2

    .line 646
    const/4 v3, 0x0

    .line 647
    :goto_17
    if-ge v3, v2, :cond_1d

    .line 648
    .line 649
    invoke-interface {v6, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 650
    .line 651
    .line 652
    move-result-object v4

    .line 653
    check-cast v4, Lc2/t;

    .line 654
    .line 655
    iget-boolean v4, v4, Lc2/t;->d:Z

    .line 656
    .line 657
    if-eqz v4, :cond_1c

    .line 658
    .line 659
    move-wide v4, v9

    .line 660
    move-object/from16 v3, v22

    .line 661
    .line 662
    move-object/from16 v9, v23

    .line 663
    .line 664
    move/from16 v10, v28

    .line 665
    .line 666
    const/high16 v2, 0x3f800000    # 1.0f

    .line 667
    .line 668
    const/4 v6, 0x0

    .line 669
    const/4 v7, 0x0

    .line 670
    const/4 v8, 0x1

    .line 671
    goto/16 :goto_1

    .line 672
    .line 673
    :cond_1c
    add-int/lit8 v3, v3, 0x1

    .line 674
    .line 675
    goto :goto_17

    .line 676
    :cond_1d
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 677
    .line 678
    return-object v1
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
.end method
