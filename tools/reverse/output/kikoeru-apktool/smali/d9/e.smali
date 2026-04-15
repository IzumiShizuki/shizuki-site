.class public final synthetic Ld9/e;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/k;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ln7/w;


# direct methods
.method public synthetic constructor <init>(Ln7/w;I)V
    .locals 0

    .line 1
    iput p2, p0, Ld9/e;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ld9/e;->b:Ln7/w;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
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
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 34

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Ld9/e;->a:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v0, p1

    .line 9
    .line 10
    check-cast v0, Lz7/c;

    .line 11
    .line 12
    iget-object v2, v1, Ld9/e;->b:Ln7/w;

    .line 13
    .line 14
    iget-object v2, v2, Ln7/w;->b:Lh1/m;

    .line 15
    .line 16
    invoke-virtual {v2, v0}, Lh1/m;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    invoke-interface {v0}, Lz7/c;->Z()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    invoke-interface {v0}, Lz7/c;->V()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v0, 0x0

    .line 31
    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    return-object v0

    .line 36
    :pswitch_0
    move-object/from16 v0, p1

    .line 37
    .line 38
    check-cast v0, Lz7/a;

    .line 39
    .line 40
    const-string v2, "_connection"

    .line 41
    .line 42
    invoke-static {v0, v2}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iget-object v2, v1, Ld9/e;->b:Ln7/w;

    .line 46
    .line 47
    iget-object v3, v2, Ln7/w;->a:Ljava/lang/String;

    .line 48
    .line 49
    invoke-interface {v0, v3}, Lz7/a;->d0(Ljava/lang/String;)Lz7/c;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    iget-object v0, v2, Ln7/w;->b:Lh1/m;

    .line 54
    .line 55
    invoke-virtual {v0, v3}, Lh1/m;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 61
    .line 62
    .line 63
    :goto_1
    invoke-interface {v3}, Lz7/c;->Z()Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-eqz v2, :cond_1

    .line 68
    .line 69
    const/4 v2, 0x0

    .line 70
    invoke-interface {v3, v2}, Lz7/c;->M(I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :catchall_0
    move-exception v0

    .line 79
    goto :goto_2

    .line 80
    :cond_1
    invoke-interface {v3}, Ljava/lang/AutoCloseable;->close()V

    .line 81
    .line 82
    .line 83
    return-object v0

    .line 84
    :goto_2
    invoke-interface {v3}, Ljava/lang/AutoCloseable;->close()V

    .line 85
    .line 86
    .line 87
    throw v0

    .line 88
    :pswitch_1
    move-object/from16 v0, p1

    .line 89
    .line 90
    check-cast v0, Lz7/a;

    .line 91
    .line 92
    const-string v2, "_connection"

    .line 93
    .line 94
    invoke-static {v0, v2}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    iget-object v2, v1, Ld9/e;->b:Ln7/w;

    .line 98
    .line 99
    iget-object v3, v2, Ln7/w;->a:Ljava/lang/String;

    .line 100
    .line 101
    invoke-interface {v0, v3}, Lz7/a;->d0(Ljava/lang/String;)Lz7/c;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    iget-object v0, v2, Ln7/w;->b:Lh1/m;

    .line 106
    .line 107
    invoke-virtual {v0, v3}, Lh1/m;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    :try_start_1
    const-string v0, "id"

    .line 111
    .line 112
    invoke-static {v3, v0}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    const-string v2, "timestamp"

    .line 117
    .line 118
    invoke-static {v3, v2}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    const-string v4, "rj"

    .line 123
    .line 124
    invoke-static {v3, v4}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    const-string v5, "sourceId"

    .line 129
    .line 130
    invoke-static {v3, v5}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    const-string v6, "releaseTime"

    .line 135
    .line 136
    invoke-static {v3, v6}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 137
    .line 138
    .line 139
    move-result v6

    .line 140
    const-string v7, "tags"

    .line 141
    .line 142
    invoke-static {v3, v7}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 143
    .line 144
    .line 145
    move-result v7

    .line 146
    const-string v8, "vas"

    .line 147
    .line 148
    invoke-static {v3, v8}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 149
    .line 150
    .line 151
    move-result v8

    .line 152
    const-string v9, "circle"

    .line 153
    .line 154
    invoke-static {v3, v9}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 155
    .line 156
    .line 157
    move-result v9

    .line 158
    const-string v10, "nsfw"

    .line 159
    .line 160
    invoke-static {v3, v10}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 161
    .line 162
    .line 163
    move-result v10

    .line 164
    const-string v11, "has_subtitle"

    .line 165
    .line 166
    invoke-static {v3, v11}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 167
    .line 168
    .line 169
    move-result v11

    .line 170
    const-string v12, "icon"

    .line 171
    .line 172
    invoke-static {v3, v12}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 173
    .line 174
    .line 175
    move-result v12

    .line 176
    const-string v13, "name"

    .line 177
    .line 178
    invoke-static {v3, v13}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 179
    .line 180
    .line 181
    move-result v13

    .line 182
    const-string v14, "workJson"

    .line 183
    .line 184
    invoke-static {v3, v14}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 185
    .line 186
    .line 187
    move-result v14

    .line 188
    new-instance v15, Ljava/util/ArrayList;

    .line 189
    .line 190
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 191
    .line 192
    .line 193
    :goto_3
    invoke-interface {v3}, Lz7/c;->Z()Z

    .line 194
    .line 195
    .line 196
    move-result v16

    .line 197
    if-eqz v16, :cond_4

    .line 198
    .line 199
    move/from16 p1, v14

    .line 200
    .line 201
    move-object/from16 v16, v15

    .line 202
    .line 203
    invoke-interface {v3, v0}, Lz7/c;->getLong(I)J

    .line 204
    .line 205
    .line 206
    move-result-wide v14

    .line 207
    long-to-int v15, v14

    .line 208
    invoke-interface {v3, v2}, Lz7/c;->getLong(I)J

    .line 209
    .line 210
    .line 211
    move-result-wide v19

    .line 212
    invoke-interface {v3, v4}, Lz7/c;->getLong(I)J

    .line 213
    .line 214
    .line 215
    move-result-wide v21

    .line 216
    invoke-interface {v3, v5}, Lz7/c;->M(I)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v23

    .line 220
    invoke-interface {v3, v6}, Lz7/c;->M(I)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v24

    .line 224
    invoke-interface {v3, v7}, Lz7/c;->M(I)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v25

    .line 228
    invoke-interface {v3, v8}, Lz7/c;->M(I)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v26

    .line 232
    invoke-interface {v3, v9}, Lz7/c;->M(I)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v27

    .line 236
    move v14, v4

    .line 237
    move/from16 v33, v5

    .line 238
    .line 239
    invoke-interface {v3, v10}, Lz7/c;->getLong(I)J

    .line 240
    .line 241
    .line 242
    move-result-wide v4

    .line 243
    long-to-int v5, v4

    .line 244
    const/16 v17, 0x1

    .line 245
    .line 246
    if-eqz v5, :cond_2

    .line 247
    .line 248
    const/16 v28, 0x1

    .line 249
    .line 250
    goto :goto_4

    .line 251
    :cond_2
    const/16 v28, 0x0

    .line 252
    .line 253
    :goto_4
    invoke-interface {v3, v11}, Lz7/c;->getLong(I)J

    .line 254
    .line 255
    .line 256
    move-result-wide v4

    .line 257
    long-to-int v5, v4

    .line 258
    if-eqz v5, :cond_3

    .line 259
    .line 260
    const/16 v29, 0x1

    .line 261
    .line 262
    goto :goto_5

    .line 263
    :cond_3
    const/16 v29, 0x0

    .line 264
    .line 265
    :goto_5
    invoke-interface {v3, v12}, Lz7/c;->M(I)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v30

    .line 269
    invoke-interface {v3, v13}, Lz7/c;->M(I)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v31

    .line 273
    move/from16 v4, p1

    .line 274
    .line 275
    invoke-interface {v3, v4}, Lz7/c;->M(I)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v32

    .line 279
    new-instance v17, Lc9/d;

    .line 280
    .line 281
    move/from16 v18, v15

    .line 282
    .line 283
    invoke-direct/range {v17 .. v32}, Lc9/d;-><init>(IJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    move-object/from16 v5, v17

    .line 287
    .line 288
    move-object/from16 v15, v16

    .line 289
    .line 290
    invoke-virtual {v15, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 291
    .line 292
    .line 293
    move v5, v14

    .line 294
    move v14, v4

    .line 295
    move v4, v5

    .line 296
    move/from16 v5, v33

    .line 297
    .line 298
    goto :goto_3

    .line 299
    :catchall_1
    move-exception v0

    .line 300
    goto :goto_6

    .line 301
    :cond_4
    invoke-interface {v3}, Ljava/lang/AutoCloseable;->close()V

    .line 302
    .line 303
    .line 304
    return-object v15

    .line 305
    :goto_6
    invoke-interface {v3}, Ljava/lang/AutoCloseable;->close()V

    .line 306
    .line 307
    .line 308
    throw v0

    .line 309
    :pswitch_2
    move-object/from16 v0, p1

    .line 310
    .line 311
    check-cast v0, Lz7/a;

    .line 312
    .line 313
    const-string v2, "_connection"

    .line 314
    .line 315
    invoke-static {v0, v2}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    iget-object v2, v1, Ld9/e;->b:Ln7/w;

    .line 319
    .line 320
    iget-object v3, v2, Ln7/w;->a:Ljava/lang/String;

    .line 321
    .line 322
    invoke-interface {v0, v3}, Lz7/a;->d0(Ljava/lang/String;)Lz7/c;

    .line 323
    .line 324
    .line 325
    move-result-object v3

    .line 326
    iget-object v0, v2, Ln7/w;->b:Lh1/m;

    .line 327
    .line 328
    invoke-virtual {v0, v3}, Lh1/m;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    :try_start_2
    const-string v0, "id"

    .line 332
    .line 333
    invoke-static {v3, v0}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 334
    .line 335
    .line 336
    move-result v0

    .line 337
    const-string v2, "timestamp"

    .line 338
    .line 339
    invoke-static {v3, v2}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 340
    .line 341
    .line 342
    move-result v2

    .line 343
    const-string v4, "rj"

    .line 344
    .line 345
    invoke-static {v3, v4}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 346
    .line 347
    .line 348
    move-result v4

    .line 349
    const-string v5, "sourceId"

    .line 350
    .line 351
    invoke-static {v3, v5}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 352
    .line 353
    .line 354
    move-result v5

    .line 355
    const-string v6, "releaseTime"

    .line 356
    .line 357
    invoke-static {v3, v6}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 358
    .line 359
    .line 360
    move-result v6

    .line 361
    const-string v7, "tags"

    .line 362
    .line 363
    invoke-static {v3, v7}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 364
    .line 365
    .line 366
    move-result v7

    .line 367
    const-string v8, "vas"

    .line 368
    .line 369
    invoke-static {v3, v8}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 370
    .line 371
    .line 372
    move-result v8

    .line 373
    const-string v9, "circle"

    .line 374
    .line 375
    invoke-static {v3, v9}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 376
    .line 377
    .line 378
    move-result v9

    .line 379
    const-string v10, "nsfw"

    .line 380
    .line 381
    invoke-static {v3, v10}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 382
    .line 383
    .line 384
    move-result v10

    .line 385
    const-string v11, "has_subtitle"

    .line 386
    .line 387
    invoke-static {v3, v11}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 388
    .line 389
    .line 390
    move-result v11

    .line 391
    const-string v12, "icon"

    .line 392
    .line 393
    invoke-static {v3, v12}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 394
    .line 395
    .line 396
    move-result v12

    .line 397
    const-string v13, "name"

    .line 398
    .line 399
    invoke-static {v3, v13}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 400
    .line 401
    .line 402
    move-result v13

    .line 403
    const-string v14, "workJson"

    .line 404
    .line 405
    invoke-static {v3, v14}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 406
    .line 407
    .line 408
    move-result v14

    .line 409
    new-instance v15, Ljava/util/ArrayList;

    .line 410
    .line 411
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 412
    .line 413
    .line 414
    :goto_7
    invoke-interface {v3}, Lz7/c;->Z()Z

    .line 415
    .line 416
    .line 417
    move-result v16

    .line 418
    if-eqz v16, :cond_7

    .line 419
    .line 420
    move/from16 p1, v14

    .line 421
    .line 422
    move-object/from16 v16, v15

    .line 423
    .line 424
    invoke-interface {v3, v0}, Lz7/c;->getLong(I)J

    .line 425
    .line 426
    .line 427
    move-result-wide v14

    .line 428
    long-to-int v15, v14

    .line 429
    invoke-interface {v3, v2}, Lz7/c;->getLong(I)J

    .line 430
    .line 431
    .line 432
    move-result-wide v19

    .line 433
    invoke-interface {v3, v4}, Lz7/c;->getLong(I)J

    .line 434
    .line 435
    .line 436
    move-result-wide v21

    .line 437
    invoke-interface {v3, v5}, Lz7/c;->M(I)Ljava/lang/String;

    .line 438
    .line 439
    .line 440
    move-result-object v23

    .line 441
    invoke-interface {v3, v6}, Lz7/c;->M(I)Ljava/lang/String;

    .line 442
    .line 443
    .line 444
    move-result-object v24

    .line 445
    invoke-interface {v3, v7}, Lz7/c;->M(I)Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    move-result-object v25

    .line 449
    invoke-interface {v3, v8}, Lz7/c;->M(I)Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object v26

    .line 453
    invoke-interface {v3, v9}, Lz7/c;->M(I)Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v27

    .line 457
    move v14, v4

    .line 458
    move/from16 v33, v5

    .line 459
    .line 460
    invoke-interface {v3, v10}, Lz7/c;->getLong(I)J

    .line 461
    .line 462
    .line 463
    move-result-wide v4

    .line 464
    long-to-int v5, v4

    .line 465
    const/16 v17, 0x1

    .line 466
    .line 467
    if-eqz v5, :cond_5

    .line 468
    .line 469
    const/16 v28, 0x1

    .line 470
    .line 471
    goto :goto_8

    .line 472
    :cond_5
    const/16 v28, 0x0

    .line 473
    .line 474
    :goto_8
    invoke-interface {v3, v11}, Lz7/c;->getLong(I)J

    .line 475
    .line 476
    .line 477
    move-result-wide v4

    .line 478
    long-to-int v5, v4

    .line 479
    if-eqz v5, :cond_6

    .line 480
    .line 481
    const/16 v29, 0x1

    .line 482
    .line 483
    goto :goto_9

    .line 484
    :cond_6
    const/16 v29, 0x0

    .line 485
    .line 486
    :goto_9
    invoke-interface {v3, v12}, Lz7/c;->M(I)Ljava/lang/String;

    .line 487
    .line 488
    .line 489
    move-result-object v30

    .line 490
    invoke-interface {v3, v13}, Lz7/c;->M(I)Ljava/lang/String;

    .line 491
    .line 492
    .line 493
    move-result-object v31

    .line 494
    move/from16 v4, p1

    .line 495
    .line 496
    invoke-interface {v3, v4}, Lz7/c;->M(I)Ljava/lang/String;

    .line 497
    .line 498
    .line 499
    move-result-object v32

    .line 500
    new-instance v17, Lc9/c;

    .line 501
    .line 502
    move/from16 v18, v15

    .line 503
    .line 504
    invoke-direct/range {v17 .. v32}, Lc9/c;-><init>(IJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 505
    .line 506
    .line 507
    move-object/from16 v5, v17

    .line 508
    .line 509
    move-object/from16 v15, v16

    .line 510
    .line 511
    invoke-virtual {v15, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 512
    .line 513
    .line 514
    move v5, v14

    .line 515
    move v14, v4

    .line 516
    move v4, v5

    .line 517
    move/from16 v5, v33

    .line 518
    .line 519
    goto :goto_7

    .line 520
    :catchall_2
    move-exception v0

    .line 521
    goto :goto_a

    .line 522
    :cond_7
    invoke-interface {v3}, Ljava/lang/AutoCloseable;->close()V

    .line 523
    .line 524
    .line 525
    return-object v15

    .line 526
    :goto_a
    invoke-interface {v3}, Ljava/lang/AutoCloseable;->close()V

    .line 527
    .line 528
    .line 529
    throw v0

    .line 530
    :pswitch_3
    move-object/from16 v0, p1

    .line 531
    .line 532
    check-cast v0, Lz7/a;

    .line 533
    .line 534
    const-string v2, "_connection"

    .line 535
    .line 536
    invoke-static {v0, v2}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 537
    .line 538
    .line 539
    iget-object v2, v1, Ld9/e;->b:Ln7/w;

    .line 540
    .line 541
    iget-object v3, v2, Ln7/w;->a:Ljava/lang/String;

    .line 542
    .line 543
    invoke-interface {v0, v3}, Lz7/a;->d0(Ljava/lang/String;)Lz7/c;

    .line 544
    .line 545
    .line 546
    move-result-object v3

    .line 547
    iget-object v0, v2, Ln7/w;->b:Lh1/m;

    .line 548
    .line 549
    invoke-virtual {v0, v3}, Lh1/m;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 550
    .line 551
    .line 552
    :try_start_3
    const-string v0, "id"

    .line 553
    .line 554
    invoke-static {v3, v0}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 555
    .line 556
    .line 557
    move-result v0

    .line 558
    const-string v2, "type"

    .line 559
    .line 560
    invoke-static {v3, v2}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 561
    .line 562
    .line 563
    move-result v2

    .line 564
    const-string v4, "value"

    .line 565
    .line 566
    invoke-static {v3, v4}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 567
    .line 568
    .line 569
    move-result v4

    .line 570
    new-instance v5, Ljava/util/ArrayList;

    .line 571
    .line 572
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 573
    .line 574
    .line 575
    :goto_b
    invoke-interface {v3}, Lz7/c;->Z()Z

    .line 576
    .line 577
    .line 578
    move-result v6

    .line 579
    if-eqz v6, :cond_8

    .line 580
    .line 581
    invoke-interface {v3, v0}, Lz7/c;->getLong(I)J

    .line 582
    .line 583
    .line 584
    move-result-wide v6

    .line 585
    long-to-int v7, v6

    .line 586
    invoke-interface {v3, v2}, Lz7/c;->M(I)Ljava/lang/String;

    .line 587
    .line 588
    .line 589
    move-result-object v6

    .line 590
    invoke-interface {v3, v4}, Lz7/c;->M(I)Ljava/lang/String;

    .line 591
    .line 592
    .line 593
    move-result-object v8

    .line 594
    new-instance v9, Lc9/b;

    .line 595
    .line 596
    invoke-direct {v9, v7, v6, v8}, Lc9/b;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 597
    .line 598
    .line 599
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 600
    .line 601
    .line 602
    goto :goto_b

    .line 603
    :catchall_3
    move-exception v0

    .line 604
    goto :goto_c

    .line 605
    :cond_8
    invoke-interface {v3}, Ljava/lang/AutoCloseable;->close()V

    .line 606
    .line 607
    .line 608
    return-object v5

    .line 609
    :goto_c
    invoke-interface {v3}, Ljava/lang/AutoCloseable;->close()V

    .line 610
    .line 611
    .line 612
    throw v0

    .line 613
    :pswitch_4
    move-object/from16 v0, p1

    .line 614
    .line 615
    check-cast v0, Lz7/a;

    .line 616
    .line 617
    const-string v2, "_connection"

    .line 618
    .line 619
    invoke-static {v0, v2}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 620
    .line 621
    .line 622
    iget-object v2, v1, Ld9/e;->b:Ln7/w;

    .line 623
    .line 624
    iget-object v3, v2, Ln7/w;->a:Ljava/lang/String;

    .line 625
    .line 626
    invoke-interface {v0, v3}, Lz7/a;->d0(Ljava/lang/String;)Lz7/c;

    .line 627
    .line 628
    .line 629
    move-result-object v3

    .line 630
    iget-object v0, v2, Ln7/w;->b:Lh1/m;

    .line 631
    .line 632
    invoke-virtual {v0, v3}, Lh1/m;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 633
    .line 634
    .line 635
    :try_start_4
    const-string v0, "id"

    .line 636
    .line 637
    invoke-static {v3, v0}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 638
    .line 639
    .line 640
    move-result v0

    .line 641
    const-string v2, "server"

    .line 642
    .line 643
    invoke-static {v3, v2}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 644
    .line 645
    .line 646
    move-result v2

    .line 647
    const-string v4, "username"

    .line 648
    .line 649
    invoke-static {v3, v4}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 650
    .line 651
    .line 652
    move-result v4

    .line 653
    const-string v5, "password"

    .line 654
    .line 655
    invoke-static {v3, v5}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 656
    .line 657
    .line 658
    move-result v5

    .line 659
    const-string v6, "token"

    .line 660
    .line 661
    invoke-static {v3, v6}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 662
    .line 663
    .line 664
    move-result v6

    .line 665
    const-string v7, "timestamp"

    .line 666
    .line 667
    invoke-static {v3, v7}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 668
    .line 669
    .line 670
    move-result v7

    .line 671
    new-instance v8, Ljava/util/ArrayList;

    .line 672
    .line 673
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 674
    .line 675
    .line 676
    :goto_d
    invoke-interface {v3}, Lz7/c;->Z()Z

    .line 677
    .line 678
    .line 679
    move-result v9

    .line 680
    if-eqz v9, :cond_9

    .line 681
    .line 682
    invoke-interface {v3, v0}, Lz7/c;->getLong(I)J

    .line 683
    .line 684
    .line 685
    move-result-wide v9

    .line 686
    long-to-int v12, v9

    .line 687
    invoke-interface {v3, v2}, Lz7/c;->M(I)Ljava/lang/String;

    .line 688
    .line 689
    .line 690
    move-result-object v13

    .line 691
    invoke-interface {v3, v4}, Lz7/c;->M(I)Ljava/lang/String;

    .line 692
    .line 693
    .line 694
    move-result-object v14

    .line 695
    invoke-interface {v3, v5}, Lz7/c;->M(I)Ljava/lang/String;

    .line 696
    .line 697
    .line 698
    move-result-object v15

    .line 699
    invoke-interface {v3, v6}, Lz7/c;->M(I)Ljava/lang/String;

    .line 700
    .line 701
    .line 702
    move-result-object v16

    .line 703
    invoke-interface {v3, v7}, Lz7/c;->getLong(I)J

    .line 704
    .line 705
    .line 706
    move-result-wide v17

    .line 707
    new-instance v11, Lc9/a;

    .line 708
    .line 709
    invoke-direct/range {v11 .. v18}, Lc9/a;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 710
    .line 711
    .line 712
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 713
    .line 714
    .line 715
    goto :goto_d

    .line 716
    :catchall_4
    move-exception v0

    .line 717
    goto :goto_e

    .line 718
    :cond_9
    invoke-interface {v3}, Ljava/lang/AutoCloseable;->close()V

    .line 719
    .line 720
    .line 721
    return-object v8

    .line 722
    :goto_e
    invoke-interface {v3}, Ljava/lang/AutoCloseable;->close()V

    .line 723
    .line 724
    .line 725
    throw v0

    .line 726
    nop

    .line 727
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
