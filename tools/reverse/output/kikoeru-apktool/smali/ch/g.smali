.class public abstract Lch/g;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final a:[Lch/d;

.field public static final b:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 64

    .line 1
    new-instance v0, Lch/d;

    .line 2
    .line 3
    sget-object v1, Lch/d;->i:Llh/i;

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    invoke-direct {v0, v2, v1}, Lch/d;-><init>(Ljava/lang/String;Llh/i;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lch/d;

    .line 11
    .line 12
    sget-object v3, Lch/d;->f:Llh/i;

    .line 13
    .line 14
    const-string v4, "GET"

    .line 15
    .line 16
    invoke-direct {v1, v4, v3}, Lch/d;-><init>(Ljava/lang/String;Llh/i;)V

    .line 17
    .line 18
    .line 19
    new-instance v4, Lch/d;

    .line 20
    .line 21
    const-string v5, "POST"

    .line 22
    .line 23
    invoke-direct {v4, v5, v3}, Lch/d;-><init>(Ljava/lang/String;Llh/i;)V

    .line 24
    .line 25
    .line 26
    new-instance v3, Lch/d;

    .line 27
    .line 28
    sget-object v5, Lch/d;->g:Llh/i;

    .line 29
    .line 30
    const-string v6, "/"

    .line 31
    .line 32
    invoke-direct {v3, v6, v5}, Lch/d;-><init>(Ljava/lang/String;Llh/i;)V

    .line 33
    .line 34
    .line 35
    new-instance v6, Lch/d;

    .line 36
    .line 37
    const-string v7, "/index.html"

    .line 38
    .line 39
    invoke-direct {v6, v7, v5}, Lch/d;-><init>(Ljava/lang/String;Llh/i;)V

    .line 40
    .line 41
    .line 42
    new-instance v5, Lch/d;

    .line 43
    .line 44
    sget-object v7, Lch/d;->h:Llh/i;

    .line 45
    .line 46
    const-string v8, "http"

    .line 47
    .line 48
    invoke-direct {v5, v8, v7}, Lch/d;-><init>(Ljava/lang/String;Llh/i;)V

    .line 49
    .line 50
    .line 51
    new-instance v8, Lch/d;

    .line 52
    .line 53
    const-string v9, "https"

    .line 54
    .line 55
    invoke-direct {v8, v9, v7}, Lch/d;-><init>(Ljava/lang/String;Llh/i;)V

    .line 56
    .line 57
    .line 58
    new-instance v7, Lch/d;

    .line 59
    .line 60
    sget-object v9, Lch/d;->e:Llh/i;

    .line 61
    .line 62
    const-string v10, "200"

    .line 63
    .line 64
    invoke-direct {v7, v10, v9}, Lch/d;-><init>(Ljava/lang/String;Llh/i;)V

    .line 65
    .line 66
    .line 67
    new-instance v10, Lch/d;

    .line 68
    .line 69
    const-string v11, "204"

    .line 70
    .line 71
    invoke-direct {v10, v11, v9}, Lch/d;-><init>(Ljava/lang/String;Llh/i;)V

    .line 72
    .line 73
    .line 74
    new-instance v11, Lch/d;

    .line 75
    .line 76
    const-string v12, "206"

    .line 77
    .line 78
    invoke-direct {v11, v12, v9}, Lch/d;-><init>(Ljava/lang/String;Llh/i;)V

    .line 79
    .line 80
    .line 81
    new-instance v12, Lch/d;

    .line 82
    .line 83
    const-string v13, "304"

    .line 84
    .line 85
    invoke-direct {v12, v13, v9}, Lch/d;-><init>(Ljava/lang/String;Llh/i;)V

    .line 86
    .line 87
    .line 88
    new-instance v13, Lch/d;

    .line 89
    .line 90
    const-string v14, "400"

    .line 91
    .line 92
    invoke-direct {v13, v14, v9}, Lch/d;-><init>(Ljava/lang/String;Llh/i;)V

    .line 93
    .line 94
    .line 95
    new-instance v14, Lch/d;

    .line 96
    .line 97
    const-string v15, "404"

    .line 98
    .line 99
    invoke-direct {v14, v15, v9}, Lch/d;-><init>(Ljava/lang/String;Llh/i;)V

    .line 100
    .line 101
    .line 102
    new-instance v15, Lch/d;

    .line 103
    .line 104
    move-object/from16 v16, v0

    .line 105
    .line 106
    const-string v0, "500"

    .line 107
    .line 108
    invoke-direct {v15, v0, v9}, Lch/d;-><init>(Ljava/lang/String;Llh/i;)V

    .line 109
    .line 110
    .line 111
    new-instance v0, Lch/d;

    .line 112
    .line 113
    const-string v9, "accept-charset"

    .line 114
    .line 115
    invoke-direct {v0, v9, v2}, Lch/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    new-instance v9, Lch/d;

    .line 119
    .line 120
    move-object/from16 v17, v0

    .line 121
    .line 122
    const-string v0, "accept-encoding"

    .line 123
    .line 124
    move-object/from16 v18, v1

    .line 125
    .line 126
    const-string v1, "gzip, deflate"

    .line 127
    .line 128
    invoke-direct {v9, v0, v1}, Lch/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    new-instance v0, Lch/d;

    .line 132
    .line 133
    const-string v1, "accept-language"

    .line 134
    .line 135
    invoke-direct {v0, v1, v2}, Lch/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    new-instance v1, Lch/d;

    .line 139
    .line 140
    move-object/from16 v19, v0

    .line 141
    .line 142
    const-string v0, "accept-ranges"

    .line 143
    .line 144
    invoke-direct {v1, v0, v2}, Lch/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    new-instance v0, Lch/d;

    .line 148
    .line 149
    move-object/from16 v20, v1

    .line 150
    .line 151
    const-string v1, "accept"

    .line 152
    .line 153
    invoke-direct {v0, v1, v2}, Lch/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    new-instance v1, Lch/d;

    .line 157
    .line 158
    move-object/from16 v21, v0

    .line 159
    .line 160
    const-string v0, "access-control-allow-origin"

    .line 161
    .line 162
    invoke-direct {v1, v0, v2}, Lch/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    new-instance v0, Lch/d;

    .line 166
    .line 167
    move-object/from16 v22, v1

    .line 168
    .line 169
    const-string v1, "age"

    .line 170
    .line 171
    invoke-direct {v0, v1, v2}, Lch/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    new-instance v1, Lch/d;

    .line 175
    .line 176
    move-object/from16 v23, v0

    .line 177
    .line 178
    const-string v0, "allow"

    .line 179
    .line 180
    invoke-direct {v1, v0, v2}, Lch/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    new-instance v0, Lch/d;

    .line 184
    .line 185
    move-object/from16 v24, v1

    .line 186
    .line 187
    const-string v1, "authorization"

    .line 188
    .line 189
    invoke-direct {v0, v1, v2}, Lch/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    new-instance v1, Lch/d;

    .line 193
    .line 194
    move-object/from16 v25, v0

    .line 195
    .line 196
    const-string v0, "cache-control"

    .line 197
    .line 198
    invoke-direct {v1, v0, v2}, Lch/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    new-instance v0, Lch/d;

    .line 202
    .line 203
    move-object/from16 v26, v1

    .line 204
    .line 205
    const-string v1, "content-disposition"

    .line 206
    .line 207
    invoke-direct {v0, v1, v2}, Lch/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    new-instance v1, Lch/d;

    .line 211
    .line 212
    move-object/from16 v27, v0

    .line 213
    .line 214
    const-string v0, "content-encoding"

    .line 215
    .line 216
    invoke-direct {v1, v0, v2}, Lch/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    new-instance v0, Lch/d;

    .line 220
    .line 221
    move-object/from16 v28, v1

    .line 222
    .line 223
    const-string v1, "content-language"

    .line 224
    .line 225
    invoke-direct {v0, v1, v2}, Lch/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    new-instance v1, Lch/d;

    .line 229
    .line 230
    move-object/from16 v29, v0

    .line 231
    .line 232
    const-string v0, "content-length"

    .line 233
    .line 234
    invoke-direct {v1, v0, v2}, Lch/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    new-instance v0, Lch/d;

    .line 238
    .line 239
    move-object/from16 v30, v1

    .line 240
    .line 241
    const-string v1, "content-location"

    .line 242
    .line 243
    invoke-direct {v0, v1, v2}, Lch/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    new-instance v1, Lch/d;

    .line 247
    .line 248
    move-object/from16 v31, v0

    .line 249
    .line 250
    const-string v0, "content-range"

    .line 251
    .line 252
    invoke-direct {v1, v0, v2}, Lch/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    new-instance v0, Lch/d;

    .line 256
    .line 257
    move-object/from16 v32, v1

    .line 258
    .line 259
    const-string v1, "content-type"

    .line 260
    .line 261
    invoke-direct {v0, v1, v2}, Lch/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    new-instance v1, Lch/d;

    .line 265
    .line 266
    move-object/from16 v33, v0

    .line 267
    .line 268
    const-string v0, "cookie"

    .line 269
    .line 270
    invoke-direct {v1, v0, v2}, Lch/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    new-instance v0, Lch/d;

    .line 274
    .line 275
    move-object/from16 v34, v1

    .line 276
    .line 277
    const-string v1, "date"

    .line 278
    .line 279
    invoke-direct {v0, v1, v2}, Lch/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    new-instance v1, Lch/d;

    .line 283
    .line 284
    move-object/from16 v35, v0

    .line 285
    .line 286
    const-string v0, "etag"

    .line 287
    .line 288
    invoke-direct {v1, v0, v2}, Lch/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    new-instance v0, Lch/d;

    .line 292
    .line 293
    move-object/from16 v36, v1

    .line 294
    .line 295
    const-string v1, "expect"

    .line 296
    .line 297
    invoke-direct {v0, v1, v2}, Lch/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    new-instance v1, Lch/d;

    .line 301
    .line 302
    move-object/from16 v37, v0

    .line 303
    .line 304
    const-string v0, "expires"

    .line 305
    .line 306
    invoke-direct {v1, v0, v2}, Lch/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    new-instance v0, Lch/d;

    .line 310
    .line 311
    move-object/from16 v38, v1

    .line 312
    .line 313
    const-string v1, "from"

    .line 314
    .line 315
    invoke-direct {v0, v1, v2}, Lch/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    new-instance v1, Lch/d;

    .line 319
    .line 320
    move-object/from16 v39, v0

    .line 321
    .line 322
    const-string v0, "host"

    .line 323
    .line 324
    invoke-direct {v1, v0, v2}, Lch/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    new-instance v0, Lch/d;

    .line 328
    .line 329
    move-object/from16 v40, v1

    .line 330
    .line 331
    const-string v1, "if-match"

    .line 332
    .line 333
    invoke-direct {v0, v1, v2}, Lch/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    new-instance v1, Lch/d;

    .line 337
    .line 338
    move-object/from16 v41, v0

    .line 339
    .line 340
    const-string v0, "if-modified-since"

    .line 341
    .line 342
    invoke-direct {v1, v0, v2}, Lch/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    new-instance v0, Lch/d;

    .line 346
    .line 347
    move-object/from16 v42, v1

    .line 348
    .line 349
    const-string v1, "if-none-match"

    .line 350
    .line 351
    invoke-direct {v0, v1, v2}, Lch/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    new-instance v1, Lch/d;

    .line 355
    .line 356
    move-object/from16 v43, v0

    .line 357
    .line 358
    const-string v0, "if-range"

    .line 359
    .line 360
    invoke-direct {v1, v0, v2}, Lch/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 361
    .line 362
    .line 363
    new-instance v0, Lch/d;

    .line 364
    .line 365
    move-object/from16 v44, v1

    .line 366
    .line 367
    const-string v1, "if-unmodified-since"

    .line 368
    .line 369
    invoke-direct {v0, v1, v2}, Lch/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    new-instance v1, Lch/d;

    .line 373
    .line 374
    move-object/from16 v45, v0

    .line 375
    .line 376
    const-string v0, "last-modified"

    .line 377
    .line 378
    invoke-direct {v1, v0, v2}, Lch/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    new-instance v0, Lch/d;

    .line 382
    .line 383
    move-object/from16 v46, v1

    .line 384
    .line 385
    const-string v1, "link"

    .line 386
    .line 387
    invoke-direct {v0, v1, v2}, Lch/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 388
    .line 389
    .line 390
    new-instance v1, Lch/d;

    .line 391
    .line 392
    move-object/from16 v47, v0

    .line 393
    .line 394
    const-string v0, "location"

    .line 395
    .line 396
    invoke-direct {v1, v0, v2}, Lch/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 397
    .line 398
    .line 399
    new-instance v0, Lch/d;

    .line 400
    .line 401
    move-object/from16 v48, v1

    .line 402
    .line 403
    const-string v1, "max-forwards"

    .line 404
    .line 405
    invoke-direct {v0, v1, v2}, Lch/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    new-instance v1, Lch/d;

    .line 409
    .line 410
    move-object/from16 v49, v0

    .line 411
    .line 412
    const-string v0, "proxy-authenticate"

    .line 413
    .line 414
    invoke-direct {v1, v0, v2}, Lch/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 415
    .line 416
    .line 417
    new-instance v0, Lch/d;

    .line 418
    .line 419
    move-object/from16 v50, v1

    .line 420
    .line 421
    const-string v1, "proxy-authorization"

    .line 422
    .line 423
    invoke-direct {v0, v1, v2}, Lch/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 424
    .line 425
    .line 426
    new-instance v1, Lch/d;

    .line 427
    .line 428
    move-object/from16 v51, v0

    .line 429
    .line 430
    const-string v0, "range"

    .line 431
    .line 432
    invoke-direct {v1, v0, v2}, Lch/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 433
    .line 434
    .line 435
    new-instance v0, Lch/d;

    .line 436
    .line 437
    move-object/from16 v52, v1

    .line 438
    .line 439
    const-string v1, "referer"

    .line 440
    .line 441
    invoke-direct {v0, v1, v2}, Lch/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 442
    .line 443
    .line 444
    new-instance v1, Lch/d;

    .line 445
    .line 446
    move-object/from16 v53, v0

    .line 447
    .line 448
    const-string v0, "refresh"

    .line 449
    .line 450
    invoke-direct {v1, v0, v2}, Lch/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 451
    .line 452
    .line 453
    new-instance v0, Lch/d;

    .line 454
    .line 455
    move-object/from16 v54, v1

    .line 456
    .line 457
    const-string v1, "retry-after"

    .line 458
    .line 459
    invoke-direct {v0, v1, v2}, Lch/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 460
    .line 461
    .line 462
    new-instance v1, Lch/d;

    .line 463
    .line 464
    move-object/from16 v55, v0

    .line 465
    .line 466
    const-string v0, "server"

    .line 467
    .line 468
    invoke-direct {v1, v0, v2}, Lch/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 469
    .line 470
    .line 471
    new-instance v0, Lch/d;

    .line 472
    .line 473
    move-object/from16 v56, v1

    .line 474
    .line 475
    const-string v1, "set-cookie"

    .line 476
    .line 477
    invoke-direct {v0, v1, v2}, Lch/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 478
    .line 479
    .line 480
    new-instance v1, Lch/d;

    .line 481
    .line 482
    move-object/from16 v57, v0

    .line 483
    .line 484
    const-string v0, "strict-transport-security"

    .line 485
    .line 486
    invoke-direct {v1, v0, v2}, Lch/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 487
    .line 488
    .line 489
    new-instance v0, Lch/d;

    .line 490
    .line 491
    move-object/from16 v58, v1

    .line 492
    .line 493
    const-string v1, "transfer-encoding"

    .line 494
    .line 495
    invoke-direct {v0, v1, v2}, Lch/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 496
    .line 497
    .line 498
    new-instance v1, Lch/d;

    .line 499
    .line 500
    move-object/from16 v59, v0

    .line 501
    .line 502
    const-string v0, "user-agent"

    .line 503
    .line 504
    invoke-direct {v1, v0, v2}, Lch/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 505
    .line 506
    .line 507
    new-instance v0, Lch/d;

    .line 508
    .line 509
    move-object/from16 v60, v1

    .line 510
    .line 511
    const-string v1, "vary"

    .line 512
    .line 513
    invoke-direct {v0, v1, v2}, Lch/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 514
    .line 515
    .line 516
    new-instance v1, Lch/d;

    .line 517
    .line 518
    move-object/from16 v61, v0

    .line 519
    .line 520
    const-string v0, "via"

    .line 521
    .line 522
    invoke-direct {v1, v0, v2}, Lch/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 523
    .line 524
    .line 525
    new-instance v0, Lch/d;

    .line 526
    .line 527
    move-object/from16 v62, v1

    .line 528
    .line 529
    const-string v1, "www-authenticate"

    .line 530
    .line 531
    invoke-direct {v0, v1, v2}, Lch/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 532
    .line 533
    .line 534
    const/16 v1, 0x3d

    .line 535
    .line 536
    new-array v2, v1, [Lch/d;

    .line 537
    .line 538
    const/16 v63, 0x0

    .line 539
    .line 540
    aput-object v16, v2, v63

    .line 541
    .line 542
    const/16 v16, 0x1

    .line 543
    .line 544
    aput-object v18, v2, v16

    .line 545
    .line 546
    const/16 v16, 0x2

    .line 547
    .line 548
    aput-object v4, v2, v16

    .line 549
    .line 550
    const/4 v4, 0x3

    .line 551
    aput-object v3, v2, v4

    .line 552
    .line 553
    const/4 v3, 0x4

    .line 554
    aput-object v6, v2, v3

    .line 555
    .line 556
    const/4 v3, 0x5

    .line 557
    aput-object v5, v2, v3

    .line 558
    .line 559
    const/4 v3, 0x6

    .line 560
    aput-object v8, v2, v3

    .line 561
    .line 562
    const/4 v3, 0x7

    .line 563
    aput-object v7, v2, v3

    .line 564
    .line 565
    const/16 v3, 0x8

    .line 566
    .line 567
    aput-object v10, v2, v3

    .line 568
    .line 569
    const/16 v3, 0x9

    .line 570
    .line 571
    aput-object v11, v2, v3

    .line 572
    .line 573
    const/16 v3, 0xa

    .line 574
    .line 575
    aput-object v12, v2, v3

    .line 576
    .line 577
    const/16 v3, 0xb

    .line 578
    .line 579
    aput-object v13, v2, v3

    .line 580
    .line 581
    const/16 v3, 0xc

    .line 582
    .line 583
    aput-object v14, v2, v3

    .line 584
    .line 585
    const/16 v3, 0xd

    .line 586
    .line 587
    aput-object v15, v2, v3

    .line 588
    .line 589
    const/16 v3, 0xe

    .line 590
    .line 591
    aput-object v17, v2, v3

    .line 592
    .line 593
    const/16 v3, 0xf

    .line 594
    .line 595
    aput-object v9, v2, v3

    .line 596
    .line 597
    const/16 v3, 0x10

    .line 598
    .line 599
    aput-object v19, v2, v3

    .line 600
    .line 601
    const/16 v3, 0x11

    .line 602
    .line 603
    aput-object v20, v2, v3

    .line 604
    .line 605
    const/16 v3, 0x12

    .line 606
    .line 607
    aput-object v21, v2, v3

    .line 608
    .line 609
    const/16 v3, 0x13

    .line 610
    .line 611
    aput-object v22, v2, v3

    .line 612
    .line 613
    const/16 v3, 0x14

    .line 614
    .line 615
    aput-object v23, v2, v3

    .line 616
    .line 617
    const/16 v3, 0x15

    .line 618
    .line 619
    aput-object v24, v2, v3

    .line 620
    .line 621
    const/16 v3, 0x16

    .line 622
    .line 623
    aput-object v25, v2, v3

    .line 624
    .line 625
    const/16 v3, 0x17

    .line 626
    .line 627
    aput-object v26, v2, v3

    .line 628
    .line 629
    const/16 v3, 0x18

    .line 630
    .line 631
    aput-object v27, v2, v3

    .line 632
    .line 633
    const/16 v3, 0x19

    .line 634
    .line 635
    aput-object v28, v2, v3

    .line 636
    .line 637
    const/16 v3, 0x1a

    .line 638
    .line 639
    aput-object v29, v2, v3

    .line 640
    .line 641
    const/16 v3, 0x1b

    .line 642
    .line 643
    aput-object v30, v2, v3

    .line 644
    .line 645
    const/16 v3, 0x1c

    .line 646
    .line 647
    aput-object v31, v2, v3

    .line 648
    .line 649
    const/16 v3, 0x1d

    .line 650
    .line 651
    aput-object v32, v2, v3

    .line 652
    .line 653
    const/16 v3, 0x1e

    .line 654
    .line 655
    aput-object v33, v2, v3

    .line 656
    .line 657
    const/16 v3, 0x1f

    .line 658
    .line 659
    aput-object v34, v2, v3

    .line 660
    .line 661
    const/16 v3, 0x20

    .line 662
    .line 663
    aput-object v35, v2, v3

    .line 664
    .line 665
    const/16 v3, 0x21

    .line 666
    .line 667
    aput-object v36, v2, v3

    .line 668
    .line 669
    const/16 v3, 0x22

    .line 670
    .line 671
    aput-object v37, v2, v3

    .line 672
    .line 673
    const/16 v3, 0x23

    .line 674
    .line 675
    aput-object v38, v2, v3

    .line 676
    .line 677
    const/16 v3, 0x24

    .line 678
    .line 679
    aput-object v39, v2, v3

    .line 680
    .line 681
    const/16 v3, 0x25

    .line 682
    .line 683
    aput-object v40, v2, v3

    .line 684
    .line 685
    const/16 v3, 0x26

    .line 686
    .line 687
    aput-object v41, v2, v3

    .line 688
    .line 689
    const/16 v3, 0x27

    .line 690
    .line 691
    aput-object v42, v2, v3

    .line 692
    .line 693
    const/16 v3, 0x28

    .line 694
    .line 695
    aput-object v43, v2, v3

    .line 696
    .line 697
    const/16 v3, 0x29

    .line 698
    .line 699
    aput-object v44, v2, v3

    .line 700
    .line 701
    const/16 v3, 0x2a

    .line 702
    .line 703
    aput-object v45, v2, v3

    .line 704
    .line 705
    const/16 v3, 0x2b

    .line 706
    .line 707
    aput-object v46, v2, v3

    .line 708
    .line 709
    const/16 v3, 0x2c

    .line 710
    .line 711
    aput-object v47, v2, v3

    .line 712
    .line 713
    const/16 v3, 0x2d

    .line 714
    .line 715
    aput-object v48, v2, v3

    .line 716
    .line 717
    const/16 v3, 0x2e

    .line 718
    .line 719
    aput-object v49, v2, v3

    .line 720
    .line 721
    const/16 v3, 0x2f

    .line 722
    .line 723
    aput-object v50, v2, v3

    .line 724
    .line 725
    const/16 v3, 0x30

    .line 726
    .line 727
    aput-object v51, v2, v3

    .line 728
    .line 729
    const/16 v3, 0x31

    .line 730
    .line 731
    aput-object v52, v2, v3

    .line 732
    .line 733
    const/16 v3, 0x32

    .line 734
    .line 735
    aput-object v53, v2, v3

    .line 736
    .line 737
    const/16 v3, 0x33

    .line 738
    .line 739
    aput-object v54, v2, v3

    .line 740
    .line 741
    const/16 v3, 0x34

    .line 742
    .line 743
    aput-object v55, v2, v3

    .line 744
    .line 745
    const/16 v3, 0x35

    .line 746
    .line 747
    aput-object v56, v2, v3

    .line 748
    .line 749
    const/16 v3, 0x36

    .line 750
    .line 751
    aput-object v57, v2, v3

    .line 752
    .line 753
    const/16 v3, 0x37

    .line 754
    .line 755
    aput-object v58, v2, v3

    .line 756
    .line 757
    const/16 v3, 0x38

    .line 758
    .line 759
    aput-object v59, v2, v3

    .line 760
    .line 761
    const/16 v3, 0x39

    .line 762
    .line 763
    aput-object v60, v2, v3

    .line 764
    .line 765
    const/16 v3, 0x3a

    .line 766
    .line 767
    aput-object v61, v2, v3

    .line 768
    .line 769
    const/16 v3, 0x3b

    .line 770
    .line 771
    aput-object v62, v2, v3

    .line 772
    .line 773
    const/16 v3, 0x3c

    .line 774
    .line 775
    aput-object v0, v2, v3

    .line 776
    .line 777
    sput-object v2, Lch/g;->a:[Lch/d;

    .line 778
    .line 779
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 780
    .line 781
    const/high16 v3, 0x3f800000    # 1.0f

    .line 782
    .line 783
    invoke-direct {v0, v1, v3}, Ljava/util/LinkedHashMap;-><init>(IF)V

    .line 784
    .line 785
    .line 786
    const/4 v3, 0x0

    .line 787
    :goto_0
    if-ge v3, v1, :cond_1

    .line 788
    .line 789
    aget-object v4, v2, v3

    .line 790
    .line 791
    iget-object v4, v4, Lch/d;->a:Llh/i;

    .line 792
    .line 793
    invoke-virtual {v0, v4}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    .line 794
    .line 795
    .line 796
    move-result v4

    .line 797
    if-nez v4, :cond_0

    .line 798
    .line 799
    aget-object v4, v2, v3

    .line 800
    .line 801
    iget-object v4, v4, Lch/d;->a:Llh/i;

    .line 802
    .line 803
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 804
    .line 805
    .line 806
    move-result-object v5

    .line 807
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 808
    .line 809
    .line 810
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 811
    .line 812
    goto :goto_0

    .line 813
    :cond_1
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 814
    .line 815
    .line 816
    move-result-object v0

    .line 817
    const-string v1, "unmodifiableMap(...)"

    .line 818
    .line 819
    invoke-static {v0, v1}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 820
    .line 821
    .line 822
    sput-object v0, Lch/g;->b:Ljava/util/Map;

    .line 823
    .line 824
    return-void
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
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
.end method

.method public static a(Llh/i;)V
    .locals 4

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p0, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Llh/i;->d()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    if-ge v1, v0, :cond_2

    .line 12
    .line 13
    invoke-virtual {p0, v1}, Llh/i;->i(I)B

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/16 v3, 0x41

    .line 18
    .line 19
    if-gt v3, v2, :cond_1

    .line 20
    .line 21
    const/16 v3, 0x5b

    .line 22
    .line 23
    if-lt v2, v3, :cond_0

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    new-instance v0, Ljava/io/IOException;

    .line 27
    .line 28
    invoke-virtual {p0}, Llh/i;->s()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    const-string v1, "PROTOCOL_ERROR response malformed: mixed case name: "

    .line 33
    .line 34
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw v0

    .line 42
    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    return-void
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
