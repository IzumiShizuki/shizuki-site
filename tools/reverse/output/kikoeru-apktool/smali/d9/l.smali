.class public final synthetic Ld9/l;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/k;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:J


# direct methods
.method public synthetic constructor <init>(JI)V
    .locals 0

    .line 1
    iput p3, p0, Ld9/l;->a:I

    .line 2
    .line 3
    iput-wide p1, p0, Ld9/l;->b:J

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
    .locals 32

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Ld9/l;->a:I

    .line 4
    .line 5
    iget-wide v2, v1, Ld9/l;->b:J

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v0, p1

    .line 11
    .line 12
    check-cast v0, Lz7/a;

    .line 13
    .line 14
    const-string v4, "_connection"

    .line 15
    .line 16
    invoke-static {v0, v4}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const-string v4, "SELECT 1 FROM LyricBean WHERE rj=(?) LIMIT 1"

    .line 20
    .line 21
    invoke-interface {v0, v4}, Lz7/a;->d0(Ljava/lang/String;)Lz7/c;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    const/4 v0, 0x1

    .line 26
    :try_start_0
    invoke-interface {v4, v0, v2, v3}, Lz7/c;->c(IJ)V

    .line 27
    .line 28
    .line 29
    invoke-interface {v4}, Lz7/c;->Z()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    const/4 v3, 0x0

    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    invoke-interface {v4, v3}, Lz7/c;->getLong(I)J

    .line 37
    .line 38
    .line 39
    move-result-wide v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    long-to-int v2, v5

    .line 41
    if-eqz v2, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    const/4 v0, 0x0

    .line 45
    :goto_0
    move v3, v0

    .line 46
    goto :goto_1

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    goto :goto_2

    .line 49
    :cond_1
    :goto_1
    invoke-interface {v4}, Ljava/lang/AutoCloseable;->close()V

    .line 50
    .line 51
    .line 52
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    return-object v0

    .line 57
    :goto_2
    invoke-interface {v4}, Ljava/lang/AutoCloseable;->close()V

    .line 58
    .line 59
    .line 60
    throw v0

    .line 61
    :pswitch_0
    move-object/from16 v0, p1

    .line 62
    .line 63
    check-cast v0, Lz7/a;

    .line 64
    .line 65
    const-string v4, "_connection"

    .line 66
    .line 67
    invoke-static {v0, v4}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    const-string v4, "SELECT * FROM LyricBean WHERE rj=(?)"

    .line 71
    .line 72
    invoke-interface {v0, v4}, Lz7/a;->d0(Ljava/lang/String;)Lz7/c;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    const/4 v0, 0x1

    .line 77
    :try_start_1
    invoke-interface {v4, v0, v2, v3}, Lz7/c;->c(IJ)V

    .line 78
    .line 79
    .line 80
    const-string v0, "id"

    .line 81
    .line 82
    invoke-static {v4, v0}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    const-string v2, "rj"

    .line 87
    .line 88
    invoke-static {v4, v2}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    const-string v3, "sourceId"

    .line 93
    .line 94
    invoke-static {v4, v3}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    const-string v5, "nameBin"

    .line 99
    .line 100
    invoke-static {v4, v5}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    const-string v6, "nameEnc"

    .line 105
    .line 106
    invoke-static {v4, v6}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    const-string v7, "lyricBin"

    .line 111
    .line 112
    invoke-static {v4, v7}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 113
    .line 114
    .line 115
    move-result v7

    .line 116
    const-string v8, "lyricEnc"

    .line 117
    .line 118
    invoke-static {v4, v8}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 119
    .line 120
    .line 121
    move-result v8

    .line 122
    const-string v9, "duration"

    .line 123
    .line 124
    invoke-static {v4, v9}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 125
    .line 126
    .line 127
    move-result v9

    .line 128
    const-string v10, "documentUri"

    .line 129
    .line 130
    invoke-static {v4, v10}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 131
    .line 132
    .line 133
    move-result v10

    .line 134
    const-string v11, "zipInnerPath"

    .line 135
    .line 136
    invoke-static {v4, v11}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 137
    .line 138
    .line 139
    move-result v11

    .line 140
    new-instance v12, Ljava/util/ArrayList;

    .line 141
    .line 142
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 143
    .line 144
    .line 145
    :goto_3
    invoke-interface {v4}, Lz7/c;->Z()Z

    .line 146
    .line 147
    .line 148
    move-result v13

    .line 149
    if-eqz v13, :cond_4

    .line 150
    .line 151
    invoke-interface {v4, v0}, Lz7/c;->getLong(I)J

    .line 152
    .line 153
    .line 154
    move-result-wide v13

    .line 155
    long-to-int v14, v13

    .line 156
    invoke-interface {v4, v2}, Lz7/c;->getLong(I)J

    .line 157
    .line 158
    .line 159
    move-result-wide v17

    .line 160
    invoke-interface {v4, v3}, Lz7/c;->M(I)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v19

    .line 164
    invoke-interface {v4, v5}, Lz7/c;->getBlob(I)[B

    .line 165
    .line 166
    .line 167
    move-result-object v20

    .line 168
    invoke-interface {v4, v6}, Lz7/c;->isNull(I)Z

    .line 169
    .line 170
    .line 171
    move-result v13

    .line 172
    const/4 v15, 0x0

    .line 173
    if-eqz v13, :cond_2

    .line 174
    .line 175
    move-object/from16 v21, v15

    .line 176
    .line 177
    goto :goto_4

    .line 178
    :cond_2
    invoke-interface {v4, v6}, Lz7/c;->M(I)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v13

    .line 182
    move-object/from16 v21, v13

    .line 183
    .line 184
    :goto_4
    invoke-interface {v4, v7}, Lz7/c;->getBlob(I)[B

    .line 185
    .line 186
    .line 187
    move-result-object v22

    .line 188
    invoke-interface {v4, v8}, Lz7/c;->isNull(I)Z

    .line 189
    .line 190
    .line 191
    move-result v13

    .line 192
    if-eqz v13, :cond_3

    .line 193
    .line 194
    :goto_5
    move-object/from16 v23, v15

    .line 195
    .line 196
    goto :goto_6

    .line 197
    :cond_3
    invoke-interface {v4, v8}, Lz7/c;->M(I)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v15

    .line 201
    goto :goto_5

    .line 202
    :goto_6
    invoke-interface {v4, v9}, Lz7/c;->getLong(I)J

    .line 203
    .line 204
    .line 205
    move-result-wide v24

    .line 206
    invoke-interface {v4, v10}, Lz7/c;->M(I)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v26

    .line 210
    invoke-interface {v4, v11}, Lz7/c;->M(I)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v27

    .line 214
    new-instance v15, Lc9/f;

    .line 215
    .line 216
    move/from16 v16, v14

    .line 217
    .line 218
    invoke-direct/range {v15 .. v27}, Lc9/f;-><init>(IJLjava/lang/String;[BLjava/lang/String;[BLjava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v12, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 222
    .line 223
    .line 224
    goto :goto_3

    .line 225
    :catchall_1
    move-exception v0

    .line 226
    goto :goto_7

    .line 227
    :cond_4
    invoke-interface {v4}, Ljava/lang/AutoCloseable;->close()V

    .line 228
    .line 229
    .line 230
    return-object v12

    .line 231
    :goto_7
    invoke-interface {v4}, Ljava/lang/AutoCloseable;->close()V

    .line 232
    .line 233
    .line 234
    throw v0

    .line 235
    :pswitch_1
    move-object/from16 v0, p1

    .line 236
    .line 237
    check-cast v0, Lz7/a;

    .line 238
    .line 239
    const-string v4, "_connection"

    .line 240
    .line 241
    invoke-static {v0, v4}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    const-string v4, "DELETE FROM HistoryBean WHERE rj=(?)"

    .line 245
    .line 246
    invoke-interface {v0, v4}, Lz7/a;->d0(Ljava/lang/String;)Lz7/c;

    .line 247
    .line 248
    .line 249
    move-result-object v4

    .line 250
    const/4 v0, 0x1

    .line 251
    :try_start_2
    invoke-interface {v4, v0, v2, v3}, Lz7/c;->c(IJ)V

    .line 252
    .line 253
    .line 254
    invoke-interface {v4}, Lz7/c;->Z()Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 255
    .line 256
    .line 257
    invoke-interface {v4}, Ljava/lang/AutoCloseable;->close()V

    .line 258
    .line 259
    .line 260
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 261
    .line 262
    return-object v0

    .line 263
    :catchall_2
    move-exception v0

    .line 264
    invoke-interface {v4}, Ljava/lang/AutoCloseable;->close()V

    .line 265
    .line 266
    .line 267
    throw v0

    .line 268
    :pswitch_2
    move-object/from16 v0, p1

    .line 269
    .line 270
    check-cast v0, Lz7/a;

    .line 271
    .line 272
    const-string v4, "_connection"

    .line 273
    .line 274
    invoke-static {v0, v4}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    const-string v4, "SELECT * FROM HistoryBean WHERE rj=(?)"

    .line 278
    .line 279
    invoke-interface {v0, v4}, Lz7/a;->d0(Ljava/lang/String;)Lz7/c;

    .line 280
    .line 281
    .line 282
    move-result-object v4

    .line 283
    const/4 v0, 0x1

    .line 284
    :try_start_3
    invoke-interface {v4, v0, v2, v3}, Lz7/c;->c(IJ)V

    .line 285
    .line 286
    .line 287
    const-string v2, "id"

    .line 288
    .line 289
    invoke-static {v4, v2}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 290
    .line 291
    .line 292
    move-result v2

    .line 293
    const-string v3, "timestamp"

    .line 294
    .line 295
    invoke-static {v4, v3}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 296
    .line 297
    .line 298
    move-result v3

    .line 299
    const-string v5, "rj"

    .line 300
    .line 301
    invoke-static {v4, v5}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 302
    .line 303
    .line 304
    move-result v5

    .line 305
    const-string v6, "sourceId"

    .line 306
    .line 307
    invoke-static {v4, v6}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 308
    .line 309
    .line 310
    move-result v6

    .line 311
    const-string v7, "releaseTime"

    .line 312
    .line 313
    invoke-static {v4, v7}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 314
    .line 315
    .line 316
    move-result v7

    .line 317
    const-string v8, "tags"

    .line 318
    .line 319
    invoke-static {v4, v8}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 320
    .line 321
    .line 322
    move-result v8

    .line 323
    const-string v9, "vas"

    .line 324
    .line 325
    invoke-static {v4, v9}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 326
    .line 327
    .line 328
    move-result v9

    .line 329
    const-string v10, "circle"

    .line 330
    .line 331
    invoke-static {v4, v10}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 332
    .line 333
    .line 334
    move-result v10

    .line 335
    const-string v11, "nsfw"

    .line 336
    .line 337
    invoke-static {v4, v11}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 338
    .line 339
    .line 340
    move-result v11

    .line 341
    const-string v12, "has_subtitle"

    .line 342
    .line 343
    invoke-static {v4, v12}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 344
    .line 345
    .line 346
    move-result v12

    .line 347
    const-string v13, "icon"

    .line 348
    .line 349
    invoke-static {v4, v13}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 350
    .line 351
    .line 352
    move-result v13

    .line 353
    const-string v14, "name"

    .line 354
    .line 355
    invoke-static {v4, v14}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 356
    .line 357
    .line 358
    move-result v14

    .line 359
    const-string v15, "workJson"

    .line 360
    .line 361
    invoke-static {v4, v15}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 362
    .line 363
    .line 364
    move-result v15

    .line 365
    invoke-interface {v4}, Lz7/c;->Z()Z

    .line 366
    .line 367
    .line 368
    move-result v16

    .line 369
    if-eqz v16, :cond_7

    .line 370
    .line 371
    invoke-interface {v4, v2}, Lz7/c;->getLong(I)J

    .line 372
    .line 373
    .line 374
    move-result-wide v0

    .line 375
    long-to-int v1, v0

    .line 376
    invoke-interface {v4, v3}, Lz7/c;->getLong(I)J

    .line 377
    .line 378
    .line 379
    move-result-wide v18

    .line 380
    invoke-interface {v4, v5}, Lz7/c;->getLong(I)J

    .line 381
    .line 382
    .line 383
    move-result-wide v20

    .line 384
    invoke-interface {v4, v6}, Lz7/c;->M(I)Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v22

    .line 388
    invoke-interface {v4, v7}, Lz7/c;->M(I)Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v23

    .line 392
    invoke-interface {v4, v8}, Lz7/c;->M(I)Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v24

    .line 396
    invoke-interface {v4, v9}, Lz7/c;->M(I)Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object v25

    .line 400
    invoke-interface {v4, v10}, Lz7/c;->M(I)Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object v26

    .line 404
    invoke-interface {v4, v11}, Lz7/c;->getLong(I)J

    .line 405
    .line 406
    .line 407
    move-result-wide v2

    .line 408
    long-to-int v0, v2

    .line 409
    const/4 v2, 0x0

    .line 410
    if-eqz v0, :cond_5

    .line 411
    .line 412
    const/16 v27, 0x1

    .line 413
    .line 414
    goto :goto_8

    .line 415
    :cond_5
    const/16 v27, 0x0

    .line 416
    .line 417
    :goto_8
    invoke-interface {v4, v12}, Lz7/c;->getLong(I)J

    .line 418
    .line 419
    .line 420
    move-result-wide v5

    .line 421
    long-to-int v0, v5

    .line 422
    if-eqz v0, :cond_6

    .line 423
    .line 424
    const/16 v28, 0x1

    .line 425
    .line 426
    goto :goto_9

    .line 427
    :cond_6
    const/16 v28, 0x0

    .line 428
    .line 429
    :goto_9
    invoke-interface {v4, v13}, Lz7/c;->M(I)Ljava/lang/String;

    .line 430
    .line 431
    .line 432
    move-result-object v29

    .line 433
    invoke-interface {v4, v14}, Lz7/c;->M(I)Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object v30

    .line 437
    invoke-interface {v4, v15}, Lz7/c;->M(I)Ljava/lang/String;

    .line 438
    .line 439
    .line 440
    move-result-object v31

    .line 441
    new-instance v16, Lc9/d;

    .line 442
    .line 443
    move/from16 v17, v1

    .line 444
    .line 445
    invoke-direct/range {v16 .. v31}, Lc9/d;-><init>(IJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 446
    .line 447
    .line 448
    goto :goto_a

    .line 449
    :catchall_3
    move-exception v0

    .line 450
    goto :goto_b

    .line 451
    :cond_7
    const/16 v16, 0x0

    .line 452
    .line 453
    :goto_a
    invoke-interface {v4}, Ljava/lang/AutoCloseable;->close()V

    .line 454
    .line 455
    .line 456
    return-object v16

    .line 457
    :goto_b
    invoke-interface {v4}, Ljava/lang/AutoCloseable;->close()V

    .line 458
    .line 459
    .line 460
    throw v0

    .line 461
    :pswitch_3
    move-object/from16 v0, p1

    .line 462
    .line 463
    check-cast v0, Lz7/a;

    .line 464
    .line 465
    const-string v4, "_connection"

    .line 466
    .line 467
    invoke-static {v0, v4}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 468
    .line 469
    .line 470
    const-string v4, "SELECT * FROM DownloadBean WHERE rj=(?)"

    .line 471
    .line 472
    invoke-interface {v0, v4}, Lz7/a;->d0(Ljava/lang/String;)Lz7/c;

    .line 473
    .line 474
    .line 475
    move-result-object v4

    .line 476
    const/4 v0, 0x1

    .line 477
    :try_start_4
    invoke-interface {v4, v0, v2, v3}, Lz7/c;->c(IJ)V

    .line 478
    .line 479
    .line 480
    const-string v2, "id"

    .line 481
    .line 482
    invoke-static {v4, v2}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 483
    .line 484
    .line 485
    move-result v2

    .line 486
    const-string v3, "timestamp"

    .line 487
    .line 488
    invoke-static {v4, v3}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 489
    .line 490
    .line 491
    move-result v3

    .line 492
    const-string v5, "rj"

    .line 493
    .line 494
    invoke-static {v4, v5}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 495
    .line 496
    .line 497
    move-result v5

    .line 498
    const-string v6, "sourceId"

    .line 499
    .line 500
    invoke-static {v4, v6}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 501
    .line 502
    .line 503
    move-result v6

    .line 504
    const-string v7, "releaseTime"

    .line 505
    .line 506
    invoke-static {v4, v7}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 507
    .line 508
    .line 509
    move-result v7

    .line 510
    const-string v8, "tags"

    .line 511
    .line 512
    invoke-static {v4, v8}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 513
    .line 514
    .line 515
    move-result v8

    .line 516
    const-string v9, "vas"

    .line 517
    .line 518
    invoke-static {v4, v9}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 519
    .line 520
    .line 521
    move-result v9

    .line 522
    const-string v10, "circle"

    .line 523
    .line 524
    invoke-static {v4, v10}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 525
    .line 526
    .line 527
    move-result v10

    .line 528
    const-string v11, "nsfw"

    .line 529
    .line 530
    invoke-static {v4, v11}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 531
    .line 532
    .line 533
    move-result v11

    .line 534
    const-string v12, "has_subtitle"

    .line 535
    .line 536
    invoke-static {v4, v12}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 537
    .line 538
    .line 539
    move-result v12

    .line 540
    const-string v13, "icon"

    .line 541
    .line 542
    invoke-static {v4, v13}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 543
    .line 544
    .line 545
    move-result v13

    .line 546
    const-string v14, "name"

    .line 547
    .line 548
    invoke-static {v4, v14}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 549
    .line 550
    .line 551
    move-result v14

    .line 552
    const-string v15, "workJson"

    .line 553
    .line 554
    invoke-static {v4, v15}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 555
    .line 556
    .line 557
    move-result v15

    .line 558
    invoke-interface {v4}, Lz7/c;->Z()Z

    .line 559
    .line 560
    .line 561
    move-result v16

    .line 562
    if-eqz v16, :cond_a

    .line 563
    .line 564
    invoke-interface {v4, v2}, Lz7/c;->getLong(I)J

    .line 565
    .line 566
    .line 567
    move-result-wide v0

    .line 568
    long-to-int v1, v0

    .line 569
    invoke-interface {v4, v3}, Lz7/c;->getLong(I)J

    .line 570
    .line 571
    .line 572
    move-result-wide v18

    .line 573
    invoke-interface {v4, v5}, Lz7/c;->getLong(I)J

    .line 574
    .line 575
    .line 576
    move-result-wide v20

    .line 577
    invoke-interface {v4, v6}, Lz7/c;->M(I)Ljava/lang/String;

    .line 578
    .line 579
    .line 580
    move-result-object v22

    .line 581
    invoke-interface {v4, v7}, Lz7/c;->M(I)Ljava/lang/String;

    .line 582
    .line 583
    .line 584
    move-result-object v23

    .line 585
    invoke-interface {v4, v8}, Lz7/c;->M(I)Ljava/lang/String;

    .line 586
    .line 587
    .line 588
    move-result-object v24

    .line 589
    invoke-interface {v4, v9}, Lz7/c;->M(I)Ljava/lang/String;

    .line 590
    .line 591
    .line 592
    move-result-object v25

    .line 593
    invoke-interface {v4, v10}, Lz7/c;->M(I)Ljava/lang/String;

    .line 594
    .line 595
    .line 596
    move-result-object v26

    .line 597
    invoke-interface {v4, v11}, Lz7/c;->getLong(I)J

    .line 598
    .line 599
    .line 600
    move-result-wide v2

    .line 601
    long-to-int v0, v2

    .line 602
    const/4 v2, 0x0

    .line 603
    if-eqz v0, :cond_8

    .line 604
    .line 605
    const/16 v27, 0x1

    .line 606
    .line 607
    goto :goto_c

    .line 608
    :cond_8
    const/16 v27, 0x0

    .line 609
    .line 610
    :goto_c
    invoke-interface {v4, v12}, Lz7/c;->getLong(I)J

    .line 611
    .line 612
    .line 613
    move-result-wide v5

    .line 614
    long-to-int v0, v5

    .line 615
    if-eqz v0, :cond_9

    .line 616
    .line 617
    const/16 v28, 0x1

    .line 618
    .line 619
    goto :goto_d

    .line 620
    :cond_9
    const/16 v28, 0x0

    .line 621
    .line 622
    :goto_d
    invoke-interface {v4, v13}, Lz7/c;->M(I)Ljava/lang/String;

    .line 623
    .line 624
    .line 625
    move-result-object v29

    .line 626
    invoke-interface {v4, v14}, Lz7/c;->M(I)Ljava/lang/String;

    .line 627
    .line 628
    .line 629
    move-result-object v30

    .line 630
    invoke-interface {v4, v15}, Lz7/c;->M(I)Ljava/lang/String;

    .line 631
    .line 632
    .line 633
    move-result-object v31

    .line 634
    new-instance v16, Lc9/c;

    .line 635
    .line 636
    move/from16 v17, v1

    .line 637
    .line 638
    invoke-direct/range {v16 .. v31}, Lc9/c;-><init>(IJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 639
    .line 640
    .line 641
    goto :goto_e

    .line 642
    :catchall_4
    move-exception v0

    .line 643
    goto :goto_f

    .line 644
    :cond_a
    const/16 v16, 0x0

    .line 645
    .line 646
    :goto_e
    invoke-interface {v4}, Ljava/lang/AutoCloseable;->close()V

    .line 647
    .line 648
    .line 649
    return-object v16

    .line 650
    :goto_f
    invoke-interface {v4}, Ljava/lang/AutoCloseable;->close()V

    .line 651
    .line 652
    .line 653
    throw v0

    .line 654
    :pswitch_4
    move-object/from16 v0, p1

    .line 655
    .line 656
    check-cast v0, Lz7/a;

    .line 657
    .line 658
    const-string v4, "_connection"

    .line 659
    .line 660
    invoke-static {v0, v4}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 661
    .line 662
    .line 663
    const-string v4, "DELETE FROM DownloadBean WHERE rj=(?)"

    .line 664
    .line 665
    invoke-interface {v0, v4}, Lz7/a;->d0(Ljava/lang/String;)Lz7/c;

    .line 666
    .line 667
    .line 668
    move-result-object v4

    .line 669
    const/4 v0, 0x1

    .line 670
    :try_start_5
    invoke-interface {v4, v0, v2, v3}, Lz7/c;->c(IJ)V

    .line 671
    .line 672
    .line 673
    invoke-interface {v4}, Lz7/c;->Z()Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 674
    .line 675
    .line 676
    invoke-interface {v4}, Ljava/lang/AutoCloseable;->close()V

    .line 677
    .line 678
    .line 679
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 680
    .line 681
    return-object v0

    .line 682
    :catchall_5
    move-exception v0

    .line 683
    invoke-interface {v4}, Ljava/lang/AutoCloseable;->close()V

    .line 684
    .line 685
    .line 686
    throw v0

    .line 687
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
