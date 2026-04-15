.class public abstract Lj3/j;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final a:Lx0/z;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lj3/d;->d:Lj3/d;

    .line 2
    .line 3
    new-instance v1, Lx0/z;

    .line 4
    .line 5
    invoke-direct {v1, v0}, Lx0/z;-><init>(Lic/a;)V

    .line 6
    .line 7
    .line 8
    sput-object v1, Lj3/j;->a:Lx0/z;

    .line 9
    .line 10
    return-void
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

.method public static final a(Lj3/x;Lic/a;Lj3/y;Lf1/f;Lx0/o;II)V
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v8, p4

    .line 4
    .line 5
    move/from16 v9, p5

    .line 6
    .line 7
    const v0, -0x699ff8ef

    .line 8
    .line 9
    .line 10
    invoke-virtual {v8, v0}, Lx0/o;->Y(I)Lx0/o;

    .line 11
    .line 12
    .line 13
    and-int/lit8 v0, v9, 0x6

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {v8, v1}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    const/4 v0, 0x4

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v0, 0x2

    .line 26
    :goto_0
    or-int/2addr v0, v9

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move v0, v9

    .line 29
    :goto_1
    and-int/lit8 v2, p6, 0x2

    .line 30
    .line 31
    if-eqz v2, :cond_3

    .line 32
    .line 33
    or-int/lit8 v0, v0, 0x30

    .line 34
    .line 35
    :cond_2
    move-object/from16 v3, p1

    .line 36
    .line 37
    goto :goto_3

    .line 38
    :cond_3
    and-int/lit8 v3, v9, 0x30

    .line 39
    .line 40
    if-nez v3, :cond_2

    .line 41
    .line 42
    move-object/from16 v3, p1

    .line 43
    .line 44
    invoke-virtual {v8, v3}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-eqz v4, :cond_4

    .line 49
    .line 50
    const/16 v4, 0x20

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_4
    const/16 v4, 0x10

    .line 54
    .line 55
    :goto_2
    or-int/2addr v0, v4

    .line 56
    :goto_3
    and-int/lit16 v4, v9, 0x180

    .line 57
    .line 58
    if-nez v4, :cond_6

    .line 59
    .line 60
    move-object/from16 v4, p2

    .line 61
    .line 62
    invoke-virtual {v8, v4}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-eqz v5, :cond_5

    .line 67
    .line 68
    const/16 v5, 0x100

    .line 69
    .line 70
    goto :goto_4

    .line 71
    :cond_5
    const/16 v5, 0x80

    .line 72
    .line 73
    :goto_4
    or-int/2addr v0, v5

    .line 74
    goto :goto_5

    .line 75
    :cond_6
    move-object/from16 v4, p2

    .line 76
    .line 77
    :goto_5
    and-int/lit16 v5, v9, 0xc00

    .line 78
    .line 79
    move-object/from16 v13, p3

    .line 80
    .line 81
    if-nez v5, :cond_8

    .line 82
    .line 83
    invoke-virtual {v8, v13}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    if-eqz v5, :cond_7

    .line 88
    .line 89
    const/16 v5, 0x800

    .line 90
    .line 91
    goto :goto_6

    .line 92
    :cond_7
    const/16 v5, 0x400

    .line 93
    .line 94
    :goto_6
    or-int/2addr v0, v5

    .line 95
    :cond_8
    move v14, v0

    .line 96
    and-int/lit16 v0, v14, 0x493

    .line 97
    .line 98
    const/16 v5, 0x492

    .line 99
    .line 100
    const/4 v15, 0x0

    .line 101
    if-eq v0, v5, :cond_9

    .line 102
    .line 103
    const/4 v0, 0x1

    .line 104
    goto :goto_7

    .line 105
    :cond_9
    const/4 v0, 0x0

    .line 106
    :goto_7
    and-int/lit8 v5, v14, 0x1

    .line 107
    .line 108
    invoke-virtual {v8, v5, v0}, Lx0/o;->N(IZ)Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-eqz v0, :cond_21

    .line 113
    .line 114
    if-eqz v2, :cond_a

    .line 115
    .line 116
    const/4 v1, 0x0

    .line 117
    goto :goto_8

    .line 118
    :cond_a
    move-object v1, v3

    .line 119
    :goto_8
    sget-object v2, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->f:Lx0/o2;

    .line 120
    .line 121
    invoke-virtual {v8, v2}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    check-cast v2, Landroid/view/View;

    .line 126
    .line 127
    sget-object v3, Lj2/l1;->h:Lx0/o2;

    .line 128
    .line 129
    invoke-virtual {v8, v3}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    move-object v5, v3

    .line 134
    check-cast v5, Lf3/c;

    .line 135
    .line 136
    sget-object v3, Lj3/j;->a:Lx0/z;

    .line 137
    .line 138
    invoke-virtual {v8, v3}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    move-object/from16 v17, v3

    .line 143
    .line 144
    check-cast v17, Ljava/lang/String;

    .line 145
    .line 146
    sget-object v3, Lj2/l1;->n:Lx0/o2;

    .line 147
    .line 148
    invoke-virtual {v8, v3}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    move-object/from16 v18, v3

    .line 153
    .line 154
    check-cast v18, Lf3/m;

    .line 155
    .line 156
    invoke-static {v8}, Lx0/v;->x(Lx0/o;)Lx0/n;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    invoke-static/range {p3 .. p4}, Lx0/v;->y(Ljava/lang/Object;Lx0/o;)Lx0/w0;

    .line 161
    .line 162
    .line 163
    move-result-object v7

    .line 164
    new-array v0, v15, [Ljava/lang/Object;

    .line 165
    .line 166
    invoke-virtual {v8}, Lx0/o;->K()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v6

    .line 170
    sget-object v10, Lx0/k;->a:Lx0/r0;

    .line 171
    .line 172
    if-ne v6, v10, :cond_b

    .line 173
    .line 174
    sget-object v6, Lj3/d;->e:Lj3/d;

    .line 175
    .line 176
    invoke-virtual {v8, v6}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    :cond_b
    check-cast v6, Lic/a;

    .line 180
    .line 181
    invoke-static {v0, v6, v8}, Lg1/l;->e([Ljava/lang/Object;Lic/a;Lx0/o;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    check-cast v0, Ljava/util/UUID;

    .line 186
    .line 187
    invoke-virtual {v8}, Lx0/o;->K()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v6

    .line 191
    if-ne v6, v10, :cond_c

    .line 192
    .line 193
    move-object/from16 v20, v7

    .line 194
    .line 195
    move-object v7, v0

    .line 196
    new-instance v0, Lj3/u;

    .line 197
    .line 198
    move-object v6, v4

    .line 199
    move-object v4, v2

    .line 200
    move-object v2, v6

    .line 201
    const/4 v12, 0x1

    .line 202
    move-object/from16 v6, p0

    .line 203
    .line 204
    move-object v15, v3

    .line 205
    move-object/from16 v3, v17

    .line 206
    .line 207
    move-object/from16 v11, v20

    .line 208
    .line 209
    invoke-direct/range {v0 .. v7}, Lj3/u;-><init>(Lic/a;Lj3/y;Ljava/lang/String;Landroid/view/View;Lf3/c;Lj3/x;Ljava/util/UUID;)V

    .line 210
    .line 211
    .line 212
    move-object v2, v3

    .line 213
    move-object v3, v1

    .line 214
    move-object v1, v6

    .line 215
    new-instance v4, Lb0/i0;

    .line 216
    .line 217
    const/16 v5, 0xc

    .line 218
    .line 219
    invoke-direct {v4, v5, v0, v11}, Lb0/i0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    new-instance v5, Lf1/f;

    .line 223
    .line 224
    const v6, -0x11bbdae4

    .line 225
    .line 226
    .line 227
    invoke-direct {v5, v4, v6, v12}, Lf1/f;-><init>(Ljava/lang/Object;IZ)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v0, v15, v5}, Lj3/u;->j(Lx0/r;Lic/n;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v8, v0}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    move-object v6, v0

    .line 237
    goto :goto_9

    .line 238
    :cond_c
    const/4 v12, 0x1

    .line 239
    move-object v3, v1

    .line 240
    move-object/from16 v2, v17

    .line 241
    .line 242
    move-object/from16 v1, p0

    .line 243
    .line 244
    :goto_9
    check-cast v6, Lj3/u;

    .line 245
    .line 246
    invoke-virtual {v8, v6}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    move-result v0

    .line 250
    and-int/lit8 v4, v14, 0x70

    .line 251
    .line 252
    const/16 v5, 0x20

    .line 253
    .line 254
    if-ne v4, v5, :cond_d

    .line 255
    .line 256
    const/4 v5, 0x1

    .line 257
    goto :goto_a

    .line 258
    :cond_d
    const/4 v5, 0x0

    .line 259
    :goto_a
    or-int/2addr v0, v5

    .line 260
    and-int/lit16 v5, v14, 0x380

    .line 261
    .line 262
    const/16 v7, 0x100

    .line 263
    .line 264
    if-ne v5, v7, :cond_e

    .line 265
    .line 266
    const/4 v7, 0x1

    .line 267
    goto :goto_b

    .line 268
    :cond_e
    const/4 v7, 0x0

    .line 269
    :goto_b
    or-int/2addr v0, v7

    .line 270
    invoke-virtual {v8, v2}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    move-result v7

    .line 274
    or-int/2addr v0, v7

    .line 275
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Enum;->ordinal()I

    .line 276
    .line 277
    .line 278
    move-result v7

    .line 279
    invoke-virtual {v8, v7}, Lx0/o;->d(I)Z

    .line 280
    .line 281
    .line 282
    move-result v7

    .line 283
    or-int/2addr v0, v7

    .line 284
    invoke-virtual {v8}, Lx0/o;->K()Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v7

    .line 288
    if-nez v0, :cond_10

    .line 289
    .line 290
    if-ne v7, v10, :cond_f

    .line 291
    .line 292
    goto :goto_c

    .line 293
    :cond_f
    move-object v15, v3

    .line 294
    const/4 v0, 0x0

    .line 295
    move-object v3, v2

    .line 296
    move v2, v14

    .line 297
    move-object v14, v6

    .line 298
    goto :goto_d

    .line 299
    :cond_10
    :goto_c
    new-instance v13, Lh0/d1;

    .line 300
    .line 301
    const/16 v19, 0x2

    .line 302
    .line 303
    move-object/from16 v16, p2

    .line 304
    .line 305
    move-object/from16 v17, v2

    .line 306
    .line 307
    move-object v15, v3

    .line 308
    move v2, v14

    .line 309
    const/4 v0, 0x0

    .line 310
    move-object v14, v6

    .line 311
    invoke-direct/range {v13 .. v19}, Lh0/d1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 312
    .line 313
    .line 314
    move-object/from16 v3, v17

    .line 315
    .line 316
    invoke-virtual {v8, v13}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 317
    .line 318
    .line 319
    move-object v7, v13

    .line 320
    :goto_d
    check-cast v7, Lic/k;

    .line 321
    .line 322
    invoke-static {v14, v7, v8}, Lx0/v;->c(Ljava/lang/Object;Lic/k;Lx0/o;)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v8, v14}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    move-result v6

    .line 329
    const/16 v7, 0x20

    .line 330
    .line 331
    if-ne v4, v7, :cond_11

    .line 332
    .line 333
    const/4 v4, 0x1

    .line 334
    goto :goto_e

    .line 335
    :cond_11
    const/4 v4, 0x0

    .line 336
    :goto_e
    or-int/2addr v4, v6

    .line 337
    const/16 v7, 0x100

    .line 338
    .line 339
    if-ne v5, v7, :cond_12

    .line 340
    .line 341
    const/4 v5, 0x1

    .line 342
    goto :goto_f

    .line 343
    :cond_12
    const/4 v5, 0x0

    .line 344
    :goto_f
    or-int/2addr v4, v5

    .line 345
    invoke-virtual {v8, v3}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 346
    .line 347
    .line 348
    move-result v5

    .line 349
    or-int/2addr v4, v5

    .line 350
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Enum;->ordinal()I

    .line 351
    .line 352
    .line 353
    move-result v5

    .line 354
    invoke-virtual {v8, v5}, Lx0/o;->d(I)Z

    .line 355
    .line 356
    .line 357
    move-result v5

    .line 358
    or-int/2addr v4, v5

    .line 359
    invoke-virtual {v8}, Lx0/o;->K()Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v5

    .line 363
    if-nez v4, :cond_14

    .line 364
    .line 365
    if-ne v5, v10, :cond_13

    .line 366
    .line 367
    goto :goto_10

    .line 368
    :cond_13
    move-object/from16 v3, v18

    .line 369
    .line 370
    goto :goto_11

    .line 371
    :cond_14
    :goto_10
    new-instance v13, Lj3/f;

    .line 372
    .line 373
    move-object/from16 v16, p2

    .line 374
    .line 375
    move-object/from16 v17, v3

    .line 376
    .line 377
    invoke-direct/range {v13 .. v18}, Lj3/f;-><init>(Lj3/u;Lic/a;Lj3/y;Ljava/lang/String;Lf3/m;)V

    .line 378
    .line 379
    .line 380
    move-object/from16 v3, v18

    .line 381
    .line 382
    invoke-virtual {v8, v13}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 383
    .line 384
    .line 385
    move-object v5, v13

    .line 386
    :goto_11
    check-cast v5, Lic/a;

    .line 387
    .line 388
    invoke-static {v5, v8}, Lx0/v;->h(Lic/a;Lx0/o;)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v8, v14}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 392
    .line 393
    .line 394
    move-result v4

    .line 395
    and-int/lit8 v2, v2, 0xe

    .line 396
    .line 397
    const/4 v5, 0x4

    .line 398
    if-ne v2, v5, :cond_15

    .line 399
    .line 400
    const/4 v0, 0x1

    .line 401
    :cond_15
    or-int/2addr v0, v4

    .line 402
    invoke-virtual {v8}, Lx0/o;->K()Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    move-result-object v2

    .line 406
    if-nez v0, :cond_16

    .line 407
    .line 408
    if-ne v2, v10, :cond_17

    .line 409
    .line 410
    :cond_16
    new-instance v2, Lb0/o1;

    .line 411
    .line 412
    const/16 v0, 0x15

    .line 413
    .line 414
    invoke-direct {v2, v0, v14, v1}, Lb0/o1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 415
    .line 416
    .line 417
    invoke-virtual {v8, v2}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 418
    .line 419
    .line 420
    :cond_17
    check-cast v2, Lic/k;

    .line 421
    .line 422
    invoke-static {v1, v2, v8}, Lx0/v;->c(Ljava/lang/Object;Lic/k;Lx0/o;)V

    .line 423
    .line 424
    .line 425
    invoke-virtual {v8, v14}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 426
    .line 427
    .line 428
    move-result v0

    .line 429
    invoke-virtual {v8}, Lx0/o;->K()Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v2

    .line 433
    if-nez v0, :cond_18

    .line 434
    .line 435
    if-ne v2, v10, :cond_19

    .line 436
    .line 437
    :cond_18
    new-instance v2, Lba/u0;

    .line 438
    .line 439
    const/16 v0, 0x18

    .line 440
    .line 441
    const/4 v4, 0x0

    .line 442
    invoke-direct {v2, v0, v14, v4}, Lba/u0;-><init>(ILjava/lang/Object;Lyb/c;)V

    .line 443
    .line 444
    .line 445
    invoke-virtual {v8, v2}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 446
    .line 447
    .line 448
    :cond_19
    check-cast v2, Lic/n;

    .line 449
    .line 450
    invoke-static {v2, v14, v8}, Lx0/v;->e(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 451
    .line 452
    .line 453
    invoke-virtual {v8, v14}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 454
    .line 455
    .line 456
    move-result v0

    .line 457
    invoke-virtual {v8}, Lx0/o;->K()Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object v2

    .line 461
    if-nez v0, :cond_1a

    .line 462
    .line 463
    if-ne v2, v10, :cond_1b

    .line 464
    .line 465
    :cond_1a
    new-instance v2, Lj3/h;

    .line 466
    .line 467
    const/4 v0, 0x0

    .line 468
    invoke-direct {v2, v14, v0}, Lj3/h;-><init>(Lj3/u;I)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v8, v2}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 472
    .line 473
    .line 474
    :cond_1b
    check-cast v2, Lic/k;

    .line 475
    .line 476
    sget-object v0, Lj1/n;->a:Lj1/n;

    .line 477
    .line 478
    invoke-static {v0, v2}, Landroidx/compose/ui/layout/a;->d(Lj1/q;Lic/k;)Lj1/q;

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    invoke-virtual {v8, v14}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 483
    .line 484
    .line 485
    move-result v2

    .line 486
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 487
    .line 488
    .line 489
    move-result v4

    .line 490
    invoke-virtual {v8, v4}, Lx0/o;->d(I)Z

    .line 491
    .line 492
    .line 493
    move-result v4

    .line 494
    or-int/2addr v2, v4

    .line 495
    invoke-virtual {v8}, Lx0/o;->K()Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    move-result-object v4

    .line 499
    if-nez v2, :cond_1c

    .line 500
    .line 501
    if-ne v4, v10, :cond_1d

    .line 502
    .line 503
    :cond_1c
    new-instance v4, Li3/e;

    .line 504
    .line 505
    const/4 v2, 0x1

    .line 506
    invoke-direct {v4, v14, v3, v2}, Li3/e;-><init>(Landroid/view/ViewGroup;Ljava/lang/Object;I)V

    .line 507
    .line 508
    .line 509
    invoke-virtual {v8, v4}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 510
    .line 511
    .line 512
    :cond_1d
    check-cast v4, Lg2/v0;

    .line 513
    .line 514
    iget-wide v2, v8, Lx0/o;->T:J

    .line 515
    .line 516
    const/16 v20, 0x20

    .line 517
    .line 518
    ushr-long v5, v2, v20

    .line 519
    .line 520
    xor-long/2addr v2, v5

    .line 521
    long-to-int v3, v2

    .line 522
    invoke-virtual {v8}, Lx0/o;->l()Lx0/j1;

    .line 523
    .line 524
    .line 525
    move-result-object v2

    .line 526
    invoke-static {v0, v8}, Lj1/a;->c(Lj1/q;Lx0/o;)Lj1/q;

    .line 527
    .line 528
    .line 529
    move-result-object v0

    .line 530
    sget-object v5, Li2/k;->g0:Li2/j;

    .line 531
    .line 532
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 533
    .line 534
    .line 535
    sget-object v5, Li2/j;->b:Li2/i;

    .line 536
    .line 537
    invoke-virtual {v8}, Lx0/o;->a0()V

    .line 538
    .line 539
    .line 540
    iget-boolean v6, v8, Lx0/o;->S:Z

    .line 541
    .line 542
    if-eqz v6, :cond_1e

    .line 543
    .line 544
    invoke-virtual {v8, v5}, Lx0/o;->k(Lic/a;)V

    .line 545
    .line 546
    .line 547
    goto :goto_12

    .line 548
    :cond_1e
    invoke-virtual {v8}, Lx0/o;->k0()V

    .line 549
    .line 550
    .line 551
    :goto_12
    sget-object v5, Li2/j;->g:Li2/h;

    .line 552
    .line 553
    invoke-static {v5, v4, v8}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 554
    .line 555
    .line 556
    sget-object v4, Li2/j;->f:Li2/h;

    .line 557
    .line 558
    invoke-static {v4, v2, v8}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 559
    .line 560
    .line 561
    sget-object v2, Li2/j;->j:Li2/h;

    .line 562
    .line 563
    iget-boolean v4, v8, Lx0/o;->S:Z

    .line 564
    .line 565
    if-nez v4, :cond_1f

    .line 566
    .line 567
    invoke-virtual {v8}, Lx0/o;->K()Ljava/lang/Object;

    .line 568
    .line 569
    .line 570
    move-result-object v4

    .line 571
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 572
    .line 573
    .line 574
    move-result-object v5

    .line 575
    invoke-static {v4, v5}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 576
    .line 577
    .line 578
    move-result v4

    .line 579
    if-nez v4, :cond_20

    .line 580
    .line 581
    :cond_1f
    invoke-static {v3, v8, v3, v2}, Lj2/h0;->s(ILx0/o;ILi2/h;)V

    .line 582
    .line 583
    .line 584
    :cond_20
    sget-object v2, Li2/j;->d:Li2/h;

    .line 585
    .line 586
    invoke-static {v2, v0, v8}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 587
    .line 588
    .line 589
    invoke-virtual {v8, v12}, Lx0/o;->p(Z)V

    .line 590
    .line 591
    .line 592
    move-object v2, v15

    .line 593
    goto :goto_13

    .line 594
    :cond_21
    invoke-virtual {v8}, Lx0/o;->Q()V

    .line 595
    .line 596
    .line 597
    move-object v2, v3

    .line 598
    :goto_13
    invoke-virtual {v8}, Lx0/o;->r()Lx0/p1;

    .line 599
    .line 600
    .line 601
    move-result-object v7

    .line 602
    if-eqz v7, :cond_22

    .line 603
    .line 604
    new-instance v0, Lj3/i;

    .line 605
    .line 606
    move-object/from16 v3, p2

    .line 607
    .line 608
    move-object/from16 v4, p3

    .line 609
    .line 610
    move/from16 v6, p6

    .line 611
    .line 612
    move v5, v9

    .line 613
    invoke-direct/range {v0 .. v6}, Lj3/i;-><init>(Lj3/x;Lic/a;Lj3/y;Lf1/f;II)V

    .line 614
    .line 615
    .line 616
    iput-object v0, v7, Lx0/p1;->d:Lic/n;

    .line 617
    .line 618
    :cond_22
    return-void
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
.end method

.method public static final b(Landroid/view/View;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    instance-of v0, p0, Landroid/view/WindowManager$LayoutParams;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    check-cast p0, Landroid/view/WindowManager$LayoutParams;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    :goto_0
    const/4 v0, 0x0

    .line 18
    if-eqz p0, :cond_1

    .line 19
    .line 20
    iget p0, p0, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 21
    .line 22
    and-int/lit16 p0, p0, 0x2000

    .line 23
    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    const/4 p0, 0x1

    .line 27
    return p0

    .line 28
    :cond_1
    return v0
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method
