.class public final Le4/g;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final A:[B

.field public static final B:[Ljava/lang/String;

.field public static final C:[I

.field public static final D:[B

.field public static final E:Le4/d;

.field public static final F:[[Le4/d;

.field public static final G:[Le4/d;

.field public static final H:[Ljava/util/HashMap;

.field public static final I:[Ljava/util/HashMap;

.field public static final J:Ljava/util/HashSet;

.field public static final K:Ljava/util/HashMap;

.field public static final L:Ljava/nio/charset/Charset;

.field public static final M:[B

.field public static final N:[B

.field public static final l:Z

.field public static final m:[I

.field public static final n:[I

.field public static final o:[B

.field public static final p:[B

.field public static final q:[B

.field public static final r:[B

.field public static final s:[B

.field public static final t:[B

.field public static final u:[B

.field public static final v:[B

.field public static final w:[B

.field public static final x:[B

.field public static final y:[B

.field public static final z:[B


# instance fields
.field public final a:Ljava/io/FileDescriptor;

.field public final b:Landroid/content/res/AssetManager$AssetInputStream;

.field public c:I

.field public final d:[Ljava/util/HashMap;

.field public final e:Ljava/util/HashSet;

.field public f:Ljava/nio/ByteOrder;

.field public g:Z

.field public h:I

.field public i:I

.field public j:I

.field public k:I


# direct methods
.method static constructor <clinit>()V
    .locals 125

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    const-string v2, "ExifInterface"

    .line 7
    .line 8
    invoke-static {v2, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    sput-boolean v2, Le4/g;->l:Z

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    const/4 v4, 0x6

    .line 20
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    const/16 v6, 0x8

    .line 25
    .line 26
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object v7

    .line 30
    const/4 v8, 0x4

    .line 31
    new-array v9, v8, [Ljava/lang/Integer;

    .line 32
    .line 33
    const/4 v10, 0x0

    .line 34
    aput-object v3, v9, v10

    .line 35
    .line 36
    aput-object v5, v9, v2

    .line 37
    .line 38
    const/4 v5, 0x2

    .line 39
    aput-object v1, v9, v5

    .line 40
    .line 41
    aput-object v7, v9, v0

    .line 42
    .line 43
    invoke-static {v9}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 44
    .line 45
    .line 46
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object v9

    .line 50
    const/4 v11, 0x7

    .line 51
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v12

    .line 55
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object v13

    .line 59
    const/4 v14, 0x5

    .line 60
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object v15

    .line 64
    const/16 v16, 0x0

    .line 65
    .line 66
    new-array v10, v8, [Ljava/lang/Integer;

    .line 67
    .line 68
    aput-object v9, v10, v16

    .line 69
    .line 70
    aput-object v12, v10, v2

    .line 71
    .line 72
    aput-object v13, v10, v5

    .line 73
    .line 74
    aput-object v15, v10, v0

    .line 75
    .line 76
    invoke-static {v10}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 77
    .line 78
    .line 79
    filled-new-array {v6, v6, v6}, [I

    .line 80
    .line 81
    .line 82
    move-result-object v10

    .line 83
    sput-object v10, Le4/g;->m:[I

    .line 84
    .line 85
    filled-new-array {v6}, [I

    .line 86
    .line 87
    .line 88
    move-result-object v10

    .line 89
    sput-object v10, Le4/g;->n:[I

    .line 90
    .line 91
    new-array v10, v0, [B

    .line 92
    .line 93
    fill-array-data v10, :array_0

    .line 94
    .line 95
    .line 96
    sput-object v10, Le4/g;->o:[B

    .line 97
    .line 98
    new-array v10, v8, [B

    .line 99
    .line 100
    fill-array-data v10, :array_1

    .line 101
    .line 102
    .line 103
    sput-object v10, Le4/g;->p:[B

    .line 104
    .line 105
    new-array v10, v8, [B

    .line 106
    .line 107
    fill-array-data v10, :array_2

    .line 108
    .line 109
    .line 110
    sput-object v10, Le4/g;->q:[B

    .line 111
    .line 112
    new-array v10, v8, [B

    .line 113
    .line 114
    fill-array-data v10, :array_3

    .line 115
    .line 116
    .line 117
    sput-object v10, Le4/g;->r:[B

    .line 118
    .line 119
    new-array v10, v4, [B

    .line 120
    .line 121
    fill-array-data v10, :array_4

    .line 122
    .line 123
    .line 124
    sput-object v10, Le4/g;->s:[B

    .line 125
    .line 126
    const/16 v10, 0xa

    .line 127
    .line 128
    new-array v13, v10, [B

    .line 129
    .line 130
    fill-array-data v13, :array_5

    .line 131
    .line 132
    .line 133
    sput-object v13, Le4/g;->t:[B

    .line 134
    .line 135
    new-array v13, v6, [B

    .line 136
    .line 137
    fill-array-data v13, :array_6

    .line 138
    .line 139
    .line 140
    sput-object v13, Le4/g;->u:[B

    .line 141
    .line 142
    new-array v13, v8, [B

    .line 143
    .line 144
    fill-array-data v13, :array_7

    .line 145
    .line 146
    .line 147
    sput-object v13, Le4/g;->v:[B

    .line 148
    .line 149
    new-array v13, v8, [B

    .line 150
    .line 151
    fill-array-data v13, :array_8

    .line 152
    .line 153
    .line 154
    sput-object v13, Le4/g;->w:[B

    .line 155
    .line 156
    new-array v13, v8, [B

    .line 157
    .line 158
    fill-array-data v13, :array_9

    .line 159
    .line 160
    .line 161
    sput-object v13, Le4/g;->x:[B

    .line 162
    .line 163
    new-array v13, v8, [B

    .line 164
    .line 165
    fill-array-data v13, :array_a

    .line 166
    .line 167
    .line 168
    sput-object v13, Le4/g;->y:[B

    .line 169
    .line 170
    new-array v13, v8, [B

    .line 171
    .line 172
    fill-array-data v13, :array_b

    .line 173
    .line 174
    .line 175
    sput-object v13, Le4/g;->z:[B

    .line 176
    .line 177
    new-array v13, v8, [B

    .line 178
    .line 179
    fill-array-data v13, :array_c

    .line 180
    .line 181
    .line 182
    sput-object v13, Le4/g;->A:[B

    .line 183
    .line 184
    const-string v13, "VP8X"

    .line 185
    .line 186
    const/16 v17, 0xa

    .line 187
    .line 188
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    .line 189
    .line 190
    .line 191
    move-result-object v10

    .line 192
    invoke-virtual {v13, v10}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 193
    .line 194
    .line 195
    const-string v10, "VP8L"

    .line 196
    .line 197
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    .line 198
    .line 199
    .line 200
    move-result-object v13

    .line 201
    invoke-virtual {v10, v13}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 202
    .line 203
    .line 204
    const-string v10, "VP8 "

    .line 205
    .line 206
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    .line 207
    .line 208
    .line 209
    move-result-object v13

    .line 210
    invoke-virtual {v10, v13}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 211
    .line 212
    .line 213
    const-string v10, "ANIM"

    .line 214
    .line 215
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    .line 216
    .line 217
    .line 218
    move-result-object v13

    .line 219
    invoke-virtual {v10, v13}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 220
    .line 221
    .line 222
    const-string v10, "ANMF"

    .line 223
    .line 224
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    .line 225
    .line 226
    .line 227
    move-result-object v13

    .line 228
    invoke-virtual {v10, v13}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 229
    .line 230
    .line 231
    const-string v30, "DOUBLE"

    .line 232
    .line 233
    const-string v31, "IFD"

    .line 234
    .line 235
    const-string v18, ""

    .line 236
    .line 237
    const-string v19, "BYTE"

    .line 238
    .line 239
    const-string v20, "STRING"

    .line 240
    .line 241
    const-string v21, "USHORT"

    .line 242
    .line 243
    const-string v22, "ULONG"

    .line 244
    .line 245
    const-string v23, "URATIONAL"

    .line 246
    .line 247
    const-string v24, "SBYTE"

    .line 248
    .line 249
    const-string v25, "UNDEFINED"

    .line 250
    .line 251
    const-string v26, "SSHORT"

    .line 252
    .line 253
    const-string v27, "SLONG"

    .line 254
    .line 255
    const-string v28, "SRATIONAL"

    .line 256
    .line 257
    const-string v29, "SINGLE"

    .line 258
    .line 259
    filled-new-array/range {v18 .. v31}, [Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v10

    .line 263
    sput-object v10, Le4/g;->B:[Ljava/lang/String;

    .line 264
    .line 265
    const/16 v10, 0xe

    .line 266
    .line 267
    new-array v13, v10, [I

    .line 268
    .line 269
    fill-array-data v13, :array_d

    .line 270
    .line 271
    .line 272
    sput-object v13, Le4/g;->C:[I

    .line 273
    .line 274
    new-array v13, v6, [B

    .line 275
    .line 276
    fill-array-data v13, :array_e

    .line 277
    .line 278
    .line 279
    sput-object v13, Le4/g;->D:[B

    .line 280
    .line 281
    new-instance v13, Le4/d;

    .line 282
    .line 283
    const/16 v18, 0xe

    .line 284
    .line 285
    const/16 v10, 0xfe

    .line 286
    .line 287
    const/16 v19, 0x8

    .line 288
    .line 289
    const-string v6, "NewSubfileType"

    .line 290
    .line 291
    invoke-direct {v13, v10, v8, v6}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 292
    .line 293
    .line 294
    new-instance v10, Le4/d;

    .line 295
    .line 296
    const/16 v2, 0xff

    .line 297
    .line 298
    const-string v11, "SubfileType"

    .line 299
    .line 300
    invoke-direct {v10, v2, v8, v11}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 301
    .line 302
    .line 303
    new-instance v2, Le4/d;

    .line 304
    .line 305
    const/16 v4, 0x100

    .line 306
    .line 307
    const-string v14, "ImageWidth"

    .line 308
    .line 309
    invoke-direct {v2, v4, v0, v8, v14}, Le4/d;-><init>(IIILjava/lang/String;)V

    .line 310
    .line 311
    .line 312
    new-instance v14, Le4/d;

    .line 313
    .line 314
    const/16 v4, 0x101

    .line 315
    .line 316
    const-string v5, "ImageLength"

    .line 317
    .line 318
    invoke-direct {v14, v4, v0, v8, v5}, Le4/d;-><init>(IIILjava/lang/String;)V

    .line 319
    .line 320
    .line 321
    new-instance v5, Le4/d;

    .line 322
    .line 323
    const/16 v4, 0x102

    .line 324
    .line 325
    const-string v8, "BitsPerSample"

    .line 326
    .line 327
    invoke-direct {v5, v4, v0, v8}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 328
    .line 329
    .line 330
    new-instance v4, Le4/d;

    .line 331
    .line 332
    move-object/from16 v31, v2

    .line 333
    .line 334
    const/16 v2, 0x103

    .line 335
    .line 336
    move-object/from16 v32, v5

    .line 337
    .line 338
    const-string v5, "Compression"

    .line 339
    .line 340
    invoke-direct {v4, v2, v0, v5}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 341
    .line 342
    .line 343
    new-instance v2, Le4/d;

    .line 344
    .line 345
    move-object/from16 v34, v4

    .line 346
    .line 347
    const/16 v4, 0x106

    .line 348
    .line 349
    move-object/from16 v35, v10

    .line 350
    .line 351
    const-string v10, "PhotometricInterpretation"

    .line 352
    .line 353
    invoke-direct {v2, v4, v0, v10}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 354
    .line 355
    .line 356
    new-instance v4, Le4/d;

    .line 357
    .line 358
    const/16 v0, 0x10e

    .line 359
    .line 360
    move-object/from16 v38, v2

    .line 361
    .line 362
    const-string v2, "ImageDescription"

    .line 363
    .line 364
    move-object/from16 v39, v13

    .line 365
    .line 366
    const/4 v13, 0x2

    .line 367
    invoke-direct {v4, v0, v13, v2}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 368
    .line 369
    .line 370
    new-instance v0, Le4/d;

    .line 371
    .line 372
    move-object/from16 v41, v4

    .line 373
    .line 374
    const/16 v4, 0x10f

    .line 375
    .line 376
    move-object/from16 v42, v14

    .line 377
    .line 378
    const-string v14, "Make"

    .line 379
    .line 380
    invoke-direct {v0, v4, v13, v14}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 381
    .line 382
    .line 383
    new-instance v4, Le4/d;

    .line 384
    .line 385
    move-object/from16 v43, v0

    .line 386
    .line 387
    const-string v0, "Model"

    .line 388
    .line 389
    move-object/from16 v44, v7

    .line 390
    .line 391
    const/16 v7, 0x110

    .line 392
    .line 393
    invoke-direct {v4, v7, v13, v0}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 394
    .line 395
    .line 396
    new-instance v0, Le4/d;

    .line 397
    .line 398
    const/16 v7, 0x111

    .line 399
    .line 400
    const-string v13, "StripOffsets"

    .line 401
    .line 402
    move-object/from16 v45, v4

    .line 403
    .line 404
    move-object/from16 v46, v12

    .line 405
    .line 406
    const/4 v4, 0x3

    .line 407
    const/4 v12, 0x4

    .line 408
    invoke-direct {v0, v7, v4, v12, v13}, Le4/d;-><init>(IIILjava/lang/String;)V

    .line 409
    .line 410
    .line 411
    new-instance v12, Le4/d;

    .line 412
    .line 413
    const-string v7, "Orientation"

    .line 414
    .line 415
    move-object/from16 v47, v0

    .line 416
    .line 417
    const/16 v0, 0x112

    .line 418
    .line 419
    invoke-direct {v12, v0, v4, v7}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 420
    .line 421
    .line 422
    new-instance v0, Le4/d;

    .line 423
    .line 424
    const-string v7, "SamplesPerPixel"

    .line 425
    .line 426
    move-object/from16 v48, v12

    .line 427
    .line 428
    const/16 v12, 0x115

    .line 429
    .line 430
    invoke-direct {v0, v12, v4, v7}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 431
    .line 432
    .line 433
    new-instance v7, Le4/d;

    .line 434
    .line 435
    const-string v12, "RowsPerStrip"

    .line 436
    .line 437
    move-object/from16 v49, v0

    .line 438
    .line 439
    const/16 v0, 0x116

    .line 440
    .line 441
    move-object/from16 v50, v1

    .line 442
    .line 443
    const/4 v1, 0x4

    .line 444
    invoke-direct {v7, v0, v4, v1, v12}, Le4/d;-><init>(IIILjava/lang/String;)V

    .line 445
    .line 446
    .line 447
    new-instance v0, Le4/d;

    .line 448
    .line 449
    const-string v12, "StripByteCounts"

    .line 450
    .line 451
    move-object/from16 v51, v7

    .line 452
    .line 453
    const/16 v7, 0x117

    .line 454
    .line 455
    invoke-direct {v0, v7, v4, v1, v12}, Le4/d;-><init>(IIILjava/lang/String;)V

    .line 456
    .line 457
    .line 458
    new-instance v1, Le4/d;

    .line 459
    .line 460
    const-string v4, "XResolution"

    .line 461
    .line 462
    const/16 v7, 0x11a

    .line 463
    .line 464
    const/4 v12, 0x5

    .line 465
    invoke-direct {v1, v7, v12, v4}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 466
    .line 467
    .line 468
    new-instance v4, Le4/d;

    .line 469
    .line 470
    const-string v7, "YResolution"

    .line 471
    .line 472
    move-object/from16 v52, v0

    .line 473
    .line 474
    const/16 v0, 0x11b

    .line 475
    .line 476
    invoke-direct {v4, v0, v12, v7}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 477
    .line 478
    .line 479
    new-instance v0, Le4/d;

    .line 480
    .line 481
    const-string v7, "PlanarConfiguration"

    .line 482
    .line 483
    const/16 v12, 0x11c

    .line 484
    .line 485
    move-object/from16 v53, v1

    .line 486
    .line 487
    const/4 v1, 0x3

    .line 488
    invoke-direct {v0, v12, v1, v7}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 489
    .line 490
    .line 491
    new-instance v7, Le4/d;

    .line 492
    .line 493
    const-string v12, "ResolutionUnit"

    .line 494
    .line 495
    move-object/from16 v54, v0

    .line 496
    .line 497
    const/16 v0, 0x128

    .line 498
    .line 499
    invoke-direct {v7, v0, v1, v12}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 500
    .line 501
    .line 502
    new-instance v0, Le4/d;

    .line 503
    .line 504
    const-string v12, "TransferFunction"

    .line 505
    .line 506
    move-object/from16 v55, v4

    .line 507
    .line 508
    const/16 v4, 0x12d

    .line 509
    .line 510
    invoke-direct {v0, v4, v1, v12}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 511
    .line 512
    .line 513
    new-instance v1, Le4/d;

    .line 514
    .line 515
    const-string v4, "Software"

    .line 516
    .line 517
    const/16 v12, 0x131

    .line 518
    .line 519
    move-object/from16 v56, v0

    .line 520
    .line 521
    const/4 v0, 0x2

    .line 522
    invoke-direct {v1, v12, v0, v4}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 523
    .line 524
    .line 525
    new-instance v4, Le4/d;

    .line 526
    .line 527
    const-string v12, "DateTime"

    .line 528
    .line 529
    move-object/from16 v57, v1

    .line 530
    .line 531
    const/16 v1, 0x132

    .line 532
    .line 533
    invoke-direct {v4, v1, v0, v12}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 534
    .line 535
    .line 536
    new-instance v1, Le4/d;

    .line 537
    .line 538
    const-string v12, "Artist"

    .line 539
    .line 540
    move-object/from16 v58, v4

    .line 541
    .line 542
    const/16 v4, 0x13b

    .line 543
    .line 544
    invoke-direct {v1, v4, v0, v12}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 545
    .line 546
    .line 547
    new-instance v0, Le4/d;

    .line 548
    .line 549
    const-string v4, "WhitePoint"

    .line 550
    .line 551
    const/16 v12, 0x13e

    .line 552
    .line 553
    move-object/from16 v59, v1

    .line 554
    .line 555
    const/4 v1, 0x5

    .line 556
    invoke-direct {v0, v12, v1, v4}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 557
    .line 558
    .line 559
    new-instance v4, Le4/d;

    .line 560
    .line 561
    const-string v12, "PrimaryChromaticities"

    .line 562
    .line 563
    move-object/from16 v60, v0

    .line 564
    .line 565
    const/16 v0, 0x13f

    .line 566
    .line 567
    invoke-direct {v4, v0, v1, v12}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 568
    .line 569
    .line 570
    new-instance v0, Le4/d;

    .line 571
    .line 572
    const/16 v1, 0x14a

    .line 573
    .line 574
    const-string v12, "SubIFDPointer"

    .line 575
    .line 576
    move-object/from16 v61, v4

    .line 577
    .line 578
    const/4 v4, 0x4

    .line 579
    invoke-direct {v0, v1, v4, v12}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 580
    .line 581
    .line 582
    new-instance v1, Le4/d;

    .line 583
    .line 584
    move-object/from16 v62, v0

    .line 585
    .line 586
    const-string v0, "JPEGInterchangeFormat"

    .line 587
    .line 588
    move-object/from16 v63, v7

    .line 589
    .line 590
    const/16 v7, 0x201

    .line 591
    .line 592
    invoke-direct {v1, v7, v4, v0}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 593
    .line 594
    .line 595
    new-instance v0, Le4/d;

    .line 596
    .line 597
    const-string v7, "JPEGInterchangeFormatLength"

    .line 598
    .line 599
    move-object/from16 v64, v1

    .line 600
    .line 601
    const/16 v1, 0x202

    .line 602
    .line 603
    invoke-direct {v0, v1, v4, v7}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 604
    .line 605
    .line 606
    new-instance v1, Le4/d;

    .line 607
    .line 608
    const-string v4, "YCbCrCoefficients"

    .line 609
    .line 610
    const/16 v7, 0x211

    .line 611
    .line 612
    move-object/from16 v65, v0

    .line 613
    .line 614
    const/4 v0, 0x5

    .line 615
    invoke-direct {v1, v7, v0, v4}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 616
    .line 617
    .line 618
    new-instance v0, Le4/d;

    .line 619
    .line 620
    const-string v4, "YCbCrSubSampling"

    .line 621
    .line 622
    const/16 v7, 0x212

    .line 623
    .line 624
    move-object/from16 v66, v1

    .line 625
    .line 626
    const/4 v1, 0x3

    .line 627
    invoke-direct {v0, v7, v1, v4}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 628
    .line 629
    .line 630
    new-instance v4, Le4/d;

    .line 631
    .line 632
    const-string v7, "YCbCrPositioning"

    .line 633
    .line 634
    move-object/from16 v67, v0

    .line 635
    .line 636
    const/16 v0, 0x213

    .line 637
    .line 638
    invoke-direct {v4, v0, v1, v7}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 639
    .line 640
    .line 641
    new-instance v0, Le4/d;

    .line 642
    .line 643
    const-string v1, "ReferenceBlackWhite"

    .line 644
    .line 645
    const/16 v7, 0x214

    .line 646
    .line 647
    move-object/from16 v68, v4

    .line 648
    .line 649
    const/4 v4, 0x5

    .line 650
    invoke-direct {v0, v7, v4, v1}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 651
    .line 652
    .line 653
    new-instance v1, Le4/d;

    .line 654
    .line 655
    const-string v4, "Copyright"

    .line 656
    .line 657
    const v7, 0x8298

    .line 658
    .line 659
    .line 660
    move-object/from16 v69, v0

    .line 661
    .line 662
    const/4 v0, 0x2

    .line 663
    invoke-direct {v1, v7, v0, v4}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 664
    .line 665
    .line 666
    new-instance v0, Le4/d;

    .line 667
    .line 668
    const v4, 0x8769

    .line 669
    .line 670
    .line 671
    const-string v7, "ExifIFDPointer"

    .line 672
    .line 673
    move-object/from16 v70, v1

    .line 674
    .line 675
    const/4 v1, 0x4

    .line 676
    invoke-direct {v0, v4, v1, v7}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 677
    .line 678
    .line 679
    new-instance v4, Le4/d;

    .line 680
    .line 681
    move-object/from16 v71, v0

    .line 682
    .line 683
    const v0, 0x8825

    .line 684
    .line 685
    .line 686
    move-object/from16 v72, v9

    .line 687
    .line 688
    const-string v9, "GPSInfoIFDPointer"

    .line 689
    .line 690
    invoke-direct {v4, v0, v1, v9}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 691
    .line 692
    .line 693
    new-instance v0, Le4/d;

    .line 694
    .line 695
    move-object/from16 v73, v4

    .line 696
    .line 697
    const-string v4, "SensorTopBorder"

    .line 698
    .line 699
    invoke-direct {v0, v1, v1, v4}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 700
    .line 701
    .line 702
    new-instance v4, Le4/d;

    .line 703
    .line 704
    move-object/from16 v74, v0

    .line 705
    .line 706
    const-string v0, "SensorLeftBorder"

    .line 707
    .line 708
    move-object/from16 v75, v3

    .line 709
    .line 710
    const/4 v3, 0x5

    .line 711
    invoke-direct {v4, v3, v1, v0}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 712
    .line 713
    .line 714
    new-instance v0, Le4/d;

    .line 715
    .line 716
    const-string v3, "SensorBottomBorder"

    .line 717
    .line 718
    move-object/from16 v76, v4

    .line 719
    .line 720
    const/4 v4, 0x6

    .line 721
    invoke-direct {v0, v4, v1, v3}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 722
    .line 723
    .line 724
    new-instance v3, Le4/d;

    .line 725
    .line 726
    const-string v4, "SensorRightBorder"

    .line 727
    .line 728
    move-object/from16 v77, v0

    .line 729
    .line 730
    const/4 v0, 0x7

    .line 731
    invoke-direct {v3, v0, v1, v4}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 732
    .line 733
    .line 734
    new-instance v1, Le4/d;

    .line 735
    .line 736
    const/16 v4, 0x17

    .line 737
    .line 738
    const-string v0, "ISO"

    .line 739
    .line 740
    move-object/from16 v78, v3

    .line 741
    .line 742
    const/4 v3, 0x3

    .line 743
    invoke-direct {v1, v4, v3, v0}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 744
    .line 745
    .line 746
    new-instance v0, Le4/d;

    .line 747
    .line 748
    const-string v3, "JpgFromRaw"

    .line 749
    .line 750
    const/16 v79, 0x17

    .line 751
    .line 752
    const/16 v4, 0x2e

    .line 753
    .line 754
    move-object/from16 v80, v1

    .line 755
    .line 756
    const/4 v1, 0x7

    .line 757
    invoke-direct {v0, v4, v1, v3}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 758
    .line 759
    .line 760
    new-instance v1, Le4/d;

    .line 761
    .line 762
    const-string v3, "Xmp"

    .line 763
    .line 764
    const/16 v4, 0x2bc

    .line 765
    .line 766
    move-object/from16 v81, v0

    .line 767
    .line 768
    const/4 v0, 0x1

    .line 769
    invoke-direct {v1, v4, v0, v3}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 770
    .line 771
    .line 772
    const/16 v3, 0x2a

    .line 773
    .line 774
    new-array v3, v3, [Le4/d;

    .line 775
    .line 776
    aput-object v39, v3, v16

    .line 777
    .line 778
    aput-object v35, v3, v0

    .line 779
    .line 780
    const/16 v27, 0x2

    .line 781
    .line 782
    aput-object v31, v3, v27

    .line 783
    .line 784
    const/16 v37, 0x3

    .line 785
    .line 786
    aput-object v42, v3, v37

    .line 787
    .line 788
    const/16 v29, 0x4

    .line 789
    .line 790
    aput-object v32, v3, v29

    .line 791
    .line 792
    const/16 v25, 0x5

    .line 793
    .line 794
    aput-object v34, v3, v25

    .line 795
    .line 796
    const/16 v24, 0x6

    .line 797
    .line 798
    aput-object v38, v3, v24

    .line 799
    .line 800
    const/16 v22, 0x7

    .line 801
    .line 802
    aput-object v41, v3, v22

    .line 803
    .line 804
    aput-object v43, v3, v19

    .line 805
    .line 806
    const/16 v0, 0x9

    .line 807
    .line 808
    aput-object v45, v3, v0

    .line 809
    .line 810
    aput-object v47, v3, v17

    .line 811
    .line 812
    const/16 v4, 0xb

    .line 813
    .line 814
    aput-object v48, v3, v4

    .line 815
    .line 816
    const/16 v31, 0xb

    .line 817
    .line 818
    const/16 v4, 0xc

    .line 819
    .line 820
    aput-object v49, v3, v4

    .line 821
    .line 822
    const/16 v32, 0xc

    .line 823
    .line 824
    const/16 v4, 0xd

    .line 825
    .line 826
    aput-object v51, v3, v4

    .line 827
    .line 828
    aput-object v52, v3, v18

    .line 829
    .line 830
    const/16 v34, 0xd

    .line 831
    .line 832
    const/16 v4, 0xf

    .line 833
    .line 834
    aput-object v53, v3, v4

    .line 835
    .line 836
    const/16 v35, 0xf

    .line 837
    .line 838
    const/16 v4, 0x10

    .line 839
    .line 840
    aput-object v55, v3, v4

    .line 841
    .line 842
    const/16 v38, 0x10

    .line 843
    .line 844
    const/16 v4, 0x11

    .line 845
    .line 846
    aput-object v54, v3, v4

    .line 847
    .line 848
    const/16 v39, 0x11

    .line 849
    .line 850
    const/16 v4, 0x12

    .line 851
    .line 852
    aput-object v63, v3, v4

    .line 853
    .line 854
    const/16 v41, 0x13

    .line 855
    .line 856
    aput-object v56, v3, v41

    .line 857
    .line 858
    const/16 v41, 0x14

    .line 859
    .line 860
    aput-object v57, v3, v41

    .line 861
    .line 862
    const/16 v41, 0x15

    .line 863
    .line 864
    aput-object v58, v3, v41

    .line 865
    .line 866
    const/16 v41, 0x16

    .line 867
    .line 868
    aput-object v59, v3, v41

    .line 869
    .line 870
    aput-object v60, v3, v79

    .line 871
    .line 872
    const/16 v41, 0x18

    .line 873
    .line 874
    aput-object v61, v3, v41

    .line 875
    .line 876
    const/16 v41, 0x19

    .line 877
    .line 878
    aput-object v62, v3, v41

    .line 879
    .line 880
    const/16 v41, 0x12

    .line 881
    .line 882
    const/16 v4, 0x1a

    .line 883
    .line 884
    aput-object v64, v3, v4

    .line 885
    .line 886
    const/16 v42, 0x1b

    .line 887
    .line 888
    aput-object v65, v3, v42

    .line 889
    .line 890
    const/16 v42, 0x1c

    .line 891
    .line 892
    aput-object v66, v3, v42

    .line 893
    .line 894
    const/16 v42, 0x1d

    .line 895
    .line 896
    aput-object v67, v3, v42

    .line 897
    .line 898
    const/16 v42, 0x1e

    .line 899
    .line 900
    aput-object v68, v3, v42

    .line 901
    .line 902
    const/16 v42, 0x1f

    .line 903
    .line 904
    aput-object v69, v3, v42

    .line 905
    .line 906
    const/16 v42, 0x20

    .line 907
    .line 908
    aput-object v70, v3, v42

    .line 909
    .line 910
    const/16 v42, 0x21

    .line 911
    .line 912
    aput-object v71, v3, v42

    .line 913
    .line 914
    const/16 v42, 0x22

    .line 915
    .line 916
    aput-object v73, v3, v42

    .line 917
    .line 918
    const/16 v42, 0x23

    .line 919
    .line 920
    aput-object v74, v3, v42

    .line 921
    .line 922
    const/16 v42, 0x24

    .line 923
    .line 924
    aput-object v76, v3, v42

    .line 925
    .line 926
    const/16 v42, 0x25

    .line 927
    .line 928
    aput-object v77, v3, v42

    .line 929
    .line 930
    const/16 v42, 0x26

    .line 931
    .line 932
    aput-object v78, v3, v42

    .line 933
    .line 934
    const/16 v42, 0x27

    .line 935
    .line 936
    aput-object v80, v3, v42

    .line 937
    .line 938
    const/16 v42, 0x28

    .line 939
    .line 940
    aput-object v81, v3, v42

    .line 941
    .line 942
    const/16 v42, 0x29

    .line 943
    .line 944
    aput-object v1, v3, v42

    .line 945
    .line 946
    new-instance v1, Le4/d;

    .line 947
    .line 948
    const/16 v42, 0x1a

    .line 949
    .line 950
    const-string v4, "ExposureTime"

    .line 951
    .line 952
    const/16 v43, 0x9

    .line 953
    .line 954
    const v0, 0x829a

    .line 955
    .line 956
    .line 957
    move-object/from16 v45, v3

    .line 958
    .line 959
    const/4 v3, 0x5

    .line 960
    invoke-direct {v1, v0, v3, v4}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 961
    .line 962
    .line 963
    new-instance v0, Le4/d;

    .line 964
    .line 965
    const-string v4, "FNumber"

    .line 966
    .line 967
    move-object/from16 v47, v1

    .line 968
    .line 969
    const v1, 0x829d

    .line 970
    .line 971
    .line 972
    invoke-direct {v0, v1, v3, v4}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 973
    .line 974
    .line 975
    new-instance v1, Le4/d;

    .line 976
    .line 977
    const-string v3, "ExposureProgram"

    .line 978
    .line 979
    const v4, 0x8822

    .line 980
    .line 981
    .line 982
    move-object/from16 v48, v0

    .line 983
    .line 984
    const/4 v0, 0x3

    .line 985
    invoke-direct {v1, v4, v0, v3}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 986
    .line 987
    .line 988
    new-instance v3, Le4/d;

    .line 989
    .line 990
    const-string v4, "SpectralSensitivity"

    .line 991
    .line 992
    const v0, 0x8824

    .line 993
    .line 994
    .line 995
    move-object/from16 v49, v1

    .line 996
    .line 997
    const/4 v1, 0x2

    .line 998
    invoke-direct {v3, v0, v1, v4}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 999
    .line 1000
    .line 1001
    new-instance v0, Le4/d;

    .line 1002
    .line 1003
    const-string v1, "PhotographicSensitivity"

    .line 1004
    .line 1005
    const v4, 0x8827

    .line 1006
    .line 1007
    .line 1008
    move-object/from16 v51, v3

    .line 1009
    .line 1010
    const/4 v3, 0x3

    .line 1011
    invoke-direct {v0, v4, v3, v1}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1012
    .line 1013
    .line 1014
    new-instance v1, Le4/d;

    .line 1015
    .line 1016
    const-string v4, "OECF"

    .line 1017
    .line 1018
    const v3, 0x8828

    .line 1019
    .line 1020
    .line 1021
    move-object/from16 v52, v0

    .line 1022
    .line 1023
    const/4 v0, 0x7

    .line 1024
    invoke-direct {v1, v3, v0, v4}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1025
    .line 1026
    .line 1027
    new-instance v0, Le4/d;

    .line 1028
    .line 1029
    const-string v3, "SensitivityType"

    .line 1030
    .line 1031
    const v4, 0x8830

    .line 1032
    .line 1033
    .line 1034
    move-object/from16 v53, v1

    .line 1035
    .line 1036
    const/4 v1, 0x3

    .line 1037
    invoke-direct {v0, v4, v1, v3}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1038
    .line 1039
    .line 1040
    new-instance v1, Le4/d;

    .line 1041
    .line 1042
    const-string v3, "StandardOutputSensitivity"

    .line 1043
    .line 1044
    const v4, 0x8831

    .line 1045
    .line 1046
    .line 1047
    move-object/from16 v54, v0

    .line 1048
    .line 1049
    const/4 v0, 0x4

    .line 1050
    invoke-direct {v1, v4, v0, v3}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1051
    .line 1052
    .line 1053
    new-instance v3, Le4/d;

    .line 1054
    .line 1055
    const-string v4, "RecommendedExposureIndex"

    .line 1056
    .line 1057
    move-object/from16 v55, v1

    .line 1058
    .line 1059
    const v1, 0x8832

    .line 1060
    .line 1061
    .line 1062
    invoke-direct {v3, v1, v0, v4}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1063
    .line 1064
    .line 1065
    new-instance v1, Le4/d;

    .line 1066
    .line 1067
    const-string v4, "ISOSpeed"

    .line 1068
    .line 1069
    move-object/from16 v56, v3

    .line 1070
    .line 1071
    const v3, 0x8833

    .line 1072
    .line 1073
    .line 1074
    invoke-direct {v1, v3, v0, v4}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1075
    .line 1076
    .line 1077
    new-instance v3, Le4/d;

    .line 1078
    .line 1079
    const-string v4, "ISOSpeedLatitudeyyy"

    .line 1080
    .line 1081
    move-object/from16 v57, v1

    .line 1082
    .line 1083
    const v1, 0x8834

    .line 1084
    .line 1085
    .line 1086
    invoke-direct {v3, v1, v0, v4}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1087
    .line 1088
    .line 1089
    new-instance v1, Le4/d;

    .line 1090
    .line 1091
    const-string v4, "ISOSpeedLatitudezzz"

    .line 1092
    .line 1093
    move-object/from16 v58, v3

    .line 1094
    .line 1095
    const v3, 0x8835

    .line 1096
    .line 1097
    .line 1098
    invoke-direct {v1, v3, v0, v4}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1099
    .line 1100
    .line 1101
    new-instance v0, Le4/d;

    .line 1102
    .line 1103
    const-string v3, "ExifVersion"

    .line 1104
    .line 1105
    const v4, 0x9000

    .line 1106
    .line 1107
    .line 1108
    move-object/from16 v59, v1

    .line 1109
    .line 1110
    const/4 v1, 0x2

    .line 1111
    invoke-direct {v0, v4, v1, v3}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1112
    .line 1113
    .line 1114
    new-instance v3, Le4/d;

    .line 1115
    .line 1116
    const-string v4, "DateTimeOriginal"

    .line 1117
    .line 1118
    move-object/from16 v60, v0

    .line 1119
    .line 1120
    const v0, 0x9003

    .line 1121
    .line 1122
    .line 1123
    invoke-direct {v3, v0, v1, v4}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1124
    .line 1125
    .line 1126
    new-instance v0, Le4/d;

    .line 1127
    .line 1128
    const-string v4, "DateTimeDigitized"

    .line 1129
    .line 1130
    move-object/from16 v61, v3

    .line 1131
    .line 1132
    const v3, 0x9004

    .line 1133
    .line 1134
    .line 1135
    invoke-direct {v0, v3, v1, v4}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1136
    .line 1137
    .line 1138
    new-instance v3, Le4/d;

    .line 1139
    .line 1140
    const-string v4, "OffsetTime"

    .line 1141
    .line 1142
    move-object/from16 v62, v0

    .line 1143
    .line 1144
    const v0, 0x9010

    .line 1145
    .line 1146
    .line 1147
    invoke-direct {v3, v0, v1, v4}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1148
    .line 1149
    .line 1150
    new-instance v0, Le4/d;

    .line 1151
    .line 1152
    const-string v4, "OffsetTimeOriginal"

    .line 1153
    .line 1154
    move-object/from16 v63, v3

    .line 1155
    .line 1156
    const v3, 0x9011

    .line 1157
    .line 1158
    .line 1159
    invoke-direct {v0, v3, v1, v4}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1160
    .line 1161
    .line 1162
    new-instance v3, Le4/d;

    .line 1163
    .line 1164
    const-string v4, "OffsetTimeDigitized"

    .line 1165
    .line 1166
    move-object/from16 v64, v0

    .line 1167
    .line 1168
    const v0, 0x9012

    .line 1169
    .line 1170
    .line 1171
    invoke-direct {v3, v0, v1, v4}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1172
    .line 1173
    .line 1174
    new-instance v0, Le4/d;

    .line 1175
    .line 1176
    const-string v1, "ComponentsConfiguration"

    .line 1177
    .line 1178
    const v4, 0x9101

    .line 1179
    .line 1180
    .line 1181
    move-object/from16 v65, v3

    .line 1182
    .line 1183
    const/4 v3, 0x7

    .line 1184
    invoke-direct {v0, v4, v3, v1}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1185
    .line 1186
    .line 1187
    new-instance v1, Le4/d;

    .line 1188
    .line 1189
    const-string v3, "CompressedBitsPerPixel"

    .line 1190
    .line 1191
    const v4, 0x9102

    .line 1192
    .line 1193
    .line 1194
    move-object/from16 v66, v0

    .line 1195
    .line 1196
    const/4 v0, 0x5

    .line 1197
    invoke-direct {v1, v4, v0, v3}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1198
    .line 1199
    .line 1200
    new-instance v3, Le4/d;

    .line 1201
    .line 1202
    const-string v4, "ShutterSpeedValue"

    .line 1203
    .line 1204
    const v0, 0x9201

    .line 1205
    .line 1206
    .line 1207
    move-object/from16 v67, v1

    .line 1208
    .line 1209
    const/16 v1, 0xa

    .line 1210
    .line 1211
    invoke-direct {v3, v0, v1, v4}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1212
    .line 1213
    .line 1214
    new-instance v0, Le4/d;

    .line 1215
    .line 1216
    const-string v4, "ApertureValue"

    .line 1217
    .line 1218
    const v1, 0x9202

    .line 1219
    .line 1220
    .line 1221
    move-object/from16 v68, v3

    .line 1222
    .line 1223
    const/4 v3, 0x5

    .line 1224
    invoke-direct {v0, v1, v3, v4}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1225
    .line 1226
    .line 1227
    new-instance v1, Le4/d;

    .line 1228
    .line 1229
    const-string v3, "BrightnessValue"

    .line 1230
    .line 1231
    const v4, 0x9203

    .line 1232
    .line 1233
    .line 1234
    move-object/from16 v69, v0

    .line 1235
    .line 1236
    const/16 v0, 0xa

    .line 1237
    .line 1238
    invoke-direct {v1, v4, v0, v3}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1239
    .line 1240
    .line 1241
    new-instance v3, Le4/d;

    .line 1242
    .line 1243
    const-string v4, "ExposureBiasValue"

    .line 1244
    .line 1245
    move-object/from16 v70, v1

    .line 1246
    .line 1247
    const v1, 0x9204

    .line 1248
    .line 1249
    .line 1250
    invoke-direct {v3, v1, v0, v4}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1251
    .line 1252
    .line 1253
    new-instance v0, Le4/d;

    .line 1254
    .line 1255
    const-string v1, "MaxApertureValue"

    .line 1256
    .line 1257
    const v4, 0x9205

    .line 1258
    .line 1259
    .line 1260
    move-object/from16 v71, v3

    .line 1261
    .line 1262
    const/4 v3, 0x5

    .line 1263
    invoke-direct {v0, v4, v3, v1}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1264
    .line 1265
    .line 1266
    new-instance v1, Le4/d;

    .line 1267
    .line 1268
    const-string v4, "SubjectDistance"

    .line 1269
    .line 1270
    move-object/from16 v73, v0

    .line 1271
    .line 1272
    const v0, 0x9206

    .line 1273
    .line 1274
    .line 1275
    invoke-direct {v1, v0, v3, v4}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1276
    .line 1277
    .line 1278
    new-instance v0, Le4/d;

    .line 1279
    .line 1280
    const-string v3, "MeteringMode"

    .line 1281
    .line 1282
    const v4, 0x9207

    .line 1283
    .line 1284
    .line 1285
    move-object/from16 v74, v1

    .line 1286
    .line 1287
    const/4 v1, 0x3

    .line 1288
    invoke-direct {v0, v4, v1, v3}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1289
    .line 1290
    .line 1291
    new-instance v3, Le4/d;

    .line 1292
    .line 1293
    const-string v4, "LightSource"

    .line 1294
    .line 1295
    move-object/from16 v76, v0

    .line 1296
    .line 1297
    const v0, 0x9208

    .line 1298
    .line 1299
    .line 1300
    invoke-direct {v3, v0, v1, v4}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1301
    .line 1302
    .line 1303
    new-instance v0, Le4/d;

    .line 1304
    .line 1305
    const-string v4, "Flash"

    .line 1306
    .line 1307
    move-object/from16 v77, v3

    .line 1308
    .line 1309
    const v3, 0x9209

    .line 1310
    .line 1311
    .line 1312
    invoke-direct {v0, v3, v1, v4}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1313
    .line 1314
    .line 1315
    new-instance v3, Le4/d;

    .line 1316
    .line 1317
    const-string v4, "FocalLength"

    .line 1318
    .line 1319
    const v1, 0x920a

    .line 1320
    .line 1321
    .line 1322
    move-object/from16 v78, v0

    .line 1323
    .line 1324
    const/4 v0, 0x5

    .line 1325
    invoke-direct {v3, v1, v0, v4}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1326
    .line 1327
    .line 1328
    new-instance v0, Le4/d;

    .line 1329
    .line 1330
    const-string v1, "SubjectArea"

    .line 1331
    .line 1332
    const v4, 0x9214

    .line 1333
    .line 1334
    .line 1335
    move-object/from16 v80, v3

    .line 1336
    .line 1337
    const/4 v3, 0x3

    .line 1338
    invoke-direct {v0, v4, v3, v1}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1339
    .line 1340
    .line 1341
    new-instance v1, Le4/d;

    .line 1342
    .line 1343
    const-string v3, "MakerNote"

    .line 1344
    .line 1345
    const v4, 0x927c

    .line 1346
    .line 1347
    .line 1348
    move-object/from16 v81, v0

    .line 1349
    .line 1350
    const/4 v0, 0x7

    .line 1351
    invoke-direct {v1, v4, v0, v3}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1352
    .line 1353
    .line 1354
    new-instance v3, Le4/d;

    .line 1355
    .line 1356
    const-string v4, "UserComment"

    .line 1357
    .line 1358
    move-object/from16 v82, v1

    .line 1359
    .line 1360
    const v1, 0x9286

    .line 1361
    .line 1362
    .line 1363
    invoke-direct {v3, v1, v0, v4}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1364
    .line 1365
    .line 1366
    new-instance v0, Le4/d;

    .line 1367
    .line 1368
    const-string v1, "SubSecTime"

    .line 1369
    .line 1370
    const v4, 0x9290

    .line 1371
    .line 1372
    .line 1373
    move-object/from16 v83, v3

    .line 1374
    .line 1375
    const/4 v3, 0x2

    .line 1376
    invoke-direct {v0, v4, v3, v1}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1377
    .line 1378
    .line 1379
    new-instance v1, Le4/d;

    .line 1380
    .line 1381
    const-string v4, "SubSecTimeOriginal"

    .line 1382
    .line 1383
    move-object/from16 v84, v0

    .line 1384
    .line 1385
    const v0, 0x9291

    .line 1386
    .line 1387
    .line 1388
    invoke-direct {v1, v0, v3, v4}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1389
    .line 1390
    .line 1391
    new-instance v0, Le4/d;

    .line 1392
    .line 1393
    const-string v4, "SubSecTimeDigitized"

    .line 1394
    .line 1395
    move-object/from16 v85, v1

    .line 1396
    .line 1397
    const v1, 0x9292

    .line 1398
    .line 1399
    .line 1400
    invoke-direct {v0, v1, v3, v4}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1401
    .line 1402
    .line 1403
    new-instance v1, Le4/d;

    .line 1404
    .line 1405
    const-string v3, "FlashpixVersion"

    .line 1406
    .line 1407
    const v4, 0xa000

    .line 1408
    .line 1409
    .line 1410
    move-object/from16 v86, v0

    .line 1411
    .line 1412
    const/4 v0, 0x7

    .line 1413
    invoke-direct {v1, v4, v0, v3}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1414
    .line 1415
    .line 1416
    new-instance v0, Le4/d;

    .line 1417
    .line 1418
    const-string v3, "ColorSpace"

    .line 1419
    .line 1420
    const v4, 0xa001

    .line 1421
    .line 1422
    .line 1423
    move-object/from16 v87, v1

    .line 1424
    .line 1425
    const/4 v1, 0x3

    .line 1426
    invoke-direct {v0, v4, v1, v3}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1427
    .line 1428
    .line 1429
    new-instance v3, Le4/d;

    .line 1430
    .line 1431
    const-string v4, "PixelXDimension"

    .line 1432
    .line 1433
    move-object/from16 v88, v0

    .line 1434
    .line 1435
    const v0, 0xa002

    .line 1436
    .line 1437
    .line 1438
    move-object/from16 v89, v15

    .line 1439
    .line 1440
    const/4 v15, 0x4

    .line 1441
    invoke-direct {v3, v0, v1, v15, v4}, Le4/d;-><init>(IIILjava/lang/String;)V

    .line 1442
    .line 1443
    .line 1444
    new-instance v0, Le4/d;

    .line 1445
    .line 1446
    const-string v4, "PixelYDimension"

    .line 1447
    .line 1448
    move-object/from16 v90, v3

    .line 1449
    .line 1450
    const v3, 0xa003

    .line 1451
    .line 1452
    .line 1453
    invoke-direct {v0, v3, v1, v15, v4}, Le4/d;-><init>(IIILjava/lang/String;)V

    .line 1454
    .line 1455
    .line 1456
    new-instance v1, Le4/d;

    .line 1457
    .line 1458
    const-string v3, "RelatedSoundFile"

    .line 1459
    .line 1460
    const v4, 0xa004

    .line 1461
    .line 1462
    .line 1463
    const/4 v15, 0x2

    .line 1464
    invoke-direct {v1, v4, v15, v3}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1465
    .line 1466
    .line 1467
    new-instance v3, Le4/d;

    .line 1468
    .line 1469
    const-string v4, "InteroperabilityIFDPointer"

    .line 1470
    .line 1471
    const v15, 0xa005

    .line 1472
    .line 1473
    .line 1474
    move-object/from16 v91, v0

    .line 1475
    .line 1476
    const/4 v0, 0x4

    .line 1477
    invoke-direct {v3, v15, v0, v4}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1478
    .line 1479
    .line 1480
    new-instance v0, Le4/d;

    .line 1481
    .line 1482
    const-string v4, "FlashEnergy"

    .line 1483
    .line 1484
    const v15, 0xa20b

    .line 1485
    .line 1486
    .line 1487
    move-object/from16 v92, v1

    .line 1488
    .line 1489
    const/4 v1, 0x5

    .line 1490
    invoke-direct {v0, v15, v1, v4}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1491
    .line 1492
    .line 1493
    new-instance v4, Le4/d;

    .line 1494
    .line 1495
    const-string v15, "SpatialFrequencyResponse"

    .line 1496
    .line 1497
    const v1, 0xa20c

    .line 1498
    .line 1499
    .line 1500
    move-object/from16 v93, v0

    .line 1501
    .line 1502
    const/4 v0, 0x7

    .line 1503
    invoke-direct {v4, v1, v0, v15}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1504
    .line 1505
    .line 1506
    new-instance v0, Le4/d;

    .line 1507
    .line 1508
    const-string v1, "FocalPlaneXResolution"

    .line 1509
    .line 1510
    const v15, 0xa20e

    .line 1511
    .line 1512
    .line 1513
    move-object/from16 v94, v3

    .line 1514
    .line 1515
    const/4 v3, 0x5

    .line 1516
    invoke-direct {v0, v15, v3, v1}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1517
    .line 1518
    .line 1519
    new-instance v1, Le4/d;

    .line 1520
    .line 1521
    const-string v15, "FocalPlaneYResolution"

    .line 1522
    .line 1523
    move-object/from16 v95, v0

    .line 1524
    .line 1525
    const v0, 0xa20f

    .line 1526
    .line 1527
    .line 1528
    invoke-direct {v1, v0, v3, v15}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1529
    .line 1530
    .line 1531
    new-instance v0, Le4/d;

    .line 1532
    .line 1533
    const-string v3, "FocalPlaneResolutionUnit"

    .line 1534
    .line 1535
    const v15, 0xa210

    .line 1536
    .line 1537
    .line 1538
    move-object/from16 v96, v1

    .line 1539
    .line 1540
    const/4 v1, 0x3

    .line 1541
    invoke-direct {v0, v15, v1, v3}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1542
    .line 1543
    .line 1544
    new-instance v3, Le4/d;

    .line 1545
    .line 1546
    const-string v15, "SubjectLocation"

    .line 1547
    .line 1548
    move-object/from16 v97, v0

    .line 1549
    .line 1550
    const v0, 0xa214

    .line 1551
    .line 1552
    .line 1553
    invoke-direct {v3, v0, v1, v15}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1554
    .line 1555
    .line 1556
    new-instance v0, Le4/d;

    .line 1557
    .line 1558
    const-string v15, "ExposureIndex"

    .line 1559
    .line 1560
    const v1, 0xa215

    .line 1561
    .line 1562
    .line 1563
    move-object/from16 v98, v3

    .line 1564
    .line 1565
    const/4 v3, 0x5

    .line 1566
    invoke-direct {v0, v1, v3, v15}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1567
    .line 1568
    .line 1569
    new-instance v1, Le4/d;

    .line 1570
    .line 1571
    const-string v3, "SensingMethod"

    .line 1572
    .line 1573
    const v15, 0xa217

    .line 1574
    .line 1575
    .line 1576
    move-object/from16 v99, v0

    .line 1577
    .line 1578
    const/4 v0, 0x3

    .line 1579
    invoke-direct {v1, v15, v0, v3}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1580
    .line 1581
    .line 1582
    new-instance v0, Le4/d;

    .line 1583
    .line 1584
    const-string v3, "FileSource"

    .line 1585
    .line 1586
    const v15, 0xa300

    .line 1587
    .line 1588
    .line 1589
    move-object/from16 v100, v1

    .line 1590
    .line 1591
    const/4 v1, 0x7

    .line 1592
    invoke-direct {v0, v15, v1, v3}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1593
    .line 1594
    .line 1595
    new-instance v3, Le4/d;

    .line 1596
    .line 1597
    const-string v15, "SceneType"

    .line 1598
    .line 1599
    move-object/from16 v101, v0

    .line 1600
    .line 1601
    const v0, 0xa301

    .line 1602
    .line 1603
    .line 1604
    invoke-direct {v3, v0, v1, v15}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1605
    .line 1606
    .line 1607
    new-instance v0, Le4/d;

    .line 1608
    .line 1609
    const-string v15, "CFAPattern"

    .line 1610
    .line 1611
    move-object/from16 v102, v3

    .line 1612
    .line 1613
    const v3, 0xa302

    .line 1614
    .line 1615
    .line 1616
    invoke-direct {v0, v3, v1, v15}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1617
    .line 1618
    .line 1619
    new-instance v1, Le4/d;

    .line 1620
    .line 1621
    const-string v3, "CustomRendered"

    .line 1622
    .line 1623
    const v15, 0xa401

    .line 1624
    .line 1625
    .line 1626
    move-object/from16 v103, v0

    .line 1627
    .line 1628
    const/4 v0, 0x3

    .line 1629
    invoke-direct {v1, v15, v0, v3}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1630
    .line 1631
    .line 1632
    new-instance v3, Le4/d;

    .line 1633
    .line 1634
    const-string v15, "ExposureMode"

    .line 1635
    .line 1636
    move-object/from16 v104, v1

    .line 1637
    .line 1638
    const v1, 0xa402

    .line 1639
    .line 1640
    .line 1641
    invoke-direct {v3, v1, v0, v15}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1642
    .line 1643
    .line 1644
    new-instance v1, Le4/d;

    .line 1645
    .line 1646
    const-string v15, "WhiteBalance"

    .line 1647
    .line 1648
    move-object/from16 v105, v3

    .line 1649
    .line 1650
    const v3, 0xa403

    .line 1651
    .line 1652
    .line 1653
    invoke-direct {v1, v3, v0, v15}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1654
    .line 1655
    .line 1656
    new-instance v3, Le4/d;

    .line 1657
    .line 1658
    const-string v15, "DigitalZoomRatio"

    .line 1659
    .line 1660
    const v0, 0xa404

    .line 1661
    .line 1662
    .line 1663
    move-object/from16 v106, v1

    .line 1664
    .line 1665
    const/4 v1, 0x5

    .line 1666
    invoke-direct {v3, v0, v1, v15}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1667
    .line 1668
    .line 1669
    new-instance v0, Le4/d;

    .line 1670
    .line 1671
    const-string v1, "FocalLengthIn35mmFilm"

    .line 1672
    .line 1673
    const v15, 0xa405

    .line 1674
    .line 1675
    .line 1676
    move-object/from16 v107, v3

    .line 1677
    .line 1678
    const/4 v3, 0x3

    .line 1679
    invoke-direct {v0, v15, v3, v1}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1680
    .line 1681
    .line 1682
    new-instance v1, Le4/d;

    .line 1683
    .line 1684
    const-string v15, "SceneCaptureType"

    .line 1685
    .line 1686
    move-object/from16 v108, v0

    .line 1687
    .line 1688
    const v0, 0xa406

    .line 1689
    .line 1690
    .line 1691
    invoke-direct {v1, v0, v3, v15}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1692
    .line 1693
    .line 1694
    new-instance v0, Le4/d;

    .line 1695
    .line 1696
    const-string v15, "GainControl"

    .line 1697
    .line 1698
    move-object/from16 v109, v1

    .line 1699
    .line 1700
    const v1, 0xa407

    .line 1701
    .line 1702
    .line 1703
    invoke-direct {v0, v1, v3, v15}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1704
    .line 1705
    .line 1706
    new-instance v1, Le4/d;

    .line 1707
    .line 1708
    const-string v15, "Contrast"

    .line 1709
    .line 1710
    move-object/from16 v110, v0

    .line 1711
    .line 1712
    const v0, 0xa408

    .line 1713
    .line 1714
    .line 1715
    invoke-direct {v1, v0, v3, v15}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1716
    .line 1717
    .line 1718
    new-instance v0, Le4/d;

    .line 1719
    .line 1720
    const-string v15, "Saturation"

    .line 1721
    .line 1722
    move-object/from16 v111, v1

    .line 1723
    .line 1724
    const v1, 0xa409

    .line 1725
    .line 1726
    .line 1727
    invoke-direct {v0, v1, v3, v15}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1728
    .line 1729
    .line 1730
    new-instance v1, Le4/d;

    .line 1731
    .line 1732
    const-string v15, "Sharpness"

    .line 1733
    .line 1734
    move-object/from16 v112, v0

    .line 1735
    .line 1736
    const v0, 0xa40a

    .line 1737
    .line 1738
    .line 1739
    invoke-direct {v1, v0, v3, v15}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1740
    .line 1741
    .line 1742
    new-instance v0, Le4/d;

    .line 1743
    .line 1744
    const-string v15, "DeviceSettingDescription"

    .line 1745
    .line 1746
    const v3, 0xa40b

    .line 1747
    .line 1748
    .line 1749
    move-object/from16 v113, v1

    .line 1750
    .line 1751
    const/4 v1, 0x7

    .line 1752
    invoke-direct {v0, v3, v1, v15}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1753
    .line 1754
    .line 1755
    new-instance v1, Le4/d;

    .line 1756
    .line 1757
    const-string v3, "SubjectDistanceRange"

    .line 1758
    .line 1759
    const v15, 0xa40c

    .line 1760
    .line 1761
    .line 1762
    move-object/from16 v114, v0

    .line 1763
    .line 1764
    const/4 v0, 0x3

    .line 1765
    invoke-direct {v1, v15, v0, v3}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1766
    .line 1767
    .line 1768
    new-instance v0, Le4/d;

    .line 1769
    .line 1770
    const-string v3, "ImageUniqueID"

    .line 1771
    .line 1772
    const v15, 0xa420

    .line 1773
    .line 1774
    .line 1775
    move-object/from16 v115, v1

    .line 1776
    .line 1777
    const/4 v1, 0x2

    .line 1778
    invoke-direct {v0, v15, v1, v3}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1779
    .line 1780
    .line 1781
    new-instance v3, Le4/d;

    .line 1782
    .line 1783
    const-string v15, "CameraOwnerName"

    .line 1784
    .line 1785
    move-object/from16 v116, v0

    .line 1786
    .line 1787
    const v0, 0xa430

    .line 1788
    .line 1789
    .line 1790
    invoke-direct {v3, v0, v1, v15}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1791
    .line 1792
    .line 1793
    new-instance v0, Le4/d;

    .line 1794
    .line 1795
    const-string v15, "BodySerialNumber"

    .line 1796
    .line 1797
    move-object/from16 v117, v3

    .line 1798
    .line 1799
    const v3, 0xa431

    .line 1800
    .line 1801
    .line 1802
    invoke-direct {v0, v3, v1, v15}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1803
    .line 1804
    .line 1805
    new-instance v3, Le4/d;

    .line 1806
    .line 1807
    const-string v15, "LensSpecification"

    .line 1808
    .line 1809
    const v1, 0xa432

    .line 1810
    .line 1811
    .line 1812
    move-object/from16 v118, v0

    .line 1813
    .line 1814
    const/4 v0, 0x5

    .line 1815
    invoke-direct {v3, v1, v0, v15}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1816
    .line 1817
    .line 1818
    new-instance v0, Le4/d;

    .line 1819
    .line 1820
    const-string v1, "LensMake"

    .line 1821
    .line 1822
    const v15, 0xa433

    .line 1823
    .line 1824
    .line 1825
    move-object/from16 v119, v3

    .line 1826
    .line 1827
    const/4 v3, 0x2

    .line 1828
    invoke-direct {v0, v15, v3, v1}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1829
    .line 1830
    .line 1831
    new-instance v1, Le4/d;

    .line 1832
    .line 1833
    const-string v15, "LensModel"

    .line 1834
    .line 1835
    move-object/from16 v120, v0

    .line 1836
    .line 1837
    const v0, 0xa434

    .line 1838
    .line 1839
    .line 1840
    invoke-direct {v1, v0, v3, v15}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1841
    .line 1842
    .line 1843
    new-instance v0, Le4/d;

    .line 1844
    .line 1845
    const-string v3, "Gamma"

    .line 1846
    .line 1847
    const v15, 0xa500

    .line 1848
    .line 1849
    .line 1850
    move-object/from16 v121, v1

    .line 1851
    .line 1852
    const/4 v1, 0x5

    .line 1853
    invoke-direct {v0, v15, v1, v3}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1854
    .line 1855
    .line 1856
    new-instance v1, Le4/d;

    .line 1857
    .line 1858
    const-string v3, "DNGVersion"

    .line 1859
    .line 1860
    const v15, 0xc612

    .line 1861
    .line 1862
    .line 1863
    move-object/from16 v122, v0

    .line 1864
    .line 1865
    const/4 v0, 0x1

    .line 1866
    invoke-direct {v1, v15, v0, v3}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 1867
    .line 1868
    .line 1869
    new-instance v3, Le4/d;

    .line 1870
    .line 1871
    const-string v15, "DefaultCropSize"

    .line 1872
    .line 1873
    const/16 v21, 0x1

    .line 1874
    .line 1875
    const v0, 0xc620

    .line 1876
    .line 1877
    .line 1878
    move-object/from16 v123, v1

    .line 1879
    .line 1880
    move-object/from16 v124, v4

    .line 1881
    .line 1882
    const/4 v1, 0x3

    .line 1883
    const/4 v4, 0x4

    .line 1884
    invoke-direct {v3, v0, v1, v4, v15}, Le4/d;-><init>(IIILjava/lang/String;)V

    .line 1885
    .line 1886
    .line 1887
    const/16 v0, 0x4a

    .line 1888
    .line 1889
    new-array v0, v0, [Le4/d;

    .line 1890
    .line 1891
    aput-object v47, v0, v16

    .line 1892
    .line 1893
    aput-object v48, v0, v21

    .line 1894
    .line 1895
    const/16 v27, 0x2

    .line 1896
    .line 1897
    aput-object v49, v0, v27

    .line 1898
    .line 1899
    aput-object v51, v0, v1

    .line 1900
    .line 1901
    aput-object v52, v0, v4

    .line 1902
    .line 1903
    const/16 v25, 0x5

    .line 1904
    .line 1905
    aput-object v53, v0, v25

    .line 1906
    .line 1907
    const/16 v24, 0x6

    .line 1908
    .line 1909
    aput-object v54, v0, v24

    .line 1910
    .line 1911
    const/16 v22, 0x7

    .line 1912
    .line 1913
    aput-object v55, v0, v22

    .line 1914
    .line 1915
    aput-object v56, v0, v19

    .line 1916
    .line 1917
    aput-object v57, v0, v43

    .line 1918
    .line 1919
    const/16 v17, 0xa

    .line 1920
    .line 1921
    aput-object v58, v0, v17

    .line 1922
    .line 1923
    aput-object v59, v0, v31

    .line 1924
    .line 1925
    aput-object v60, v0, v32

    .line 1926
    .line 1927
    aput-object v61, v0, v34

    .line 1928
    .line 1929
    aput-object v62, v0, v18

    .line 1930
    .line 1931
    aput-object v63, v0, v35

    .line 1932
    .line 1933
    aput-object v64, v0, v38

    .line 1934
    .line 1935
    aput-object v65, v0, v39

    .line 1936
    .line 1937
    aput-object v66, v0, v41

    .line 1938
    .line 1939
    const/16 v1, 0x13

    .line 1940
    .line 1941
    aput-object v67, v0, v1

    .line 1942
    .line 1943
    const/16 v1, 0x14

    .line 1944
    .line 1945
    aput-object v68, v0, v1

    .line 1946
    .line 1947
    const/16 v1, 0x15

    .line 1948
    .line 1949
    aput-object v69, v0, v1

    .line 1950
    .line 1951
    const/16 v1, 0x16

    .line 1952
    .line 1953
    aput-object v70, v0, v1

    .line 1954
    .line 1955
    aput-object v71, v0, v79

    .line 1956
    .line 1957
    const/16 v1, 0x18

    .line 1958
    .line 1959
    aput-object v73, v0, v1

    .line 1960
    .line 1961
    const/16 v1, 0x19

    .line 1962
    .line 1963
    aput-object v74, v0, v1

    .line 1964
    .line 1965
    aput-object v76, v0, v42

    .line 1966
    .line 1967
    const/16 v1, 0x1b

    .line 1968
    .line 1969
    aput-object v77, v0, v1

    .line 1970
    .line 1971
    const/16 v1, 0x1c

    .line 1972
    .line 1973
    aput-object v78, v0, v1

    .line 1974
    .line 1975
    const/16 v1, 0x1d

    .line 1976
    .line 1977
    aput-object v80, v0, v1

    .line 1978
    .line 1979
    const/16 v1, 0x1e

    .line 1980
    .line 1981
    aput-object v81, v0, v1

    .line 1982
    .line 1983
    const/16 v1, 0x1f

    .line 1984
    .line 1985
    aput-object v82, v0, v1

    .line 1986
    .line 1987
    const/16 v1, 0x20

    .line 1988
    .line 1989
    aput-object v83, v0, v1

    .line 1990
    .line 1991
    const/16 v1, 0x21

    .line 1992
    .line 1993
    aput-object v84, v0, v1

    .line 1994
    .line 1995
    const/16 v1, 0x22

    .line 1996
    .line 1997
    aput-object v85, v0, v1

    .line 1998
    .line 1999
    const/16 v1, 0x23

    .line 2000
    .line 2001
    aput-object v86, v0, v1

    .line 2002
    .line 2003
    const/16 v1, 0x24

    .line 2004
    .line 2005
    aput-object v87, v0, v1

    .line 2006
    .line 2007
    const/16 v1, 0x25

    .line 2008
    .line 2009
    aput-object v88, v0, v1

    .line 2010
    .line 2011
    const/16 v1, 0x26

    .line 2012
    .line 2013
    aput-object v90, v0, v1

    .line 2014
    .line 2015
    const/16 v1, 0x27

    .line 2016
    .line 2017
    aput-object v91, v0, v1

    .line 2018
    .line 2019
    const/16 v1, 0x28

    .line 2020
    .line 2021
    aput-object v92, v0, v1

    .line 2022
    .line 2023
    const/16 v1, 0x29

    .line 2024
    .line 2025
    aput-object v94, v0, v1

    .line 2026
    .line 2027
    const/16 v1, 0x2a

    .line 2028
    .line 2029
    aput-object v93, v0, v1

    .line 2030
    .line 2031
    const/16 v1, 0x2b

    .line 2032
    .line 2033
    aput-object v124, v0, v1

    .line 2034
    .line 2035
    const/16 v1, 0x2c

    .line 2036
    .line 2037
    aput-object v95, v0, v1

    .line 2038
    .line 2039
    const/16 v1, 0x2d

    .line 2040
    .line 2041
    aput-object v96, v0, v1

    .line 2042
    .line 2043
    const/16 v1, 0x2e

    .line 2044
    .line 2045
    aput-object v97, v0, v1

    .line 2046
    .line 2047
    const/16 v1, 0x2f

    .line 2048
    .line 2049
    aput-object v98, v0, v1

    .line 2050
    .line 2051
    const/16 v1, 0x30

    .line 2052
    .line 2053
    aput-object v99, v0, v1

    .line 2054
    .line 2055
    const/16 v1, 0x31

    .line 2056
    .line 2057
    aput-object v100, v0, v1

    .line 2058
    .line 2059
    const/16 v1, 0x32

    .line 2060
    .line 2061
    aput-object v101, v0, v1

    .line 2062
    .line 2063
    const/16 v1, 0x33

    .line 2064
    .line 2065
    aput-object v102, v0, v1

    .line 2066
    .line 2067
    const/16 v1, 0x34

    .line 2068
    .line 2069
    aput-object v103, v0, v1

    .line 2070
    .line 2071
    const/16 v1, 0x35

    .line 2072
    .line 2073
    aput-object v104, v0, v1

    .line 2074
    .line 2075
    const/16 v1, 0x36

    .line 2076
    .line 2077
    aput-object v105, v0, v1

    .line 2078
    .line 2079
    const/16 v1, 0x37

    .line 2080
    .line 2081
    aput-object v106, v0, v1

    .line 2082
    .line 2083
    const/16 v1, 0x38

    .line 2084
    .line 2085
    aput-object v107, v0, v1

    .line 2086
    .line 2087
    const/16 v1, 0x39

    .line 2088
    .line 2089
    aput-object v108, v0, v1

    .line 2090
    .line 2091
    const/16 v1, 0x3a

    .line 2092
    .line 2093
    aput-object v109, v0, v1

    .line 2094
    .line 2095
    const/16 v1, 0x3b

    .line 2096
    .line 2097
    aput-object v110, v0, v1

    .line 2098
    .line 2099
    const/16 v1, 0x3c

    .line 2100
    .line 2101
    aput-object v111, v0, v1

    .line 2102
    .line 2103
    const/16 v1, 0x3d

    .line 2104
    .line 2105
    aput-object v112, v0, v1

    .line 2106
    .line 2107
    const/16 v1, 0x3e

    .line 2108
    .line 2109
    aput-object v113, v0, v1

    .line 2110
    .line 2111
    const/16 v1, 0x3f

    .line 2112
    .line 2113
    aput-object v114, v0, v1

    .line 2114
    .line 2115
    const/16 v1, 0x40

    .line 2116
    .line 2117
    aput-object v115, v0, v1

    .line 2118
    .line 2119
    const/16 v1, 0x41

    .line 2120
    .line 2121
    aput-object v116, v0, v1

    .line 2122
    .line 2123
    const/16 v1, 0x42

    .line 2124
    .line 2125
    aput-object v117, v0, v1

    .line 2126
    .line 2127
    const/16 v1, 0x43

    .line 2128
    .line 2129
    aput-object v118, v0, v1

    .line 2130
    .line 2131
    const/16 v1, 0x44

    .line 2132
    .line 2133
    aput-object v119, v0, v1

    .line 2134
    .line 2135
    const/16 v1, 0x45

    .line 2136
    .line 2137
    aput-object v120, v0, v1

    .line 2138
    .line 2139
    const/16 v1, 0x46

    .line 2140
    .line 2141
    aput-object v121, v0, v1

    .line 2142
    .line 2143
    const/16 v1, 0x47

    .line 2144
    .line 2145
    aput-object v122, v0, v1

    .line 2146
    .line 2147
    const/16 v1, 0x48

    .line 2148
    .line 2149
    aput-object v123, v0, v1

    .line 2150
    .line 2151
    const/16 v1, 0x49

    .line 2152
    .line 2153
    aput-object v3, v0, v1

    .line 2154
    .line 2155
    new-instance v1, Le4/d;

    .line 2156
    .line 2157
    const-string v3, "GPSVersionID"

    .line 2158
    .line 2159
    const/4 v4, 0x1

    .line 2160
    const/4 v15, 0x0

    .line 2161
    invoke-direct {v1, v15, v4, v3}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2162
    .line 2163
    .line 2164
    new-instance v3, Le4/d;

    .line 2165
    .line 2166
    const-string v15, "GPSLatitudeRef"

    .line 2167
    .line 2168
    move-object/from16 v47, v0

    .line 2169
    .line 2170
    const/4 v0, 0x2

    .line 2171
    invoke-direct {v3, v4, v0, v15}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2172
    .line 2173
    .line 2174
    new-instance v4, Le4/d;

    .line 2175
    .line 2176
    const-string v15, "GPSLatitude"

    .line 2177
    .line 2178
    move-object/from16 v48, v1

    .line 2179
    .line 2180
    move-object/from16 v49, v3

    .line 2181
    .line 2182
    const/4 v1, 0x5

    .line 2183
    const/16 v3, 0xa

    .line 2184
    .line 2185
    invoke-direct {v4, v0, v1, v3, v15}, Le4/d;-><init>(IIILjava/lang/String;)V

    .line 2186
    .line 2187
    .line 2188
    new-instance v15, Le4/d;

    .line 2189
    .line 2190
    const-string v1, "GPSLongitudeRef"

    .line 2191
    .line 2192
    const/4 v3, 0x3

    .line 2193
    invoke-direct {v15, v3, v0, v1}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2194
    .line 2195
    .line 2196
    new-instance v0, Le4/d;

    .line 2197
    .line 2198
    const-string v1, "GPSLongitude"

    .line 2199
    .line 2200
    move-object/from16 v51, v4

    .line 2201
    .line 2202
    move-object/from16 v52, v15

    .line 2203
    .line 2204
    const/4 v3, 0x4

    .line 2205
    const/4 v4, 0x5

    .line 2206
    const/16 v15, 0xa

    .line 2207
    .line 2208
    invoke-direct {v0, v3, v4, v15, v1}, Le4/d;-><init>(IIILjava/lang/String;)V

    .line 2209
    .line 2210
    .line 2211
    new-instance v1, Le4/d;

    .line 2212
    .line 2213
    const-string v3, "GPSAltitudeRef"

    .line 2214
    .line 2215
    const/4 v15, 0x1

    .line 2216
    invoke-direct {v1, v4, v15, v3}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2217
    .line 2218
    .line 2219
    new-instance v3, Le4/d;

    .line 2220
    .line 2221
    const-string v15, "GPSAltitude"

    .line 2222
    .line 2223
    move-object/from16 v53, v0

    .line 2224
    .line 2225
    const/4 v0, 0x6

    .line 2226
    invoke-direct {v3, v0, v4, v15}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2227
    .line 2228
    .line 2229
    new-instance v0, Le4/d;

    .line 2230
    .line 2231
    const-string v15, "GPSTimeStamp"

    .line 2232
    .line 2233
    move-object/from16 v54, v1

    .line 2234
    .line 2235
    const/4 v1, 0x7

    .line 2236
    invoke-direct {v0, v1, v4, v15}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2237
    .line 2238
    .line 2239
    new-instance v1, Le4/d;

    .line 2240
    .line 2241
    const-string v4, "GPSSatellites"

    .line 2242
    .line 2243
    move-object/from16 v55, v0

    .line 2244
    .line 2245
    const/4 v0, 0x2

    .line 2246
    const/16 v15, 0x8

    .line 2247
    .line 2248
    invoke-direct {v1, v15, v0, v4}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2249
    .line 2250
    .line 2251
    new-instance v4, Le4/d;

    .line 2252
    .line 2253
    const-string v15, "GPSStatus"

    .line 2254
    .line 2255
    move-object/from16 v56, v1

    .line 2256
    .line 2257
    const/16 v1, 0x9

    .line 2258
    .line 2259
    invoke-direct {v4, v1, v0, v15}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2260
    .line 2261
    .line 2262
    new-instance v1, Le4/d;

    .line 2263
    .line 2264
    const-string v15, "GPSMeasureMode"

    .line 2265
    .line 2266
    move-object/from16 v57, v3

    .line 2267
    .line 2268
    const/16 v3, 0xa

    .line 2269
    .line 2270
    invoke-direct {v1, v3, v0, v15}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2271
    .line 2272
    .line 2273
    new-instance v3, Le4/d;

    .line 2274
    .line 2275
    const-string v15, "GPSDOP"

    .line 2276
    .line 2277
    move-object/from16 v58, v1

    .line 2278
    .line 2279
    const/4 v0, 0x5

    .line 2280
    const/16 v1, 0xb

    .line 2281
    .line 2282
    invoke-direct {v3, v1, v0, v15}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2283
    .line 2284
    .line 2285
    new-instance v1, Le4/d;

    .line 2286
    .line 2287
    const-string v15, "GPSSpeedRef"

    .line 2288
    .line 2289
    move-object/from16 v59, v3

    .line 2290
    .line 2291
    const/4 v0, 0x2

    .line 2292
    const/16 v3, 0xc

    .line 2293
    .line 2294
    invoke-direct {v1, v3, v0, v15}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2295
    .line 2296
    .line 2297
    new-instance v3, Le4/d;

    .line 2298
    .line 2299
    const-string v15, "GPSSpeed"

    .line 2300
    .line 2301
    move-object/from16 v60, v1

    .line 2302
    .line 2303
    const/4 v0, 0x5

    .line 2304
    const/16 v1, 0xd

    .line 2305
    .line 2306
    invoke-direct {v3, v1, v0, v15}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2307
    .line 2308
    .line 2309
    new-instance v1, Le4/d;

    .line 2310
    .line 2311
    const-string v15, "GPSTrackRef"

    .line 2312
    .line 2313
    move-object/from16 v61, v3

    .line 2314
    .line 2315
    const/4 v0, 0x2

    .line 2316
    const/16 v3, 0xe

    .line 2317
    .line 2318
    invoke-direct {v1, v3, v0, v15}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2319
    .line 2320
    .line 2321
    new-instance v3, Le4/d;

    .line 2322
    .line 2323
    const-string v15, "GPSTrack"

    .line 2324
    .line 2325
    move-object/from16 v62, v1

    .line 2326
    .line 2327
    const/4 v0, 0x5

    .line 2328
    const/16 v1, 0xf

    .line 2329
    .line 2330
    invoke-direct {v3, v1, v0, v15}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2331
    .line 2332
    .line 2333
    new-instance v1, Le4/d;

    .line 2334
    .line 2335
    const-string v15, "GPSImgDirectionRef"

    .line 2336
    .line 2337
    move-object/from16 v63, v3

    .line 2338
    .line 2339
    const/4 v0, 0x2

    .line 2340
    const/16 v3, 0x10

    .line 2341
    .line 2342
    invoke-direct {v1, v3, v0, v15}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2343
    .line 2344
    .line 2345
    new-instance v3, Le4/d;

    .line 2346
    .line 2347
    const-string v15, "GPSImgDirection"

    .line 2348
    .line 2349
    move-object/from16 v64, v1

    .line 2350
    .line 2351
    const/4 v0, 0x5

    .line 2352
    const/16 v1, 0x11

    .line 2353
    .line 2354
    invoke-direct {v3, v1, v0, v15}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2355
    .line 2356
    .line 2357
    new-instance v1, Le4/d;

    .line 2358
    .line 2359
    const-string v15, "GPSMapDatum"

    .line 2360
    .line 2361
    move-object/from16 v65, v3

    .line 2362
    .line 2363
    const/4 v0, 0x2

    .line 2364
    const/16 v3, 0x12

    .line 2365
    .line 2366
    invoke-direct {v1, v3, v0, v15}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2367
    .line 2368
    .line 2369
    new-instance v3, Le4/d;

    .line 2370
    .line 2371
    const-string v15, "GPSDestLatitudeRef"

    .line 2372
    .line 2373
    move-object/from16 v66, v1

    .line 2374
    .line 2375
    const/16 v1, 0x13

    .line 2376
    .line 2377
    invoke-direct {v3, v1, v0, v15}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2378
    .line 2379
    .line 2380
    new-instance v1, Le4/d;

    .line 2381
    .line 2382
    const-string v15, "GPSDestLatitude"

    .line 2383
    .line 2384
    const/16 v0, 0x14

    .line 2385
    .line 2386
    move-object/from16 v67, v3

    .line 2387
    .line 2388
    const/4 v3, 0x5

    .line 2389
    invoke-direct {v1, v0, v3, v15}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2390
    .line 2391
    .line 2392
    new-instance v0, Le4/d;

    .line 2393
    .line 2394
    const-string v15, "GPSDestLongitudeRef"

    .line 2395
    .line 2396
    const/16 v3, 0x15

    .line 2397
    .line 2398
    move-object/from16 v68, v1

    .line 2399
    .line 2400
    const/4 v1, 0x2

    .line 2401
    invoke-direct {v0, v3, v1, v15}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2402
    .line 2403
    .line 2404
    new-instance v3, Le4/d;

    .line 2405
    .line 2406
    const-string v15, "GPSDestLongitude"

    .line 2407
    .line 2408
    const/16 v1, 0x16

    .line 2409
    .line 2410
    move-object/from16 v69, v0

    .line 2411
    .line 2412
    const/4 v0, 0x5

    .line 2413
    invoke-direct {v3, v1, v0, v15}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2414
    .line 2415
    .line 2416
    new-instance v1, Le4/d;

    .line 2417
    .line 2418
    const-string v15, "GPSDestBearingRef"

    .line 2419
    .line 2420
    move-object/from16 v70, v3

    .line 2421
    .line 2422
    const/4 v0, 0x2

    .line 2423
    const/16 v3, 0x17

    .line 2424
    .line 2425
    invoke-direct {v1, v3, v0, v15}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2426
    .line 2427
    .line 2428
    new-instance v3, Le4/d;

    .line 2429
    .line 2430
    const-string v15, "GPSDestBearing"

    .line 2431
    .line 2432
    const/16 v0, 0x18

    .line 2433
    .line 2434
    move-object/from16 v71, v1

    .line 2435
    .line 2436
    const/4 v1, 0x5

    .line 2437
    invoke-direct {v3, v0, v1, v15}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2438
    .line 2439
    .line 2440
    new-instance v0, Le4/d;

    .line 2441
    .line 2442
    const-string v15, "GPSDestDistanceRef"

    .line 2443
    .line 2444
    const/16 v1, 0x19

    .line 2445
    .line 2446
    move-object/from16 v73, v3

    .line 2447
    .line 2448
    const/4 v3, 0x2

    .line 2449
    invoke-direct {v0, v1, v3, v15}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2450
    .line 2451
    .line 2452
    new-instance v1, Le4/d;

    .line 2453
    .line 2454
    const-string v3, "GPSDestDistance"

    .line 2455
    .line 2456
    move-object/from16 v74, v0

    .line 2457
    .line 2458
    const/16 v0, 0x1a

    .line 2459
    .line 2460
    const/4 v15, 0x5

    .line 2461
    invoke-direct {v1, v0, v15, v3}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2462
    .line 2463
    .line 2464
    new-instance v0, Le4/d;

    .line 2465
    .line 2466
    const-string v3, "GPSProcessingMethod"

    .line 2467
    .line 2468
    const/16 v15, 0x1b

    .line 2469
    .line 2470
    move-object/from16 v76, v1

    .line 2471
    .line 2472
    const/4 v1, 0x7

    .line 2473
    invoke-direct {v0, v15, v1, v3}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2474
    .line 2475
    .line 2476
    new-instance v3, Le4/d;

    .line 2477
    .line 2478
    const-string v15, "GPSAreaInformation"

    .line 2479
    .line 2480
    move-object/from16 v77, v0

    .line 2481
    .line 2482
    const/16 v0, 0x1c

    .line 2483
    .line 2484
    invoke-direct {v3, v0, v1, v15}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2485
    .line 2486
    .line 2487
    new-instance v0, Le4/d;

    .line 2488
    .line 2489
    const-string v1, "GPSDateStamp"

    .line 2490
    .line 2491
    const/16 v15, 0x1d

    .line 2492
    .line 2493
    move-object/from16 v78, v3

    .line 2494
    .line 2495
    const/4 v3, 0x2

    .line 2496
    invoke-direct {v0, v15, v3, v1}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2497
    .line 2498
    .line 2499
    new-instance v1, Le4/d;

    .line 2500
    .line 2501
    const-string v3, "GPSDifferential"

    .line 2502
    .line 2503
    const/16 v15, 0x1e

    .line 2504
    .line 2505
    move-object/from16 v80, v0

    .line 2506
    .line 2507
    const/4 v0, 0x3

    .line 2508
    invoke-direct {v1, v15, v0, v3}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2509
    .line 2510
    .line 2511
    new-instance v3, Le4/d;

    .line 2512
    .line 2513
    const-string v15, "GPSHPositioningError"

    .line 2514
    .line 2515
    const/16 v37, 0x3

    .line 2516
    .line 2517
    const/16 v0, 0x1f

    .line 2518
    .line 2519
    move-object/from16 v81, v1

    .line 2520
    .line 2521
    const/4 v1, 0x5

    .line 2522
    invoke-direct {v3, v0, v1, v15}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2523
    .line 2524
    .line 2525
    const/16 v0, 0x20

    .line 2526
    .line 2527
    new-array v0, v0, [Le4/d;

    .line 2528
    .line 2529
    const/16 v16, 0x0

    .line 2530
    .line 2531
    aput-object v48, v0, v16

    .line 2532
    .line 2533
    const/16 v21, 0x1

    .line 2534
    .line 2535
    aput-object v49, v0, v21

    .line 2536
    .line 2537
    const/16 v27, 0x2

    .line 2538
    .line 2539
    aput-object v51, v0, v27

    .line 2540
    .line 2541
    aput-object v52, v0, v37

    .line 2542
    .line 2543
    const/16 v29, 0x4

    .line 2544
    .line 2545
    aput-object v53, v0, v29

    .line 2546
    .line 2547
    aput-object v54, v0, v1

    .line 2548
    .line 2549
    const/16 v24, 0x6

    .line 2550
    .line 2551
    aput-object v57, v0, v24

    .line 2552
    .line 2553
    const/16 v22, 0x7

    .line 2554
    .line 2555
    aput-object v55, v0, v22

    .line 2556
    .line 2557
    const/16 v19, 0x8

    .line 2558
    .line 2559
    aput-object v56, v0, v19

    .line 2560
    .line 2561
    const/16 v43, 0x9

    .line 2562
    .line 2563
    aput-object v4, v0, v43

    .line 2564
    .line 2565
    const/16 v17, 0xa

    .line 2566
    .line 2567
    aput-object v58, v0, v17

    .line 2568
    .line 2569
    const/16 v31, 0xb

    .line 2570
    .line 2571
    aput-object v59, v0, v31

    .line 2572
    .line 2573
    const/16 v32, 0xc

    .line 2574
    .line 2575
    aput-object v60, v0, v32

    .line 2576
    .line 2577
    const/16 v34, 0xd

    .line 2578
    .line 2579
    aput-object v61, v0, v34

    .line 2580
    .line 2581
    const/16 v18, 0xe

    .line 2582
    .line 2583
    aput-object v62, v0, v18

    .line 2584
    .line 2585
    const/16 v35, 0xf

    .line 2586
    .line 2587
    aput-object v63, v0, v35

    .line 2588
    .line 2589
    const/16 v38, 0x10

    .line 2590
    .line 2591
    aput-object v64, v0, v38

    .line 2592
    .line 2593
    const/16 v39, 0x11

    .line 2594
    .line 2595
    aput-object v65, v0, v39

    .line 2596
    .line 2597
    const/16 v41, 0x12

    .line 2598
    .line 2599
    aput-object v66, v0, v41

    .line 2600
    .line 2601
    const/16 v1, 0x13

    .line 2602
    .line 2603
    aput-object v67, v0, v1

    .line 2604
    .line 2605
    const/16 v1, 0x14

    .line 2606
    .line 2607
    aput-object v68, v0, v1

    .line 2608
    .line 2609
    const/16 v1, 0x15

    .line 2610
    .line 2611
    aput-object v69, v0, v1

    .line 2612
    .line 2613
    const/16 v1, 0x16

    .line 2614
    .line 2615
    aput-object v70, v0, v1

    .line 2616
    .line 2617
    const/16 v79, 0x17

    .line 2618
    .line 2619
    aput-object v71, v0, v79

    .line 2620
    .line 2621
    const/16 v1, 0x18

    .line 2622
    .line 2623
    aput-object v73, v0, v1

    .line 2624
    .line 2625
    const/16 v1, 0x19

    .line 2626
    .line 2627
    aput-object v74, v0, v1

    .line 2628
    .line 2629
    const/16 v42, 0x1a

    .line 2630
    .line 2631
    aput-object v76, v0, v42

    .line 2632
    .line 2633
    const/16 v1, 0x1b

    .line 2634
    .line 2635
    aput-object v77, v0, v1

    .line 2636
    .line 2637
    const/16 v1, 0x1c

    .line 2638
    .line 2639
    aput-object v78, v0, v1

    .line 2640
    .line 2641
    const/16 v1, 0x1d

    .line 2642
    .line 2643
    aput-object v80, v0, v1

    .line 2644
    .line 2645
    const/16 v1, 0x1e

    .line 2646
    .line 2647
    aput-object v81, v0, v1

    .line 2648
    .line 2649
    const/16 v1, 0x1f

    .line 2650
    .line 2651
    aput-object v3, v0, v1

    .line 2652
    .line 2653
    new-instance v1, Le4/d;

    .line 2654
    .line 2655
    const-string v3, "InteroperabilityIndex"

    .line 2656
    .line 2657
    const/4 v4, 0x1

    .line 2658
    const/4 v15, 0x2

    .line 2659
    invoke-direct {v1, v4, v15, v3}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2660
    .line 2661
    .line 2662
    new-array v3, v4, [Le4/d;

    .line 2663
    .line 2664
    const/16 v16, 0x0

    .line 2665
    .line 2666
    aput-object v1, v3, v16

    .line 2667
    .line 2668
    new-instance v1, Le4/d;

    .line 2669
    .line 2670
    const/4 v4, 0x4

    .line 2671
    const/16 v15, 0xfe

    .line 2672
    .line 2673
    invoke-direct {v1, v15, v4, v6}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2674
    .line 2675
    .line 2676
    new-instance v6, Le4/d;

    .line 2677
    .line 2678
    const/16 v15, 0xff

    .line 2679
    .line 2680
    invoke-direct {v6, v15, v4, v11}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2681
    .line 2682
    .line 2683
    new-instance v11, Le4/d;

    .line 2684
    .line 2685
    const-string v15, "ThumbnailImageWidth"

    .line 2686
    .line 2687
    move-object/from16 v20, v0

    .line 2688
    .line 2689
    move-object/from16 v23, v1

    .line 2690
    .line 2691
    const/4 v0, 0x3

    .line 2692
    const/16 v1, 0x100

    .line 2693
    .line 2694
    invoke-direct {v11, v1, v0, v4, v15}, Le4/d;-><init>(IIILjava/lang/String;)V

    .line 2695
    .line 2696
    .line 2697
    new-instance v1, Le4/d;

    .line 2698
    .line 2699
    const-string v15, "ThumbnailImageLength"

    .line 2700
    .line 2701
    move-object/from16 v48, v3

    .line 2702
    .line 2703
    const/16 v3, 0x101

    .line 2704
    .line 2705
    invoke-direct {v1, v3, v0, v4, v15}, Le4/d;-><init>(IIILjava/lang/String;)V

    .line 2706
    .line 2707
    .line 2708
    new-instance v3, Le4/d;

    .line 2709
    .line 2710
    const/16 v4, 0x102

    .line 2711
    .line 2712
    invoke-direct {v3, v4, v0, v8}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2713
    .line 2714
    .line 2715
    new-instance v4, Le4/d;

    .line 2716
    .line 2717
    const/16 v8, 0x103

    .line 2718
    .line 2719
    invoke-direct {v4, v8, v0, v5}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2720
    .line 2721
    .line 2722
    new-instance v5, Le4/d;

    .line 2723
    .line 2724
    const/16 v8, 0x106

    .line 2725
    .line 2726
    invoke-direct {v5, v8, v0, v10}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2727
    .line 2728
    .line 2729
    new-instance v8, Le4/d;

    .line 2730
    .line 2731
    const/16 v10, 0x10e

    .line 2732
    .line 2733
    const/4 v15, 0x2

    .line 2734
    invoke-direct {v8, v10, v15, v2}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2735
    .line 2736
    .line 2737
    new-instance v2, Le4/d;

    .line 2738
    .line 2739
    const/16 v10, 0x10f

    .line 2740
    .line 2741
    invoke-direct {v2, v10, v15, v14}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2742
    .line 2743
    .line 2744
    new-instance v10, Le4/d;

    .line 2745
    .line 2746
    const-string v14, "Model"

    .line 2747
    .line 2748
    const/16 v0, 0x110

    .line 2749
    .line 2750
    invoke-direct {v10, v0, v15, v14}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2751
    .line 2752
    .line 2753
    new-instance v0, Le4/d;

    .line 2754
    .line 2755
    move-object/from16 v33, v1

    .line 2756
    .line 2757
    const/16 v1, 0x111

    .line 2758
    .line 2759
    const/4 v14, 0x3

    .line 2760
    const/4 v15, 0x4

    .line 2761
    invoke-direct {v0, v1, v14, v15, v13}, Le4/d;-><init>(IIILjava/lang/String;)V

    .line 2762
    .line 2763
    .line 2764
    new-instance v1, Le4/d;

    .line 2765
    .line 2766
    const-string v15, "ThumbnailOrientation"

    .line 2767
    .line 2768
    move-object/from16 v36, v0

    .line 2769
    .line 2770
    const/16 v0, 0x112

    .line 2771
    .line 2772
    invoke-direct {v1, v0, v14, v15}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2773
    .line 2774
    .line 2775
    new-instance v0, Le4/d;

    .line 2776
    .line 2777
    const-string v15, "SamplesPerPixel"

    .line 2778
    .line 2779
    move-object/from16 v40, v1

    .line 2780
    .line 2781
    const/16 v1, 0x115

    .line 2782
    .line 2783
    invoke-direct {v0, v1, v14, v15}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2784
    .line 2785
    .line 2786
    new-instance v1, Le4/d;

    .line 2787
    .line 2788
    const-string v15, "RowsPerStrip"

    .line 2789
    .line 2790
    move-object/from16 v49, v0

    .line 2791
    .line 2792
    const/16 v0, 0x116

    .line 2793
    .line 2794
    move-object/from16 v51, v2

    .line 2795
    .line 2796
    const/4 v2, 0x4

    .line 2797
    invoke-direct {v1, v0, v14, v2, v15}, Le4/d;-><init>(IIILjava/lang/String;)V

    .line 2798
    .line 2799
    .line 2800
    new-instance v0, Le4/d;

    .line 2801
    .line 2802
    const-string v15, "StripByteCounts"

    .line 2803
    .line 2804
    move-object/from16 v52, v1

    .line 2805
    .line 2806
    const/16 v1, 0x117

    .line 2807
    .line 2808
    invoke-direct {v0, v1, v14, v2, v15}, Le4/d;-><init>(IIILjava/lang/String;)V

    .line 2809
    .line 2810
    .line 2811
    new-instance v1, Le4/d;

    .line 2812
    .line 2813
    const-string v2, "XResolution"

    .line 2814
    .line 2815
    const/16 v14, 0x11a

    .line 2816
    .line 2817
    const/4 v15, 0x5

    .line 2818
    invoke-direct {v1, v14, v15, v2}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2819
    .line 2820
    .line 2821
    new-instance v2, Le4/d;

    .line 2822
    .line 2823
    const-string v14, "YResolution"

    .line 2824
    .line 2825
    move-object/from16 v53, v0

    .line 2826
    .line 2827
    const/16 v0, 0x11b

    .line 2828
    .line 2829
    invoke-direct {v2, v0, v15, v14}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2830
    .line 2831
    .line 2832
    new-instance v0, Le4/d;

    .line 2833
    .line 2834
    const-string v14, "PlanarConfiguration"

    .line 2835
    .line 2836
    const/16 v15, 0x11c

    .line 2837
    .line 2838
    move-object/from16 v54, v1

    .line 2839
    .line 2840
    const/4 v1, 0x3

    .line 2841
    invoke-direct {v0, v15, v1, v14}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2842
    .line 2843
    .line 2844
    new-instance v14, Le4/d;

    .line 2845
    .line 2846
    const-string v15, "ResolutionUnit"

    .line 2847
    .line 2848
    move-object/from16 v55, v0

    .line 2849
    .line 2850
    const/16 v0, 0x128

    .line 2851
    .line 2852
    invoke-direct {v14, v0, v1, v15}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2853
    .line 2854
    .line 2855
    new-instance v0, Le4/d;

    .line 2856
    .line 2857
    const-string v15, "TransferFunction"

    .line 2858
    .line 2859
    move-object/from16 v56, v2

    .line 2860
    .line 2861
    const/16 v2, 0x12d

    .line 2862
    .line 2863
    invoke-direct {v0, v2, v1, v15}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2864
    .line 2865
    .line 2866
    new-instance v1, Le4/d;

    .line 2867
    .line 2868
    const-string v2, "Software"

    .line 2869
    .line 2870
    const/16 v15, 0x131

    .line 2871
    .line 2872
    move-object/from16 v57, v0

    .line 2873
    .line 2874
    const/4 v0, 0x2

    .line 2875
    invoke-direct {v1, v15, v0, v2}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2876
    .line 2877
    .line 2878
    new-instance v2, Le4/d;

    .line 2879
    .line 2880
    const-string v15, "DateTime"

    .line 2881
    .line 2882
    move-object/from16 v58, v1

    .line 2883
    .line 2884
    const/16 v1, 0x132

    .line 2885
    .line 2886
    invoke-direct {v2, v1, v0, v15}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2887
    .line 2888
    .line 2889
    new-instance v1, Le4/d;

    .line 2890
    .line 2891
    const-string v15, "Artist"

    .line 2892
    .line 2893
    move-object/from16 v59, v2

    .line 2894
    .line 2895
    const/16 v2, 0x13b

    .line 2896
    .line 2897
    invoke-direct {v1, v2, v0, v15}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2898
    .line 2899
    .line 2900
    new-instance v0, Le4/d;

    .line 2901
    .line 2902
    const-string v2, "WhitePoint"

    .line 2903
    .line 2904
    const/16 v15, 0x13e

    .line 2905
    .line 2906
    move-object/from16 v60, v1

    .line 2907
    .line 2908
    const/4 v1, 0x5

    .line 2909
    invoke-direct {v0, v15, v1, v2}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2910
    .line 2911
    .line 2912
    new-instance v2, Le4/d;

    .line 2913
    .line 2914
    const-string v15, "PrimaryChromaticities"

    .line 2915
    .line 2916
    move-object/from16 v61, v0

    .line 2917
    .line 2918
    const/16 v0, 0x13f

    .line 2919
    .line 2920
    invoke-direct {v2, v0, v1, v15}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2921
    .line 2922
    .line 2923
    new-instance v0, Le4/d;

    .line 2924
    .line 2925
    const/4 v1, 0x4

    .line 2926
    const/16 v15, 0x14a

    .line 2927
    .line 2928
    invoke-direct {v0, v15, v1, v12}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2929
    .line 2930
    .line 2931
    new-instance v15, Le4/d;

    .line 2932
    .line 2933
    move-object/from16 v62, v0

    .line 2934
    .line 2935
    const-string v0, "JPEGInterchangeFormat"

    .line 2936
    .line 2937
    move-object/from16 v63, v2

    .line 2938
    .line 2939
    const/16 v2, 0x201

    .line 2940
    .line 2941
    invoke-direct {v15, v2, v1, v0}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2942
    .line 2943
    .line 2944
    new-instance v0, Le4/d;

    .line 2945
    .line 2946
    const-string v2, "JPEGInterchangeFormatLength"

    .line 2947
    .line 2948
    move-object/from16 v64, v3

    .line 2949
    .line 2950
    const/16 v3, 0x202

    .line 2951
    .line 2952
    invoke-direct {v0, v3, v1, v2}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2953
    .line 2954
    .line 2955
    new-instance v1, Le4/d;

    .line 2956
    .line 2957
    const-string v2, "YCbCrCoefficients"

    .line 2958
    .line 2959
    const/16 v3, 0x211

    .line 2960
    .line 2961
    move-object/from16 v65, v0

    .line 2962
    .line 2963
    const/4 v0, 0x5

    .line 2964
    invoke-direct {v1, v3, v0, v2}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2965
    .line 2966
    .line 2967
    new-instance v0, Le4/d;

    .line 2968
    .line 2969
    const-string v2, "YCbCrSubSampling"

    .line 2970
    .line 2971
    const/16 v3, 0x212

    .line 2972
    .line 2973
    move-object/from16 v66, v1

    .line 2974
    .line 2975
    const/4 v1, 0x3

    .line 2976
    invoke-direct {v0, v3, v1, v2}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2977
    .line 2978
    .line 2979
    new-instance v2, Le4/d;

    .line 2980
    .line 2981
    const-string v3, "YCbCrPositioning"

    .line 2982
    .line 2983
    move-object/from16 v67, v0

    .line 2984
    .line 2985
    const/16 v0, 0x213

    .line 2986
    .line 2987
    invoke-direct {v2, v0, v1, v3}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 2988
    .line 2989
    .line 2990
    new-instance v0, Le4/d;

    .line 2991
    .line 2992
    const-string v1, "ReferenceBlackWhite"

    .line 2993
    .line 2994
    const/16 v3, 0x214

    .line 2995
    .line 2996
    move-object/from16 v68, v2

    .line 2997
    .line 2998
    const/4 v2, 0x5

    .line 2999
    invoke-direct {v0, v3, v2, v1}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 3000
    .line 3001
    .line 3002
    new-instance v1, Le4/d;

    .line 3003
    .line 3004
    const-string v2, "Copyright"

    .line 3005
    .line 3006
    const v3, 0x8298

    .line 3007
    .line 3008
    .line 3009
    move-object/from16 v69, v0

    .line 3010
    .line 3011
    const/4 v0, 0x2

    .line 3012
    invoke-direct {v1, v3, v0, v2}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 3013
    .line 3014
    .line 3015
    new-instance v0, Le4/d;

    .line 3016
    .line 3017
    const/4 v2, 0x4

    .line 3018
    const v3, 0x8769

    .line 3019
    .line 3020
    .line 3021
    invoke-direct {v0, v3, v2, v7}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 3022
    .line 3023
    .line 3024
    new-instance v3, Le4/d;

    .line 3025
    .line 3026
    move-object/from16 v70, v0

    .line 3027
    .line 3028
    const v0, 0x8825

    .line 3029
    .line 3030
    .line 3031
    invoke-direct {v3, v0, v2, v9}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 3032
    .line 3033
    .line 3034
    new-instance v0, Le4/d;

    .line 3035
    .line 3036
    const-string v2, "DNGVersion"

    .line 3037
    .line 3038
    move-object/from16 v71, v1

    .line 3039
    .line 3040
    const v1, 0xc612

    .line 3041
    .line 3042
    .line 3043
    move-object/from16 v73, v3

    .line 3044
    .line 3045
    const/4 v3, 0x1

    .line 3046
    invoke-direct {v0, v1, v3, v2}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 3047
    .line 3048
    .line 3049
    new-instance v1, Le4/d;

    .line 3050
    .line 3051
    const-string v2, "DefaultCropSize"

    .line 3052
    .line 3053
    const/16 v21, 0x1

    .line 3054
    .line 3055
    const v3, 0xc620

    .line 3056
    .line 3057
    .line 3058
    move-object/from16 v74, v0

    .line 3059
    .line 3060
    move-object/from16 v76, v4

    .line 3061
    .line 3062
    const/4 v0, 0x3

    .line 3063
    const/4 v4, 0x4

    .line 3064
    invoke-direct {v1, v3, v0, v4, v2}, Le4/d;-><init>(IIILjava/lang/String;)V

    .line 3065
    .line 3066
    .line 3067
    const/16 v2, 0x25

    .line 3068
    .line 3069
    new-array v2, v2, [Le4/d;

    .line 3070
    .line 3071
    const/16 v16, 0x0

    .line 3072
    .line 3073
    aput-object v23, v2, v16

    .line 3074
    .line 3075
    aput-object v6, v2, v21

    .line 3076
    .line 3077
    const/16 v27, 0x2

    .line 3078
    .line 3079
    aput-object v11, v2, v27

    .line 3080
    .line 3081
    aput-object v33, v2, v0

    .line 3082
    .line 3083
    aput-object v64, v2, v4

    .line 3084
    .line 3085
    const/16 v25, 0x5

    .line 3086
    .line 3087
    aput-object v76, v2, v25

    .line 3088
    .line 3089
    const/16 v24, 0x6

    .line 3090
    .line 3091
    aput-object v5, v2, v24

    .line 3092
    .line 3093
    const/16 v22, 0x7

    .line 3094
    .line 3095
    aput-object v8, v2, v22

    .line 3096
    .line 3097
    const/16 v19, 0x8

    .line 3098
    .line 3099
    aput-object v51, v2, v19

    .line 3100
    .line 3101
    const/16 v43, 0x9

    .line 3102
    .line 3103
    aput-object v10, v2, v43

    .line 3104
    .line 3105
    const/16 v17, 0xa

    .line 3106
    .line 3107
    aput-object v36, v2, v17

    .line 3108
    .line 3109
    const/16 v31, 0xb

    .line 3110
    .line 3111
    aput-object v40, v2, v31

    .line 3112
    .line 3113
    const/16 v32, 0xc

    .line 3114
    .line 3115
    aput-object v49, v2, v32

    .line 3116
    .line 3117
    const/16 v34, 0xd

    .line 3118
    .line 3119
    aput-object v52, v2, v34

    .line 3120
    .line 3121
    const/16 v18, 0xe

    .line 3122
    .line 3123
    aput-object v53, v2, v18

    .line 3124
    .line 3125
    const/16 v35, 0xf

    .line 3126
    .line 3127
    aput-object v54, v2, v35

    .line 3128
    .line 3129
    const/16 v38, 0x10

    .line 3130
    .line 3131
    aput-object v56, v2, v38

    .line 3132
    .line 3133
    const/16 v39, 0x11

    .line 3134
    .line 3135
    aput-object v55, v2, v39

    .line 3136
    .line 3137
    const/16 v41, 0x12

    .line 3138
    .line 3139
    aput-object v14, v2, v41

    .line 3140
    .line 3141
    const/16 v0, 0x13

    .line 3142
    .line 3143
    aput-object v57, v2, v0

    .line 3144
    .line 3145
    const/16 v0, 0x14

    .line 3146
    .line 3147
    aput-object v58, v2, v0

    .line 3148
    .line 3149
    const/16 v0, 0x15

    .line 3150
    .line 3151
    aput-object v59, v2, v0

    .line 3152
    .line 3153
    const/16 v0, 0x16

    .line 3154
    .line 3155
    aput-object v60, v2, v0

    .line 3156
    .line 3157
    const/16 v79, 0x17

    .line 3158
    .line 3159
    aput-object v61, v2, v79

    .line 3160
    .line 3161
    const/16 v0, 0x18

    .line 3162
    .line 3163
    aput-object v63, v2, v0

    .line 3164
    .line 3165
    const/16 v0, 0x19

    .line 3166
    .line 3167
    aput-object v62, v2, v0

    .line 3168
    .line 3169
    const/16 v42, 0x1a

    .line 3170
    .line 3171
    aput-object v15, v2, v42

    .line 3172
    .line 3173
    const/16 v0, 0x1b

    .line 3174
    .line 3175
    aput-object v65, v2, v0

    .line 3176
    .line 3177
    const/16 v0, 0x1c

    .line 3178
    .line 3179
    aput-object v66, v2, v0

    .line 3180
    .line 3181
    const/16 v0, 0x1d

    .line 3182
    .line 3183
    aput-object v67, v2, v0

    .line 3184
    .line 3185
    const/16 v0, 0x1e

    .line 3186
    .line 3187
    aput-object v68, v2, v0

    .line 3188
    .line 3189
    const/16 v0, 0x1f

    .line 3190
    .line 3191
    aput-object v69, v2, v0

    .line 3192
    .line 3193
    const/16 v0, 0x20

    .line 3194
    .line 3195
    aput-object v71, v2, v0

    .line 3196
    .line 3197
    const/16 v0, 0x21

    .line 3198
    .line 3199
    aput-object v70, v2, v0

    .line 3200
    .line 3201
    const/16 v0, 0x22

    .line 3202
    .line 3203
    aput-object v73, v2, v0

    .line 3204
    .line 3205
    const/16 v0, 0x23

    .line 3206
    .line 3207
    aput-object v74, v2, v0

    .line 3208
    .line 3209
    const/16 v0, 0x24

    .line 3210
    .line 3211
    aput-object v1, v2, v0

    .line 3212
    .line 3213
    new-instance v0, Le4/d;

    .line 3214
    .line 3215
    const/4 v1, 0x3

    .line 3216
    const/16 v3, 0x111

    .line 3217
    .line 3218
    invoke-direct {v0, v3, v1, v13}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 3219
    .line 3220
    .line 3221
    sput-object v0, Le4/g;->E:Le4/d;

    .line 3222
    .line 3223
    new-instance v0, Le4/d;

    .line 3224
    .line 3225
    const-string v1, "ThumbnailImage"

    .line 3226
    .line 3227
    const/4 v3, 0x7

    .line 3228
    const/16 v4, 0x100

    .line 3229
    .line 3230
    invoke-direct {v0, v4, v3, v1}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 3231
    .line 3232
    .line 3233
    new-instance v1, Le4/d;

    .line 3234
    .line 3235
    const-string v3, "CameraSettingsIFDPointer"

    .line 3236
    .line 3237
    const/16 v4, 0x2020

    .line 3238
    .line 3239
    const/4 v15, 0x4

    .line 3240
    invoke-direct {v1, v4, v15, v3}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 3241
    .line 3242
    .line 3243
    new-instance v3, Le4/d;

    .line 3244
    .line 3245
    const-string v4, "ImageProcessingIFDPointer"

    .line 3246
    .line 3247
    const/16 v5, 0x2040

    .line 3248
    .line 3249
    invoke-direct {v3, v5, v15, v4}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 3250
    .line 3251
    .line 3252
    const/4 v4, 0x3

    .line 3253
    new-array v5, v4, [Le4/d;

    .line 3254
    .line 3255
    const/16 v16, 0x0

    .line 3256
    .line 3257
    aput-object v0, v5, v16

    .line 3258
    .line 3259
    const/4 v0, 0x1

    .line 3260
    aput-object v1, v5, v0

    .line 3261
    .line 3262
    const/4 v1, 0x2

    .line 3263
    aput-object v3, v5, v1

    .line 3264
    .line 3265
    new-instance v3, Le4/d;

    .line 3266
    .line 3267
    const-string v4, "PreviewImageStart"

    .line 3268
    .line 3269
    const/16 v6, 0x101

    .line 3270
    .line 3271
    invoke-direct {v3, v6, v15, v4}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 3272
    .line 3273
    .line 3274
    new-instance v4, Le4/d;

    .line 3275
    .line 3276
    const-string v6, "PreviewImageLength"

    .line 3277
    .line 3278
    const/16 v8, 0x102

    .line 3279
    .line 3280
    invoke-direct {v4, v8, v15, v6}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 3281
    .line 3282
    .line 3283
    new-array v6, v1, [Le4/d;

    .line 3284
    .line 3285
    aput-object v3, v6, v16

    .line 3286
    .line 3287
    aput-object v4, v6, v0

    .line 3288
    .line 3289
    new-instance v1, Le4/d;

    .line 3290
    .line 3291
    const-string v3, "AspectFrame"

    .line 3292
    .line 3293
    const/16 v4, 0x1113

    .line 3294
    .line 3295
    const/4 v14, 0x3

    .line 3296
    invoke-direct {v1, v4, v14, v3}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 3297
    .line 3298
    .line 3299
    new-array v3, v0, [Le4/d;

    .line 3300
    .line 3301
    aput-object v1, v3, v16

    .line 3302
    .line 3303
    new-instance v1, Le4/d;

    .line 3304
    .line 3305
    const-string v4, "ColorSpace"

    .line 3306
    .line 3307
    const/16 v8, 0x37

    .line 3308
    .line 3309
    invoke-direct {v1, v8, v14, v4}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 3310
    .line 3311
    .line 3312
    new-array v4, v0, [Le4/d;

    .line 3313
    .line 3314
    aput-object v1, v4, v16

    .line 3315
    .line 3316
    const/16 v1, 0xa

    .line 3317
    .line 3318
    new-array v8, v1, [[Le4/d;

    .line 3319
    .line 3320
    aput-object v45, v8, v16

    .line 3321
    .line 3322
    aput-object v47, v8, v0

    .line 3323
    .line 3324
    const/16 v27, 0x2

    .line 3325
    .line 3326
    aput-object v20, v8, v27

    .line 3327
    .line 3328
    aput-object v48, v8, v14

    .line 3329
    .line 3330
    const/4 v1, 0x4

    .line 3331
    aput-object v2, v8, v1

    .line 3332
    .line 3333
    const/16 v25, 0x5

    .line 3334
    .line 3335
    aput-object v45, v8, v25

    .line 3336
    .line 3337
    const/16 v24, 0x6

    .line 3338
    .line 3339
    aput-object v5, v8, v24

    .line 3340
    .line 3341
    const/16 v22, 0x7

    .line 3342
    .line 3343
    aput-object v6, v8, v22

    .line 3344
    .line 3345
    const/16 v19, 0x8

    .line 3346
    .line 3347
    aput-object v3, v8, v19

    .line 3348
    .line 3349
    const/16 v43, 0x9

    .line 3350
    .line 3351
    aput-object v4, v8, v43

    .line 3352
    .line 3353
    sput-object v8, Le4/g;->F:[[Le4/d;

    .line 3354
    .line 3355
    new-instance v0, Le4/d;

    .line 3356
    .line 3357
    const/16 v15, 0x14a

    .line 3358
    .line 3359
    invoke-direct {v0, v15, v1, v12}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 3360
    .line 3361
    .line 3362
    new-instance v2, Le4/d;

    .line 3363
    .line 3364
    const v3, 0x8769

    .line 3365
    .line 3366
    .line 3367
    invoke-direct {v2, v3, v1, v7}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 3368
    .line 3369
    .line 3370
    new-instance v3, Le4/d;

    .line 3371
    .line 3372
    const v4, 0x8825

    .line 3373
    .line 3374
    .line 3375
    invoke-direct {v3, v4, v1, v9}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 3376
    .line 3377
    .line 3378
    new-instance v4, Le4/d;

    .line 3379
    .line 3380
    const-string v5, "InteroperabilityIFDPointer"

    .line 3381
    .line 3382
    const v6, 0xa005

    .line 3383
    .line 3384
    .line 3385
    invoke-direct {v4, v6, v1, v5}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 3386
    .line 3387
    .line 3388
    new-instance v1, Le4/d;

    .line 3389
    .line 3390
    const-string v5, "CameraSettingsIFDPointer"

    .line 3391
    .line 3392
    const/16 v6, 0x2020

    .line 3393
    .line 3394
    const/4 v15, 0x1

    .line 3395
    invoke-direct {v1, v6, v15, v5}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 3396
    .line 3397
    .line 3398
    new-instance v5, Le4/d;

    .line 3399
    .line 3400
    const-string v6, "ImageProcessingIFDPointer"

    .line 3401
    .line 3402
    const/16 v7, 0x2040

    .line 3403
    .line 3404
    invoke-direct {v5, v7, v15, v6}, Le4/d;-><init>(IILjava/lang/String;)V

    .line 3405
    .line 3406
    .line 3407
    const/4 v6, 0x6

    .line 3408
    new-array v6, v6, [Le4/d;

    .line 3409
    .line 3410
    const/16 v16, 0x0

    .line 3411
    .line 3412
    aput-object v0, v6, v16

    .line 3413
    .line 3414
    aput-object v2, v6, v15

    .line 3415
    .line 3416
    const/16 v27, 0x2

    .line 3417
    .line 3418
    aput-object v3, v6, v27

    .line 3419
    .line 3420
    const/16 v37, 0x3

    .line 3421
    .line 3422
    aput-object v4, v6, v37

    .line 3423
    .line 3424
    const/16 v29, 0x4

    .line 3425
    .line 3426
    aput-object v1, v6, v29

    .line 3427
    .line 3428
    const/16 v25, 0x5

    .line 3429
    .line 3430
    aput-object v5, v6, v25

    .line 3431
    .line 3432
    sput-object v6, Le4/g;->G:[Le4/d;

    .line 3433
    .line 3434
    const/16 v1, 0xa

    .line 3435
    .line 3436
    new-array v0, v1, [Ljava/util/HashMap;

    .line 3437
    .line 3438
    sput-object v0, Le4/g;->H:[Ljava/util/HashMap;

    .line 3439
    .line 3440
    new-array v0, v1, [Ljava/util/HashMap;

    .line 3441
    .line 3442
    sput-object v0, Le4/g;->I:[Ljava/util/HashMap;

    .line 3443
    .line 3444
    new-instance v0, Ljava/util/HashSet;

    .line 3445
    .line 3446
    const-string v1, "SubjectDistance"

    .line 3447
    .line 3448
    const-string v2, "GPSTimeStamp"

    .line 3449
    .line 3450
    const-string v3, "FNumber"

    .line 3451
    .line 3452
    const-string v4, "DigitalZoomRatio"

    .line 3453
    .line 3454
    const-string v5, "ExposureTime"

    .line 3455
    .line 3456
    filled-new-array {v3, v4, v5, v1, v2}, [Ljava/lang/String;

    .line 3457
    .line 3458
    .line 3459
    move-result-object v1

    .line 3460
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 3461
    .line 3462
    .line 3463
    move-result-object v1

    .line 3464
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 3465
    .line 3466
    .line 3467
    sput-object v0, Le4/g;->J:Ljava/util/HashSet;

    .line 3468
    .line 3469
    new-instance v0, Ljava/util/HashMap;

    .line 3470
    .line 3471
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 3472
    .line 3473
    .line 3474
    sput-object v0, Le4/g;->K:Ljava/util/HashMap;

    .line 3475
    .line 3476
    const-string v0, "US-ASCII"

    .line 3477
    .line 3478
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 3479
    .line 3480
    .line 3481
    move-result-object v0

    .line 3482
    sput-object v0, Le4/g;->L:Ljava/nio/charset/Charset;

    .line 3483
    .line 3484
    const-string v1, "Exif\u0000\u0000"

    .line 3485
    .line 3486
    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 3487
    .line 3488
    .line 3489
    move-result-object v1

    .line 3490
    sput-object v1, Le4/g;->M:[B

    .line 3491
    .line 3492
    const-string v1, "http://ns.adobe.com/xap/1.0/\u0000"

    .line 3493
    .line 3494
    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 3495
    .line 3496
    .line 3497
    move-result-object v0

    .line 3498
    sput-object v0, Le4/g;->N:[B

    .line 3499
    .line 3500
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 3501
    .line 3502
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 3503
    .line 3504
    const-string v2, "yyyy:MM:dd HH:mm:ss"

    .line 3505
    .line 3506
    invoke-direct {v0, v2, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 3507
    .line 3508
    .line 3509
    const-string v2, "UTC"

    .line 3510
    .line 3511
    invoke-static {v2}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    .line 3512
    .line 3513
    .line 3514
    move-result-object v2

    .line 3515
    invoke-virtual {v0, v2}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 3516
    .line 3517
    .line 3518
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 3519
    .line 3520
    const-string v2, "yyyy-MM-dd HH:mm:ss"

    .line 3521
    .line 3522
    invoke-direct {v0, v2, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 3523
    .line 3524
    .line 3525
    const-string v1, "UTC"

    .line 3526
    .line 3527
    invoke-static {v1}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    .line 3528
    .line 3529
    .line 3530
    move-result-object v1

    .line 3531
    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 3532
    .line 3533
    .line 3534
    const/4 v15, 0x0

    .line 3535
    :goto_0
    sget-object v0, Le4/g;->F:[[Le4/d;

    .line 3536
    .line 3537
    array-length v1, v0

    .line 3538
    if-ge v15, v1, :cond_1

    .line 3539
    .line 3540
    sget-object v1, Le4/g;->H:[Ljava/util/HashMap;

    .line 3541
    .line 3542
    new-instance v2, Ljava/util/HashMap;

    .line 3543
    .line 3544
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 3545
    .line 3546
    .line 3547
    aput-object v2, v1, v15

    .line 3548
    .line 3549
    sget-object v1, Le4/g;->I:[Ljava/util/HashMap;

    .line 3550
    .line 3551
    new-instance v2, Ljava/util/HashMap;

    .line 3552
    .line 3553
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 3554
    .line 3555
    .line 3556
    aput-object v2, v1, v15

    .line 3557
    .line 3558
    aget-object v0, v0, v15

    .line 3559
    .line 3560
    array-length v1, v0

    .line 3561
    const/4 v2, 0x0

    .line 3562
    :goto_1
    if-ge v2, v1, :cond_0

    .line 3563
    .line 3564
    aget-object v3, v0, v2

    .line 3565
    .line 3566
    sget-object v4, Le4/g;->H:[Ljava/util/HashMap;

    .line 3567
    .line 3568
    aget-object v4, v4, v15

    .line 3569
    .line 3570
    iget v5, v3, Le4/d;->a:I

    .line 3571
    .line 3572
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3573
    .line 3574
    .line 3575
    move-result-object v5

    .line 3576
    invoke-virtual {v4, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3577
    .line 3578
    .line 3579
    sget-object v4, Le4/g;->I:[Ljava/util/HashMap;

    .line 3580
    .line 3581
    aget-object v4, v4, v15

    .line 3582
    .line 3583
    iget-object v5, v3, Le4/d;->b:Ljava/lang/String;

    .line 3584
    .line 3585
    invoke-virtual {v4, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3586
    .line 3587
    .line 3588
    add-int/lit8 v2, v2, 0x1

    .line 3589
    .line 3590
    goto :goto_1

    .line 3591
    :cond_0
    add-int/lit8 v15, v15, 0x1

    .line 3592
    .line 3593
    goto :goto_0

    .line 3594
    :cond_1
    sget-object v0, Le4/g;->K:Ljava/util/HashMap;

    .line 3595
    .line 3596
    sget-object v1, Le4/g;->G:[Le4/d;

    .line 3597
    .line 3598
    const/16 v16, 0x0

    .line 3599
    .line 3600
    aget-object v2, v1, v16

    .line 3601
    .line 3602
    iget v2, v2, Le4/d;->a:I

    .line 3603
    .line 3604
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3605
    .line 3606
    .line 3607
    move-result-object v2

    .line 3608
    move-object/from16 v3, v89

    .line 3609
    .line 3610
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3611
    .line 3612
    .line 3613
    const/16 v21, 0x1

    .line 3614
    .line 3615
    aget-object v2, v1, v21

    .line 3616
    .line 3617
    iget v2, v2, Le4/d;->a:I

    .line 3618
    .line 3619
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3620
    .line 3621
    .line 3622
    move-result-object v2

    .line 3623
    move-object/from16 v3, v75

    .line 3624
    .line 3625
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3626
    .line 3627
    .line 3628
    const/16 v27, 0x2

    .line 3629
    .line 3630
    aget-object v2, v1, v27

    .line 3631
    .line 3632
    iget v2, v2, Le4/d;->a:I

    .line 3633
    .line 3634
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3635
    .line 3636
    .line 3637
    move-result-object v2

    .line 3638
    move-object/from16 v3, v72

    .line 3639
    .line 3640
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3641
    .line 3642
    .line 3643
    const/16 v37, 0x3

    .line 3644
    .line 3645
    aget-object v2, v1, v37

    .line 3646
    .line 3647
    iget v2, v2, Le4/d;->a:I

    .line 3648
    .line 3649
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3650
    .line 3651
    .line 3652
    move-result-object v2

    .line 3653
    move-object/from16 v3, v50

    .line 3654
    .line 3655
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3656
    .line 3657
    .line 3658
    const/16 v29, 0x4

    .line 3659
    .line 3660
    aget-object v2, v1, v29

    .line 3661
    .line 3662
    iget v2, v2, Le4/d;->a:I

    .line 3663
    .line 3664
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3665
    .line 3666
    .line 3667
    move-result-object v2

    .line 3668
    move-object/from16 v3, v46

    .line 3669
    .line 3670
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3671
    .line 3672
    .line 3673
    const/16 v25, 0x5

    .line 3674
    .line 3675
    aget-object v1, v1, v25

    .line 3676
    .line 3677
    iget v1, v1, Le4/d;->a:I

    .line 3678
    .line 3679
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3680
    .line 3681
    .line 3682
    move-result-object v1

    .line 3683
    move-object/from16 v2, v44

    .line 3684
    .line 3685
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3686
    .line 3687
    .line 3688
    const-string v0, ".*[1-9].*"

    .line 3689
    .line 3690
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 3691
    .line 3692
    .line 3693
    const-string v0, "^(\\d{2}):(\\d{2}):(\\d{2})$"

    .line 3694
    .line 3695
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 3696
    .line 3697
    .line 3698
    const-string v0, "^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$"

    .line 3699
    .line 3700
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 3701
    .line 3702
    .line 3703
    const-string v0, "^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$"

    .line 3704
    .line 3705
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 3706
    .line 3707
    .line 3708
    return-void

    .line 3709
    :array_0
    .array-data 1
        -0x1t
        -0x28t
        -0x1t
    .end array-data

    .line 3710
    .line 3711
    .line 3712
    .line 3713
    .line 3714
    .line 3715
    :array_1
    .array-data 1
        0x66t
        0x74t
        0x79t
        0x70t
    .end array-data

    .line 3716
    .line 3717
    .line 3718
    .line 3719
    .line 3720
    .line 3721
    :array_2
    .array-data 1
        0x6dt
        0x69t
        0x66t
        0x31t
    .end array-data

    .line 3722
    .line 3723
    .line 3724
    .line 3725
    .line 3726
    .line 3727
    :array_3
    .array-data 1
        0x68t
        0x65t
        0x69t
        0x63t
    .end array-data

    .line 3728
    .line 3729
    .line 3730
    .line 3731
    .line 3732
    .line 3733
    :array_4
    .array-data 1
        0x4ft
        0x4ct
        0x59t
        0x4dt
        0x50t
        0x0t
    .end array-data

    .line 3734
    .line 3735
    .line 3736
    .line 3737
    .line 3738
    .line 3739
    .line 3740
    nop

    .line 3741
    :array_5
    .array-data 1
        0x4ft
        0x4ct
        0x59t
        0x4dt
        0x50t
        0x55t
        0x53t
        0x0t
        0x49t
        0x49t
    .end array-data

    .line 3742
    .line 3743
    .line 3744
    .line 3745
    .line 3746
    .line 3747
    .line 3748
    .line 3749
    .line 3750
    nop

    :array_6
    .array-data 1
        -0x77t
        0x50t
        0x4et
        0x47t
        0xdt
        0xat
        0x1at
        0xat
    .end array-data

    :array_7
    .array-data 1
        0x65t
        0x58t
        0x49t
        0x66t
    .end array-data

    :array_8
    .array-data 1
        0x49t
        0x48t
        0x44t
        0x52t
    .end array-data

    :array_9
    .array-data 1
        0x49t
        0x45t
        0x4et
        0x44t
    .end array-data

    :array_a
    .array-data 1
        0x52t
        0x49t
        0x46t
        0x46t
    .end array-data

    :array_b
    .array-data 1
        0x57t
        0x45t
        0x42t
        0x50t
    .end array-data

    :array_c
    .array-data 1
        0x45t
        0x58t
        0x49t
        0x46t
    .end array-data

    :array_d
    .array-data 4
        0x0
        0x1
        0x1
        0x2
        0x4
        0x8
        0x1
        0x1
        0x2
        0x4
        0x8
        0x4
        0x8
        0x1
    .end array-data

    :array_e
    .array-data 1
        0x41t
        0x53t
        0x43t
        0x49t
        0x49t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method

.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 9

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Le4/g;->F:[[Le4/d;

    .line 5
    .line 6
    array-length v1, v0

    .line 7
    new-array v1, v1, [Ljava/util/HashMap;

    .line 8
    .line 9
    iput-object v1, p0, Le4/g;->d:[Ljava/util/HashMap;

    .line 10
    .line 11
    new-instance v1, Ljava/util/HashSet;

    .line 12
    .line 13
    array-length v2, v0

    .line 14
    invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, Le4/g;->e:Ljava/util/HashSet;

    .line 18
    .line 19
    sget-object v1, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 20
    .line 21
    iput-object v1, p0, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 22
    .line 23
    instance-of v1, p1, Landroid/content/res/AssetManager$AssetInputStream;

    .line 24
    .line 25
    sget-boolean v2, Le4/g;->l:Z

    .line 26
    .line 27
    const-string v3, "ExifInterface"

    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    move-object v1, p1

    .line 33
    check-cast v1, Landroid/content/res/AssetManager$AssetInputStream;

    .line 34
    .line 35
    iput-object v1, p0, Le4/g;->b:Landroid/content/res/AssetManager$AssetInputStream;

    .line 36
    .line 37
    iput-object v4, p0, Le4/g;->a:Ljava/io/FileDescriptor;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    instance-of v1, p1, Ljava/io/FileInputStream;

    .line 41
    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    move-object v1, p1

    .line 45
    check-cast v1, Ljava/io/FileInputStream;

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/io/FileInputStream;->getFD()Ljava/io/FileDescriptor;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    :try_start_0
    sget v6, Landroid/system/OsConstants;->SEEK_CUR:I

    .line 52
    .line 53
    const-wide/16 v7, 0x0

    .line 54
    .line 55
    invoke-static {v5, v7, v8, v6}, Le4/h;->c(Ljava/io/FileDescriptor;JI)J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    .line 57
    .line 58
    iput-object v4, p0, Le4/g;->b:Landroid/content/res/AssetManager$AssetInputStream;

    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/io/FileInputStream;->getFD()Ljava/io/FileDescriptor;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    iput-object v1, p0, Le4/g;->a:Ljava/io/FileDescriptor;

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :catch_0
    nop

    .line 68
    if-eqz v2, :cond_1

    .line 69
    .line 70
    const-string v1, "The file descriptor for the given input is not seekable"

    .line 71
    .line 72
    invoke-static {v3, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 73
    .line 74
    .line 75
    :cond_1
    iput-object v4, p0, Le4/g;->b:Landroid/content/res/AssetManager$AssetInputStream;

    .line 76
    .line 77
    iput-object v4, p0, Le4/g;->a:Ljava/io/FileDescriptor;

    .line 78
    .line 79
    :goto_0
    const/4 v1, 0x0

    .line 80
    const/4 v4, 0x0

    .line 81
    :goto_1
    :try_start_1
    array-length v5, v0

    .line 82
    if-ge v4, v5, :cond_2

    .line 83
    .line 84
    iget-object v5, p0, Le4/g;->d:[Ljava/util/HashMap;

    .line 85
    .line 86
    new-instance v6, Ljava/util/HashMap;

    .line 87
    .line 88
    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 89
    .line 90
    .line 91
    aput-object v6, v5, v4

    .line 92
    .line 93
    add-int/lit8 v4, v4, 0x1

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :catchall_0
    move-exception p1

    .line 97
    goto/16 :goto_7

    .line 98
    .line 99
    :catch_1
    move-exception p1

    .line 100
    goto/16 :goto_6

    .line 101
    .line 102
    :catch_2
    move-exception p1

    .line 103
    goto/16 :goto_6

    .line 104
    .line 105
    :cond_2
    new-instance v0, Ljava/io/BufferedInputStream;

    .line 106
    .line 107
    const/16 v4, 0x1388

    .line 108
    .line 109
    invoke-direct {v0, p1, v4}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0, v0}, Le4/g;->f(Ljava/io/BufferedInputStream;)I

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    iput p1, p0, Le4/g;->c:I

    .line 117
    .line 118
    const/16 v4, 0xe

    .line 119
    .line 120
    const/16 v5, 0xd

    .line 121
    .line 122
    const/16 v6, 0x9

    .line 123
    .line 124
    const/4 v7, 0x4

    .line 125
    if-eq p1, v7, :cond_7

    .line 126
    .line 127
    if-eq p1, v6, :cond_7

    .line 128
    .line 129
    if-eq p1, v5, :cond_7

    .line 130
    .line 131
    if-ne p1, v4, :cond_3

    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_3
    new-instance p1, Le4/f;

    .line 135
    .line 136
    invoke-direct {p1, v0}, Le4/f;-><init>(Ljava/io/InputStream;)V

    .line 137
    .line 138
    .line 139
    iget v0, p0, Le4/g;->c:I

    .line 140
    .line 141
    const/16 v1, 0xc

    .line 142
    .line 143
    if-ne v0, v1, :cond_4

    .line 144
    .line 145
    invoke-virtual {p0, p1}, Le4/g;->d(Le4/f;)V

    .line 146
    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_4
    const/4 v1, 0x7

    .line 150
    if-ne v0, v1, :cond_5

    .line 151
    .line 152
    invoke-virtual {p0, p1}, Le4/g;->g(Le4/f;)V

    .line 153
    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_5
    const/16 v1, 0xa

    .line 157
    .line 158
    if-ne v0, v1, :cond_6

    .line 159
    .line 160
    invoke-virtual {p0, p1}, Le4/g;->k(Le4/f;)V

    .line 161
    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_6
    invoke-virtual {p0, p1}, Le4/g;->j(Le4/f;)V

    .line 165
    .line 166
    .line 167
    :goto_2
    iget v0, p0, Le4/g;->h:I

    .line 168
    .line 169
    int-to-long v0, v0

    .line 170
    invoke-virtual {p1, v0, v1}, Le4/f;->g(J)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0, p1}, Le4/g;->u(Le4/b;)V

    .line 174
    .line 175
    .line 176
    goto :goto_4

    .line 177
    :cond_7
    :goto_3
    new-instance p1, Le4/b;

    .line 178
    .line 179
    invoke-direct {p1, v0}, Le4/b;-><init>(Ljava/io/InputStream;)V

    .line 180
    .line 181
    .line 182
    iget v0, p0, Le4/g;->c:I

    .line 183
    .line 184
    if-ne v0, v7, :cond_8

    .line 185
    .line 186
    invoke-virtual {p0, p1, v1, v1}, Le4/g;->e(Le4/b;II)V

    .line 187
    .line 188
    .line 189
    goto :goto_4

    .line 190
    :cond_8
    if-ne v0, v5, :cond_9

    .line 191
    .line 192
    invoke-virtual {p0, p1}, Le4/g;->h(Le4/b;)V

    .line 193
    .line 194
    .line 195
    goto :goto_4

    .line 196
    :cond_9
    if-ne v0, v6, :cond_a

    .line 197
    .line 198
    invoke-virtual {p0, p1}, Le4/g;->i(Le4/b;)V

    .line 199
    .line 200
    .line 201
    goto :goto_4

    .line 202
    :cond_a
    if-ne v0, v4, :cond_b

    .line 203
    .line 204
    invoke-virtual {p0, p1}, Le4/g;->l(Le4/b;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 205
    .line 206
    .line 207
    :cond_b
    :goto_4
    invoke-virtual {p0}, Le4/g;->a()V

    .line 208
    .line 209
    .line 210
    if-eqz v2, :cond_e

    .line 211
    .line 212
    :goto_5
    invoke-virtual {p0}, Le4/g;->p()V

    .line 213
    .line 214
    .line 215
    goto :goto_9

    .line 216
    :goto_6
    if-eqz v2, :cond_d

    .line 217
    .line 218
    :try_start_2
    const-string v0, "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."

    .line 219
    .line 220
    invoke-static {v3, v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 221
    .line 222
    .line 223
    goto :goto_8

    .line 224
    :goto_7
    invoke-virtual {p0}, Le4/g;->a()V

    .line 225
    .line 226
    .line 227
    if-eqz v2, :cond_c

    .line 228
    .line 229
    invoke-virtual {p0}, Le4/g;->p()V

    .line 230
    .line 231
    .line 232
    :cond_c
    throw p1

    .line 233
    :cond_d
    :goto_8
    invoke-virtual {p0}, Le4/g;->a()V

    .line 234
    .line 235
    .line 236
    if-eqz v2, :cond_e

    .line 237
    .line 238
    goto :goto_5

    .line 239
    :cond_e
    :goto_9
    return-void
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

.method public static q(Le4/b;)Ljava/nio/ByteOrder;
    .locals 3

    .line 1
    invoke-virtual {p0}, Le4/b;->readShort()S

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/16 v0, 0x4949

    .line 6
    .line 7
    const-string v1, "ExifInterface"

    .line 8
    .line 9
    sget-boolean v2, Le4/g;->l:Z

    .line 10
    .line 11
    if-eq p0, v0, :cond_2

    .line 12
    .line 13
    const/16 v0, 0x4d4d

    .line 14
    .line 15
    if-ne p0, v0, :cond_1

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    const-string p0, "readExifSegment: Byte Align MM"

    .line 20
    .line 21
    invoke-static {v1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    :cond_0
    sget-object p0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_1
    new-instance v0, Ljava/io/IOException;

    .line 28
    .line 29
    new-instance v1, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v2, "Invalid byte order: "

    .line 32
    .line 33
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw v0

    .line 51
    :cond_2
    if-eqz v2, :cond_3

    .line 52
    .line 53
    const-string p0, "readExifSegment: Byte Align II"

    .line 54
    .line 55
    invoke-static {v1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    :cond_3
    sget-object p0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 59
    .line 60
    return-object p0
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


# virtual methods
.method public final a()V
    .locals 8

    .line 1
    const-string v0, "DateTimeOriginal"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Le4/g;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    iget-object v2, p0, Le4/g;->d:[Ljava/util/HashMap;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const-string v3, "DateTime"

    .line 13
    .line 14
    invoke-virtual {p0, v3}, Le4/g;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    if-nez v4, :cond_0

    .line 19
    .line 20
    aget-object v4, v2, v1

    .line 21
    .line 22
    const-string v5, "\u0000"

    .line 23
    .line 24
    invoke-virtual {v0, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sget-object v5, Le4/g;->L:Ljava/nio/charset/Charset;

    .line 29
    .line 30
    invoke-virtual {v0, v5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    new-instance v5, Le4/c;

    .line 35
    .line 36
    const/4 v6, 0x2

    .line 37
    array-length v7, v0

    .line 38
    invoke-direct {v5, v0, v6, v7}, Le4/c;-><init>([BII)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v4, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    :cond_0
    const-string v0, "ImageWidth"

    .line 45
    .line 46
    invoke-virtual {p0, v0}, Le4/g;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    const-wide/16 v4, 0x0

    .line 51
    .line 52
    if-nez v3, :cond_1

    .line 53
    .line 54
    aget-object v3, v2, v1

    .line 55
    .line 56
    iget-object v6, p0, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 57
    .line 58
    invoke-static {v4, v5, v6}, Le4/c;->a(JLjava/nio/ByteOrder;)Le4/c;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    invoke-virtual {v3, v0, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    :cond_1
    const-string v0, "ImageLength"

    .line 66
    .line 67
    invoke-virtual {p0, v0}, Le4/g;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    if-nez v3, :cond_2

    .line 72
    .line 73
    aget-object v3, v2, v1

    .line 74
    .line 75
    iget-object v6, p0, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 76
    .line 77
    invoke-static {v4, v5, v6}, Le4/c;->a(JLjava/nio/ByteOrder;)Le4/c;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    invoke-virtual {v3, v0, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    :cond_2
    const-string v0, "Orientation"

    .line 85
    .line 86
    invoke-virtual {p0, v0}, Le4/g;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    if-nez v3, :cond_3

    .line 91
    .line 92
    aget-object v1, v2, v1

    .line 93
    .line 94
    iget-object v3, p0, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 95
    .line 96
    invoke-static {v4, v5, v3}, Le4/c;->a(JLjava/nio/ByteOrder;)Le4/c;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-virtual {v1, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    :cond_3
    const-string v0, "LightSource"

    .line 104
    .line 105
    invoke-virtual {p0, v0}, Le4/g;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    if-nez v1, :cond_4

    .line 110
    .line 111
    const/4 v1, 0x1

    .line 112
    aget-object v1, v2, v1

    .line 113
    .line 114
    iget-object v2, p0, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 115
    .line 116
    invoke-static {v4, v5, v2}, Le4/c;->a(JLjava/nio/ByteOrder;)Le4/c;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    :cond_4
    return-void
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
.end method

.method public final b(Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 1
    invoke-virtual {p0, p1}, Le4/g;->c(Ljava/lang/String;)Le4/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_5

    .line 7
    .line 8
    iget v2, v0, Le4/c;->a:I

    .line 9
    .line 10
    sget-object v3, Le4/g;->J:Ljava/util/HashSet;

    .line 11
    .line 12
    invoke-virtual {v3, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-nez v3, :cond_0

    .line 17
    .line 18
    iget-object p1, p0, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Le4/c;->f(Ljava/nio/ByteOrder;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1

    .line 25
    :cond_0
    const-string v3, "GPSTimeStamp"

    .line 26
    .line 27
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_4

    .line 32
    .line 33
    const/4 p1, 0x5

    .line 34
    const-string v3, "ExifInterface"

    .line 35
    .line 36
    if-eq v2, p1, :cond_1

    .line 37
    .line 38
    const/16 p1, 0xa

    .line 39
    .line 40
    if-eq v2, p1, :cond_1

    .line 41
    .line 42
    new-instance p1, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v0, "GPS Timestamp format is not rational. format="

    .line 45
    .line 46
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-static {v3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 57
    .line 58
    .line 59
    return-object v1

    .line 60
    :cond_1
    iget-object p1, p0, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 61
    .line 62
    invoke-virtual {v0, p1}, Le4/c;->g(Ljava/nio/ByteOrder;)Ljava/io/Serializable;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    check-cast p1, [Le4/e;

    .line 67
    .line 68
    if-eqz p1, :cond_3

    .line 69
    .line 70
    array-length v0, p1

    .line 71
    const/4 v2, 0x3

    .line 72
    if-eq v0, v2, :cond_2

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    const/4 v0, 0x0

    .line 76
    aget-object v1, p1, v0

    .line 77
    .line 78
    iget-wide v3, v1, Le4/e;->a:J

    .line 79
    .line 80
    long-to-float v3, v3

    .line 81
    iget-wide v4, v1, Le4/e;->b:J

    .line 82
    .line 83
    long-to-float v1, v4

    .line 84
    div-float/2addr v3, v1

    .line 85
    float-to-int v1, v3

    .line 86
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    const/4 v3, 0x1

    .line 91
    aget-object v4, p1, v3

    .line 92
    .line 93
    iget-wide v5, v4, Le4/e;->a:J

    .line 94
    .line 95
    long-to-float v5, v5

    .line 96
    iget-wide v6, v4, Le4/e;->b:J

    .line 97
    .line 98
    long-to-float v4, v6

    .line 99
    div-float/2addr v5, v4

    .line 100
    float-to-int v4, v5

    .line 101
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    const/4 v5, 0x2

    .line 106
    aget-object p1, p1, v5

    .line 107
    .line 108
    iget-wide v6, p1, Le4/e;->a:J

    .line 109
    .line 110
    long-to-float v6, v6

    .line 111
    iget-wide v7, p1, Le4/e;->b:J

    .line 112
    .line 113
    long-to-float p1, v7

    .line 114
    div-float/2addr v6, p1

    .line 115
    float-to-int p1, v6

    .line 116
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    new-array v2, v2, [Ljava/lang/Object;

    .line 121
    .line 122
    aput-object v1, v2, v0

    .line 123
    .line 124
    aput-object v4, v2, v3

    .line 125
    .line 126
    aput-object p1, v2, v5

    .line 127
    .line 128
    const-string p1, "%02d:%02d:%02d"

    .line 129
    .line 130
    invoke-static {p1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    return-object p1

    .line 135
    :cond_3
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 136
    .line 137
    const-string v2, "Invalid GPS Timestamp array. array="

    .line 138
    .line 139
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-static {v3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 154
    .line 155
    .line 156
    return-object v1

    .line 157
    :cond_4
    :try_start_0
    iget-object p1, p0, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 158
    .line 159
    invoke-virtual {v0, p1}, Le4/c;->d(Ljava/nio/ByteOrder;)D

    .line 160
    .line 161
    .line 162
    move-result-wide v2

    .line 163
    invoke-static {v2, v3}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 167
    return-object p1

    .line 168
    :catch_0
    :cond_5
    return-object v1
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

.method public final c(Ljava/lang/String;)Le4/c;
    .locals 2

    .line 1
    const-string v0, "ISOSpeedRatings"

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    sget-boolean p1, Le4/g;->l:Z

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    const-string p1, "ExifInterface"

    .line 14
    .line 15
    const-string v0, "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY."

    .line 16
    .line 17
    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    :cond_0
    const-string p1, "PhotographicSensitivity"

    .line 21
    .line 22
    :cond_1
    const/4 v0, 0x0

    .line 23
    :goto_0
    sget-object v1, Le4/g;->F:[[Le4/d;

    .line 24
    .line 25
    array-length v1, v1

    .line 26
    if-ge v0, v1, :cond_3

    .line 27
    .line 28
    iget-object v1, p0, Le4/g;->d:[Ljava/util/HashMap;

    .line 29
    .line 30
    aget-object v1, v1, v0

    .line 31
    .line 32
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Le4/c;

    .line 37
    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    return-object v1

    .line 41
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_3
    const/4 p1, 0x0

    .line 45
    return-object p1
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

.method public final d(Le4/f;)V
    .locals 13

    .line 1
    const-string v0, "yes"

    .line 2
    .line 3
    const-string v1, "Heif meta: "

    .line 4
    .line 5
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    const/16 v3, 0x1c

    .line 8
    .line 9
    if-lt v2, v3, :cond_c

    .line 10
    .line 11
    new-instance v2, Landroid/media/MediaMetadataRetriever;

    .line 12
    .line 13
    invoke-direct {v2}, Landroid/media/MediaMetadataRetriever;-><init>()V

    .line 14
    .line 15
    .line 16
    :try_start_0
    new-instance v3, Le4/a;

    .line 17
    .line 18
    invoke-direct {v3, p1}, Le4/a;-><init>(Le4/f;)V

    .line 19
    .line 20
    .line 21
    invoke-static {v2, v3}, Le4/i;->a(Landroid/media/MediaMetadataRetriever;Landroid/media/MediaDataSource;)V

    .line 22
    .line 23
    .line 24
    const/16 v3, 0x21

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    const/16 v4, 0x22

    .line 31
    .line 32
    invoke-virtual {v2, v4}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    const/16 v5, 0x1a

    .line 37
    .line 38
    invoke-virtual {v2, v5}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    const/16 v6, 0x11

    .line 43
    .line 44
    invoke-virtual {v2, v6}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    if-eqz v5, :cond_0

    .line 53
    .line 54
    const/16 v0, 0x1d

    .line 55
    .line 56
    invoke-virtual {v2, v0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    const/16 v5, 0x1e

    .line 61
    .line 62
    invoke-virtual {v2, v5}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    const/16 v6, 0x1f

    .line 67
    .line 68
    invoke-virtual {v2, v6}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    goto :goto_0

    .line 73
    :catchall_0
    move-exception p1

    .line 74
    goto/16 :goto_3

    .line 75
    .line 76
    :cond_0
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_1

    .line 81
    .line 82
    const/16 v0, 0x12

    .line 83
    .line 84
    invoke-virtual {v2, v0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    const/16 v5, 0x13

    .line 89
    .line 90
    invoke-virtual {v2, v5}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    const/16 v6, 0x18

    .line 95
    .line 96
    invoke-virtual {v2, v6}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v6
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    goto :goto_0

    .line 101
    :cond_1
    const/4 v0, 0x0

    .line 102
    move-object v5, v0

    .line 103
    move-object v6, v5

    .line 104
    :goto_0
    iget-object v7, p0, Le4/g;->d:[Ljava/util/HashMap;

    .line 105
    .line 106
    const/4 v8, 0x0

    .line 107
    if-eqz v0, :cond_2

    .line 108
    .line 109
    :try_start_1
    aget-object v9, v7, v8

    .line 110
    .line 111
    const-string v10, "ImageWidth"

    .line 112
    .line 113
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 114
    .line 115
    .line 116
    move-result v11

    .line 117
    iget-object v12, p0, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 118
    .line 119
    invoke-static {v11, v12}, Le4/c;->c(ILjava/nio/ByteOrder;)Le4/c;

    .line 120
    .line 121
    .line 122
    move-result-object v11

    .line 123
    invoke-virtual {v9, v10, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    :cond_2
    if-eqz v5, :cond_3

    .line 127
    .line 128
    aget-object v9, v7, v8

    .line 129
    .line 130
    const-string v10, "ImageLength"

    .line 131
    .line 132
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 133
    .line 134
    .line 135
    move-result v11

    .line 136
    iget-object v12, p0, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 137
    .line 138
    invoke-static {v11, v12}, Le4/c;->c(ILjava/nio/ByteOrder;)Le4/c;

    .line 139
    .line 140
    .line 141
    move-result-object v11

    .line 142
    invoke-virtual {v9, v10, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    :cond_3
    const/4 v9, 0x6

    .line 146
    if-eqz v6, :cond_7

    .line 147
    .line 148
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 149
    .line 150
    .line 151
    move-result v10

    .line 152
    const/16 v11, 0x5a

    .line 153
    .line 154
    if-eq v10, v11, :cond_6

    .line 155
    .line 156
    const/16 v11, 0xb4

    .line 157
    .line 158
    if-eq v10, v11, :cond_5

    .line 159
    .line 160
    const/16 v11, 0x10e

    .line 161
    .line 162
    if-eq v10, v11, :cond_4

    .line 163
    .line 164
    const/4 v10, 0x1

    .line 165
    goto :goto_1

    .line 166
    :cond_4
    const/16 v10, 0x8

    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_5
    const/4 v10, 0x3

    .line 170
    goto :goto_1

    .line 171
    :cond_6
    const/4 v10, 0x6

    .line 172
    :goto_1
    aget-object v7, v7, v8

    .line 173
    .line 174
    const-string v11, "Orientation"

    .line 175
    .line 176
    iget-object v12, p0, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 177
    .line 178
    invoke-static {v10, v12}, Le4/c;->c(ILjava/nio/ByteOrder;)Le4/c;

    .line 179
    .line 180
    .line 181
    move-result-object v10

    .line 182
    invoke-virtual {v7, v11, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    :cond_7
    if-eqz v3, :cond_a

    .line 186
    .line 187
    if-eqz v4, :cond_a

    .line 188
    .line 189
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 190
    .line 191
    .line 192
    move-result v3

    .line 193
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 194
    .line 195
    .line 196
    move-result v4

    .line 197
    if-le v4, v9, :cond_9

    .line 198
    .line 199
    int-to-long v10, v3

    .line 200
    invoke-virtual {p1, v10, v11}, Le4/f;->g(J)V

    .line 201
    .line 202
    .line 203
    new-array v7, v9, [B

    .line 204
    .line 205
    invoke-virtual {p1, v7}, Le4/b;->readFully([B)V

    .line 206
    .line 207
    .line 208
    add-int/2addr v3, v9

    .line 209
    add-int/lit8 v4, v4, -0x6

    .line 210
    .line 211
    sget-object v9, Le4/g;->M:[B

    .line 212
    .line 213
    invoke-static {v7, v9}, Ljava/util/Arrays;->equals([B[B)Z

    .line 214
    .line 215
    .line 216
    move-result v7

    .line 217
    if-eqz v7, :cond_8

    .line 218
    .line 219
    new-array v4, v4, [B

    .line 220
    .line 221
    invoke-virtual {p1, v4}, Le4/b;->readFully([B)V

    .line 222
    .line 223
    .line 224
    iput v3, p0, Le4/g;->h:I

    .line 225
    .line 226
    invoke-virtual {p0, v4, v8}, Le4/g;->r([BI)V

    .line 227
    .line 228
    .line 229
    goto :goto_2

    .line 230
    :cond_8
    new-instance p1, Ljava/io/IOException;

    .line 231
    .line 232
    const-string v0, "Invalid identifier"

    .line 233
    .line 234
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    throw p1

    .line 238
    :cond_9
    new-instance p1, Ljava/io/IOException;

    .line 239
    .line 240
    const-string v0, "Invalid exif length"

    .line 241
    .line 242
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    throw p1

    .line 246
    :cond_a
    :goto_2
    sget-boolean p1, Le4/g;->l:Z

    .line 247
    .line 248
    if-eqz p1, :cond_b

    .line 249
    .line 250
    const-string p1, "ExifInterface"

    .line 251
    .line 252
    new-instance v3, Ljava/lang/StringBuilder;

    .line 253
    .line 254
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    const-string v0, "x"

    .line 261
    .line 262
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    const-string v0, ", rotation "

    .line 269
    .line 270
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 281
    .line 282
    .line 283
    :cond_b
    invoke-virtual {v2}, Landroid/media/MediaMetadataRetriever;->release()V

    .line 284
    .line 285
    .line 286
    return-void

    .line 287
    :catch_0
    :try_start_2
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 288
    .line 289
    const-string v0, "Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported."

    .line 290
    .line 291
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 295
    :goto_3
    invoke-virtual {v2}, Landroid/media/MediaMetadataRetriever;->release()V

    .line 296
    .line 297
    .line 298
    throw p1

    .line 299
    :cond_c
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 300
    .line 301
    const-string v0, "Reading EXIF from HEIF files is supported from SDK 28 and above"

    .line 302
    .line 303
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    throw p1
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
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
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
.end method

.method public final e(Le4/b;II)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    const-string v3, "ExifInterface"

    .line 8
    .line 9
    sget-boolean v4, Le4/g;->l:Z

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    new-instance v5, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v6, "getJpegAttributes starting with: "

    .line 16
    .line 17
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    invoke-static {v3, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    :cond_0
    sget-object v5, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 31
    .line 32
    iput-object v5, v1, Le4/b;->c:Ljava/nio/ByteOrder;

    .line 33
    .line 34
    invoke-virtual {v1}, Le4/b;->readByte()B

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    const-string v6, "Invalid marker: "

    .line 39
    .line 40
    const/4 v7, -0x1

    .line 41
    if-ne v5, v7, :cond_17

    .line 42
    .line 43
    invoke-virtual {v1}, Le4/b;->readByte()B

    .line 44
    .line 45
    .line 46
    move-result v8

    .line 47
    const/16 v9, -0x28

    .line 48
    .line 49
    if-ne v8, v9, :cond_16

    .line 50
    .line 51
    const/4 v5, 0x2

    .line 52
    const/4 v6, 0x2

    .line 53
    :goto_0
    invoke-virtual {v1}, Le4/b;->readByte()B

    .line 54
    .line 55
    .line 56
    move-result v8

    .line 57
    if-ne v8, v7, :cond_15

    .line 58
    .line 59
    invoke-virtual {v1}, Le4/b;->readByte()B

    .line 60
    .line 61
    .line 62
    move-result v8

    .line 63
    if-eqz v4, :cond_1

    .line 64
    .line 65
    new-instance v9, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    const-string v10, "Found JPEG segment indicator: "

    .line 68
    .line 69
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    and-int/lit16 v10, v8, 0xff

    .line 73
    .line 74
    invoke-static {v10}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v10

    .line 78
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v9

    .line 85
    invoke-static {v3, v9}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 86
    .line 87
    .line 88
    :cond_1
    const/16 v9, -0x27

    .line 89
    .line 90
    if-eq v8, v9, :cond_14

    .line 91
    .line 92
    const/16 v9, -0x26

    .line 93
    .line 94
    if-ne v8, v9, :cond_2

    .line 95
    .line 96
    goto/16 :goto_9

    .line 97
    .line 98
    :cond_2
    invoke-virtual {v1}, Le4/b;->readUnsignedShort()I

    .line 99
    .line 100
    .line 101
    move-result v9

    .line 102
    add-int/lit8 v10, v9, -0x2

    .line 103
    .line 104
    const/4 v11, 0x4

    .line 105
    add-int/2addr v6, v11

    .line 106
    if-eqz v4, :cond_3

    .line 107
    .line 108
    new-instance v12, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    const-string v13, "JPEG segment: "

    .line 111
    .line 112
    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    and-int/lit16 v13, v8, 0xff

    .line 116
    .line 117
    invoke-static {v13}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v13

    .line 121
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    const-string v13, " (length: "

    .line 125
    .line 126
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    const-string v13, ")"

    .line 133
    .line 134
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v12

    .line 141
    invoke-static {v3, v12}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 142
    .line 143
    .line 144
    :cond_3
    const-string v12, "Invalid length"

    .line 145
    .line 146
    if-ltz v10, :cond_13

    .line 147
    .line 148
    const/16 v13, -0x1f

    .line 149
    .line 150
    const/4 v14, 0x0

    .line 151
    iget-object v15, v0, Le4/g;->d:[Ljava/util/HashMap;

    .line 152
    .line 153
    if-eq v8, v13, :cond_8

    .line 154
    .line 155
    const/4 v13, -0x2

    .line 156
    const/4 v7, 0x1

    .line 157
    if-eq v8, v13, :cond_6

    .line 158
    .line 159
    packed-switch v8, :pswitch_data_0

    .line 160
    .line 161
    .line 162
    packed-switch v8, :pswitch_data_1

    .line 163
    .line 164
    .line 165
    packed-switch v8, :pswitch_data_2

    .line 166
    .line 167
    .line 168
    packed-switch v8, :pswitch_data_3

    .line 169
    .line 170
    .line 171
    goto/16 :goto_8

    .line 172
    .line 173
    :pswitch_0
    invoke-virtual {v1, v7}, Le4/b;->b(I)V

    .line 174
    .line 175
    .line 176
    aget-object v7, v15, v2

    .line 177
    .line 178
    if-eq v2, v11, :cond_4

    .line 179
    .line 180
    const-string v8, "ImageLength"

    .line 181
    .line 182
    goto :goto_1

    .line 183
    :cond_4
    const-string v8, "ThumbnailImageLength"

    .line 184
    .line 185
    :goto_1
    invoke-virtual {v1}, Le4/b;->readUnsignedShort()I

    .line 186
    .line 187
    .line 188
    move-result v10

    .line 189
    int-to-long v13, v10

    .line 190
    iget-object v10, v0, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 191
    .line 192
    invoke-static {v13, v14, v10}, Le4/c;->a(JLjava/nio/ByteOrder;)Le4/c;

    .line 193
    .line 194
    .line 195
    move-result-object v10

    .line 196
    invoke-virtual {v7, v8, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    aget-object v7, v15, v2

    .line 200
    .line 201
    if-eq v2, v11, :cond_5

    .line 202
    .line 203
    const-string v8, "ImageWidth"

    .line 204
    .line 205
    goto :goto_2

    .line 206
    :cond_5
    const-string v8, "ThumbnailImageWidth"

    .line 207
    .line 208
    :goto_2
    invoke-virtual {v1}, Le4/b;->readUnsignedShort()I

    .line 209
    .line 210
    .line 211
    move-result v10

    .line 212
    int-to-long v10, v10

    .line 213
    iget-object v13, v0, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 214
    .line 215
    invoke-static {v10, v11, v13}, Le4/c;->a(JLjava/nio/ByteOrder;)Le4/c;

    .line 216
    .line 217
    .line 218
    move-result-object v10

    .line 219
    invoke-virtual {v7, v8, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    add-int/lit8 v10, v9, -0x7

    .line 223
    .line 224
    goto/16 :goto_8

    .line 225
    .line 226
    :cond_6
    new-array v8, v10, [B

    .line 227
    .line 228
    invoke-virtual {v1, v8}, Le4/b;->readFully([B)V

    .line 229
    .line 230
    .line 231
    const-string v9, "UserComment"

    .line 232
    .line 233
    invoke-virtual {v0, v9}, Le4/g;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v10

    .line 237
    if-nez v10, :cond_7

    .line 238
    .line 239
    aget-object v7, v15, v7

    .line 240
    .line 241
    new-instance v10, Ljava/lang/String;

    .line 242
    .line 243
    sget-object v11, Le4/g;->L:Ljava/nio/charset/Charset;

    .line 244
    .line 245
    invoke-direct {v10, v8, v11}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 246
    .line 247
    .line 248
    const-string v8, "\u0000"

    .line 249
    .line 250
    invoke-virtual {v10, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v8

    .line 254
    invoke-virtual {v8, v11}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 255
    .line 256
    .line 257
    move-result-object v8

    .line 258
    new-instance v10, Le4/c;

    .line 259
    .line 260
    array-length v11, v8

    .line 261
    invoke-direct {v10, v8, v5, v11}, Le4/c;-><init>([BII)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v7, v9, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    :cond_7
    :goto_3
    const/4 v10, 0x0

    .line 268
    goto/16 :goto_8

    .line 269
    .line 270
    :cond_8
    new-array v7, v10, [B

    .line 271
    .line 272
    invoke-virtual {v1, v7}, Le4/b;->readFully([B)V

    .line 273
    .line 274
    .line 275
    add-int v8, v6, v10

    .line 276
    .line 277
    sget-object v9, Le4/g;->M:[B

    .line 278
    .line 279
    if-nez v9, :cond_9

    .line 280
    .line 281
    goto :goto_5

    .line 282
    :cond_9
    array-length v11, v9

    .line 283
    if-ge v10, v11, :cond_a

    .line 284
    .line 285
    goto :goto_5

    .line 286
    :cond_a
    const/4 v11, 0x0

    .line 287
    :goto_4
    array-length v13, v9

    .line 288
    if-ge v11, v13, :cond_10

    .line 289
    .line 290
    aget-byte v13, v7, v11

    .line 291
    .line 292
    aget-byte v5, v9, v11

    .line 293
    .line 294
    if-eq v13, v5, :cond_f

    .line 295
    .line 296
    :goto_5
    sget-object v5, Le4/g;->N:[B

    .line 297
    .line 298
    if-nez v5, :cond_b

    .line 299
    .line 300
    goto :goto_7

    .line 301
    :cond_b
    array-length v9, v5

    .line 302
    if-ge v10, v9, :cond_c

    .line 303
    .line 304
    goto :goto_7

    .line 305
    :cond_c
    const/4 v9, 0x0

    .line 306
    :goto_6
    array-length v11, v5

    .line 307
    if-ge v9, v11, :cond_e

    .line 308
    .line 309
    aget-byte v11, v7, v9

    .line 310
    .line 311
    aget-byte v13, v5, v9

    .line 312
    .line 313
    if-eq v11, v13, :cond_d

    .line 314
    .line 315
    goto :goto_7

    .line 316
    :cond_d
    add-int/lit8 v9, v9, 0x1

    .line 317
    .line 318
    goto :goto_6

    .line 319
    :cond_e
    array-length v9, v5

    .line 320
    add-int/2addr v6, v9

    .line 321
    array-length v5, v5

    .line 322
    invoke-static {v7, v5, v10}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 323
    .line 324
    .line 325
    move-result-object v5

    .line 326
    const-string v7, "Xmp"

    .line 327
    .line 328
    invoke-virtual {v0, v7}, Le4/g;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v9

    .line 332
    if-nez v9, :cond_11

    .line 333
    .line 334
    aget-object v9, v15, v14

    .line 335
    .line 336
    new-instance v16, Le4/c;

    .line 337
    .line 338
    array-length v10, v5

    .line 339
    int-to-long v14, v6

    .line 340
    const/16 v20, 0x1

    .line 341
    .line 342
    move-object/from16 v19, v5

    .line 343
    .line 344
    move/from16 v21, v10

    .line 345
    .line 346
    move-wide/from16 v17, v14

    .line 347
    .line 348
    invoke-direct/range {v16 .. v21}, Le4/c;-><init>(J[BII)V

    .line 349
    .line 350
    .line 351
    move-object/from16 v5, v16

    .line 352
    .line 353
    invoke-virtual {v9, v7, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    goto :goto_7

    .line 357
    :cond_f
    add-int/lit8 v11, v11, 0x1

    .line 358
    .line 359
    const/4 v5, 0x2

    .line 360
    const/4 v14, 0x0

    .line 361
    goto :goto_4

    .line 362
    :cond_10
    array-length v5, v9

    .line 363
    invoke-static {v7, v5, v10}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 364
    .line 365
    .line 366
    move-result-object v5

    .line 367
    add-int v6, p2, v6

    .line 368
    .line 369
    array-length v7, v9

    .line 370
    add-int/2addr v6, v7

    .line 371
    iput v6, v0, Le4/g;->h:I

    .line 372
    .line 373
    invoke-virtual {v0, v5, v2}, Le4/g;->r([BI)V

    .line 374
    .line 375
    .line 376
    new-instance v6, Le4/b;

    .line 377
    .line 378
    invoke-direct {v6, v5}, Le4/b;-><init>([B)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v0, v6}, Le4/g;->u(Le4/b;)V

    .line 382
    .line 383
    .line 384
    :cond_11
    :goto_7
    move v6, v8

    .line 385
    goto :goto_3

    .line 386
    :goto_8
    if-ltz v10, :cond_12

    .line 387
    .line 388
    invoke-virtual {v1, v10}, Le4/b;->b(I)V

    .line 389
    .line 390
    .line 391
    add-int/2addr v6, v10

    .line 392
    const/4 v5, 0x2

    .line 393
    const/4 v7, -0x1

    .line 394
    goto/16 :goto_0

    .line 395
    .line 396
    :cond_12
    new-instance v1, Ljava/io/IOException;

    .line 397
    .line 398
    invoke-direct {v1, v12}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    throw v1

    .line 402
    :cond_13
    new-instance v1, Ljava/io/IOException;

    .line 403
    .line 404
    invoke-direct {v1, v12}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 405
    .line 406
    .line 407
    throw v1

    .line 408
    :cond_14
    :goto_9
    iget-object v2, v0, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 409
    .line 410
    iput-object v2, v1, Le4/b;->c:Ljava/nio/ByteOrder;

    .line 411
    .line 412
    return-void

    .line 413
    :cond_15
    new-instance v1, Ljava/io/IOException;

    .line 414
    .line 415
    new-instance v2, Ljava/lang/StringBuilder;

    .line 416
    .line 417
    const-string v3, "Invalid marker:"

    .line 418
    .line 419
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 420
    .line 421
    .line 422
    and-int/lit16 v3, v8, 0xff

    .line 423
    .line 424
    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v3

    .line 428
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 429
    .line 430
    .line 431
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v2

    .line 435
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 436
    .line 437
    .line 438
    throw v1

    .line 439
    :cond_16
    new-instance v1, Ljava/io/IOException;

    .line 440
    .line 441
    new-instance v2, Ljava/lang/StringBuilder;

    .line 442
    .line 443
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 444
    .line 445
    .line 446
    and-int/lit16 v3, v5, 0xff

    .line 447
    .line 448
    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object v3

    .line 452
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 453
    .line 454
    .line 455
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object v2

    .line 459
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 460
    .line 461
    .line 462
    throw v1

    .line 463
    :cond_17
    new-instance v1, Ljava/io/IOException;

    .line 464
    .line 465
    new-instance v2, Ljava/lang/StringBuilder;

    .line 466
    .line 467
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 468
    .line 469
    .line 470
    and-int/lit16 v3, v5, 0xff

    .line 471
    .line 472
    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 473
    .line 474
    .line 475
    move-result-object v3

    .line 476
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 477
    .line 478
    .line 479
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 480
    .line 481
    .line 482
    move-result-object v2

    .line 483
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 484
    .line 485
    .line 486
    throw v1

    .line 487
    :pswitch_data_0
    .packed-switch -0x40
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    :pswitch_data_1
    .packed-switch -0x3b
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    :pswitch_data_2
    .packed-switch -0x37
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    :pswitch_data_3
    .packed-switch -0x33
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
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
.end method

.method public final f(Ljava/io/BufferedInputStream;)I
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const/16 v2, 0x1388

    .line 6
    .line 7
    invoke-virtual {v0, v2}, Ljava/io/BufferedInputStream;->mark(I)V

    .line 8
    .line 9
    .line 10
    new-array v3, v2, [B

    .line 11
    .line 12
    invoke-virtual {v0, v3}, Ljava/io/InputStream;->read([B)I

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/io/BufferedInputStream;->reset()V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    :goto_0
    sget-object v5, Le4/g;->o:[B

    .line 20
    .line 21
    array-length v6, v5

    .line 22
    const/4 v7, 0x4

    .line 23
    if-ge v0, v6, :cond_21

    .line 24
    .line 25
    aget-byte v6, v3, v0

    .line 26
    .line 27
    aget-byte v5, v5, v0

    .line 28
    .line 29
    if-eq v6, v5, :cond_20

    .line 30
    .line 31
    const-string v0, "FUJIFILMCCD-RAW"

    .line 32
    .line 33
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    invoke-virtual {v0, v5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    const/4 v5, 0x0

    .line 42
    :goto_1
    array-length v6, v0

    .line 43
    if-ge v5, v6, :cond_1f

    .line 44
    .line 45
    aget-byte v6, v3, v5

    .line 46
    .line 47
    aget-byte v8, v0, v5

    .line 48
    .line 49
    if-eq v6, v8, :cond_1e

    .line 50
    .line 51
    const/4 v6, 0x1

    .line 52
    :try_start_0
    new-instance v8, Le4/b;

    .line 53
    .line 54
    invoke-direct {v8, v3}, Le4/b;-><init>([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 55
    .line 56
    .line 57
    :try_start_1
    invoke-virtual {v8}, Le4/b;->readInt()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    int-to-long v9, v0

    .line 62
    new-array v0, v7, [B

    .line 63
    .line 64
    invoke-virtual {v8, v0}, Le4/b;->readFully([B)V

    .line 65
    .line 66
    .line 67
    sget-object v11, Le4/g;->p:[B

    .line 68
    .line 69
    invoke-static {v0, v11}, Ljava/util/Arrays;->equals([B[B)Z

    .line 70
    .line 71
    .line 72
    move-result v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 73
    if-nez v0, :cond_0

    .line 74
    .line 75
    :goto_2
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V

    .line 76
    .line 77
    .line 78
    const/16 p1, 0x0

    .line 79
    .line 80
    goto/16 :goto_a

    .line 81
    .line 82
    :cond_0
    const-wide/16 v11, 0x8

    .line 83
    .line 84
    const-wide/16 v13, 0x1

    .line 85
    .line 86
    cmp-long v0, v9, v13

    .line 87
    .line 88
    if-nez v0, :cond_2

    .line 89
    .line 90
    :try_start_2
    invoke-virtual {v8}, Le4/b;->readLong()J

    .line 91
    .line 92
    .line 93
    move-result-wide v9
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 94
    const-wide/16 v15, 0x10

    .line 95
    .line 96
    cmp-long v0, v9, v15

    .line 97
    .line 98
    if-gez v0, :cond_1

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_1
    :goto_3
    const/16 p1, 0x0

    .line 102
    .line 103
    goto :goto_4

    .line 104
    :catchall_0
    move-exception v0

    .line 105
    move-object v5, v8

    .line 106
    goto/16 :goto_1a

    .line 107
    .line 108
    :catch_0
    move-exception v0

    .line 109
    const/16 p1, 0x0

    .line 110
    .line 111
    goto :goto_9

    .line 112
    :cond_2
    move-wide v15, v11

    .line 113
    goto :goto_3

    .line 114
    :goto_4
    int-to-long v4, v2

    .line 115
    cmp-long v0, v9, v4

    .line 116
    .line 117
    if-lez v0, :cond_3

    .line 118
    .line 119
    move-wide v9, v4

    .line 120
    :cond_3
    sub-long/2addr v9, v15

    .line 121
    cmp-long v0, v9, v11

    .line 122
    .line 123
    if-gez v0, :cond_5

    .line 124
    .line 125
    :catch_1
    :cond_4
    :goto_5
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V

    .line 126
    .line 127
    .line 128
    goto :goto_a

    .line 129
    :cond_5
    :try_start_3
    new-array v0, v7, [B

    .line 130
    .line 131
    const-wide/16 v4, 0x0

    .line 132
    .line 133
    const/4 v2, 0x0

    .line 134
    const/4 v11, 0x0

    .line 135
    :goto_6
    const-wide/16 v15, 0x4

    .line 136
    .line 137
    div-long v15, v9, v15
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 138
    .line 139
    cmp-long v12, v4, v15

    .line 140
    .line 141
    if-gez v12, :cond_4

    .line 142
    .line 143
    :try_start_4
    invoke-virtual {v8, v0}, Le4/b;->readFully([B)V
    :try_end_4
    .catch Ljava/io/EOFException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 144
    .line 145
    .line 146
    cmp-long v12, v4, v13

    .line 147
    .line 148
    if-nez v12, :cond_6

    .line 149
    .line 150
    goto :goto_8

    .line 151
    :cond_6
    :try_start_5
    sget-object v12, Le4/g;->q:[B

    .line 152
    .line 153
    invoke-static {v0, v12}, Ljava/util/Arrays;->equals([B[B)Z

    .line 154
    .line 155
    .line 156
    move-result v12

    .line 157
    if-eqz v12, :cond_7

    .line 158
    .line 159
    const/4 v2, 0x1

    .line 160
    goto :goto_7

    .line 161
    :cond_7
    sget-object v12, Le4/g;->r:[B

    .line 162
    .line 163
    invoke-static {v0, v12}, Ljava/util/Arrays;->equals([B[B)Z

    .line 164
    .line 165
    .line 166
    move-result v12
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 167
    if-eqz v12, :cond_8

    .line 168
    .line 169
    const/4 v11, 0x1

    .line 170
    :cond_8
    :goto_7
    if-eqz v2, :cond_9

    .line 171
    .line 172
    if-eqz v11, :cond_9

    .line 173
    .line 174
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V

    .line 175
    .line 176
    .line 177
    const/16 v0, 0xc

    .line 178
    .line 179
    return v0

    .line 180
    :cond_9
    :goto_8
    add-long/2addr v4, v13

    .line 181
    goto :goto_6

    .line 182
    :catch_2
    move-exception v0

    .line 183
    goto :goto_9

    .line 184
    :catchall_1
    move-exception v0

    .line 185
    const/4 v5, 0x0

    .line 186
    goto/16 :goto_1a

    .line 187
    .line 188
    :catch_3
    move-exception v0

    .line 189
    const/16 p1, 0x0

    .line 190
    .line 191
    const/4 v8, 0x0

    .line 192
    :goto_9
    :try_start_6
    sget-boolean v2, Le4/g;->l:Z

    .line 193
    .line 194
    if-eqz v2, :cond_a

    .line 195
    .line 196
    const-string v2, "ExifInterface"

    .line 197
    .line 198
    const-string v4, "Exception parsing HEIF file type box."

    .line 199
    .line 200
    invoke-static {v2, v4, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 201
    .line 202
    .line 203
    :cond_a
    if-eqz v8, :cond_b

    .line 204
    .line 205
    goto :goto_5

    .line 206
    :cond_b
    :goto_a
    :try_start_7
    new-instance v2, Le4/b;

    .line 207
    .line 208
    invoke-direct {v2, v3}, Le4/b;-><init>([B)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_5
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 209
    .line 210
    .line 211
    :try_start_8
    invoke-static {v2}, Le4/g;->q(Le4/b;)Ljava/nio/ByteOrder;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    iput-object v0, v1, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 216
    .line 217
    iput-object v0, v2, Le4/b;->c:Ljava/nio/ByteOrder;

    .line 218
    .line 219
    invoke-virtual {v2}, Le4/b;->readShort()S

    .line 220
    .line 221
    .line 222
    move-result v0
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_4
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 223
    const/16 v4, 0x4f52

    .line 224
    .line 225
    if-eq v0, v4, :cond_d

    .line 226
    .line 227
    const/16 v4, 0x5352

    .line 228
    .line 229
    if-ne v0, v4, :cond_c

    .line 230
    .line 231
    goto :goto_b

    .line 232
    :cond_c
    const/4 v0, 0x0

    .line 233
    goto :goto_c

    .line 234
    :cond_d
    :goto_b
    const/4 v0, 0x1

    .line 235
    :goto_c
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 236
    .line 237
    .line 238
    goto :goto_f

    .line 239
    :catchall_2
    move-exception v0

    .line 240
    move-object v5, v2

    .line 241
    goto :goto_d

    .line 242
    :catch_4
    nop

    .line 243
    goto :goto_e

    .line 244
    :catchall_3
    move-exception v0

    .line 245
    const/4 v5, 0x0

    .line 246
    goto :goto_d

    .line 247
    :catch_5
    nop

    .line 248
    const/4 v2, 0x0

    .line 249
    goto :goto_e

    .line 250
    :goto_d
    if-eqz v5, :cond_e

    .line 251
    .line 252
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V

    .line 253
    .line 254
    .line 255
    :cond_e
    throw v0

    .line 256
    :goto_e
    if-eqz v2, :cond_f

    .line 257
    .line 258
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 259
    .line 260
    .line 261
    :cond_f
    const/4 v0, 0x0

    .line 262
    :goto_f
    if-eqz v0, :cond_10

    .line 263
    .line 264
    const/4 v0, 0x7

    .line 265
    return v0

    .line 266
    :cond_10
    :try_start_9
    new-instance v2, Le4/b;

    .line 267
    .line 268
    invoke-direct {v2, v3}, Le4/b;-><init>([B)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_7
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 269
    .line 270
    .line 271
    :try_start_a
    invoke-static {v2}, Le4/g;->q(Le4/b;)Ljava/nio/ByteOrder;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    iput-object v0, v1, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 276
    .line 277
    iput-object v0, v2, Le4/b;->c:Ljava/nio/ByteOrder;

    .line 278
    .line 279
    invoke-virtual {v2}, Le4/b;->readShort()S

    .line 280
    .line 281
    .line 282
    move-result v0
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_6
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 283
    const/16 v4, 0x55

    .line 284
    .line 285
    if-ne v0, v4, :cond_11

    .line 286
    .line 287
    const/4 v0, 0x1

    .line 288
    goto :goto_10

    .line 289
    :cond_11
    const/4 v0, 0x0

    .line 290
    :goto_10
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 291
    .line 292
    .line 293
    goto :goto_13

    .line 294
    :catchall_4
    move-exception v0

    .line 295
    move-object v5, v2

    .line 296
    goto :goto_11

    .line 297
    :catch_6
    nop

    .line 298
    move-object v5, v2

    .line 299
    goto :goto_12

    .line 300
    :catchall_5
    move-exception v0

    .line 301
    const/4 v5, 0x0

    .line 302
    goto :goto_11

    .line 303
    :catch_7
    nop

    .line 304
    const/4 v5, 0x0

    .line 305
    goto :goto_12

    .line 306
    :goto_11
    if-eqz v5, :cond_12

    .line 307
    .line 308
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V

    .line 309
    .line 310
    .line 311
    :cond_12
    throw v0

    .line 312
    :goto_12
    if-eqz v5, :cond_13

    .line 313
    .line 314
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V

    .line 315
    .line 316
    .line 317
    :cond_13
    const/4 v0, 0x0

    .line 318
    :goto_13
    if-eqz v0, :cond_14

    .line 319
    .line 320
    const/16 v0, 0xa

    .line 321
    .line 322
    return v0

    .line 323
    :cond_14
    const/4 v0, 0x0

    .line 324
    :goto_14
    sget-object v2, Le4/g;->u:[B

    .line 325
    .line 326
    array-length v4, v2

    .line 327
    if-ge v0, v4, :cond_16

    .line 328
    .line 329
    aget-byte v4, v3, v0

    .line 330
    .line 331
    aget-byte v2, v2, v0

    .line 332
    .line 333
    if-eq v4, v2, :cond_15

    .line 334
    .line 335
    const/4 v0, 0x0

    .line 336
    goto :goto_15

    .line 337
    :cond_15
    add-int/lit8 v0, v0, 0x1

    .line 338
    .line 339
    goto :goto_14

    .line 340
    :cond_16
    const/4 v0, 0x1

    .line 341
    :goto_15
    if-eqz v0, :cond_17

    .line 342
    .line 343
    const/16 v0, 0xd

    .line 344
    .line 345
    return v0

    .line 346
    :cond_17
    const/4 v0, 0x0

    .line 347
    :goto_16
    sget-object v2, Le4/g;->y:[B

    .line 348
    .line 349
    array-length v4, v2

    .line 350
    if-ge v0, v4, :cond_19

    .line 351
    .line 352
    aget-byte v4, v3, v0

    .line 353
    .line 354
    aget-byte v2, v2, v0

    .line 355
    .line 356
    if-eq v4, v2, :cond_18

    .line 357
    .line 358
    :goto_17
    const/4 v6, 0x0

    .line 359
    goto :goto_19

    .line 360
    :cond_18
    add-int/lit8 v0, v0, 0x1

    .line 361
    .line 362
    goto :goto_16

    .line 363
    :cond_19
    const/4 v0, 0x0

    .line 364
    :goto_18
    sget-object v4, Le4/g;->z:[B

    .line 365
    .line 366
    array-length v5, v4

    .line 367
    if-ge v0, v5, :cond_1b

    .line 368
    .line 369
    array-length v5, v2

    .line 370
    add-int/2addr v5, v0

    .line 371
    add-int/2addr v5, v7

    .line 372
    aget-byte v5, v3, v5

    .line 373
    .line 374
    aget-byte v4, v4, v0

    .line 375
    .line 376
    if-eq v5, v4, :cond_1a

    .line 377
    .line 378
    goto :goto_17

    .line 379
    :cond_1a
    add-int/lit8 v0, v0, 0x1

    .line 380
    .line 381
    goto :goto_18

    .line 382
    :cond_1b
    :goto_19
    if-eqz v6, :cond_1c

    .line 383
    .line 384
    const/16 v0, 0xe

    .line 385
    .line 386
    return v0

    .line 387
    :cond_1c
    return p1

    .line 388
    :goto_1a
    if-eqz v5, :cond_1d

    .line 389
    .line 390
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V

    .line 391
    .line 392
    .line 393
    :cond_1d
    throw v0

    .line 394
    :cond_1e
    const/16 p1, 0x0

    .line 395
    .line 396
    add-int/lit8 v5, v5, 0x1

    .line 397
    .line 398
    goto/16 :goto_1

    .line 399
    .line 400
    :cond_1f
    const/16 v0, 0x9

    .line 401
    .line 402
    return v0

    .line 403
    :cond_20
    const/16 p1, 0x0

    .line 404
    .line 405
    add-int/lit8 v0, v0, 0x1

    .line 406
    .line 407
    goto/16 :goto_0

    .line 408
    .line 409
    :cond_21
    return v7
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
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
.end method

.method public final g(Le4/f;)V
    .locals 6

    .line 1
    invoke-virtual {p0, p1}, Le4/g;->j(Le4/f;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Le4/g;->d:[Ljava/util/HashMap;

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    aget-object v1, p1, v0

    .line 8
    .line 9
    const-string v2, "MakerNote"

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Le4/c;

    .line 16
    .line 17
    if-eqz v1, :cond_6

    .line 18
    .line 19
    new-instance v2, Le4/f;

    .line 20
    .line 21
    iget-object v1, v1, Le4/c;->d:[B

    .line 22
    .line 23
    invoke-direct {v2, v1}, Le4/f;-><init>([B)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 27
    .line 28
    iput-object v1, v2, Le4/b;->c:Ljava/nio/ByteOrder;

    .line 29
    .line 30
    sget-object v1, Le4/g;->s:[B

    .line 31
    .line 32
    array-length v3, v1

    .line 33
    new-array v3, v3, [B

    .line 34
    .line 35
    invoke-virtual {v2, v3}, Le4/b;->readFully([B)V

    .line 36
    .line 37
    .line 38
    const-wide/16 v4, 0x0

    .line 39
    .line 40
    invoke-virtual {v2, v4, v5}, Le4/f;->g(J)V

    .line 41
    .line 42
    .line 43
    sget-object v4, Le4/g;->t:[B

    .line 44
    .line 45
    array-length v5, v4

    .line 46
    new-array v5, v5, [B

    .line 47
    .line 48
    invoke-virtual {v2, v5}, Le4/b;->readFully([B)V

    .line 49
    .line 50
    .line 51
    invoke-static {v3, v1}, Ljava/util/Arrays;->equals([B[B)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_0

    .line 56
    .line 57
    const-wide/16 v3, 0x8

    .line 58
    .line 59
    invoke-virtual {v2, v3, v4}, Le4/f;->g(J)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    invoke-static {v5, v4}, Ljava/util/Arrays;->equals([B[B)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v1, :cond_1

    .line 68
    .line 69
    const-wide/16 v3, 0xc

    .line 70
    .line 71
    invoke-virtual {v2, v3, v4}, Le4/f;->g(J)V

    .line 72
    .line 73
    .line 74
    :cond_1
    :goto_0
    const/4 v1, 0x6

    .line 75
    invoke-virtual {p0, v2, v1}, Le4/g;->s(Le4/f;I)V

    .line 76
    .line 77
    .line 78
    const/4 v1, 0x7

    .line 79
    aget-object v2, p1, v1

    .line 80
    .line 81
    const-string v3, "PreviewImageStart"

    .line 82
    .line 83
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    check-cast v2, Le4/c;

    .line 88
    .line 89
    aget-object v1, p1, v1

    .line 90
    .line 91
    const-string v3, "PreviewImageLength"

    .line 92
    .line 93
    invoke-virtual {v1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    check-cast v1, Le4/c;

    .line 98
    .line 99
    if-eqz v2, :cond_2

    .line 100
    .line 101
    if-eqz v1, :cond_2

    .line 102
    .line 103
    const/4 v3, 0x5

    .line 104
    aget-object v4, p1, v3

    .line 105
    .line 106
    const-string v5, "JPEGInterchangeFormat"

    .line 107
    .line 108
    invoke-virtual {v4, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    aget-object v2, p1, v3

    .line 112
    .line 113
    const-string v3, "JPEGInterchangeFormatLength"

    .line 114
    .line 115
    invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    :cond_2
    const/16 v1, 0x8

    .line 119
    .line 120
    aget-object v1, p1, v1

    .line 121
    .line 122
    const-string v2, "AspectFrame"

    .line 123
    .line 124
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    check-cast v1, Le4/c;

    .line 129
    .line 130
    if-eqz v1, :cond_6

    .line 131
    .line 132
    iget-object v2, p0, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 133
    .line 134
    invoke-virtual {v1, v2}, Le4/c;->g(Ljava/nio/ByteOrder;)Ljava/io/Serializable;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    check-cast v1, [I

    .line 139
    .line 140
    if-eqz v1, :cond_5

    .line 141
    .line 142
    array-length v2, v1

    .line 143
    const/4 v3, 0x4

    .line 144
    if-eq v2, v3, :cond_3

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_3
    const/4 v2, 0x2

    .line 148
    aget v2, v1, v2

    .line 149
    .line 150
    const/4 v3, 0x0

    .line 151
    aget v4, v1, v3

    .line 152
    .line 153
    if-le v2, v4, :cond_6

    .line 154
    .line 155
    const/4 v5, 0x3

    .line 156
    aget v5, v1, v5

    .line 157
    .line 158
    aget v1, v1, v0

    .line 159
    .line 160
    if-le v5, v1, :cond_6

    .line 161
    .line 162
    sub-int/2addr v2, v4

    .line 163
    add-int/2addr v2, v0

    .line 164
    sub-int/2addr v5, v1

    .line 165
    add-int/2addr v5, v0

    .line 166
    if-ge v2, v5, :cond_4

    .line 167
    .line 168
    add-int/2addr v2, v5

    .line 169
    sub-int v5, v2, v5

    .line 170
    .line 171
    sub-int/2addr v2, v5

    .line 172
    :cond_4
    iget-object v0, p0, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 173
    .line 174
    invoke-static {v2, v0}, Le4/c;->c(ILjava/nio/ByteOrder;)Le4/c;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    iget-object v1, p0, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 179
    .line 180
    invoke-static {v5, v1}, Le4/c;->c(ILjava/nio/ByteOrder;)Le4/c;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    aget-object v2, p1, v3

    .line 185
    .line 186
    const-string v4, "ImageWidth"

    .line 187
    .line 188
    invoke-virtual {v2, v4, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    aget-object p1, p1, v3

    .line 192
    .line 193
    const-string v0, "ImageLength"

    .line 194
    .line 195
    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    return-void

    .line 199
    :cond_5
    :goto_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 200
    .line 201
    const-string v0, "Invalid aspect frame values. frame="

    .line 202
    .line 203
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    invoke-static {v1}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    const-string v0, "ExifInterface"

    .line 218
    .line 219
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 220
    .line 221
    .line 222
    :cond_6
    return-void
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

.method public final h(Le4/b;)V
    .locals 6

    .line 1
    sget-boolean v0, Le4/g;->l:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const-string v1, "getPngAttributes starting with: "

    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "ExifInterface"

    .line 20
    .line 21
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    :cond_0
    sget-object v0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 25
    .line 26
    iput-object v0, p1, Le4/b;->c:Ljava/nio/ByteOrder;

    .line 27
    .line 28
    sget-object v0, Le4/g;->u:[B

    .line 29
    .line 30
    array-length v1, v0

    .line 31
    invoke-virtual {p1, v1}, Le4/b;->b(I)V

    .line 32
    .line 33
    .line 34
    array-length v0, v0

    .line 35
    :goto_0
    :try_start_0
    invoke-virtual {p1}, Le4/b;->readInt()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    const/4 v2, 0x4

    .line 40
    new-array v2, v2, [B

    .line 41
    .line 42
    invoke-virtual {p1, v2}, Le4/b;->readFully([B)V

    .line 43
    .line 44
    .line 45
    add-int/lit8 v0, v0, 0x8

    .line 46
    .line 47
    const/16 v3, 0x10

    .line 48
    .line 49
    if-ne v0, v3, :cond_2

    .line 50
    .line 51
    sget-object v3, Le4/g;->w:[B

    .line 52
    .line 53
    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([B[B)Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    new-instance p1, Ljava/io/IOException;

    .line 61
    .line 62
    const-string v0, "Encountered invalid PNG file--IHDR chunk should appearas the first chunk"

    .line 63
    .line 64
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw p1

    .line 68
    :cond_2
    :goto_1
    sget-object v3, Le4/g;->x:[B

    .line 69
    .line 70
    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([B[B)Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-eqz v3, :cond_3

    .line 75
    .line 76
    return-void

    .line 77
    :cond_3
    sget-object v3, Le4/g;->v:[B

    .line 78
    .line 79
    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([B[B)Z

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    if-eqz v3, :cond_5

    .line 84
    .line 85
    new-array v1, v1, [B

    .line 86
    .line 87
    invoke-virtual {p1, v1}, Le4/b;->readFully([B)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, Le4/b;->readInt()I

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    new-instance v3, Ljava/util/zip/CRC32;

    .line 95
    .line 96
    invoke-direct {v3}, Ljava/util/zip/CRC32;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v3, v2}, Ljava/util/zip/CRC32;->update([B)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v3, v1}, Ljava/util/zip/CRC32;->update([B)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v3}, Ljava/util/zip/CRC32;->getValue()J

    .line 106
    .line 107
    .line 108
    move-result-wide v4

    .line 109
    long-to-int v2, v4

    .line 110
    if-ne v2, p1, :cond_4

    .line 111
    .line 112
    iput v0, p0, Le4/g;->h:I

    .line 113
    .line 114
    const/4 p1, 0x0

    .line 115
    invoke-virtual {p0, v1, p1}, Le4/g;->r([BI)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0}, Le4/g;->x()V

    .line 119
    .line 120
    .line 121
    new-instance p1, Le4/b;

    .line 122
    .line 123
    invoke-direct {p1, v1}, Le4/b;-><init>([B)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0, p1}, Le4/g;->u(Le4/b;)V

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :cond_4
    new-instance v0, Ljava/io/IOException;

    .line 131
    .line 132
    new-instance v1, Ljava/lang/StringBuilder;

    .line 133
    .line 134
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 135
    .line 136
    .line 137
    const-string v2, "Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: "

    .line 138
    .line 139
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    const-string p1, ", calculated CRC value: "

    .line 146
    .line 147
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v3}, Ljava/util/zip/CRC32;->getValue()J

    .line 151
    .line 152
    .line 153
    move-result-wide v2

    .line 154
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    throw v0

    .line 165
    :cond_5
    add-int/lit8 v1, v1, 0x4

    .line 166
    .line 167
    invoke-virtual {p1, v1}, Le4/b;->b(I)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 168
    .line 169
    .line 170
    add-int/2addr v0, v1

    .line 171
    goto/16 :goto_0

    .line 172
    .line 173
    :catch_0
    new-instance p1, Ljava/io/IOException;

    .line 174
    .line 175
    const-string v0, "Encountered corrupt PNG file."

    .line 176
    .line 177
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    throw p1
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

.method public final i(Le4/b;)V
    .locals 9

    .line 1
    const-string v0, "ExifInterface"

    .line 2
    .line 3
    sget-boolean v1, Le4/g;->l:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    new-instance v2, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v3, "getRafAttributes starting with: "

    .line 10
    .line 11
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    :cond_0
    const/16 v2, 0x54

    .line 25
    .line 26
    invoke-virtual {p1, v2}, Le4/b;->b(I)V

    .line 27
    .line 28
    .line 29
    const/4 v2, 0x4

    .line 30
    new-array v3, v2, [B

    .line 31
    .line 32
    new-array v4, v2, [B

    .line 33
    .line 34
    new-array v2, v2, [B

    .line 35
    .line 36
    invoke-virtual {p1, v3}, Le4/b;->readFully([B)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v4}, Le4/b;->readFully([B)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v2}, Le4/b;->readFully([B)V

    .line 43
    .line 44
    .line 45
    invoke-static {v3}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->getInt()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    invoke-static {v4}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->getInt()I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    invoke-static {v2}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->getInt()I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    new-array v4, v4, [B

    .line 70
    .line 71
    iget v5, p1, Le4/b;->b:I

    .line 72
    .line 73
    sub-int v5, v3, v5

    .line 74
    .line 75
    invoke-virtual {p1, v5}, Le4/b;->b(I)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, v4}, Le4/b;->readFully([B)V

    .line 79
    .line 80
    .line 81
    new-instance v5, Le4/b;

    .line 82
    .line 83
    invoke-direct {v5, v4}, Le4/b;-><init>([B)V

    .line 84
    .line 85
    .line 86
    const/4 v4, 0x5

    .line 87
    invoke-virtual {p0, v5, v3, v4}, Le4/g;->e(Le4/b;II)V

    .line 88
    .line 89
    .line 90
    iget v3, p1, Le4/b;->b:I

    .line 91
    .line 92
    sub-int/2addr v2, v3

    .line 93
    invoke-virtual {p1, v2}, Le4/b;->b(I)V

    .line 94
    .line 95
    .line 96
    sget-object v2, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 97
    .line 98
    iput-object v2, p1, Le4/b;->c:Ljava/nio/ByteOrder;

    .line 99
    .line 100
    invoke-virtual {p1}, Le4/b;->readInt()I

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    if-eqz v1, :cond_1

    .line 105
    .line 106
    new-instance v3, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    const-string v4, "numberOfDirectoryEntry: "

    .line 109
    .line 110
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    invoke-static {v0, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 121
    .line 122
    .line 123
    :cond_1
    const/4 v3, 0x0

    .line 124
    const/4 v4, 0x0

    .line 125
    :goto_0
    if-ge v4, v2, :cond_3

    .line 126
    .line 127
    invoke-virtual {p1}, Le4/b;->readUnsignedShort()I

    .line 128
    .line 129
    .line 130
    move-result v5

    .line 131
    invoke-virtual {p1}, Le4/b;->readUnsignedShort()I

    .line 132
    .line 133
    .line 134
    move-result v6

    .line 135
    sget-object v7, Le4/g;->E:Le4/d;

    .line 136
    .line 137
    iget v7, v7, Le4/d;->a:I

    .line 138
    .line 139
    if-ne v5, v7, :cond_2

    .line 140
    .line 141
    invoke-virtual {p1}, Le4/b;->readShort()S

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    invoke-virtual {p1}, Le4/b;->readShort()S

    .line 146
    .line 147
    .line 148
    move-result p1

    .line 149
    iget-object v4, p0, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 150
    .line 151
    invoke-static {v2, v4}, Le4/c;->c(ILjava/nio/ByteOrder;)Le4/c;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    iget-object v5, p0, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 156
    .line 157
    invoke-static {p1, v5}, Le4/c;->c(ILjava/nio/ByteOrder;)Le4/c;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    iget-object v6, p0, Le4/g;->d:[Ljava/util/HashMap;

    .line 162
    .line 163
    aget-object v7, v6, v3

    .line 164
    .line 165
    const-string v8, "ImageLength"

    .line 166
    .line 167
    invoke-virtual {v7, v8, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    aget-object v3, v6, v3

    .line 171
    .line 172
    const-string v4, "ImageWidth"

    .line 173
    .line 174
    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    if-eqz v1, :cond_3

    .line 178
    .line 179
    new-instance v1, Ljava/lang/StringBuilder;

    .line 180
    .line 181
    const-string v3, "Updated to length: "

    .line 182
    .line 183
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    const-string v2, ", width: "

    .line 190
    .line 191
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 202
    .line 203
    .line 204
    return-void

    .line 205
    :cond_2
    invoke-virtual {p1, v6}, Le4/b;->b(I)V

    .line 206
    .line 207
    .line 208
    add-int/lit8 v4, v4, 0x1

    .line 209
    .line 210
    goto :goto_0

    .line 211
    :cond_3
    return-void
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

.method public final j(Le4/f;)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Le4/g;->o(Le4/f;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, p1, v0}, Le4/g;->s(Le4/f;I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1, v0}, Le4/g;->w(Le4/f;I)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x5

    .line 12
    invoke-virtual {p0, p1, v0}, Le4/g;->w(Le4/f;I)V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x4

    .line 16
    invoke-virtual {p0, p1, v0}, Le4/g;->w(Le4/f;I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Le4/g;->x()V

    .line 20
    .line 21
    .line 22
    iget p1, p0, Le4/g;->c:I

    .line 23
    .line 24
    const/16 v0, 0x8

    .line 25
    .line 26
    if-ne p1, v0, :cond_0

    .line 27
    .line 28
    iget-object p1, p0, Le4/g;->d:[Ljava/util/HashMap;

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    aget-object v1, p1, v0

    .line 32
    .line 33
    const-string v2, "MakerNote"

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, Le4/c;

    .line 40
    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    new-instance v2, Le4/f;

    .line 44
    .line 45
    iget-object v1, v1, Le4/c;->d:[B

    .line 46
    .line 47
    invoke-direct {v2, v1}, Le4/f;-><init>([B)V

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 51
    .line 52
    iput-object v1, v2, Le4/b;->c:Ljava/nio/ByteOrder;

    .line 53
    .line 54
    const/4 v1, 0x6

    .line 55
    invoke-virtual {v2, v1}, Le4/b;->b(I)V

    .line 56
    .line 57
    .line 58
    const/16 v1, 0x9

    .line 59
    .line 60
    invoke-virtual {p0, v2, v1}, Le4/g;->s(Le4/f;I)V

    .line 61
    .line 62
    .line 63
    aget-object v1, p1, v1

    .line 64
    .line 65
    const-string v2, "ColorSpace"

    .line 66
    .line 67
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, Le4/c;

    .line 72
    .line 73
    if-eqz v1, :cond_0

    .line 74
    .line 75
    aget-object p1, p1, v0

    .line 76
    .line 77
    invoke-virtual {p1, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    :cond_0
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
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method

.method public final k(Le4/f;)V
    .locals 5

    .line 1
    sget-boolean v0, Le4/g;->l:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const-string v1, "getRw2Attributes starting with: "

    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "ExifInterface"

    .line 20
    .line 21
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual {p0, p1}, Le4/g;->j(Le4/f;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Le4/g;->d:[Ljava/util/HashMap;

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    aget-object v1, p1, v0

    .line 31
    .line 32
    const-string v2, "JpgFromRaw"

    .line 33
    .line 34
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Le4/c;

    .line 39
    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    new-instance v2, Le4/b;

    .line 43
    .line 44
    iget-object v3, v1, Le4/c;->d:[B

    .line 45
    .line 46
    invoke-direct {v2, v3}, Le4/b;-><init>([B)V

    .line 47
    .line 48
    .line 49
    iget-wide v3, v1, Le4/c;->c:J

    .line 50
    .line 51
    long-to-int v1, v3

    .line 52
    const/4 v3, 0x5

    .line 53
    invoke-virtual {p0, v2, v1, v3}, Le4/g;->e(Le4/b;II)V

    .line 54
    .line 55
    .line 56
    :cond_1
    aget-object v0, p1, v0

    .line 57
    .line 58
    const-string v1, "ISO"

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, Le4/c;

    .line 65
    .line 66
    const/4 v1, 0x1

    .line 67
    aget-object v2, p1, v1

    .line 68
    .line 69
    const-string v3, "PhotographicSensitivity"

    .line 70
    .line 71
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    check-cast v2, Le4/c;

    .line 76
    .line 77
    if-eqz v0, :cond_2

    .line 78
    .line 79
    if-nez v2, :cond_2

    .line 80
    .line 81
    aget-object p1, p1, v1

    .line 82
    .line 83
    invoke-virtual {p1, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    :cond_2
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
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method

.method public final l(Le4/b;)V
    .locals 5

    .line 1
    sget-boolean v0, Le4/g;->l:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const-string v1, "getWebpAttributes starting with: "

    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "ExifInterface"

    .line 20
    .line 21
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    :cond_0
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 25
    .line 26
    iput-object v0, p1, Le4/b;->c:Ljava/nio/ByteOrder;

    .line 27
    .line 28
    sget-object v0, Le4/g;->y:[B

    .line 29
    .line 30
    array-length v0, v0

    .line 31
    invoke-virtual {p1, v0}, Le4/b;->b(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Le4/b;->readInt()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    add-int/lit8 v0, v0, 0x8

    .line 39
    .line 40
    sget-object v1, Le4/g;->z:[B

    .line 41
    .line 42
    array-length v2, v1

    .line 43
    invoke-virtual {p1, v2}, Le4/b;->b(I)V

    .line 44
    .line 45
    .line 46
    array-length v1, v1

    .line 47
    add-int/lit8 v1, v1, 0x8

    .line 48
    .line 49
    :goto_0
    const/4 v2, 0x4

    .line 50
    :try_start_0
    new-array v2, v2, [B

    .line 51
    .line 52
    invoke-virtual {p1, v2}, Le4/b;->readFully([B)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Le4/b;->readInt()I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    add-int/lit8 v1, v1, 0x8

    .line 60
    .line 61
    sget-object v4, Le4/g;->A:[B

    .line 62
    .line 63
    invoke-static {v4, v2}, Ljava/util/Arrays;->equals([B[B)Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-eqz v2, :cond_1

    .line 68
    .line 69
    new-array v0, v3, [B

    .line 70
    .line 71
    invoke-virtual {p1, v0}, Le4/b;->readFully([B)V

    .line 72
    .line 73
    .line 74
    iput v1, p0, Le4/g;->h:I

    .line 75
    .line 76
    const/4 p1, 0x0

    .line 77
    invoke-virtual {p0, v0, p1}, Le4/g;->r([BI)V

    .line 78
    .line 79
    .line 80
    new-instance p1, Le4/b;

    .line 81
    .line 82
    invoke-direct {p1, v0}, Le4/b;-><init>([B)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0, p1}, Le4/g;->u(Le4/b;)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_1
    rem-int/lit8 v2, v3, 0x2

    .line 90
    .line 91
    const/4 v4, 0x1

    .line 92
    if-ne v2, v4, :cond_2

    .line 93
    .line 94
    add-int/lit8 v3, v3, 0x1

    .line 95
    .line 96
    :cond_2
    add-int/2addr v1, v3

    .line 97
    if-ne v1, v0, :cond_3

    .line 98
    .line 99
    return-void

    .line 100
    :cond_3
    if-gt v1, v0, :cond_4

    .line 101
    .line 102
    invoke-virtual {p1, v3}, Le4/b;->b(I)V

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_4
    new-instance p1, Ljava/io/IOException;

    .line 107
    .line 108
    const-string v0, "Encountered WebP file with invalid chunk size"

    .line 109
    .line 110
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    throw p1
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 114
    :catch_0
    new-instance p1, Ljava/io/IOException;

    .line 115
    .line 116
    const-string v0, "Encountered corrupt WebP file."

    .line 117
    .line 118
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    throw p1
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

.method public final m(Le4/b;Ljava/util/HashMap;)V
    .locals 3

    .line 1
    const-string v0, "JPEGInterchangeFormat"

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Le4/c;

    .line 8
    .line 9
    const-string v1, "JPEGInterchangeFormatLength"

    .line 10
    .line 11
    invoke-virtual {p2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    check-cast p2, Le4/c;

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    if-eqz p2, :cond_2

    .line 20
    .line 21
    iget-object v1, p0, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Le4/c;->e(Ljava/nio/ByteOrder;)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iget-object v1, p0, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 28
    .line 29
    invoke-virtual {p2, v1}, Le4/c;->e(Ljava/nio/ByteOrder;)I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    iget v1, p0, Le4/g;->c:I

    .line 34
    .line 35
    const/4 v2, 0x7

    .line 36
    if-ne v1, v2, :cond_0

    .line 37
    .line 38
    iget v1, p0, Le4/g;->i:I

    .line 39
    .line 40
    add-int/2addr v0, v1

    .line 41
    :cond_0
    if-lez v0, :cond_1

    .line 42
    .line 43
    if-lez p2, :cond_1

    .line 44
    .line 45
    iget-object v1, p0, Le4/g;->b:Landroid/content/res/AssetManager$AssetInputStream;

    .line 46
    .line 47
    if-nez v1, :cond_1

    .line 48
    .line 49
    iget-object v1, p0, Le4/g;->a:Ljava/io/FileDescriptor;

    .line 50
    .line 51
    if-nez v1, :cond_1

    .line 52
    .line 53
    new-array v1, p2, [B

    .line 54
    .line 55
    invoke-virtual {p1, v0}, Le4/b;->b(I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, v1}, Le4/b;->readFully([B)V

    .line 59
    .line 60
    .line 61
    :cond_1
    sget-boolean p1, Le4/g;->l:Z

    .line 62
    .line 63
    if-eqz p1, :cond_2

    .line 64
    .line 65
    new-instance p1, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    const-string v1, "Setting thumbnail attributes with offset: "

    .line 68
    .line 69
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v0, ", length: "

    .line 76
    .line 77
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    const-string p2, "ExifInterface"

    .line 88
    .line 89
    invoke-static {p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    :cond_2
    return-void
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

.method public final n(Ljava/util/HashMap;)Z
    .locals 2

    .line 1
    const-string v0, "ImageLength"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Le4/c;

    .line 8
    .line 9
    const-string v1, "ImageWidth"

    .line 10
    .line 11
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Le4/c;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    iget-object v1, p0, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Le4/c;->e(Ljava/nio/ByteOrder;)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iget-object v1, p0, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 28
    .line 29
    invoke-virtual {p1, v1}, Le4/c;->e(Ljava/nio/ByteOrder;)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    const/16 v1, 0x200

    .line 34
    .line 35
    if-gt v0, v1, :cond_0

    .line 36
    .line 37
    if-gt p1, v1, :cond_0

    .line 38
    .line 39
    const/4 p1, 0x1

    .line 40
    return p1

    .line 41
    :cond_0
    const/4 p1, 0x0

    .line 42
    return p1
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

.method public final o(Le4/f;)V
    .locals 3

    .line 1
    invoke-static {p1}, Le4/g;->q(Le4/b;)Ljava/nio/ByteOrder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 6
    .line 7
    iput-object v0, p1, Le4/b;->c:Ljava/nio/ByteOrder;

    .line 8
    .line 9
    invoke-virtual {p1}, Le4/b;->readUnsignedShort()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget v1, p0, Le4/g;->c:I

    .line 14
    .line 15
    const/4 v2, 0x7

    .line 16
    if-eq v1, v2, :cond_1

    .line 17
    .line 18
    const/16 v2, 0xa

    .line 19
    .line 20
    if-eq v1, v2, :cond_1

    .line 21
    .line 22
    const/16 v1, 0x2a

    .line 23
    .line 24
    if-ne v0, v1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    new-instance p1, Ljava/io/IOException;

    .line 28
    .line 29
    new-instance v1, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v2, "Invalid start code: "

    .line 32
    .line 33
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p1

    .line 51
    :cond_1
    :goto_0
    invoke-virtual {p1}, Le4/b;->readInt()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    const/16 v1, 0x8

    .line 56
    .line 57
    if-lt v0, v1, :cond_3

    .line 58
    .line 59
    add-int/lit8 v0, v0, -0x8

    .line 60
    .line 61
    if-lez v0, :cond_2

    .line 62
    .line 63
    invoke-virtual {p1, v0}, Le4/b;->b(I)V

    .line 64
    .line 65
    .line 66
    :cond_2
    return-void

    .line 67
    :cond_3
    new-instance p1, Ljava/io/IOException;

    .line 68
    .line 69
    const-string v1, "Invalid first Ifd offset: "

    .line 70
    .line 71
    invoke-static {v0, v1}, Lq/t0;->B(ILjava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw p1
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

.method public final p()V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Le4/g;->d:[Ljava/util/HashMap;

    .line 3
    .line 4
    array-length v2, v1

    .line 5
    if-ge v0, v2, :cond_1

    .line 6
    .line 7
    const-string v2, "The size of tag group["

    .line 8
    .line 9
    const-string v3, "]: "

    .line 10
    .line 11
    invoke-static {v0, v2, v3}, Lj2/h0;->o(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    aget-object v3, v1, v0

    .line 16
    .line 17
    invoke-virtual {v3}, Ljava/util/HashMap;->size()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    const-string v3, "ExifInterface"

    .line 29
    .line 30
    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    aget-object v1, v1, v0

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_0

    .line 48
    .line 49
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    check-cast v2, Ljava/util/Map$Entry;

    .line 54
    .line 55
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    check-cast v4, Le4/c;

    .line 60
    .line 61
    new-instance v5, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    const-string v6, "tagName: "

    .line 64
    .line 65
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    check-cast v2, Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v2, ", tagType: "

    .line 78
    .line 79
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v4}, Le4/c;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    const-string v2, ", tagValue: \'"

    .line 90
    .line 91
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    iget-object v2, p0, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 95
    .line 96
    invoke-virtual {v4, v2}, Le4/c;->f(Ljava/nio/ByteOrder;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v2, "\'"

    .line 104
    .line 105
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 113
    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_1
    return-void
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
.end method

.method public final r([BI)V
    .locals 1

    .line 1
    new-instance v0, Le4/f;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Le4/f;-><init>([B)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Le4/g;->o(Le4/f;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0, p2}, Le4/g;->s(Le4/f;I)V

    .line 10
    .line 11
    .line 12
    return-void
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

.method public final s(Le4/f;I)V
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    iget v3, v1, Le4/b;->b:I

    .line 8
    .line 9
    iget v4, v1, Le4/b;->e:I

    .line 10
    .line 11
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    iget-object v5, v0, Le4/g;->e:Ljava/util/HashSet;

    .line 16
    .line 17
    invoke-virtual {v5, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Le4/b;->readShort()S

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    const-string v6, "ExifInterface"

    .line 25
    .line 26
    sget-boolean v7, Le4/g;->l:Z

    .line 27
    .line 28
    if-eqz v7, :cond_0

    .line 29
    .line 30
    new-instance v8, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v9, "numberOfDirectoryEntry: "

    .line 33
    .line 34
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v8

    .line 44
    invoke-static {v6, v8}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    :cond_0
    if-gtz v3, :cond_1

    .line 48
    .line 49
    goto/16 :goto_16

    .line 50
    .line 51
    :cond_1
    const/4 v9, 0x0

    .line 52
    :goto_0
    iget-object v14, v0, Le4/g;->d:[Ljava/util/HashMap;

    .line 53
    .line 54
    if-ge v9, v3, :cond_2d

    .line 55
    .line 56
    const/16 v16, 0x0

    .line 57
    .line 58
    invoke-virtual {v1}, Le4/b;->readUnsignedShort()I

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    const-wide/16 v17, 0x0

    .line 63
    .line 64
    invoke-virtual {v1}, Le4/b;->readUnsignedShort()I

    .line 65
    .line 66
    .line 67
    move-result v12

    .line 68
    invoke-virtual {v1}, Le4/b;->readInt()I

    .line 69
    .line 70
    .line 71
    move-result v13

    .line 72
    const/16 v19, 0x1

    .line 73
    .line 74
    iget v11, v1, Le4/b;->b:I

    .line 75
    .line 76
    int-to-long v10, v11

    .line 77
    const-wide/16 v21, 0x4

    .line 78
    .line 79
    add-long v10, v10, v21

    .line 80
    .line 81
    sget-object v23, Le4/g;->H:[Ljava/util/HashMap;

    .line 82
    .line 83
    const/16 v24, 0x4

    .line 84
    .line 85
    aget-object v15, v23, v2

    .line 86
    .line 87
    move/from16 v25, v3

    .line 88
    .line 89
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    invoke-virtual {v15, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    check-cast v3, Le4/d;

    .line 98
    .line 99
    const/16 v23, 0x2

    .line 100
    .line 101
    if-eqz v7, :cond_3

    .line 102
    .line 103
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 104
    .line 105
    .line 106
    move-result-object v26

    .line 107
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 108
    .line 109
    .line 110
    move-result-object v27

    .line 111
    const/16 v28, 0x3

    .line 112
    .line 113
    if-eqz v3, :cond_2

    .line 114
    .line 115
    iget-object v15, v3, Le4/d;->b:Ljava/lang/String;

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_2
    const/4 v15, 0x0

    .line 119
    :goto_1
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 120
    .line 121
    .line 122
    move-result-object v29

    .line 123
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 124
    .line 125
    .line 126
    move-result-object v30

    .line 127
    move/from16 v31, v7

    .line 128
    .line 129
    const/4 v7, 0x5

    .line 130
    new-array v7, v7, [Ljava/lang/Object;

    .line 131
    .line 132
    aput-object v26, v7, v16

    .line 133
    .line 134
    aput-object v27, v7, v19

    .line 135
    .line 136
    aput-object v15, v7, v23

    .line 137
    .line 138
    aput-object v29, v7, v28

    .line 139
    .line 140
    aput-object v30, v7, v24

    .line 141
    .line 142
    const-string v15, "ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d"

    .line 143
    .line 144
    invoke-static {v15, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v7

    .line 148
    invoke-static {v6, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 149
    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_3
    move/from16 v31, v7

    .line 153
    .line 154
    const/16 v28, 0x3

    .line 155
    .line 156
    :goto_2
    if-nez v3, :cond_5

    .line 157
    .line 158
    if-eqz v31, :cond_4

    .line 159
    .line 160
    new-instance v7, Ljava/lang/StringBuilder;

    .line 161
    .line 162
    const-string v15, "Skip the tag entry since tag number is not defined: "

    .line 163
    .line 164
    invoke-direct {v7, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v7

    .line 174
    invoke-static {v6, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 175
    .line 176
    .line 177
    :cond_4
    move/from16 v30, v8

    .line 178
    .line 179
    goto/16 :goto_c

    .line 180
    .line 181
    :cond_5
    if-lez v12, :cond_6

    .line 182
    .line 183
    sget-object v7, Le4/g;->C:[I

    .line 184
    .line 185
    array-length v15, v7

    .line 186
    if-lt v12, v15, :cond_7

    .line 187
    .line 188
    :cond_6
    move/from16 v30, v8

    .line 189
    .line 190
    goto/16 :goto_b

    .line 191
    .line 192
    :cond_7
    iget v15, v3, Le4/d;->c:I

    .line 193
    .line 194
    move-object/from16 v29, v7

    .line 195
    .line 196
    const/4 v7, 0x7

    .line 197
    if-eq v15, v7, :cond_9

    .line 198
    .line 199
    if-ne v12, v7, :cond_8

    .line 200
    .line 201
    goto :goto_3

    .line 202
    :cond_8
    if-eq v15, v12, :cond_9

    .line 203
    .line 204
    iget v7, v3, Le4/d;->d:I

    .line 205
    .line 206
    if-ne v7, v12, :cond_a

    .line 207
    .line 208
    :cond_9
    :goto_3
    move/from16 v30, v8

    .line 209
    .line 210
    goto :goto_5

    .line 211
    :cond_a
    move/from16 v30, v8

    .line 212
    .line 213
    const/4 v8, 0x4

    .line 214
    if-eq v15, v8, :cond_b

    .line 215
    .line 216
    if-ne v7, v8, :cond_c

    .line 217
    .line 218
    :cond_b
    const/4 v8, 0x3

    .line 219
    goto :goto_4

    .line 220
    :cond_c
    const/16 v8, 0x9

    .line 221
    .line 222
    goto :goto_6

    .line 223
    :goto_4
    if-ne v12, v8, :cond_c

    .line 224
    .line 225
    :goto_5
    const/4 v7, 0x7

    .line 226
    goto :goto_7

    .line 227
    :goto_6
    if-eq v15, v8, :cond_d

    .line 228
    .line 229
    if-ne v7, v8, :cond_e

    .line 230
    .line 231
    :cond_d
    const/16 v8, 0x8

    .line 232
    .line 233
    if-ne v12, v8, :cond_e

    .line 234
    .line 235
    goto :goto_5

    .line 236
    :cond_e
    const/16 v8, 0xc

    .line 237
    .line 238
    if-eq v15, v8, :cond_f

    .line 239
    .line 240
    if-ne v7, v8, :cond_10

    .line 241
    .line 242
    :cond_f
    const/16 v7, 0xb

    .line 243
    .line 244
    if-ne v12, v7, :cond_10

    .line 245
    .line 246
    goto :goto_5

    .line 247
    :cond_10
    if-eqz v31, :cond_15

    .line 248
    .line 249
    new-instance v7, Ljava/lang/StringBuilder;

    .line 250
    .line 251
    const-string v8, "Skip the tag entry since data format ("

    .line 252
    .line 253
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    sget-object v8, Le4/g;->B:[Ljava/lang/String;

    .line 257
    .line 258
    aget-object v8, v8, v12

    .line 259
    .line 260
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    const-string v8, ") is unexpected for tag: "

    .line 264
    .line 265
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    iget-object v8, v3, Le4/d;->b:Ljava/lang/String;

    .line 269
    .line 270
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v7

    .line 277
    invoke-static {v6, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 278
    .line 279
    .line 280
    goto :goto_c

    .line 281
    :goto_7
    if-ne v12, v7, :cond_11

    .line 282
    .line 283
    move v12, v15

    .line 284
    :cond_11
    int-to-long v7, v13

    .line 285
    aget v15, v29, v12

    .line 286
    .line 287
    move-wide/from16 v32, v7

    .line 288
    .line 289
    int-to-long v7, v15

    .line 290
    mul-long v7, v7, v32

    .line 291
    .line 292
    cmp-long v15, v7, v17

    .line 293
    .line 294
    if-ltz v15, :cond_13

    .line 295
    .line 296
    const-wide/32 v32, 0x7fffffff

    .line 297
    .line 298
    .line 299
    cmp-long v15, v7, v32

    .line 300
    .line 301
    if-lez v15, :cond_12

    .line 302
    .line 303
    goto :goto_8

    .line 304
    :cond_12
    const/4 v15, 0x1

    .line 305
    goto :goto_d

    .line 306
    :cond_13
    :goto_8
    if-eqz v31, :cond_14

    .line 307
    .line 308
    new-instance v15, Ljava/lang/StringBuilder;

    .line 309
    .line 310
    move-wide/from16 v32, v7

    .line 311
    .line 312
    const-string v7, "Skip the tag entry since the number of components is invalid: "

    .line 313
    .line 314
    invoke-direct {v15, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v7

    .line 324
    invoke-static {v6, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 325
    .line 326
    .line 327
    goto :goto_9

    .line 328
    :cond_14
    move-wide/from16 v32, v7

    .line 329
    .line 330
    :goto_9
    move-wide/from16 v7, v32

    .line 331
    .line 332
    :goto_a
    const/4 v15, 0x0

    .line 333
    goto :goto_d

    .line 334
    :goto_b
    if-eqz v31, :cond_15

    .line 335
    .line 336
    new-instance v7, Ljava/lang/StringBuilder;

    .line 337
    .line 338
    const-string v8, "Skip the tag entry since data format is invalid: "

    .line 339
    .line 340
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v7

    .line 350
    invoke-static {v6, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 351
    .line 352
    .line 353
    :cond_15
    :goto_c
    move-wide/from16 v7, v17

    .line 354
    .line 355
    goto :goto_a

    .line 356
    :goto_d
    if-nez v15, :cond_16

    .line 357
    .line 358
    invoke-virtual {v1, v10, v11}, Le4/f;->g(J)V

    .line 359
    .line 360
    .line 361
    move/from16 v29, v9

    .line 362
    .line 363
    goto/16 :goto_15

    .line 364
    .line 365
    :cond_16
    const-string v15, "Compression"

    .line 366
    .line 367
    cmp-long v29, v7, v21

    .line 368
    .line 369
    if-lez v29, :cond_1a

    .line 370
    .line 371
    move/from16 v29, v9

    .line 372
    .line 373
    invoke-virtual {v1}, Le4/b;->readInt()I

    .line 374
    .line 375
    .line 376
    move-result v9

    .line 377
    if-eqz v31, :cond_17

    .line 378
    .line 379
    move-object/from16 v32, v14

    .line 380
    .line 381
    new-instance v14, Ljava/lang/StringBuilder;

    .line 382
    .line 383
    move-wide/from16 v33, v10

    .line 384
    .line 385
    const-string v10, "seek to data offset: "

    .line 386
    .line 387
    invoke-direct {v14, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v14, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 391
    .line 392
    .line 393
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v10

    .line 397
    invoke-static {v6, v10}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 398
    .line 399
    .line 400
    goto :goto_e

    .line 401
    :cond_17
    move-wide/from16 v33, v10

    .line 402
    .line 403
    move-object/from16 v32, v14

    .line 404
    .line 405
    :goto_e
    iget v10, v0, Le4/g;->c:I

    .line 406
    .line 407
    const/4 v11, 0x7

    .line 408
    if-ne v10, v11, :cond_18

    .line 409
    .line 410
    const-string v10, "MakerNote"

    .line 411
    .line 412
    iget-object v11, v3, Le4/d;->b:Ljava/lang/String;

    .line 413
    .line 414
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 415
    .line 416
    .line 417
    move-result v10

    .line 418
    if-eqz v10, :cond_19

    .line 419
    .line 420
    iput v9, v0, Le4/g;->i:I

    .line 421
    .line 422
    :cond_18
    move/from16 v21, v13

    .line 423
    .line 424
    goto :goto_f

    .line 425
    :cond_19
    const/4 v10, 0x6

    .line 426
    if-ne v2, v10, :cond_18

    .line 427
    .line 428
    const-string v11, "ThumbnailImage"

    .line 429
    .line 430
    iget-object v14, v3, Le4/d;->b:Ljava/lang/String;

    .line 431
    .line 432
    invoke-virtual {v11, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 433
    .line 434
    .line 435
    move-result v11

    .line 436
    if-eqz v11, :cond_18

    .line 437
    .line 438
    iput v9, v0, Le4/g;->j:I

    .line 439
    .line 440
    iput v13, v0, Le4/g;->k:I

    .line 441
    .line 442
    iget-object v11, v0, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 443
    .line 444
    invoke-static {v10, v11}, Le4/c;->c(ILjava/nio/ByteOrder;)Le4/c;

    .line 445
    .line 446
    .line 447
    move-result-object v10

    .line 448
    iget v11, v0, Le4/g;->j:I

    .line 449
    .line 450
    move/from16 v21, v13

    .line 451
    .line 452
    int-to-long v13, v11

    .line 453
    iget-object v11, v0, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 454
    .line 455
    invoke-static {v13, v14, v11}, Le4/c;->a(JLjava/nio/ByteOrder;)Le4/c;

    .line 456
    .line 457
    .line 458
    move-result-object v11

    .line 459
    iget v13, v0, Le4/g;->k:I

    .line 460
    .line 461
    int-to-long v13, v13

    .line 462
    iget-object v2, v0, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 463
    .line 464
    invoke-static {v13, v14, v2}, Le4/c;->a(JLjava/nio/ByteOrder;)Le4/c;

    .line 465
    .line 466
    .line 467
    move-result-object v2

    .line 468
    const/16 v24, 0x4

    .line 469
    .line 470
    aget-object v13, v32, v24

    .line 471
    .line 472
    invoke-virtual {v13, v15, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    aget-object v10, v32, v24

    .line 476
    .line 477
    const-string v13, "JPEGInterchangeFormat"

    .line 478
    .line 479
    invoke-virtual {v10, v13, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    aget-object v10, v32, v24

    .line 483
    .line 484
    const-string v11, "JPEGInterchangeFormatLength"

    .line 485
    .line 486
    invoke-virtual {v10, v11, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    :goto_f
    int-to-long v9, v9

    .line 490
    invoke-virtual {v1, v9, v10}, Le4/f;->g(J)V

    .line 491
    .line 492
    .line 493
    goto :goto_10

    .line 494
    :cond_1a
    move/from16 v29, v9

    .line 495
    .line 496
    move-wide/from16 v33, v10

    .line 497
    .line 498
    move/from16 v21, v13

    .line 499
    .line 500
    move-object/from16 v32, v14

    .line 501
    .line 502
    :goto_10
    sget-object v2, Le4/g;->K:Ljava/util/HashMap;

    .line 503
    .line 504
    invoke-static/range {v30 .. v30}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 505
    .line 506
    .line 507
    move-result-object v9

    .line 508
    invoke-virtual {v2, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object v2

    .line 512
    check-cast v2, Ljava/lang/Integer;

    .line 513
    .line 514
    if-eqz v31, :cond_1b

    .line 515
    .line 516
    new-instance v9, Ljava/lang/StringBuilder;

    .line 517
    .line 518
    const-string v10, "nextIfdType: "

    .line 519
    .line 520
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 521
    .line 522
    .line 523
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 524
    .line 525
    .line 526
    const-string v10, " byteCount: "

    .line 527
    .line 528
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 529
    .line 530
    .line 531
    invoke-virtual {v9, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 532
    .line 533
    .line 534
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 535
    .line 536
    .line 537
    move-result-object v9

    .line 538
    invoke-static {v6, v9}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 539
    .line 540
    .line 541
    :cond_1b
    if-eqz v2, :cond_26

    .line 542
    .line 543
    const/4 v9, 0x3

    .line 544
    if-eq v12, v9, :cond_1f

    .line 545
    .line 546
    const/4 v8, 0x4

    .line 547
    if-eq v12, v8, :cond_1e

    .line 548
    .line 549
    const/16 v8, 0x8

    .line 550
    .line 551
    if-eq v12, v8, :cond_1d

    .line 552
    .line 553
    const/16 v8, 0x9

    .line 554
    .line 555
    if-eq v12, v8, :cond_1c

    .line 556
    .line 557
    const/16 v7, 0xd

    .line 558
    .line 559
    if-eq v12, v7, :cond_1c

    .line 560
    .line 561
    const-wide/16 v7, -0x1

    .line 562
    .line 563
    goto :goto_12

    .line 564
    :cond_1c
    invoke-virtual {v1}, Le4/b;->readInt()I

    .line 565
    .line 566
    .line 567
    move-result v7

    .line 568
    :goto_11
    int-to-long v7, v7

    .line 569
    goto :goto_12

    .line 570
    :cond_1d
    invoke-virtual {v1}, Le4/b;->readShort()S

    .line 571
    .line 572
    .line 573
    move-result v7

    .line 574
    goto :goto_11

    .line 575
    :cond_1e
    invoke-virtual {v1}, Le4/b;->readInt()I

    .line 576
    .line 577
    .line 578
    move-result v7

    .line 579
    int-to-long v7, v7

    .line 580
    const-wide v9, 0xffffffffL

    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    and-long/2addr v7, v9

    .line 586
    goto :goto_12

    .line 587
    :cond_1f
    invoke-virtual {v1}, Le4/b;->readUnsignedShort()I

    .line 588
    .line 589
    .line 590
    move-result v7

    .line 591
    goto :goto_11

    .line 592
    :goto_12
    if-eqz v31, :cond_20

    .line 593
    .line 594
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 595
    .line 596
    .line 597
    move-result-object v9

    .line 598
    iget-object v3, v3, Le4/d;->b:Ljava/lang/String;

    .line 599
    .line 600
    const/4 v10, 0x2

    .line 601
    new-array v10, v10, [Ljava/lang/Object;

    .line 602
    .line 603
    aput-object v9, v10, v16

    .line 604
    .line 605
    aput-object v3, v10, v19

    .line 606
    .line 607
    const-string v3, "Offset: %d, tagName: %s"

    .line 608
    .line 609
    invoke-static {v3, v10}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 610
    .line 611
    .line 612
    move-result-object v3

    .line 613
    invoke-static {v6, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 614
    .line 615
    .line 616
    :cond_20
    const-string v3, ")"

    .line 617
    .line 618
    const/4 v9, -0x1

    .line 619
    cmp-long v10, v7, v17

    .line 620
    .line 621
    if-lez v10, :cond_24

    .line 622
    .line 623
    if-eq v4, v9, :cond_21

    .line 624
    .line 625
    int-to-long v10, v4

    .line 626
    cmp-long v12, v7, v10

    .line 627
    .line 628
    if-gez v12, :cond_24

    .line 629
    .line 630
    :cond_21
    long-to-int v9, v7

    .line 631
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 632
    .line 633
    .line 634
    move-result-object v9

    .line 635
    invoke-virtual {v5, v9}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 636
    .line 637
    .line 638
    move-result v9

    .line 639
    if-nez v9, :cond_23

    .line 640
    .line 641
    invoke-virtual {v1, v7, v8}, Le4/f;->g(J)V

    .line 642
    .line 643
    .line 644
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 645
    .line 646
    .line 647
    move-result v2

    .line 648
    invoke-virtual {v0, v1, v2}, Le4/g;->s(Le4/f;I)V

    .line 649
    .line 650
    .line 651
    :cond_22
    :goto_13
    move-wide/from16 v10, v33

    .line 652
    .line 653
    goto :goto_14

    .line 654
    :cond_23
    if-eqz v31, :cond_22

    .line 655
    .line 656
    new-instance v9, Ljava/lang/StringBuilder;

    .line 657
    .line 658
    const-string v10, "Skip jump into the IFD since it has already been read: IfdType "

    .line 659
    .line 660
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 661
    .line 662
    .line 663
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 664
    .line 665
    .line 666
    const-string v2, " (at "

    .line 667
    .line 668
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 669
    .line 670
    .line 671
    invoke-virtual {v9, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 672
    .line 673
    .line 674
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 675
    .line 676
    .line 677
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 678
    .line 679
    .line 680
    move-result-object v2

    .line 681
    invoke-static {v6, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 682
    .line 683
    .line 684
    goto :goto_13

    .line 685
    :cond_24
    if-eqz v31, :cond_22

    .line 686
    .line 687
    const-string v2, "Skip jump into the IFD since its offset is invalid: "

    .line 688
    .line 689
    invoke-static {v7, v8, v2}, Lj2/h0;->i(JLjava/lang/String;)Ljava/lang/String;

    .line 690
    .line 691
    .line 692
    move-result-object v2

    .line 693
    if-eq v4, v9, :cond_25

    .line 694
    .line 695
    new-instance v7, Ljava/lang/StringBuilder;

    .line 696
    .line 697
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 698
    .line 699
    .line 700
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 701
    .line 702
    .line 703
    const-string v2, " (total length: "

    .line 704
    .line 705
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 706
    .line 707
    .line 708
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 709
    .line 710
    .line 711
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 712
    .line 713
    .line 714
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 715
    .line 716
    .line 717
    move-result-object v2

    .line 718
    :cond_25
    invoke-static {v6, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 719
    .line 720
    .line 721
    goto :goto_13

    .line 722
    :goto_14
    invoke-virtual {v1, v10, v11}, Le4/f;->g(J)V

    .line 723
    .line 724
    .line 725
    goto :goto_15

    .line 726
    :cond_26
    move-wide/from16 v10, v33

    .line 727
    .line 728
    iget v2, v1, Le4/b;->b:I

    .line 729
    .line 730
    iget v9, v0, Le4/g;->h:I

    .line 731
    .line 732
    add-int/2addr v2, v9

    .line 733
    long-to-int v8, v7

    .line 734
    new-array v7, v8, [B

    .line 735
    .line 736
    invoke-virtual {v1, v7}, Le4/b;->readFully([B)V

    .line 737
    .line 738
    .line 739
    new-instance v19, Le4/c;

    .line 740
    .line 741
    int-to-long v8, v2

    .line 742
    move-object/from16 v22, v7

    .line 743
    .line 744
    move/from16 v23, v12

    .line 745
    .line 746
    move/from16 v24, v21

    .line 747
    .line 748
    move-wide/from16 v20, v8

    .line 749
    .line 750
    invoke-direct/range {v19 .. v24}, Le4/c;-><init>(J[BII)V

    .line 751
    .line 752
    .line 753
    move-object/from16 v2, v19

    .line 754
    .line 755
    aget-object v7, v32, p2

    .line 756
    .line 757
    iget-object v3, v3, Le4/d;->b:Ljava/lang/String;

    .line 758
    .line 759
    invoke-virtual {v7, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 760
    .line 761
    .line 762
    const-string v7, "DNGVersion"

    .line 763
    .line 764
    invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 765
    .line 766
    .line 767
    move-result v7

    .line 768
    if-eqz v7, :cond_27

    .line 769
    .line 770
    const/4 v8, 0x3

    .line 771
    iput v8, v0, Le4/g;->c:I

    .line 772
    .line 773
    :cond_27
    const-string v7, "Make"

    .line 774
    .line 775
    invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 776
    .line 777
    .line 778
    move-result v7

    .line 779
    if-nez v7, :cond_28

    .line 780
    .line 781
    const-string v7, "Model"

    .line 782
    .line 783
    invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 784
    .line 785
    .line 786
    move-result v7

    .line 787
    if-eqz v7, :cond_29

    .line 788
    .line 789
    :cond_28
    iget-object v7, v0, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 790
    .line 791
    invoke-virtual {v2, v7}, Le4/c;->f(Ljava/nio/ByteOrder;)Ljava/lang/String;

    .line 792
    .line 793
    .line 794
    move-result-object v7

    .line 795
    const-string v8, "PENTAX"

    .line 796
    .line 797
    invoke-virtual {v7, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 798
    .line 799
    .line 800
    move-result v7

    .line 801
    if-nez v7, :cond_2a

    .line 802
    .line 803
    :cond_29
    invoke-virtual {v15, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 804
    .line 805
    .line 806
    move-result v3

    .line 807
    if-eqz v3, :cond_2b

    .line 808
    .line 809
    iget-object v3, v0, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 810
    .line 811
    invoke-virtual {v2, v3}, Le4/c;->e(Ljava/nio/ByteOrder;)I

    .line 812
    .line 813
    .line 814
    move-result v2

    .line 815
    const v3, 0xffff

    .line 816
    .line 817
    .line 818
    if-ne v2, v3, :cond_2b

    .line 819
    .line 820
    :cond_2a
    const/16 v8, 0x8

    .line 821
    .line 822
    iput v8, v0, Le4/g;->c:I

    .line 823
    .line 824
    :cond_2b
    iget v2, v1, Le4/b;->b:I

    .line 825
    .line 826
    int-to-long v2, v2

    .line 827
    cmp-long v7, v2, v10

    .line 828
    .line 829
    if-eqz v7, :cond_2c

    .line 830
    .line 831
    invoke-virtual {v1, v10, v11}, Le4/f;->g(J)V

    .line 832
    .line 833
    .line 834
    :cond_2c
    :goto_15
    add-int/lit8 v9, v29, 0x1

    .line 835
    .line 836
    int-to-short v9, v9

    .line 837
    move/from16 v2, p2

    .line 838
    .line 839
    move/from16 v3, v25

    .line 840
    .line 841
    move/from16 v7, v31

    .line 842
    .line 843
    goto/16 :goto_0

    .line 844
    .line 845
    :cond_2d
    move/from16 v31, v7

    .line 846
    .line 847
    move-object/from16 v32, v14

    .line 848
    .line 849
    const/16 v16, 0x0

    .line 850
    .line 851
    const-wide/16 v17, 0x0

    .line 852
    .line 853
    const/16 v19, 0x1

    .line 854
    .line 855
    invoke-virtual {v1}, Le4/b;->readInt()I

    .line 856
    .line 857
    .line 858
    move-result v2

    .line 859
    if-eqz v31, :cond_2e

    .line 860
    .line 861
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 862
    .line 863
    .line 864
    move-result-object v3

    .line 865
    const/4 v4, 0x1

    .line 866
    new-array v4, v4, [Ljava/lang/Object;

    .line 867
    .line 868
    aput-object v3, v4, v16

    .line 869
    .line 870
    const-string v3, "nextIfdOffset: %d"

    .line 871
    .line 872
    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 873
    .line 874
    .line 875
    move-result-object v3

    .line 876
    invoke-static {v6, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 877
    .line 878
    .line 879
    :cond_2e
    int-to-long v3, v2

    .line 880
    cmp-long v7, v3, v17

    .line 881
    .line 882
    if-lez v7, :cond_31

    .line 883
    .line 884
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 885
    .line 886
    .line 887
    move-result-object v7

    .line 888
    invoke-virtual {v5, v7}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 889
    .line 890
    .line 891
    move-result v5

    .line 892
    if-nez v5, :cond_30

    .line 893
    .line 894
    invoke-virtual {v1, v3, v4}, Le4/f;->g(J)V

    .line 895
    .line 896
    .line 897
    const/4 v8, 0x4

    .line 898
    aget-object v2, v32, v8

    .line 899
    .line 900
    invoke-virtual {v2}, Ljava/util/HashMap;->isEmpty()Z

    .line 901
    .line 902
    .line 903
    move-result v2

    .line 904
    if-eqz v2, :cond_2f

    .line 905
    .line 906
    invoke-virtual {v0, v1, v8}, Le4/g;->s(Le4/f;I)V

    .line 907
    .line 908
    .line 909
    return-void

    .line 910
    :cond_2f
    const/4 v7, 0x5

    .line 911
    aget-object v2, v32, v7

    .line 912
    .line 913
    invoke-virtual {v2}, Ljava/util/HashMap;->isEmpty()Z

    .line 914
    .line 915
    .line 916
    move-result v2

    .line 917
    if-eqz v2, :cond_32

    .line 918
    .line 919
    invoke-virtual {v0, v1, v7}, Le4/g;->s(Le4/f;I)V

    .line 920
    .line 921
    .line 922
    return-void

    .line 923
    :cond_30
    if-eqz v31, :cond_32

    .line 924
    .line 925
    new-instance v1, Ljava/lang/StringBuilder;

    .line 926
    .line 927
    const-string v3, "Stop reading file since re-reading an IFD may cause an infinite loop: "

    .line 928
    .line 929
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 930
    .line 931
    .line 932
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 933
    .line 934
    .line 935
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 936
    .line 937
    .line 938
    move-result-object v1

    .line 939
    invoke-static {v6, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 940
    .line 941
    .line 942
    return-void

    .line 943
    :cond_31
    if-eqz v31, :cond_32

    .line 944
    .line 945
    new-instance v1, Ljava/lang/StringBuilder;

    .line 946
    .line 947
    const-string v3, "Stop reading file since a wrong offset may cause an infinite loop: "

    .line 948
    .line 949
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 950
    .line 951
    .line 952
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 953
    .line 954
    .line 955
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 956
    .line 957
    .line 958
    move-result-object v1

    .line 959
    invoke-static {v6, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 960
    .line 961
    .line 962
    :cond_32
    :goto_16
    return-void
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
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    .line 2510
    .line 2511
    .line 2512
    .line 2513
    .line 2514
    .line 2515
    .line 2516
    .line 2517
    .line 2518
    .line 2519
    .line 2520
    .line 2521
    .line 2522
    .line 2523
    .line 2524
    .line 2525
    .line 2526
    .line 2527
    .line 2528
    .line 2529
    .line 2530
    .line 2531
    .line 2532
    .line 2533
    .line 2534
    .line 2535
    .line 2536
    .line 2537
    .line 2538
    .line 2539
    .line 2540
    .line 2541
    .line 2542
    .line 2543
    .line 2544
    .line 2545
    .line 2546
    .line 2547
    .line 2548
    .line 2549
    .line 2550
    .line 2551
    .line 2552
    .line 2553
    .line 2554
    .line 2555
    .line 2556
    .line 2557
    .line 2558
    .line 2559
    .line 2560
    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    .line 2574
    .line 2575
    .line 2576
    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    .line 2582
    .line 2583
    .line 2584
    .line 2585
    .line 2586
    .line 2587
    .line 2588
    .line 2589
    .line 2590
    .line 2591
    .line 2592
    .line 2593
    .line 2594
    .line 2595
    .line 2596
    .line 2597
    .line 2598
    .line 2599
    .line 2600
    .line 2601
    .line 2602
    .line 2603
    .line 2604
    .line 2605
    .line 2606
    .line 2607
    .line 2608
    .line 2609
    .line 2610
    .line 2611
    .line 2612
    .line 2613
    .line 2614
    .line 2615
    .line 2616
    .line 2617
    .line 2618
    .line 2619
    .line 2620
    .line 2621
    .line 2622
    .line 2623
    .line 2624
    .line 2625
    .line 2626
    .line 2627
    .line 2628
    .line 2629
    .line 2630
    .line 2631
    .line 2632
    .line 2633
    .line 2634
    .line 2635
    .line 2636
    .line 2637
    .line 2638
    .line 2639
    .line 2640
    .line 2641
    .line 2642
    .line 2643
    .line 2644
    .line 2645
    .line 2646
    .line 2647
    .line 2648
    .line 2649
    .line 2650
    .line 2651
    .line 2652
    .line 2653
    .line 2654
    .line 2655
    .line 2656
    .line 2657
    .line 2658
    .line 2659
    .line 2660
    .line 2661
    .line 2662
    .line 2663
    .line 2664
    .line 2665
    .line 2666
    .line 2667
    .line 2668
    .line 2669
    .line 2670
    .line 2671
    .line 2672
    .line 2673
    .line 2674
    .line 2675
    .line 2676
    .line 2677
    .line 2678
    .line 2679
    .line 2680
    .line 2681
    .line 2682
    .line 2683
    .line 2684
    .line 2685
    .line 2686
    .line 2687
    .line 2688
    .line 2689
    .line 2690
    .line 2691
    .line 2692
    .line 2693
    .line 2694
    .line 2695
    .line 2696
    .line 2697
    .line 2698
    .line 2699
    .line 2700
    .line 2701
    .line 2702
    .line 2703
    .line 2704
    .line 2705
    .line 2706
    .line 2707
    .line 2708
    .line 2709
    .line 2710
    .line 2711
    .line 2712
    .line 2713
    .line 2714
    .line 2715
    .line 2716
    .line 2717
    .line 2718
    .line 2719
    .line 2720
    .line 2721
    .line 2722
    .line 2723
    .line 2724
    .line 2725
    .line 2726
    .line 2727
    .line 2728
    .line 2729
    .line 2730
    .line 2731
    .line 2732
    .line 2733
    .line 2734
    .line 2735
    .line 2736
    .line 2737
    .line 2738
    .line 2739
    .line 2740
    .line 2741
    .line 2742
    .line 2743
    .line 2744
    .line 2745
    .line 2746
    .line 2747
    .line 2748
    .line 2749
    .line 2750
    .line 2751
    .line 2752
    .line 2753
    .line 2754
    .line 2755
    .line 2756
    .line 2757
    .line 2758
    .line 2759
    .line 2760
    .line 2761
    .line 2762
    .line 2763
    .line 2764
    .line 2765
    .line 2766
    .line 2767
    .line 2768
    .line 2769
    .line 2770
    .line 2771
    .line 2772
    .line 2773
    .line 2774
    .line 2775
    .line 2776
    .line 2777
    .line 2778
    .line 2779
    .line 2780
    .line 2781
    .line 2782
    .line 2783
    .line 2784
    .line 2785
    .line 2786
    .line 2787
    .line 2788
    .line 2789
    .line 2790
    .line 2791
    .line 2792
    .line 2793
    .line 2794
    .line 2795
    .line 2796
    .line 2797
    .line 2798
    .line 2799
    .line 2800
    .line 2801
    .line 2802
    .line 2803
    .line 2804
    .line 2805
    .line 2806
    .line 2807
    .line 2808
    .line 2809
    .line 2810
    .line 2811
    .line 2812
    .line 2813
    .line 2814
    .line 2815
    .line 2816
    .line 2817
    .line 2818
    .line 2819
    .line 2820
    .line 2821
    .line 2822
    .line 2823
    .line 2824
    .line 2825
    .line 2826
    .line 2827
    .line 2828
    .line 2829
    .line 2830
    .line 2831
    .line 2832
    .line 2833
    .line 2834
    .line 2835
    .line 2836
    .line 2837
    .line 2838
    .line 2839
    .line 2840
    .line 2841
    .line 2842
    .line 2843
    .line 2844
    .line 2845
    .line 2846
    .line 2847
    .line 2848
    .line 2849
    .line 2850
    .line 2851
    .line 2852
    .line 2853
    .line 2854
    .line 2855
    .line 2856
    .line 2857
    .line 2858
    .line 2859
    .line 2860
    .line 2861
    .line 2862
    .line 2863
    .line 2864
    .line 2865
    .line 2866
    .line 2867
    .line 2868
    .line 2869
    .line 2870
    .line 2871
    .line 2872
    .line 2873
    .line 2874
    .line 2875
    .line 2876
    .line 2877
    .line 2878
    .line 2879
    .line 2880
    .line 2881
    .line 2882
    .line 2883
    .line 2884
    .line 2885
    .line 2886
    .line 2887
    .line 2888
    .line 2889
    .line 2890
    .line 2891
    .line 2892
    .line 2893
    .line 2894
    .line 2895
    .line 2896
    .line 2897
    .line 2898
    .line 2899
    .line 2900
    .line 2901
    .line 2902
    .line 2903
    .line 2904
    .line 2905
    .line 2906
    .line 2907
    .line 2908
    .line 2909
    .line 2910
    .line 2911
    .line 2912
    .line 2913
    .line 2914
    .line 2915
    .line 2916
    .line 2917
    .line 2918
    .line 2919
    .line 2920
    .line 2921
    .line 2922
    .line 2923
    .line 2924
    .line 2925
    .line 2926
    .line 2927
    .line 2928
    .line 2929
    .line 2930
    .line 2931
    .line 2932
    .line 2933
    .line 2934
    .line 2935
    .line 2936
    .line 2937
    .line 2938
    .line 2939
    .line 2940
    .line 2941
    .line 2942
    .line 2943
    .line 2944
    .line 2945
    .line 2946
    .line 2947
    .line 2948
    .line 2949
    .line 2950
    .line 2951
    .line 2952
    .line 2953
    .line 2954
    .line 2955
    .line 2956
    .line 2957
    .line 2958
    .line 2959
    .line 2960
    .line 2961
    .line 2962
    .line 2963
    .line 2964
    .line 2965
    .line 2966
    .line 2967
    .line 2968
    .line 2969
    .line 2970
    .line 2971
    .line 2972
    .line 2973
    .line 2974
    .line 2975
    .line 2976
    .line 2977
    .line 2978
    .line 2979
    .line 2980
    .line 2981
    .line 2982
    .line 2983
    .line 2984
    .line 2985
    .line 2986
    .line 2987
    .line 2988
    .line 2989
    .line 2990
    .line 2991
    .line 2992
    .line 2993
    .line 2994
    .line 2995
    .line 2996
    .line 2997
    .line 2998
    .line 2999
    .line 3000
    .line 3001
    .line 3002
    .line 3003
    .line 3004
    .line 3005
    .line 3006
    .line 3007
    .line 3008
    .line 3009
    .line 3010
    .line 3011
    .line 3012
    .line 3013
    .line 3014
    .line 3015
    .line 3016
    .line 3017
    .line 3018
    .line 3019
    .line 3020
    .line 3021
    .line 3022
    .line 3023
    .line 3024
    .line 3025
    .line 3026
    .line 3027
    .line 3028
    .line 3029
    .line 3030
    .line 3031
    .line 3032
    .line 3033
    .line 3034
    .line 3035
    .line 3036
    .line 3037
    .line 3038
    .line 3039
    .line 3040
    .line 3041
    .line 3042
    .line 3043
    .line 3044
    .line 3045
    .line 3046
    .line 3047
    .line 3048
    .line 3049
    .line 3050
    .line 3051
    .line 3052
    .line 3053
    .line 3054
    .line 3055
    .line 3056
    .line 3057
    .line 3058
    .line 3059
    .line 3060
    .line 3061
    .line 3062
    .line 3063
    .line 3064
    .line 3065
    .line 3066
    .line 3067
    .line 3068
    .line 3069
    .line 3070
    .line 3071
    .line 3072
    .line 3073
    .line 3074
    .line 3075
    .line 3076
    .line 3077
    .line 3078
    .line 3079
    .line 3080
    .line 3081
    .line 3082
    .line 3083
    .line 3084
    .line 3085
    .line 3086
    .line 3087
    .line 3088
    .line 3089
    .line 3090
    .line 3091
    .line 3092
    .line 3093
    .line 3094
    .line 3095
    .line 3096
    .line 3097
    .line 3098
    .line 3099
    .line 3100
    .line 3101
    .line 3102
    .line 3103
    .line 3104
    .line 3105
    .line 3106
    .line 3107
    .line 3108
    .line 3109
    .line 3110
    .line 3111
    .line 3112
    .line 3113
    .line 3114
    .line 3115
    .line 3116
    .line 3117
    .line 3118
    .line 3119
    .line 3120
    .line 3121
    .line 3122
    .line 3123
    .line 3124
    .line 3125
    .line 3126
    .line 3127
    .line 3128
    .line 3129
    .line 3130
    .line 3131
    .line 3132
    .line 3133
    .line 3134
    .line 3135
    .line 3136
    .line 3137
    .line 3138
    .line 3139
    .line 3140
    .line 3141
    .line 3142
    .line 3143
    .line 3144
    .line 3145
    .line 3146
    .line 3147
    .line 3148
    .line 3149
    .line 3150
    .line 3151
    .line 3152
    .line 3153
    .line 3154
    .line 3155
    .line 3156
    .line 3157
    .line 3158
    .line 3159
    .line 3160
    .line 3161
    .line 3162
    .line 3163
    .line 3164
    .line 3165
    .line 3166
    .line 3167
    .line 3168
    .line 3169
    .line 3170
    .line 3171
    .line 3172
    .line 3173
    .line 3174
    .line 3175
    .line 3176
    .line 3177
    .line 3178
    .line 3179
    .line 3180
    .line 3181
    .line 3182
    .line 3183
    .line 3184
    .line 3185
    .line 3186
    .line 3187
    .line 3188
    .line 3189
    .line 3190
    .line 3191
    .line 3192
    .line 3193
    .line 3194
    .line 3195
    .line 3196
    .line 3197
    .line 3198
    .line 3199
    .line 3200
    .line 3201
    .line 3202
    .line 3203
    .line 3204
    .line 3205
    .line 3206
    .line 3207
    .line 3208
    .line 3209
    .line 3210
    .line 3211
    .line 3212
    .line 3213
    .line 3214
    .line 3215
    .line 3216
    .line 3217
    .line 3218
    .line 3219
    .line 3220
    .line 3221
    .line 3222
    .line 3223
    .line 3224
    .line 3225
    .line 3226
    .line 3227
    .line 3228
    .line 3229
    .line 3230
    .line 3231
    .line 3232
    .line 3233
    .line 3234
    .line 3235
    .line 3236
    .line 3237
    .line 3238
    .line 3239
    .line 3240
    .line 3241
    .line 3242
    .line 3243
    .line 3244
    .line 3245
    .line 3246
    .line 3247
    .line 3248
    .line 3249
    .line 3250
    .line 3251
    .line 3252
    .line 3253
    .line 3254
    .line 3255
    .line 3256
    .line 3257
    .line 3258
    .line 3259
    .line 3260
    .line 3261
    .line 3262
    .line 3263
    .line 3264
    .line 3265
    .line 3266
    .line 3267
    .line 3268
    .line 3269
    .line 3270
    .line 3271
    .line 3272
    .line 3273
    .line 3274
    .line 3275
    .line 3276
    .line 3277
    .line 3278
    .line 3279
    .line 3280
    .line 3281
    .line 3282
    .line 3283
    .line 3284
    .line 3285
    .line 3286
    .line 3287
    .line 3288
    .line 3289
    .line 3290
    .line 3291
    .line 3292
    .line 3293
    .line 3294
    .line 3295
    .line 3296
    .line 3297
    .line 3298
    .line 3299
    .line 3300
    .line 3301
    .line 3302
    .line 3303
    .line 3304
    .line 3305
    .line 3306
    .line 3307
    .line 3308
    .line 3309
    .line 3310
    .line 3311
    .line 3312
    .line 3313
    .line 3314
    .line 3315
    .line 3316
    .line 3317
    .line 3318
    .line 3319
    .line 3320
    .line 3321
    .line 3322
    .line 3323
    .line 3324
    .line 3325
    .line 3326
    .line 3327
    .line 3328
    .line 3329
    .line 3330
    .line 3331
    .line 3332
    .line 3333
    .line 3334
    .line 3335
    .line 3336
    .line 3337
    .line 3338
    .line 3339
    .line 3340
    .line 3341
    .line 3342
    .line 3343
    .line 3344
    .line 3345
    .line 3346
    .line 3347
    .line 3348
    .line 3349
    .line 3350
    .line 3351
    .line 3352
    .line 3353
    .line 3354
    .line 3355
    .line 3356
    .line 3357
    .line 3358
    .line 3359
    .line 3360
    .line 3361
    .line 3362
    .line 3363
    .line 3364
    .line 3365
    .line 3366
    .line 3367
    .line 3368
    .line 3369
    .line 3370
    .line 3371
    .line 3372
    .line 3373
    .line 3374
    .line 3375
    .line 3376
    .line 3377
    .line 3378
    .line 3379
    .line 3380
    .line 3381
    .line 3382
    .line 3383
    .line 3384
    .line 3385
    .line 3386
    .line 3387
    .line 3388
    .line 3389
    .line 3390
    .line 3391
    .line 3392
    .line 3393
    .line 3394
    .line 3395
    .line 3396
    .line 3397
    .line 3398
    .line 3399
    .line 3400
    .line 3401
    .line 3402
    .line 3403
    .line 3404
    .line 3405
    .line 3406
    .line 3407
    .line 3408
    .line 3409
    .line 3410
    .line 3411
    .line 3412
    .line 3413
    .line 3414
    .line 3415
    .line 3416
    .line 3417
    .line 3418
    .line 3419
    .line 3420
    .line 3421
    .line 3422
    .line 3423
    .line 3424
    .line 3425
    .line 3426
    .line 3427
    .line 3428
    .line 3429
    .line 3430
    .line 3431
    .line 3432
    .line 3433
    .line 3434
    .line 3435
    .line 3436
    .line 3437
    .line 3438
    .line 3439
    .line 3440
    .line 3441
    .line 3442
    .line 3443
    .line 3444
    .line 3445
    .line 3446
    .line 3447
    .line 3448
    .line 3449
    .line 3450
    .line 3451
    .line 3452
    .line 3453
    .line 3454
    .line 3455
    .line 3456
    .line 3457
    .line 3458
    .line 3459
    .line 3460
    .line 3461
    .line 3462
    .line 3463
    .line 3464
    .line 3465
    .line 3466
    .line 3467
    .line 3468
    .line 3469
    .line 3470
    .line 3471
    .line 3472
    .line 3473
    .line 3474
    .line 3475
    .line 3476
    .line 3477
    .line 3478
    .line 3479
    .line 3480
    .line 3481
    .line 3482
    .line 3483
    .line 3484
    .line 3485
    .line 3486
    .line 3487
    .line 3488
    .line 3489
    .line 3490
    .line 3491
    .line 3492
    .line 3493
    .line 3494
    .line 3495
    .line 3496
    .line 3497
    .line 3498
    .line 3499
    .line 3500
    .line 3501
    .line 3502
    .line 3503
    .line 3504
    .line 3505
    .line 3506
    .line 3507
    .line 3508
    .line 3509
    .line 3510
    .line 3511
    .line 3512
    .line 3513
    .line 3514
    .line 3515
    .line 3516
    .line 3517
    .line 3518
    .line 3519
    .line 3520
    .line 3521
    .line 3522
    .line 3523
    .line 3524
    .line 3525
    .line 3526
    .line 3527
    .line 3528
    .line 3529
    .line 3530
    .line 3531
    .line 3532
    .line 3533
    .line 3534
    .line 3535
    .line 3536
    .line 3537
    .line 3538
    .line 3539
    .line 3540
    .line 3541
    .line 3542
    .line 3543
    .line 3544
    .line 3545
    .line 3546
    .line 3547
    .line 3548
    .line 3549
    .line 3550
    .line 3551
    .line 3552
    .line 3553
    .line 3554
    .line 3555
    .line 3556
    .line 3557
    .line 3558
    .line 3559
    .line 3560
    .line 3561
    .line 3562
    .line 3563
    .line 3564
    .line 3565
    .line 3566
    .line 3567
    .line 3568
    .line 3569
    .line 3570
    .line 3571
    .line 3572
    .line 3573
    .line 3574
    .line 3575
    .line 3576
    .line 3577
    .line 3578
    .line 3579
    .line 3580
    .line 3581
    .line 3582
    .line 3583
    .line 3584
    .line 3585
    .line 3586
    .line 3587
    .line 3588
    .line 3589
    .line 3590
    .line 3591
    .line 3592
    .line 3593
    .line 3594
    .line 3595
    .line 3596
    .line 3597
    .line 3598
    .line 3599
    .line 3600
    .line 3601
    .line 3602
    .line 3603
    .line 3604
    .line 3605
    .line 3606
    .line 3607
    .line 3608
    .line 3609
    .line 3610
    .line 3611
    .line 3612
    .line 3613
    .line 3614
    .line 3615
    .line 3616
    .line 3617
    .line 3618
    .line 3619
    .line 3620
    .line 3621
    .line 3622
    .line 3623
    .line 3624
    .line 3625
    .line 3626
    .line 3627
    .line 3628
    .line 3629
    .line 3630
    .line 3631
    .line 3632
    .line 3633
    .line 3634
    .line 3635
    .line 3636
    .line 3637
    .line 3638
    .line 3639
    .line 3640
    .line 3641
    .line 3642
    .line 3643
    .line 3644
    .line 3645
    .line 3646
    .line 3647
    .line 3648
    .line 3649
    .line 3650
    .line 3651
    .line 3652
    .line 3653
    .line 3654
    .line 3655
    .line 3656
    .line 3657
    .line 3658
    .line 3659
    .line 3660
    .line 3661
    .line 3662
    .line 3663
    .line 3664
    .line 3665
    .line 3666
    .line 3667
    .line 3668
    .line 3669
    .line 3670
    .line 3671
    .line 3672
    .line 3673
    .line 3674
    .line 3675
    .line 3676
    .line 3677
    .line 3678
    .line 3679
    .line 3680
    .line 3681
    .line 3682
    .line 3683
    .line 3684
    .line 3685
    .line 3686
    .line 3687
    .line 3688
    .line 3689
    .line 3690
    .line 3691
    .line 3692
    .line 3693
    .line 3694
    .line 3695
    .line 3696
    .line 3697
    .line 3698
    .line 3699
    .line 3700
    .line 3701
    .line 3702
    .line 3703
    .line 3704
    .line 3705
    .line 3706
    .line 3707
    .line 3708
    .line 3709
    .line 3710
    .line 3711
    .line 3712
    .line 3713
    .line 3714
    .line 3715
    .line 3716
    .line 3717
    .line 3718
    .line 3719
    .line 3720
    .line 3721
    .line 3722
    .line 3723
    .line 3724
    .line 3725
    .line 3726
    .line 3727
    .line 3728
    .line 3729
    .line 3730
    .line 3731
    .line 3732
    .line 3733
    .line 3734
    .line 3735
    .line 3736
    .line 3737
    .line 3738
    .line 3739
    .line 3740
    .line 3741
    .line 3742
    .line 3743
    .line 3744
    .line 3745
    .line 3746
    .line 3747
    .line 3748
    .line 3749
    .line 3750
    .line 3751
    .line 3752
    .line 3753
    .line 3754
    .line 3755
    .line 3756
    .line 3757
    .line 3758
    .line 3759
    .line 3760
    .line 3761
    .line 3762
    .line 3763
    .line 3764
    .line 3765
    .line 3766
    .line 3767
    .line 3768
    .line 3769
    .line 3770
    .line 3771
    .line 3772
    .line 3773
    .line 3774
    .line 3775
    .line 3776
    .line 3777
    .line 3778
    .line 3779
    .line 3780
    .line 3781
    .line 3782
    .line 3783
    .line 3784
    .line 3785
    .line 3786
    .line 3787
    .line 3788
    .line 3789
    .line 3790
    .line 3791
    .line 3792
    .line 3793
    .line 3794
    .line 3795
    .line 3796
    .line 3797
    .line 3798
    .line 3799
    .line 3800
    .line 3801
    .line 3802
    .line 3803
    .line 3804
    .line 3805
    .line 3806
    .line 3807
    .line 3808
    .line 3809
    .line 3810
    .line 3811
    .line 3812
    .line 3813
    .line 3814
    .line 3815
    .line 3816
    .line 3817
    .line 3818
    .line 3819
    .line 3820
    .line 3821
    .line 3822
    .line 3823
    .line 3824
    .line 3825
    .line 3826
    .line 3827
    .line 3828
    .line 3829
    .line 3830
    .line 3831
    .line 3832
    .line 3833
    .line 3834
    .line 3835
    .line 3836
    .line 3837
    .line 3838
    .line 3839
    .line 3840
    .line 3841
    .line 3842
    .line 3843
    .line 3844
    .line 3845
    .line 3846
    .line 3847
    .line 3848
    .line 3849
    .line 3850
    .line 3851
    .line 3852
    .line 3853
    .line 3854
    .line 3855
    .line 3856
    .line 3857
    .line 3858
    .line 3859
    .line 3860
    .line 3861
    .line 3862
    .line 3863
    .line 3864
    .line 3865
    .line 3866
    .line 3867
    .line 3868
    .line 3869
    .line 3870
    .line 3871
    .line 3872
    .line 3873
    .line 3874
    .line 3875
    .line 3876
    .line 3877
    .line 3878
    .line 3879
    .line 3880
    .line 3881
    .line 3882
    .line 3883
    .line 3884
    .line 3885
    .line 3886
    .line 3887
    .line 3888
    .line 3889
    .line 3890
    .line 3891
    .line 3892
    .line 3893
    .line 3894
    .line 3895
    .line 3896
    .line 3897
    .line 3898
    .line 3899
    .line 3900
    .line 3901
    .line 3902
    .line 3903
    .line 3904
    .line 3905
    .line 3906
    .line 3907
    .line 3908
    .line 3909
    .line 3910
    .line 3911
    .line 3912
    .line 3913
    .line 3914
    .line 3915
    .line 3916
    .line 3917
    .line 3918
    .line 3919
    .line 3920
    .line 3921
    .line 3922
    .line 3923
    .line 3924
    .line 3925
    .line 3926
    .line 3927
    .line 3928
    .line 3929
    .line 3930
    .line 3931
    .line 3932
    .line 3933
    .line 3934
    .line 3935
    .line 3936
    .line 3937
    .line 3938
    .line 3939
    .line 3940
    .line 3941
    .line 3942
    .line 3943
    .line 3944
    .line 3945
    .line 3946
    .line 3947
    .line 3948
    .line 3949
    .line 3950
    .line 3951
    .line 3952
    .line 3953
    .line 3954
    .line 3955
    .line 3956
    .line 3957
    .line 3958
    .line 3959
    .line 3960
    .line 3961
    .line 3962
    .line 3963
    .line 3964
    .line 3965
    .line 3966
    .line 3967
    .line 3968
    .line 3969
    .line 3970
    .line 3971
    .line 3972
    .line 3973
    .line 3974
    .line 3975
    .line 3976
    .line 3977
    .line 3978
    .line 3979
    .line 3980
    .line 3981
    .line 3982
    .line 3983
    .line 3984
    .line 3985
    .line 3986
    .line 3987
    .line 3988
    .line 3989
    .line 3990
    .line 3991
    .line 3992
    .line 3993
    .line 3994
    .line 3995
    .line 3996
    .line 3997
    .line 3998
    .line 3999
    .line 4000
    .line 4001
    .line 4002
    .line 4003
    .line 4004
    .line 4005
    .line 4006
    .line 4007
    .line 4008
    .line 4009
    .line 4010
    .line 4011
    .line 4012
    .line 4013
    .line 4014
    .line 4015
    .line 4016
    .line 4017
    .line 4018
    .line 4019
    .line 4020
    .line 4021
    .line 4022
    .line 4023
    .line 4024
.end method

.method public final t(ILjava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Le4/g;->d:[Ljava/util/HashMap;

    .line 2
    .line 3
    aget-object v1, v0, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    aget-object v1, v0, p1

    .line 12
    .line 13
    invoke-virtual {v1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    aget-object v1, v0, p1

    .line 20
    .line 21
    invoke-virtual {v1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v1, p3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    aget-object p1, v0, p1

    .line 29
    .line 30
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void
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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method public final u(Le4/b;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Le4/g;->d:[Ljava/util/HashMap;

    .line 6
    .line 7
    const/4 v3, 0x4

    .line 8
    aget-object v2, v2, v3

    .line 9
    .line 10
    const-string v3, "Compression"

    .line 11
    .line 12
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    check-cast v3, Le4/c;

    .line 17
    .line 18
    if-eqz v3, :cond_10

    .line 19
    .line 20
    iget-object v4, v0, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 21
    .line 22
    invoke-virtual {v3, v4}, Le4/c;->e(Ljava/nio/ByteOrder;)I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    const/4 v4, 0x6

    .line 27
    const/4 v5, 0x1

    .line 28
    if-eq v3, v5, :cond_1

    .line 29
    .line 30
    if-eq v3, v4, :cond_0

    .line 31
    .line 32
    const/4 v6, 0x7

    .line 33
    if-eq v3, v6, :cond_1

    .line 34
    .line 35
    goto/16 :goto_5

    .line 36
    .line 37
    :cond_0
    invoke-virtual {v0, v1, v2}, Le4/g;->m(Le4/b;Ljava/util/HashMap;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    const-string v3, "BitsPerSample"

    .line 42
    .line 43
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    check-cast v3, Le4/c;

    .line 48
    .line 49
    const-string v6, "ExifInterface"

    .line 50
    .line 51
    if-eqz v3, :cond_e

    .line 52
    .line 53
    iget-object v7, v0, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 54
    .line 55
    invoke-virtual {v3, v7}, Le4/c;->g(Ljava/nio/ByteOrder;)Ljava/io/Serializable;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    check-cast v3, [I

    .line 60
    .line 61
    sget-object v7, Le4/g;->m:[I

    .line 62
    .line 63
    invoke-static {v7, v3}, Ljava/util/Arrays;->equals([I[I)Z

    .line 64
    .line 65
    .line 66
    move-result v8

    .line 67
    if-eqz v8, :cond_2

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    iget v8, v0, Le4/g;->c:I

    .line 71
    .line 72
    const/4 v9, 0x3

    .line 73
    if-ne v8, v9, :cond_e

    .line 74
    .line 75
    const-string v8, "PhotometricInterpretation"

    .line 76
    .line 77
    invoke-virtual {v2, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v8

    .line 81
    check-cast v8, Le4/c;

    .line 82
    .line 83
    if-eqz v8, :cond_e

    .line 84
    .line 85
    iget-object v9, v0, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 86
    .line 87
    invoke-virtual {v8, v9}, Le4/c;->e(Ljava/nio/ByteOrder;)I

    .line 88
    .line 89
    .line 90
    move-result v8

    .line 91
    if-ne v8, v5, :cond_3

    .line 92
    .line 93
    sget-object v9, Le4/g;->n:[I

    .line 94
    .line 95
    invoke-static {v3, v9}, Ljava/util/Arrays;->equals([I[I)Z

    .line 96
    .line 97
    .line 98
    move-result v9

    .line 99
    if-nez v9, :cond_4

    .line 100
    .line 101
    :cond_3
    if-ne v8, v4, :cond_e

    .line 102
    .line 103
    invoke-static {v3, v7}, Ljava/util/Arrays;->equals([I[I)Z

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    if-eqz v3, :cond_e

    .line 108
    .line 109
    :cond_4
    :goto_0
    const-string v3, " bytes."

    .line 110
    .line 111
    const-string v4, "StripOffsets"

    .line 112
    .line 113
    invoke-virtual {v2, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    check-cast v4, Le4/c;

    .line 118
    .line 119
    const-string v7, "StripByteCounts"

    .line 120
    .line 121
    invoke-virtual {v2, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    check-cast v2, Le4/c;

    .line 126
    .line 127
    if-eqz v4, :cond_f

    .line 128
    .line 129
    if-eqz v2, :cond_f

    .line 130
    .line 131
    iget-object v7, v0, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 132
    .line 133
    invoke-virtual {v4, v7}, Le4/c;->g(Ljava/nio/ByteOrder;)Ljava/io/Serializable;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    invoke-static {v4}, Lpc/f0;->t(Ljava/io/Serializable;)[J

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    iget-object v7, v0, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 142
    .line 143
    invoke-virtual {v2, v7}, Le4/c;->g(Ljava/nio/ByteOrder;)Ljava/io/Serializable;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    invoke-static {v2}, Lpc/f0;->t(Ljava/io/Serializable;)[J

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    if-eqz v4, :cond_d

    .line 152
    .line 153
    array-length v7, v4

    .line 154
    if-nez v7, :cond_5

    .line 155
    .line 156
    goto/16 :goto_4

    .line 157
    .line 158
    :cond_5
    if-eqz v2, :cond_c

    .line 159
    .line 160
    array-length v7, v2

    .line 161
    if-nez v7, :cond_6

    .line 162
    .line 163
    goto/16 :goto_3

    .line 164
    .line 165
    :cond_6
    array-length v7, v4

    .line 166
    array-length v8, v2

    .line 167
    if-eq v7, v8, :cond_7

    .line 168
    .line 169
    const-string v1, "stripOffsets and stripByteCounts should have same length."

    .line 170
    .line 171
    invoke-static {v6, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 172
    .line 173
    .line 174
    goto/16 :goto_5

    .line 175
    .line 176
    :cond_7
    array-length v7, v2

    .line 177
    const/4 v8, 0x0

    .line 178
    const-wide/16 v9, 0x0

    .line 179
    .line 180
    const/4 v11, 0x0

    .line 181
    :goto_1
    if-ge v11, v7, :cond_8

    .line 182
    .line 183
    aget-wide v12, v2, v11

    .line 184
    .line 185
    add-long/2addr v9, v12

    .line 186
    add-int/lit8 v11, v11, 0x1

    .line 187
    .line 188
    goto :goto_1

    .line 189
    :cond_8
    long-to-int v7, v9

    .line 190
    new-array v7, v7, [B

    .line 191
    .line 192
    iput-boolean v5, v0, Le4/g;->g:Z

    .line 193
    .line 194
    const/4 v9, 0x0

    .line 195
    const/4 v10, 0x0

    .line 196
    const/4 v11, 0x0

    .line 197
    :goto_2
    array-length v12, v4

    .line 198
    if-ge v9, v12, :cond_b

    .line 199
    .line 200
    aget-wide v12, v4, v9

    .line 201
    .line 202
    long-to-int v13, v12

    .line 203
    aget-wide v14, v2, v9

    .line 204
    .line 205
    long-to-int v12, v14

    .line 206
    array-length v14, v4

    .line 207
    sub-int/2addr v14, v5

    .line 208
    if-ge v9, v14, :cond_9

    .line 209
    .line 210
    add-int v14, v13, v12

    .line 211
    .line 212
    int-to-long v14, v14

    .line 213
    add-int/lit8 v16, v9, 0x1

    .line 214
    .line 215
    aget-wide v16, v4, v16

    .line 216
    .line 217
    cmp-long v18, v14, v16

    .line 218
    .line 219
    if-eqz v18, :cond_9

    .line 220
    .line 221
    iput-boolean v8, v0, Le4/g;->g:Z

    .line 222
    .line 223
    :cond_9
    sub-int/2addr v13, v10

    .line 224
    if-gez v13, :cond_a

    .line 225
    .line 226
    const-string v1, "Invalid strip offset value"

    .line 227
    .line 228
    invoke-static {v6, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 229
    .line 230
    .line 231
    goto :goto_5

    .line 232
    :cond_a
    :try_start_0
    invoke-virtual {v1, v13}, Le4/b;->b(I)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_1

    .line 233
    .line 234
    .line 235
    add-int/2addr v10, v13

    .line 236
    new-array v13, v12, [B

    .line 237
    .line 238
    :try_start_1
    invoke-virtual {v1, v13}, Le4/b;->readFully([B)V
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0

    .line 239
    .line 240
    .line 241
    add-int/2addr v10, v12

    .line 242
    invoke-static {v13, v8, v7, v11, v12}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 243
    .line 244
    .line 245
    add-int/2addr v11, v12

    .line 246
    add-int/lit8 v9, v9, 0x1

    .line 247
    .line 248
    goto :goto_2

    .line 249
    :catch_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 250
    .line 251
    const-string v2, "Failed to read "

    .line 252
    .line 253
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    invoke-static {v6, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 267
    .line 268
    .line 269
    goto :goto_5

    .line 270
    :catch_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 271
    .line 272
    const-string v2, "Failed to skip "

    .line 273
    .line 274
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v1

    .line 287
    invoke-static {v6, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 288
    .line 289
    .line 290
    goto :goto_5

    .line 291
    :cond_b
    iget-boolean v1, v0, Le4/g;->g:Z

    .line 292
    .line 293
    if-eqz v1, :cond_f

    .line 294
    .line 295
    aget-wide v1, v4, v8

    .line 296
    .line 297
    goto :goto_5

    .line 298
    :cond_c
    :goto_3
    const-string v1, "stripByteCounts should not be null or have zero length."

    .line 299
    .line 300
    invoke-static {v6, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 301
    .line 302
    .line 303
    goto :goto_5

    .line 304
    :cond_d
    :goto_4
    const-string v1, "stripOffsets should not be null or have zero length."

    .line 305
    .line 306
    invoke-static {v6, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 307
    .line 308
    .line 309
    goto :goto_5

    .line 310
    :cond_e
    sget-boolean v1, Le4/g;->l:Z

    .line 311
    .line 312
    if-eqz v1, :cond_f

    .line 313
    .line 314
    const-string v1, "Unsupported data type value"

    .line 315
    .line 316
    invoke-static {v6, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 317
    .line 318
    .line 319
    :cond_f
    :goto_5
    return-void

    .line 320
    :cond_10
    invoke-virtual {v0, v1, v2}, Le4/g;->m(Le4/b;Ljava/util/HashMap;)V

    .line 321
    .line 322
    .line 323
    return-void
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
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
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
.end method

.method public final v(II)V
    .locals 8

    .line 1
    iget-object v0, p0, Le4/g;->d:[Ljava/util/HashMap;

    .line 2
    .line 3
    aget-object v1, v0, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const-string v2, "ExifInterface"

    .line 10
    .line 11
    sget-boolean v3, Le4/g;->l:Z

    .line 12
    .line 13
    if-nez v1, :cond_5

    .line 14
    .line 15
    aget-object v1, v0, p2

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    goto :goto_2

    .line 24
    :cond_0
    aget-object v1, v0, p1

    .line 25
    .line 26
    const-string v4, "ImageLength"

    .line 27
    .line 28
    invoke-virtual {v1, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Le4/c;

    .line 33
    .line 34
    aget-object v5, v0, p1

    .line 35
    .line 36
    const-string v6, "ImageWidth"

    .line 37
    .line 38
    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    check-cast v5, Le4/c;

    .line 43
    .line 44
    aget-object v7, v0, p2

    .line 45
    .line 46
    invoke-virtual {v7, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    check-cast v4, Le4/c;

    .line 51
    .line 52
    aget-object v7, v0, p2

    .line 53
    .line 54
    invoke-virtual {v7, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    check-cast v6, Le4/c;

    .line 59
    .line 60
    if-eqz v1, :cond_4

    .line 61
    .line 62
    if-nez v5, :cond_1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    if-eqz v4, :cond_3

    .line 66
    .line 67
    if-nez v6, :cond_2

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    iget-object v2, p0, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 71
    .line 72
    invoke-virtual {v1, v2}, Le4/c;->e(Ljava/nio/ByteOrder;)I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    iget-object v2, p0, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 77
    .line 78
    invoke-virtual {v5, v2}, Le4/c;->e(Ljava/nio/ByteOrder;)I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    iget-object v3, p0, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 83
    .line 84
    invoke-virtual {v4, v3}, Le4/c;->e(Ljava/nio/ByteOrder;)I

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    iget-object v4, p0, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 89
    .line 90
    invoke-virtual {v6, v4}, Le4/c;->e(Ljava/nio/ByteOrder;)I

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    if-ge v1, v3, :cond_6

    .line 95
    .line 96
    if-ge v2, v4, :cond_6

    .line 97
    .line 98
    aget-object v1, v0, p1

    .line 99
    .line 100
    aget-object v2, v0, p2

    .line 101
    .line 102
    aput-object v2, v0, p1

    .line 103
    .line 104
    aput-object v1, v0, p2

    .line 105
    .line 106
    return-void

    .line 107
    :cond_3
    :goto_0
    if-eqz v3, :cond_6

    .line 108
    .line 109
    const-string p1, "Second image does not contain valid size information"

    .line 110
    .line 111
    invoke-static {v2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :cond_4
    :goto_1
    if-eqz v3, :cond_6

    .line 116
    .line 117
    const-string p1, "First image does not contain valid size information"

    .line 118
    .line 119
    invoke-static {v2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :cond_5
    :goto_2
    if-eqz v3, :cond_6

    .line 124
    .line 125
    const-string p1, "Cannot perform swap since only one image data exists"

    .line 126
    .line 127
    invoke-static {v2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 128
    .line 129
    .line 130
    :cond_6
    return-void
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

.method public final w(Le4/f;I)V
    .locals 10

    .line 1
    iget-object v0, p0, Le4/g;->d:[Ljava/util/HashMap;

    .line 2
    .line 3
    aget-object v1, v0, p2

    .line 4
    .line 5
    const-string v2, "DefaultCropSize"

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Le4/c;

    .line 12
    .line 13
    aget-object v2, v0, p2

    .line 14
    .line 15
    const-string v3, "SensorTopBorder"

    .line 16
    .line 17
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Le4/c;

    .line 22
    .line 23
    aget-object v3, v0, p2

    .line 24
    .line 25
    const-string v4, "SensorLeftBorder"

    .line 26
    .line 27
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Le4/c;

    .line 32
    .line 33
    aget-object v4, v0, p2

    .line 34
    .line 35
    const-string v5, "SensorBottomBorder"

    .line 36
    .line 37
    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    check-cast v4, Le4/c;

    .line 42
    .line 43
    aget-object v5, v0, p2

    .line 44
    .line 45
    const-string v6, "SensorRightBorder"

    .line 46
    .line 47
    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    check-cast v5, Le4/c;

    .line 52
    .line 53
    const-string v6, "ImageLength"

    .line 54
    .line 55
    const-string v7, "ImageWidth"

    .line 56
    .line 57
    if-eqz v1, :cond_5

    .line 58
    .line 59
    iget p1, v1, Le4/c;->a:I

    .line 60
    .line 61
    const/4 v2, 0x5

    .line 62
    const-string v3, "Invalid crop size values. cropSize="

    .line 63
    .line 64
    const-string v4, "ExifInterface"

    .line 65
    .line 66
    const/4 v5, 0x1

    .line 67
    const/4 v8, 0x0

    .line 68
    const/4 v9, 0x2

    .line 69
    if-ne p1, v2, :cond_2

    .line 70
    .line 71
    iget-object p1, p0, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 72
    .line 73
    invoke-virtual {v1, p1}, Le4/c;->g(Ljava/nio/ByteOrder;)Ljava/io/Serializable;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    check-cast p1, [Le4/e;

    .line 78
    .line 79
    if-eqz p1, :cond_1

    .line 80
    .line 81
    array-length v1, p1

    .line 82
    if-eq v1, v9, :cond_0

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_0
    aget-object v1, p1, v8

    .line 86
    .line 87
    iget-object v2, p0, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 88
    .line 89
    invoke-static {v1, v2}, Le4/c;->b(Le4/e;Ljava/nio/ByteOrder;)Le4/c;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    aget-object p1, p1, v5

    .line 94
    .line 95
    iget-object v2, p0, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 96
    .line 97
    invoke-static {p1, v2}, Le4/c;->b(Le4/e;Ljava/nio/ByteOrder;)Le4/c;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    goto :goto_1

    .line 102
    :cond_1
    :goto_0
    new-instance p2, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    invoke-direct {p2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-static {v4, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :cond_2
    iget-object p1, p0, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 123
    .line 124
    invoke-virtual {v1, p1}, Le4/c;->g(Ljava/nio/ByteOrder;)Ljava/io/Serializable;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    check-cast p1, [I

    .line 129
    .line 130
    if-eqz p1, :cond_4

    .line 131
    .line 132
    array-length v1, p1

    .line 133
    if-eq v1, v9, :cond_3

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_3
    aget v1, p1, v8

    .line 137
    .line 138
    iget-object v2, p0, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 139
    .line 140
    invoke-static {v1, v2}, Le4/c;->c(ILjava/nio/ByteOrder;)Le4/c;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    aget p1, p1, v5

    .line 145
    .line 146
    iget-object v2, p0, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 147
    .line 148
    invoke-static {p1, v2}, Le4/c;->c(ILjava/nio/ByteOrder;)Le4/c;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    :goto_1
    aget-object v2, v0, p2

    .line 153
    .line 154
    invoke-virtual {v2, v7, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    aget-object p2, v0, p2

    .line 158
    .line 159
    invoke-virtual {p2, v6, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    return-void

    .line 163
    :cond_4
    :goto_2
    new-instance p2, Ljava/lang/StringBuilder;

    .line 164
    .line 165
    invoke-direct {p2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    invoke-static {p1}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    invoke-static {v4, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 180
    .line 181
    .line 182
    return-void

    .line 183
    :cond_5
    if-eqz v2, :cond_6

    .line 184
    .line 185
    if-eqz v3, :cond_6

    .line 186
    .line 187
    if-eqz v4, :cond_6

    .line 188
    .line 189
    if-eqz v5, :cond_6

    .line 190
    .line 191
    iget-object p1, p0, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 192
    .line 193
    invoke-virtual {v2, p1}, Le4/c;->e(Ljava/nio/ByteOrder;)I

    .line 194
    .line 195
    .line 196
    move-result p1

    .line 197
    iget-object v1, p0, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 198
    .line 199
    invoke-virtual {v4, v1}, Le4/c;->e(Ljava/nio/ByteOrder;)I

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    iget-object v2, p0, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 204
    .line 205
    invoke-virtual {v5, v2}, Le4/c;->e(Ljava/nio/ByteOrder;)I

    .line 206
    .line 207
    .line 208
    move-result v2

    .line 209
    iget-object v4, p0, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 210
    .line 211
    invoke-virtual {v3, v4}, Le4/c;->e(Ljava/nio/ByteOrder;)I

    .line 212
    .line 213
    .line 214
    move-result v3

    .line 215
    if-le v1, p1, :cond_8

    .line 216
    .line 217
    if-le v2, v3, :cond_8

    .line 218
    .line 219
    sub-int/2addr v1, p1

    .line 220
    sub-int/2addr v2, v3

    .line 221
    iget-object p1, p0, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 222
    .line 223
    invoke-static {v1, p1}, Le4/c;->c(ILjava/nio/ByteOrder;)Le4/c;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    iget-object v1, p0, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 228
    .line 229
    invoke-static {v2, v1}, Le4/c;->c(ILjava/nio/ByteOrder;)Le4/c;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    aget-object v2, v0, p2

    .line 234
    .line 235
    invoke-virtual {v2, v6, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    aget-object p1, v0, p2

    .line 239
    .line 240
    invoke-virtual {p1, v7, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    return-void

    .line 244
    :cond_6
    aget-object v1, v0, p2

    .line 245
    .line 246
    invoke-virtual {v1, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    check-cast v1, Le4/c;

    .line 251
    .line 252
    aget-object v2, v0, p2

    .line 253
    .line 254
    invoke-virtual {v2, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    check-cast v2, Le4/c;

    .line 259
    .line 260
    if-eqz v1, :cond_7

    .line 261
    .line 262
    if-nez v2, :cond_8

    .line 263
    .line 264
    :cond_7
    aget-object v1, v0, p2

    .line 265
    .line 266
    const-string v2, "JPEGInterchangeFormat"

    .line 267
    .line 268
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    check-cast v1, Le4/c;

    .line 273
    .line 274
    aget-object v0, v0, p2

    .line 275
    .line 276
    const-string v2, "JPEGInterchangeFormatLength"

    .line 277
    .line 278
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    check-cast v0, Le4/c;

    .line 283
    .line 284
    if-eqz v1, :cond_8

    .line 285
    .line 286
    if-eqz v0, :cond_8

    .line 287
    .line 288
    iget-object v0, p0, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 289
    .line 290
    invoke-virtual {v1, v0}, Le4/c;->e(Ljava/nio/ByteOrder;)I

    .line 291
    .line 292
    .line 293
    move-result v0

    .line 294
    iget-object v2, p0, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 295
    .line 296
    invoke-virtual {v1, v2}, Le4/c;->e(Ljava/nio/ByteOrder;)I

    .line 297
    .line 298
    .line 299
    move-result v1

    .line 300
    int-to-long v2, v0

    .line 301
    invoke-virtual {p1, v2, v3}, Le4/f;->g(J)V

    .line 302
    .line 303
    .line 304
    new-array v1, v1, [B

    .line 305
    .line 306
    invoke-virtual {p1, v1}, Le4/b;->readFully([B)V

    .line 307
    .line 308
    .line 309
    new-instance p1, Le4/b;

    .line 310
    .line 311
    invoke-direct {p1, v1}, Le4/b;-><init>([B)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {p0, p1, v0, p2}, Le4/g;->e(Le4/b;II)V

    .line 315
    .line 316
    .line 317
    :cond_8
    return-void
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
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
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
.end method

.method public final x()V
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x5

    .line 3
    invoke-virtual {p0, v0, v1}, Le4/g;->v(II)V

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x4

    .line 7
    invoke-virtual {p0, v0, v2}, Le4/g;->v(II)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v1, v2}, Le4/g;->v(II)V

    .line 11
    .line 12
    .line 13
    iget-object v3, p0, Le4/g;->d:[Ljava/util/HashMap;

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    aget-object v5, v3, v4

    .line 17
    .line 18
    const-string v6, "PixelXDimension"

    .line 19
    .line 20
    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    check-cast v5, Le4/c;

    .line 25
    .line 26
    aget-object v4, v3, v4

    .line 27
    .line 28
    const-string v6, "PixelYDimension"

    .line 29
    .line 30
    invoke-virtual {v4, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    check-cast v4, Le4/c;

    .line 35
    .line 36
    const-string v6, "ImageLength"

    .line 37
    .line 38
    const-string v7, "ImageWidth"

    .line 39
    .line 40
    if-eqz v5, :cond_0

    .line 41
    .line 42
    if-eqz v4, :cond_0

    .line 43
    .line 44
    aget-object v8, v3, v0

    .line 45
    .line 46
    invoke-virtual {v8, v7, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    aget-object v5, v3, v0

    .line 50
    .line 51
    invoke-virtual {v5, v6, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    :cond_0
    aget-object v4, v3, v2

    .line 55
    .line 56
    invoke-virtual {v4}, Ljava/util/HashMap;->isEmpty()Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-eqz v4, :cond_1

    .line 61
    .line 62
    aget-object v4, v3, v1

    .line 63
    .line 64
    invoke-virtual {p0, v4}, Le4/g;->n(Ljava/util/HashMap;)Z

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    if-eqz v4, :cond_1

    .line 69
    .line 70
    aget-object v4, v3, v1

    .line 71
    .line 72
    aput-object v4, v3, v2

    .line 73
    .line 74
    new-instance v4, Ljava/util/HashMap;

    .line 75
    .line 76
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 77
    .line 78
    .line 79
    aput-object v4, v3, v1

    .line 80
    .line 81
    :cond_1
    aget-object v3, v3, v2

    .line 82
    .line 83
    invoke-virtual {p0, v3}, Le4/g;->n(Ljava/util/HashMap;)Z

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    if-nez v3, :cond_2

    .line 88
    .line 89
    const-string v3, "ExifInterface"

    .line 90
    .line 91
    const-string v4, "No image meets the size requirements of a thumbnail image."

    .line 92
    .line 93
    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 94
    .line 95
    .line 96
    :cond_2
    const-string v3, "ThumbnailOrientation"

    .line 97
    .line 98
    const-string v4, "Orientation"

    .line 99
    .line 100
    invoke-virtual {p0, v0, v3, v4}, Le4/g;->t(ILjava/lang/String;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    const-string v5, "ThumbnailImageLength"

    .line 104
    .line 105
    invoke-virtual {p0, v0, v5, v6}, Le4/g;->t(ILjava/lang/String;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    const-string v8, "ThumbnailImageWidth"

    .line 109
    .line 110
    invoke-virtual {p0, v0, v8, v7}, Le4/g;->t(ILjava/lang/String;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0, v1, v3, v4}, Le4/g;->t(ILjava/lang/String;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0, v1, v5, v6}, Le4/g;->t(ILjava/lang/String;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0, v1, v8, v7}, Le4/g;->t(ILjava/lang/String;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0, v2, v4, v3}, Le4/g;->t(ILjava/lang/String;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0, v2, v6, v5}, Le4/g;->t(ILjava/lang/String;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0, v2, v7, v8}, Le4/g;->t(ILjava/lang/String;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    return-void
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
.end method
