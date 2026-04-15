.class public abstract Lr/f2;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final a:Lp1/c;

.field public static final b:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, Lp1/c;

    .line 2
    .line 3
    const/high16 v1, 0x3f000000    # 0.5f

    .line 4
    .line 5
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-direct {v0, v1, v1, v1, v1}, Lp1/c;-><init>(FFFF)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lr/f2;->a:Lp1/c;

    .line 13
    .line 14
    sget-object v0, Lr/w1;->b:Lr/v1;

    .line 15
    .line 16
    const/high16 v1, 0x3f800000    # 1.0f

    .line 17
    .line 18
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    new-instance v3, Lub/k;

    .line 23
    .line 24
    invoke-direct {v3, v0, v1}, Lub/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    sget-object v0, Lr/w1;->h:Lr/v1;

    .line 28
    .line 29
    new-instance v4, Lub/k;

    .line 30
    .line 31
    invoke-direct {v4, v0, v1}, Lub/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    sget-object v0, Lr/w1;->g:Lr/v1;

    .line 35
    .line 36
    new-instance v5, Lub/k;

    .line 37
    .line 38
    invoke-direct {v5, v0, v1}, Lub/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    sget-object v0, Lr/w1;->a:Lr/v1;

    .line 42
    .line 43
    const v1, 0x3c23d70a    # 0.01f

    .line 44
    .line 45
    .line 46
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    new-instance v6, Lub/k;

    .line 51
    .line 52
    invoke-direct {v6, v0, v1}, Lub/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    sget-object v0, Lr/w1;->i:Lr/v1;

    .line 56
    .line 57
    new-instance v1, Lub/k;

    .line 58
    .line 59
    invoke-direct {v1, v0, v2}, Lub/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    sget-object v0, Lr/w1;->e:Lr/v1;

    .line 63
    .line 64
    new-instance v7, Lub/k;

    .line 65
    .line 66
    invoke-direct {v7, v0, v2}, Lub/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    sget-object v0, Lr/w1;->f:Lr/v1;

    .line 70
    .line 71
    new-instance v8, Lub/k;

    .line 72
    .line 73
    invoke-direct {v8, v0, v2}, Lub/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    sget-object v0, Lr/w1;->c:Lr/v1;

    .line 77
    .line 78
    const v2, 0x3dcccccd    # 0.1f

    .line 79
    .line 80
    .line 81
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    new-instance v9, Lub/k;

    .line 86
    .line 87
    invoke-direct {v9, v0, v2}, Lub/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    sget-object v0, Lr/w1;->d:Lr/v1;

    .line 91
    .line 92
    new-instance v10, Lub/k;

    .line 93
    .line 94
    invoke-direct {v10, v0, v2}, Lub/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    const/16 v0, 0x9

    .line 98
    .line 99
    new-array v0, v0, [Lub/k;

    .line 100
    .line 101
    const/4 v2, 0x0

    .line 102
    aput-object v3, v0, v2

    .line 103
    .line 104
    const/4 v2, 0x1

    .line 105
    aput-object v4, v0, v2

    .line 106
    .line 107
    const/4 v2, 0x2

    .line 108
    aput-object v5, v0, v2

    .line 109
    .line 110
    const/4 v2, 0x3

    .line 111
    aput-object v6, v0, v2

    .line 112
    .line 113
    const/4 v2, 0x4

    .line 114
    aput-object v1, v0, v2

    .line 115
    .line 116
    const/4 v1, 0x5

    .line 117
    aput-object v7, v0, v1

    .line 118
    .line 119
    const/4 v1, 0x6

    .line 120
    aput-object v8, v0, v1

    .line 121
    .line 122
    const/4 v1, 0x7

    .line 123
    aput-object v9, v0, v1

    .line 124
    .line 125
    const/16 v1, 0x8

    .line 126
    .line 127
    aput-object v10, v0, v1

    .line 128
    .line 129
    invoke-static {v0}, Lvb/w;->v([Lub/k;)Ljava/util/Map;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    sput-object v0, Lr/f2;->b:Ljava/lang/Object;

    .line 134
    .line 135
    return-void
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
