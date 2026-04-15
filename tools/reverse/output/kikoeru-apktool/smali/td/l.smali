.class public abstract Ltd/l;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final a:Ltd/d;

.field public static final b:Ltd/d;

.field public static final c:Ltd/d;

.field public static final d:Ljava/util/LinkedHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 20

    .line 1
    new-instance v0, Ltd/d;

    .line 2
    .line 3
    sget-object v1, Ltd/g;->b:Ltd/g;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ltd/d;-><init>(Ltd/g;Z)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Ltd/l;->a:Ltd/d;

    .line 10
    .line 11
    new-instance v0, Ltd/d;

    .line 12
    .line 13
    sget-object v1, Ltd/g;->c:Ltd/g;

    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Ltd/d;-><init>(Ltd/g;Z)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Ltd/l;->b:Ltd/d;

    .line 19
    .line 20
    new-instance v0, Ltd/d;

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    invoke-direct {v0, v1, v2}, Ltd/d;-><init>(Ltd/g;Z)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Ltd/l;->c:Ltd/d;

    .line 27
    .line 28
    const-string v0, "java/lang/"

    .line 29
    .line 30
    const-string v1, "Object"

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    const-string v2, "java/util/function/"

    .line 37
    .line 38
    const-string v3, "Predicate"

    .line 39
    .line 40
    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    const-string v4, "Function"

    .line 45
    .line 46
    invoke-virtual {v2, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    const-string v5, "Consumer"

    .line 51
    .line 52
    invoke-virtual {v2, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    const-string v6, "BiFunction"

    .line 57
    .line 58
    invoke-virtual {v2, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    const-string v7, "BiConsumer"

    .line 63
    .line 64
    invoke-virtual {v2, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    const-string v8, "UnaryOperator"

    .line 69
    .line 70
    invoke-virtual {v2, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    const-string v9, "java/util/"

    .line 75
    .line 76
    const-string v10, "stream/Stream"

    .line 77
    .line 78
    invoke-virtual {v9, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v10

    .line 82
    const-string v11, "Optional"

    .line 83
    .line 84
    invoke-virtual {v9, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v11

    .line 88
    new-instance v12, Li4/d;

    .line 89
    .line 90
    const/4 v13, 0x4

    .line 91
    invoke-direct {v12, v13}, Li4/d;-><init>(I)V

    .line 92
    .line 93
    .line 94
    const-string v13, "Iterator"

    .line 95
    .line 96
    invoke-virtual {v9, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v13

    .line 100
    new-instance v14, Lm0/w;

    .line 101
    .line 102
    invoke-direct {v14, v12, v13}, Lm0/w;-><init>(Li4/d;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    new-instance v13, Ltd/i;

    .line 106
    .line 107
    const/4 v15, 0x0

    .line 108
    invoke-direct {v13, v15, v5}, Ltd/i;-><init>(ILjava/lang/String;)V

    .line 109
    .line 110
    .line 111
    const-string v15, "forEachRemaining"

    .line 112
    .line 113
    move-object/from16 v16, v2

    .line 114
    .line 115
    const/4 v2, 0x0

    .line 116
    invoke-virtual {v14, v15, v2, v13}, Lm0/w;->z(Ljava/lang/String;Ljava/lang/String;Lic/k;)V

    .line 117
    .line 118
    .line 119
    const-string v13, "Iterable"

    .line 120
    .line 121
    invoke-virtual {v0, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v13

    .line 125
    new-instance v14, Lm0/w;

    .line 126
    .line 127
    invoke-direct {v14, v12, v13}, Lm0/w;-><init>(Li4/d;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    new-instance v13, Ltd/n;

    .line 131
    .line 132
    const/4 v15, 0x4

    .line 133
    invoke-direct {v13, v15}, Ltd/n;-><init>(I)V

    .line 134
    .line 135
    .line 136
    const-string v15, "spliterator"

    .line 137
    .line 138
    invoke-virtual {v14, v15, v2, v13}, Lm0/w;->z(Ljava/lang/String;Ljava/lang/String;Lic/k;)V

    .line 139
    .line 140
    .line 141
    const-string v13, "Collection"

    .line 142
    .line 143
    invoke-virtual {v9, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v13

    .line 147
    new-instance v14, Lm0/w;

    .line 148
    .line 149
    invoke-direct {v14, v12, v13}, Lm0/w;-><init>(Li4/d;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    new-instance v13, Ltd/i;

    .line 153
    .line 154
    const/16 v15, 0x11

    .line 155
    .line 156
    invoke-direct {v13, v15, v3}, Ltd/i;-><init>(ILjava/lang/String;)V

    .line 157
    .line 158
    .line 159
    const-string v15, "removeIf"

    .line 160
    .line 161
    invoke-virtual {v14, v15, v2, v13}, Lm0/w;->z(Ljava/lang/String;Ljava/lang/String;Lic/k;)V

    .line 162
    .line 163
    .line 164
    new-instance v13, Ltd/i;

    .line 165
    .line 166
    const/16 v15, 0x1a

    .line 167
    .line 168
    invoke-direct {v13, v15, v10}, Ltd/i;-><init>(ILjava/lang/String;)V

    .line 169
    .line 170
    .line 171
    const-string v15, "stream"

    .line 172
    .line 173
    invoke-virtual {v14, v15, v2, v13}, Lm0/w;->z(Ljava/lang/String;Ljava/lang/String;Lic/k;)V

    .line 174
    .line 175
    .line 176
    new-instance v13, Ltd/k;

    .line 177
    .line 178
    const/4 v15, 0x1

    .line 179
    invoke-direct {v13, v15, v10}, Ltd/k;-><init>(ILjava/lang/String;)V

    .line 180
    .line 181
    .line 182
    const-string v10, "parallelStream"

    .line 183
    .line 184
    invoke-virtual {v14, v10, v2, v13}, Lm0/w;->z(Ljava/lang/String;Ljava/lang/String;Lic/k;)V

    .line 185
    .line 186
    .line 187
    const-string v10, "List"

    .line 188
    .line 189
    invoke-virtual {v9, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v10

    .line 193
    new-instance v13, Lm0/w;

    .line 194
    .line 195
    invoke-direct {v13, v12, v10}, Lm0/w;-><init>(Li4/d;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    new-instance v10, Ltd/k;

    .line 199
    .line 200
    const/4 v14, 0x2

    .line 201
    invoke-direct {v10, v14, v8}, Ltd/k;-><init>(ILjava/lang/String;)V

    .line 202
    .line 203
    .line 204
    const-string v8, "replaceAll"

    .line 205
    .line 206
    invoke-virtual {v13, v8, v2, v10}, Lm0/w;->z(Ljava/lang/String;Ljava/lang/String;Lic/k;)V

    .line 207
    .line 208
    .line 209
    new-instance v10, Ltd/k;

    .line 210
    .line 211
    const/4 v14, 0x3

    .line 212
    invoke-direct {v10, v14, v1}, Ltd/k;-><init>(ILjava/lang/String;)V

    .line 213
    .line 214
    .line 215
    const-string v14, "addFirst"

    .line 216
    .line 217
    const-string v15, "2.1"

    .line 218
    .line 219
    invoke-virtual {v13, v14, v15, v10}, Lm0/w;->z(Ljava/lang/String;Ljava/lang/String;Lic/k;)V

    .line 220
    .line 221
    .line 222
    new-instance v10, Ltd/k;

    .line 223
    .line 224
    const/4 v2, 0x4

    .line 225
    invoke-direct {v10, v2, v1}, Ltd/k;-><init>(ILjava/lang/String;)V

    .line 226
    .line 227
    .line 228
    const-string v2, "addLast"

    .line 229
    .line 230
    invoke-virtual {v13, v2, v15, v10}, Lm0/w;->z(Ljava/lang/String;Ljava/lang/String;Lic/k;)V

    .line 231
    .line 232
    .line 233
    new-instance v10, Ltd/k;

    .line 234
    .line 235
    move-object/from16 v17, v3

    .line 236
    .line 237
    const/4 v3, 0x5

    .line 238
    invoke-direct {v10, v3, v1}, Ltd/k;-><init>(ILjava/lang/String;)V

    .line 239
    .line 240
    .line 241
    const-string v3, "removeFirst"

    .line 242
    .line 243
    invoke-virtual {v13, v3, v15, v10}, Lm0/w;->z(Ljava/lang/String;Ljava/lang/String;Lic/k;)V

    .line 244
    .line 245
    .line 246
    new-instance v10, Ltd/k;

    .line 247
    .line 248
    move-object/from16 v18, v0

    .line 249
    .line 250
    const/4 v0, 0x6

    .line 251
    invoke-direct {v10, v0, v1}, Ltd/k;-><init>(ILjava/lang/String;)V

    .line 252
    .line 253
    .line 254
    const-string v0, "removeLast"

    .line 255
    .line 256
    invoke-virtual {v13, v0, v15, v10}, Lm0/w;->z(Ljava/lang/String;Ljava/lang/String;Lic/k;)V

    .line 257
    .line 258
    .line 259
    const-string v10, "LinkedList"

    .line 260
    .line 261
    invoke-virtual {v9, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v10

    .line 265
    new-instance v13, Lm0/w;

    .line 266
    .line 267
    invoke-direct {v13, v12, v10}, Lm0/w;-><init>(Li4/d;Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    new-instance v10, Ltd/i;

    .line 271
    .line 272
    move-object/from16 v19, v5

    .line 273
    .line 274
    const/4 v5, 0x1

    .line 275
    invoke-direct {v10, v5, v1}, Ltd/i;-><init>(ILjava/lang/String;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v13, v14, v15, v10}, Lm0/w;->z(Ljava/lang/String;Ljava/lang/String;Lic/k;)V

    .line 279
    .line 280
    .line 281
    new-instance v5, Ltd/i;

    .line 282
    .line 283
    const/4 v10, 0x2

    .line 284
    invoke-direct {v5, v10, v1}, Ltd/i;-><init>(ILjava/lang/String;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v13, v2, v15, v5}, Lm0/w;->z(Ljava/lang/String;Ljava/lang/String;Lic/k;)V

    .line 288
    .line 289
    .line 290
    new-instance v5, Ltd/i;

    .line 291
    .line 292
    const/4 v10, 0x3

    .line 293
    invoke-direct {v5, v10, v1}, Ltd/i;-><init>(ILjava/lang/String;)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v13, v3, v15, v5}, Lm0/w;->z(Ljava/lang/String;Ljava/lang/String;Lic/k;)V

    .line 297
    .line 298
    .line 299
    new-instance v5, Ltd/i;

    .line 300
    .line 301
    const/4 v10, 0x4

    .line 302
    invoke-direct {v5, v10, v1}, Ltd/i;-><init>(ILjava/lang/String;)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v13, v0, v15, v5}, Lm0/w;->z(Ljava/lang/String;Ljava/lang/String;Lic/k;)V

    .line 306
    .line 307
    .line 308
    const-string v5, "LinkedHashSet"

    .line 309
    .line 310
    invoke-virtual {v9, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v5

    .line 314
    new-instance v10, Lm0/w;

    .line 315
    .line 316
    invoke-direct {v10, v12, v5}, Lm0/w;-><init>(Li4/d;Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    new-instance v5, Ltd/i;

    .line 320
    .line 321
    const/4 v13, 0x5

    .line 322
    invoke-direct {v5, v13, v1}, Ltd/i;-><init>(ILjava/lang/String;)V

    .line 323
    .line 324
    .line 325
    const-string v13, "2.2"

    .line 326
    .line 327
    invoke-virtual {v10, v14, v13, v5}, Lm0/w;->z(Ljava/lang/String;Ljava/lang/String;Lic/k;)V

    .line 328
    .line 329
    .line 330
    new-instance v5, Ltd/i;

    .line 331
    .line 332
    const/4 v14, 0x6

    .line 333
    invoke-direct {v5, v14, v1}, Ltd/i;-><init>(ILjava/lang/String;)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v10, v2, v13, v5}, Lm0/w;->z(Ljava/lang/String;Ljava/lang/String;Lic/k;)V

    .line 337
    .line 338
    .line 339
    new-instance v2, Ltd/i;

    .line 340
    .line 341
    const/4 v5, 0x7

    .line 342
    invoke-direct {v2, v5, v1}, Ltd/i;-><init>(ILjava/lang/String;)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v10, v3, v13, v2}, Lm0/w;->z(Ljava/lang/String;Ljava/lang/String;Lic/k;)V

    .line 346
    .line 347
    .line 348
    new-instance v2, Ltd/i;

    .line 349
    .line 350
    const/16 v3, 0x8

    .line 351
    .line 352
    invoke-direct {v2, v3, v1}, Ltd/i;-><init>(ILjava/lang/String;)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v10, v0, v13, v2}, Lm0/w;->z(Ljava/lang/String;Ljava/lang/String;Lic/k;)V

    .line 356
    .line 357
    .line 358
    new-instance v0, Ltd/i;

    .line 359
    .line 360
    const/16 v2, 0x9

    .line 361
    .line 362
    invoke-direct {v0, v2, v1}, Ltd/i;-><init>(ILjava/lang/String;)V

    .line 363
    .line 364
    .line 365
    const-string v2, "getFirst"

    .line 366
    .line 367
    invoke-virtual {v10, v2, v13, v0}, Lm0/w;->z(Ljava/lang/String;Ljava/lang/String;Lic/k;)V

    .line 368
    .line 369
    .line 370
    new-instance v0, Ltd/i;

    .line 371
    .line 372
    const/16 v2, 0xa

    .line 373
    .line 374
    invoke-direct {v0, v2, v1}, Ltd/i;-><init>(ILjava/lang/String;)V

    .line 375
    .line 376
    .line 377
    const-string v2, "getLast"

    .line 378
    .line 379
    invoke-virtual {v10, v2, v13, v0}, Lm0/w;->z(Ljava/lang/String;Ljava/lang/String;Lic/k;)V

    .line 380
    .line 381
    .line 382
    const-string v0, "Map"

    .line 383
    .line 384
    invoke-virtual {v9, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    new-instance v2, Lm0/w;

    .line 389
    .line 390
    invoke-direct {v2, v12, v0}, Lm0/w;-><init>(Li4/d;Ljava/lang/String;)V

    .line 391
    .line 392
    .line 393
    new-instance v0, Ltd/i;

    .line 394
    .line 395
    const/16 v3, 0xb

    .line 396
    .line 397
    invoke-direct {v0, v3, v7}, Ltd/i;-><init>(ILjava/lang/String;)V

    .line 398
    .line 399
    .line 400
    const-string v3, "forEach"

    .line 401
    .line 402
    const/4 v5, 0x0

    .line 403
    invoke-virtual {v2, v3, v5, v0}, Lm0/w;->z(Ljava/lang/String;Ljava/lang/String;Lic/k;)V

    .line 404
    .line 405
    .line 406
    new-instance v0, Ltd/i;

    .line 407
    .line 408
    const/16 v3, 0xc

    .line 409
    .line 410
    invoke-direct {v0, v3, v1}, Ltd/i;-><init>(ILjava/lang/String;)V

    .line 411
    .line 412
    .line 413
    const-string v3, "putIfAbsent"

    .line 414
    .line 415
    invoke-virtual {v2, v3, v5, v0}, Lm0/w;->z(Ljava/lang/String;Ljava/lang/String;Lic/k;)V

    .line 416
    .line 417
    .line 418
    new-instance v0, Ltd/i;

    .line 419
    .line 420
    const/16 v3, 0xd

    .line 421
    .line 422
    invoke-direct {v0, v3, v1}, Ltd/i;-><init>(ILjava/lang/String;)V

    .line 423
    .line 424
    .line 425
    const-string v3, "replace"

    .line 426
    .line 427
    invoke-virtual {v2, v3, v5, v0}, Lm0/w;->z(Ljava/lang/String;Ljava/lang/String;Lic/k;)V

    .line 428
    .line 429
    .line 430
    new-instance v0, Ltd/i;

    .line 431
    .line 432
    const/16 v10, 0xe

    .line 433
    .line 434
    invoke-direct {v0, v10, v1}, Ltd/i;-><init>(ILjava/lang/String;)V

    .line 435
    .line 436
    .line 437
    invoke-virtual {v2, v3, v5, v0}, Lm0/w;->z(Ljava/lang/String;Ljava/lang/String;Lic/k;)V

    .line 438
    .line 439
    .line 440
    new-instance v0, Ltd/i;

    .line 441
    .line 442
    const/16 v3, 0xf

    .line 443
    .line 444
    invoke-direct {v0, v3, v6}, Ltd/i;-><init>(ILjava/lang/String;)V

    .line 445
    .line 446
    .line 447
    invoke-virtual {v2, v8, v5, v0}, Lm0/w;->z(Ljava/lang/String;Ljava/lang/String;Lic/k;)V

    .line 448
    .line 449
    .line 450
    new-instance v0, Ltd/j;

    .line 451
    .line 452
    const/4 v3, 0x0

    .line 453
    invoke-direct {v0, v3, v1, v6}, Ltd/j;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 454
    .line 455
    .line 456
    const-string v3, "compute"

    .line 457
    .line 458
    invoke-virtual {v2, v3, v5, v0}, Lm0/w;->z(Ljava/lang/String;Ljava/lang/String;Lic/k;)V

    .line 459
    .line 460
    .line 461
    new-instance v0, Ltd/j;

    .line 462
    .line 463
    const/4 v3, 0x1

    .line 464
    invoke-direct {v0, v3, v1, v4}, Ltd/j;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 465
    .line 466
    .line 467
    const-string v3, "computeIfAbsent"

    .line 468
    .line 469
    invoke-virtual {v2, v3, v5, v0}, Lm0/w;->z(Ljava/lang/String;Ljava/lang/String;Lic/k;)V

    .line 470
    .line 471
    .line 472
    new-instance v0, Ltd/j;

    .line 473
    .line 474
    const/4 v3, 0x2

    .line 475
    invoke-direct {v0, v3, v1, v6}, Ltd/j;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 476
    .line 477
    .line 478
    const-string v3, "computeIfPresent"

    .line 479
    .line 480
    invoke-virtual {v2, v3, v5, v0}, Lm0/w;->z(Ljava/lang/String;Ljava/lang/String;Lic/k;)V

    .line 481
    .line 482
    .line 483
    new-instance v0, Ltd/j;

    .line 484
    .line 485
    const/4 v3, 0x3

    .line 486
    invoke-direct {v0, v3, v1, v6}, Ltd/j;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 487
    .line 488
    .line 489
    const-string v3, "merge"

    .line 490
    .line 491
    invoke-virtual {v2, v3, v5, v0}, Lm0/w;->z(Ljava/lang/String;Ljava/lang/String;Lic/k;)V

    .line 492
    .line 493
    .line 494
    const-string v0, "LinkedHashMap"

    .line 495
    .line 496
    invoke-virtual {v9, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    new-instance v2, Lm0/w;

    .line 501
    .line 502
    invoke-direct {v2, v12, v0}, Lm0/w;-><init>(Li4/d;Ljava/lang/String;)V

    .line 503
    .line 504
    .line 505
    new-instance v0, Ltd/i;

    .line 506
    .line 507
    const/16 v3, 0x10

    .line 508
    .line 509
    invoke-direct {v0, v3, v1}, Ltd/i;-><init>(ILjava/lang/String;)V

    .line 510
    .line 511
    .line 512
    const-string v3, "putFirst"

    .line 513
    .line 514
    invoke-virtual {v2, v3, v13, v0}, Lm0/w;->z(Ljava/lang/String;Ljava/lang/String;Lic/k;)V

    .line 515
    .line 516
    .line 517
    new-instance v0, Ltd/i;

    .line 518
    .line 519
    const/16 v3, 0x12

    .line 520
    .line 521
    invoke-direct {v0, v3, v1}, Ltd/i;-><init>(ILjava/lang/String;)V

    .line 522
    .line 523
    .line 524
    const-string v3, "putLast"

    .line 525
    .line 526
    invoke-virtual {v2, v3, v13, v0}, Lm0/w;->z(Ljava/lang/String;Ljava/lang/String;Lic/k;)V

    .line 527
    .line 528
    .line 529
    new-instance v0, Lm0/w;

    .line 530
    .line 531
    invoke-direct {v0, v12, v11}, Lm0/w;-><init>(Li4/d;Ljava/lang/String;)V

    .line 532
    .line 533
    .line 534
    new-instance v2, Ltd/i;

    .line 535
    .line 536
    const/16 v3, 0x13

    .line 537
    .line 538
    invoke-direct {v2, v3, v11}, Ltd/i;-><init>(ILjava/lang/String;)V

    .line 539
    .line 540
    .line 541
    const-string v3, "empty"

    .line 542
    .line 543
    const/4 v5, 0x0

    .line 544
    invoke-virtual {v0, v3, v5, v2}, Lm0/w;->z(Ljava/lang/String;Ljava/lang/String;Lic/k;)V

    .line 545
    .line 546
    .line 547
    new-instance v2, Ltd/j;

    .line 548
    .line 549
    const/4 v3, 0x4

    .line 550
    invoke-direct {v2, v3, v1, v11}, Ltd/j;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 551
    .line 552
    .line 553
    const-string v3, "of"

    .line 554
    .line 555
    invoke-virtual {v0, v3, v5, v2}, Lm0/w;->z(Ljava/lang/String;Ljava/lang/String;Lic/k;)V

    .line 556
    .line 557
    .line 558
    new-instance v2, Ltd/j;

    .line 559
    .line 560
    const/4 v3, 0x5

    .line 561
    invoke-direct {v2, v3, v1, v11}, Ltd/j;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 562
    .line 563
    .line 564
    const-string v3, "ofNullable"

    .line 565
    .line 566
    invoke-virtual {v0, v3, v5, v2}, Lm0/w;->z(Ljava/lang/String;Ljava/lang/String;Lic/k;)V

    .line 567
    .line 568
    .line 569
    new-instance v2, Ltd/i;

    .line 570
    .line 571
    const/16 v3, 0x14

    .line 572
    .line 573
    invoke-direct {v2, v3, v1}, Ltd/i;-><init>(ILjava/lang/String;)V

    .line 574
    .line 575
    .line 576
    const-string v3, "get"

    .line 577
    .line 578
    invoke-virtual {v0, v3, v5, v2}, Lm0/w;->z(Ljava/lang/String;Ljava/lang/String;Lic/k;)V

    .line 579
    .line 580
    .line 581
    new-instance v2, Ltd/i;

    .line 582
    .line 583
    const/16 v8, 0x15

    .line 584
    .line 585
    move-object/from16 v9, v19

    .line 586
    .line 587
    invoke-direct {v2, v8, v9}, Ltd/i;-><init>(ILjava/lang/String;)V

    .line 588
    .line 589
    .line 590
    const-string v8, "ifPresent"

    .line 591
    .line 592
    invoke-virtual {v0, v8, v5, v2}, Lm0/w;->z(Ljava/lang/String;Ljava/lang/String;Lic/k;)V

    .line 593
    .line 594
    .line 595
    const-string v0, "ref/Reference"

    .line 596
    .line 597
    move-object/from16 v2, v18

    .line 598
    .line 599
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 600
    .line 601
    .line 602
    move-result-object v0

    .line 603
    new-instance v2, Lm0/w;

    .line 604
    .line 605
    invoke-direct {v2, v12, v0}, Lm0/w;-><init>(Li4/d;Ljava/lang/String;)V

    .line 606
    .line 607
    .line 608
    new-instance v0, Ltd/i;

    .line 609
    .line 610
    const/16 v8, 0x16

    .line 611
    .line 612
    invoke-direct {v0, v8, v1}, Ltd/i;-><init>(ILjava/lang/String;)V

    .line 613
    .line 614
    .line 615
    invoke-virtual {v2, v3, v5, v0}, Lm0/w;->z(Ljava/lang/String;Ljava/lang/String;Lic/k;)V

    .line 616
    .line 617
    .line 618
    new-instance v0, Lm0/w;

    .line 619
    .line 620
    move-object/from16 v2, v17

    .line 621
    .line 622
    invoke-direct {v0, v12, v2}, Lm0/w;-><init>(Li4/d;Ljava/lang/String;)V

    .line 623
    .line 624
    .line 625
    new-instance v2, Ltd/i;

    .line 626
    .line 627
    const/16 v8, 0x17

    .line 628
    .line 629
    invoke-direct {v2, v8, v1}, Ltd/i;-><init>(ILjava/lang/String;)V

    .line 630
    .line 631
    .line 632
    const-string v8, "test"

    .line 633
    .line 634
    invoke-virtual {v0, v8, v5, v2}, Lm0/w;->z(Ljava/lang/String;Ljava/lang/String;Lic/k;)V

    .line 635
    .line 636
    .line 637
    const-string v0, "BiPredicate"

    .line 638
    .line 639
    move-object/from16 v2, v16

    .line 640
    .line 641
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 642
    .line 643
    .line 644
    move-result-object v0

    .line 645
    new-instance v10, Lm0/w;

    .line 646
    .line 647
    invoke-direct {v10, v12, v0}, Lm0/w;-><init>(Li4/d;Ljava/lang/String;)V

    .line 648
    .line 649
    .line 650
    new-instance v0, Ltd/i;

    .line 651
    .line 652
    const/16 v11, 0x18

    .line 653
    .line 654
    invoke-direct {v0, v11, v1}, Ltd/i;-><init>(ILjava/lang/String;)V

    .line 655
    .line 656
    .line 657
    invoke-virtual {v10, v8, v5, v0}, Lm0/w;->z(Ljava/lang/String;Ljava/lang/String;Lic/k;)V

    .line 658
    .line 659
    .line 660
    new-instance v0, Lm0/w;

    .line 661
    .line 662
    invoke-direct {v0, v12, v9}, Lm0/w;-><init>(Li4/d;Ljava/lang/String;)V

    .line 663
    .line 664
    .line 665
    new-instance v8, Ltd/i;

    .line 666
    .line 667
    const/16 v9, 0x19

    .line 668
    .line 669
    invoke-direct {v8, v9, v1}, Ltd/i;-><init>(ILjava/lang/String;)V

    .line 670
    .line 671
    .line 672
    const-string v9, "accept"

    .line 673
    .line 674
    invoke-virtual {v0, v9, v5, v8}, Lm0/w;->z(Ljava/lang/String;Ljava/lang/String;Lic/k;)V

    .line 675
    .line 676
    .line 677
    new-instance v0, Lm0/w;

    .line 678
    .line 679
    invoke-direct {v0, v12, v7}, Lm0/w;-><init>(Li4/d;Ljava/lang/String;)V

    .line 680
    .line 681
    .line 682
    new-instance v7, Ltd/i;

    .line 683
    .line 684
    const/16 v8, 0x1b

    .line 685
    .line 686
    invoke-direct {v7, v8, v1}, Ltd/i;-><init>(ILjava/lang/String;)V

    .line 687
    .line 688
    .line 689
    invoke-virtual {v0, v9, v5, v7}, Lm0/w;->z(Ljava/lang/String;Ljava/lang/String;Lic/k;)V

    .line 690
    .line 691
    .line 692
    new-instance v0, Lm0/w;

    .line 693
    .line 694
    invoke-direct {v0, v12, v4}, Lm0/w;-><init>(Li4/d;Ljava/lang/String;)V

    .line 695
    .line 696
    .line 697
    new-instance v4, Ltd/i;

    .line 698
    .line 699
    const/16 v7, 0x1c

    .line 700
    .line 701
    invoke-direct {v4, v7, v1}, Ltd/i;-><init>(ILjava/lang/String;)V

    .line 702
    .line 703
    .line 704
    const-string v7, "apply"

    .line 705
    .line 706
    invoke-virtual {v0, v7, v5, v4}, Lm0/w;->z(Ljava/lang/String;Ljava/lang/String;Lic/k;)V

    .line 707
    .line 708
    .line 709
    new-instance v0, Lm0/w;

    .line 710
    .line 711
    invoke-direct {v0, v12, v6}, Lm0/w;-><init>(Li4/d;Ljava/lang/String;)V

    .line 712
    .line 713
    .line 714
    new-instance v4, Ltd/i;

    .line 715
    .line 716
    const/16 v6, 0x1d

    .line 717
    .line 718
    invoke-direct {v4, v6, v1}, Ltd/i;-><init>(ILjava/lang/String;)V

    .line 719
    .line 720
    .line 721
    invoke-virtual {v0, v7, v5, v4}, Lm0/w;->z(Ljava/lang/String;Ljava/lang/String;Lic/k;)V

    .line 722
    .line 723
    .line 724
    const-string v0, "Supplier"

    .line 725
    .line 726
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 727
    .line 728
    .line 729
    move-result-object v0

    .line 730
    new-instance v2, Lm0/w;

    .line 731
    .line 732
    invoke-direct {v2, v12, v0}, Lm0/w;-><init>(Li4/d;Ljava/lang/String;)V

    .line 733
    .line 734
    .line 735
    new-instance v0, Ltd/k;

    .line 736
    .line 737
    const/4 v4, 0x0

    .line 738
    invoke-direct {v0, v4, v1}, Ltd/k;-><init>(ILjava/lang/String;)V

    .line 739
    .line 740
    .line 741
    invoke-virtual {v2, v3, v5, v0}, Lm0/w;->z(Ljava/lang/String;Ljava/lang/String;Lic/k;)V

    .line 742
    .line 743
    .line 744
    iget-object v0, v12, Li4/d;->a:Ljava/util/LinkedHashMap;

    .line 745
    .line 746
    sput-object v0, Ltd/l;->d:Ljava/util/LinkedHashMap;

    .line 747
    .line 748
    return-void
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
