.class public final Led/e0;
.super Led/b0;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lsd/d;


# instance fields
.field public final a:Ljava/lang/reflect/WildcardType;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/WildcardType;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Led/e0;->a:Ljava/lang/reflect/WildcardType;

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
.end method


# virtual methods
.method public final b()Ljava/lang/reflect/Type;
    .locals 1

    .line 1
    iget-object v0, p0, Led/e0;->a:Ljava/lang/reflect/WildcardType;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public final c()Led/b0;
    .locals 5

    .line 1
    iget-object v0, p0, Led/e0;->a:Ljava/lang/reflect/WildcardType;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    array-length v3, v1

    .line 12
    const/4 v4, 0x1

    .line 13
    if-gt v3, v4, :cond_a

    .line 14
    .line 15
    array-length v3, v2

    .line 16
    if-gt v3, v4, :cond_a

    .line 17
    .line 18
    array-length v0, v2

    .line 19
    if-ne v0, v4, :cond_4

    .line 20
    .line 21
    invoke-static {v2}, Lvb/l;->I0([Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string v1, "single(...)"

    .line 26
    .line 27
    invoke-static {v0, v1}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    check-cast v0, Ljava/lang/reflect/Type;

    .line 31
    .line 32
    instance-of v1, v0, Ljava/lang/Class;

    .line 33
    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    move-object v2, v0

    .line 37
    check-cast v2, Ljava/lang/Class;

    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/lang/Class;->isPrimitive()Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_0

    .line 44
    .line 45
    new-instance v0, Led/z;

    .line 46
    .line 47
    invoke-direct {v0, v2}, Led/z;-><init>(Ljava/lang/Class;)V

    .line 48
    .line 49
    .line 50
    return-object v0

    .line 51
    :cond_0
    instance-of v2, v0, Ljava/lang/reflect/GenericArrayType;

    .line 52
    .line 53
    if-nez v2, :cond_3

    .line 54
    .line 55
    if-eqz v1, :cond_1

    .line 56
    .line 57
    move-object v1, v0

    .line 58
    check-cast v1, Ljava/lang/Class;

    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    instance-of v1, v0, Ljava/lang/reflect/WildcardType;

    .line 68
    .line 69
    if-eqz v1, :cond_2

    .line 70
    .line 71
    new-instance v1, Led/e0;

    .line 72
    .line 73
    check-cast v0, Ljava/lang/reflect/WildcardType;

    .line 74
    .line 75
    invoke-direct {v1, v0}, Led/e0;-><init>(Ljava/lang/reflect/WildcardType;)V

    .line 76
    .line 77
    .line 78
    return-object v1

    .line 79
    :cond_2
    new-instance v1, Led/q;

    .line 80
    .line 81
    invoke-direct {v1, v0}, Led/q;-><init>(Ljava/lang/reflect/Type;)V

    .line 82
    .line 83
    .line 84
    return-object v1

    .line 85
    :cond_3
    :goto_0
    new-instance v1, Led/i;

    .line 86
    .line 87
    invoke-direct {v1, v0}, Led/i;-><init>(Ljava/lang/reflect/Type;)V

    .line 88
    .line 89
    .line 90
    return-object v1

    .line 91
    :cond_4
    array-length v0, v1

    .line 92
    if-ne v0, v4, :cond_9

    .line 93
    .line 94
    invoke-static {v1}, Lvb/l;->I0([Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    check-cast v0, Ljava/lang/reflect/Type;

    .line 99
    .line 100
    const-class v1, Ljava/lang/Object;

    .line 101
    .line 102
    invoke-static {v0, v1}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-nez v1, :cond_9

    .line 107
    .line 108
    invoke-static {v0}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    instance-of v1, v0, Ljava/lang/Class;

    .line 112
    .line 113
    if-eqz v1, :cond_5

    .line 114
    .line 115
    move-object v2, v0

    .line 116
    check-cast v2, Ljava/lang/Class;

    .line 117
    .line 118
    invoke-virtual {v2}, Ljava/lang/Class;->isPrimitive()Z

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    if-eqz v3, :cond_5

    .line 123
    .line 124
    new-instance v0, Led/z;

    .line 125
    .line 126
    invoke-direct {v0, v2}, Led/z;-><init>(Ljava/lang/Class;)V

    .line 127
    .line 128
    .line 129
    return-object v0

    .line 130
    :cond_5
    instance-of v2, v0, Ljava/lang/reflect/GenericArrayType;

    .line 131
    .line 132
    if-nez v2, :cond_8

    .line 133
    .line 134
    if-eqz v1, :cond_6

    .line 135
    .line 136
    move-object v1, v0

    .line 137
    check-cast v1, Ljava/lang/Class;

    .line 138
    .line 139
    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    if-eqz v1, :cond_6

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_6
    instance-of v1, v0, Ljava/lang/reflect/WildcardType;

    .line 147
    .line 148
    if-eqz v1, :cond_7

    .line 149
    .line 150
    new-instance v1, Led/e0;

    .line 151
    .line 152
    check-cast v0, Ljava/lang/reflect/WildcardType;

    .line 153
    .line 154
    invoke-direct {v1, v0}, Led/e0;-><init>(Ljava/lang/reflect/WildcardType;)V

    .line 155
    .line 156
    .line 157
    return-object v1

    .line 158
    :cond_7
    new-instance v1, Led/q;

    .line 159
    .line 160
    invoke-direct {v1, v0}, Led/q;-><init>(Ljava/lang/reflect/Type;)V

    .line 161
    .line 162
    .line 163
    return-object v1

    .line 164
    :cond_8
    :goto_1
    new-instance v1, Led/i;

    .line 165
    .line 166
    invoke-direct {v1, v0}, Led/i;-><init>(Ljava/lang/reflect/Type;)V

    .line 167
    .line 168
    .line 169
    return-object v1

    .line 170
    :cond_9
    const/4 v0, 0x0

    .line 171
    return-object v0

    .line 172
    :cond_a
    new-instance v1, Ljava/lang/UnsupportedOperationException;

    .line 173
    .line 174
    new-instance v2, Ljava/lang/StringBuilder;

    .line 175
    .line 176
    const-string v3, "Wildcard types with many bounds are not yet supported: "

    .line 177
    .line 178
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-direct {v1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    throw v1
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

.method public final getAnnotations()Ljava/util/Collection;
    .locals 1

    .line 1
    sget-object v0, Lvb/r;->a:Lvb/r;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
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
.end method
