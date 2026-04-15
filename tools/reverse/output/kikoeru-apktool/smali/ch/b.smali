.class public final enum Lch/b;
.super Ljava/lang/Enum;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final b:Lch/b0;

.field public static final enum c:Lch/b;

.field public static final enum d:Lch/b;

.field public static final enum e:Lch/b;

.field public static final enum f:Lch/b;

.field public static final enum g:Lch/b;

.field public static final enum h:Lch/b;

.field public static final synthetic i:[Lch/b;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 29

    .line 1
    new-instance v0, Lch/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "NO_ERROR"

    .line 5
    .line 6
    invoke-direct {v0, v1, v1, v2}, Lch/b;-><init>(IILjava/lang/String;)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lch/b;->c:Lch/b;

    .line 10
    .line 11
    new-instance v2, Lch/b;

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    const-string v4, "PROTOCOL_ERROR"

    .line 15
    .line 16
    invoke-direct {v2, v3, v3, v4}, Lch/b;-><init>(IILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    sput-object v2, Lch/b;->d:Lch/b;

    .line 20
    .line 21
    new-instance v4, Lch/b;

    .line 22
    .line 23
    const/4 v5, 0x2

    .line 24
    const-string v6, "INTERNAL_ERROR"

    .line 25
    .line 26
    invoke-direct {v4, v5, v5, v6}, Lch/b;-><init>(IILjava/lang/String;)V

    .line 27
    .line 28
    .line 29
    sput-object v4, Lch/b;->e:Lch/b;

    .line 30
    .line 31
    new-instance v6, Lch/b;

    .line 32
    .line 33
    const/4 v7, 0x3

    .line 34
    const-string v8, "FLOW_CONTROL_ERROR"

    .line 35
    .line 36
    invoke-direct {v6, v7, v7, v8}, Lch/b;-><init>(IILjava/lang/String;)V

    .line 37
    .line 38
    .line 39
    sput-object v6, Lch/b;->f:Lch/b;

    .line 40
    .line 41
    new-instance v8, Lch/b;

    .line 42
    .line 43
    const/4 v9, 0x4

    .line 44
    const-string v10, "SETTINGS_TIMEOUT"

    .line 45
    .line 46
    invoke-direct {v8, v9, v9, v10}, Lch/b;-><init>(IILjava/lang/String;)V

    .line 47
    .line 48
    .line 49
    new-instance v10, Lch/b;

    .line 50
    .line 51
    const/4 v11, 0x5

    .line 52
    const-string v12, "STREAM_CLOSED"

    .line 53
    .line 54
    invoke-direct {v10, v11, v11, v12}, Lch/b;-><init>(IILjava/lang/String;)V

    .line 55
    .line 56
    .line 57
    new-instance v12, Lch/b;

    .line 58
    .line 59
    const/4 v13, 0x6

    .line 60
    const-string v14, "FRAME_SIZE_ERROR"

    .line 61
    .line 62
    invoke-direct {v12, v13, v13, v14}, Lch/b;-><init>(IILjava/lang/String;)V

    .line 63
    .line 64
    .line 65
    new-instance v14, Lch/b;

    .line 66
    .line 67
    const/4 v15, 0x7

    .line 68
    const/16 v16, 0x0

    .line 69
    .line 70
    const-string v1, "REFUSED_STREAM"

    .line 71
    .line 72
    invoke-direct {v14, v15, v15, v1}, Lch/b;-><init>(IILjava/lang/String;)V

    .line 73
    .line 74
    .line 75
    sput-object v14, Lch/b;->g:Lch/b;

    .line 76
    .line 77
    new-instance v1, Lch/b;

    .line 78
    .line 79
    const/16 v17, 0x1

    .line 80
    .line 81
    const/16 v3, 0x8

    .line 82
    .line 83
    const/16 v18, 0x2

    .line 84
    .line 85
    const-string v5, "CANCEL"

    .line 86
    .line 87
    invoke-direct {v1, v3, v3, v5}, Lch/b;-><init>(IILjava/lang/String;)V

    .line 88
    .line 89
    .line 90
    sput-object v1, Lch/b;->h:Lch/b;

    .line 91
    .line 92
    new-instance v5, Lch/b;

    .line 93
    .line 94
    const/16 v19, 0x8

    .line 95
    .line 96
    const/16 v3, 0x9

    .line 97
    .line 98
    const/16 v20, 0x3

    .line 99
    .line 100
    const-string v7, "COMPRESSION_ERROR"

    .line 101
    .line 102
    invoke-direct {v5, v3, v3, v7}, Lch/b;-><init>(IILjava/lang/String;)V

    .line 103
    .line 104
    .line 105
    new-instance v7, Lch/b;

    .line 106
    .line 107
    const/16 v21, 0x9

    .line 108
    .line 109
    const/16 v3, 0xa

    .line 110
    .line 111
    const/16 v22, 0x4

    .line 112
    .line 113
    const-string v9, "CONNECT_ERROR"

    .line 114
    .line 115
    invoke-direct {v7, v3, v3, v9}, Lch/b;-><init>(IILjava/lang/String;)V

    .line 116
    .line 117
    .line 118
    new-instance v9, Lch/b;

    .line 119
    .line 120
    const/16 v23, 0xa

    .line 121
    .line 122
    const/16 v3, 0xb

    .line 123
    .line 124
    const/16 v24, 0x5

    .line 125
    .line 126
    const-string v11, "ENHANCE_YOUR_CALM"

    .line 127
    .line 128
    invoke-direct {v9, v3, v3, v11}, Lch/b;-><init>(IILjava/lang/String;)V

    .line 129
    .line 130
    .line 131
    new-instance v11, Lch/b;

    .line 132
    .line 133
    const/16 v25, 0xb

    .line 134
    .line 135
    const/16 v3, 0xc

    .line 136
    .line 137
    const/16 v26, 0x6

    .line 138
    .line 139
    const-string v13, "INADEQUATE_SECURITY"

    .line 140
    .line 141
    invoke-direct {v11, v3, v3, v13}, Lch/b;-><init>(IILjava/lang/String;)V

    .line 142
    .line 143
    .line 144
    new-instance v13, Lch/b;

    .line 145
    .line 146
    const/16 v27, 0xc

    .line 147
    .line 148
    const/16 v3, 0xd

    .line 149
    .line 150
    const/16 v28, 0x7

    .line 151
    .line 152
    const-string v15, "HTTP_1_1_REQUIRED"

    .line 153
    .line 154
    invoke-direct {v13, v3, v3, v15}, Lch/b;-><init>(IILjava/lang/String;)V

    .line 155
    .line 156
    .line 157
    const/16 v15, 0xe

    .line 158
    .line 159
    new-array v15, v15, [Lch/b;

    .line 160
    .line 161
    aput-object v0, v15, v16

    .line 162
    .line 163
    aput-object v2, v15, v17

    .line 164
    .line 165
    aput-object v4, v15, v18

    .line 166
    .line 167
    aput-object v6, v15, v20

    .line 168
    .line 169
    aput-object v8, v15, v22

    .line 170
    .line 171
    aput-object v10, v15, v24

    .line 172
    .line 173
    aput-object v12, v15, v26

    .line 174
    .line 175
    aput-object v14, v15, v28

    .line 176
    .line 177
    aput-object v1, v15, v19

    .line 178
    .line 179
    aput-object v5, v15, v21

    .line 180
    .line 181
    aput-object v7, v15, v23

    .line 182
    .line 183
    aput-object v9, v15, v25

    .line 184
    .line 185
    aput-object v11, v15, v27

    .line 186
    .line 187
    aput-object v13, v15, v3

    .line 188
    .line 189
    sput-object v15, Lch/b;->i:[Lch/b;

    .line 190
    .line 191
    new-instance v0, Lch/b0;

    .line 192
    .line 193
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 194
    .line 195
    .line 196
    sput-object v0, Lch/b;->b:Lch/b0;

    .line 197
    .line 198
    return-void
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

.method public constructor <init>(IILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p3, p1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p2, p0, Lch/b;->a:I

    .line 5
    .line 6
    return-void
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

.method public static valueOf(Ljava/lang/String;)Lch/b;
    .locals 1

    .line 1
    const-class v0, Lch/b;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lch/b;

    .line 8
    .line 9
    return-object p0
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
.end method

.method public static values()[Lch/b;
    .locals 1

    .line 1
    sget-object v0, Lch/b;->i:[Lch/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lch/b;

    .line 8
    .line 9
    return-object v0
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
