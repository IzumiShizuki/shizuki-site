.class public final enum Lue/h;
.super Ljava/lang/Enum;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final enum b:Lue/h;

.field public static final enum c:Lue/h;

.field public static final enum d:Lue/h;

.field public static final enum e:Lue/h;

.field public static final enum f:Lue/h;

.field public static final synthetic g:[Lue/h;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 22

    .line 1
    new-instance v0, Lue/h;

    .line 2
    .line 3
    const-string v1, "No member resolution should be done on captured type, it used only during constraint system resolution"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "CAPTURED_TYPE_SCOPE"

    .line 7
    .line 8
    invoke-direct {v0, v2, v3, v1}, Lue/h;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lue/h;->b:Lue/h;

    .line 12
    .line 13
    new-instance v1, Lue/h;

    .line 14
    .line 15
    const-string v3, "Scope for integer literal type (%s)"

    .line 16
    .line 17
    const/4 v4, 0x1

    .line 18
    const-string v5, "INTEGER_LITERAL_TYPE_SCOPE"

    .line 19
    .line 20
    invoke-direct {v1, v4, v5, v3}, Lue/h;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Lue/h;->c:Lue/h;

    .line 24
    .line 25
    new-instance v3, Lue/h;

    .line 26
    .line 27
    const-string v5, "Error scope for erased receiver type"

    .line 28
    .line 29
    const/4 v6, 0x2

    .line 30
    const-string v7, "ERASED_RECEIVER_TYPE_SCOPE"

    .line 31
    .line 32
    invoke-direct {v3, v6, v7, v5}, Lue/h;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    new-instance v5, Lue/h;

    .line 36
    .line 37
    const-string v7, "Scope for abbreviation %s"

    .line 38
    .line 39
    const/4 v8, 0x3

    .line 40
    const-string v9, "SCOPE_FOR_ABBREVIATION_TYPE"

    .line 41
    .line 42
    invoke-direct {v5, v8, v9, v7}, Lue/h;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    sput-object v5, Lue/h;->d:Lue/h;

    .line 46
    .line 47
    new-instance v7, Lue/h;

    .line 48
    .line 49
    const-string v9, "Scope for stub type %s"

    .line 50
    .line 51
    const/4 v10, 0x4

    .line 52
    const-string v11, "STUB_TYPE_SCOPE"

    .line 53
    .line 54
    invoke-direct {v7, v10, v11, v9}, Lue/h;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    new-instance v9, Lue/h;

    .line 58
    .line 59
    const-string v11, "A scope for common supertype which is not a normal classifier"

    .line 60
    .line 61
    const/4 v12, 0x5

    .line 62
    const-string v13, "NON_CLASSIFIER_SUPER_TYPE_SCOPE"

    .line 63
    .line 64
    invoke-direct {v9, v12, v13, v11}, Lue/h;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    new-instance v11, Lue/h;

    .line 68
    .line 69
    const-string v13, "Scope for error type %s"

    .line 70
    .line 71
    const/4 v14, 0x6

    .line 72
    const-string v15, "ERROR_TYPE_SCOPE"

    .line 73
    .line 74
    invoke-direct {v11, v14, v15, v13}, Lue/h;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    sput-object v11, Lue/h;->e:Lue/h;

    .line 78
    .line 79
    new-instance v13, Lue/h;

    .line 80
    .line 81
    const-string v15, "Scope for unsupported type %s"

    .line 82
    .line 83
    const/16 v16, 0x0

    .line 84
    .line 85
    const/4 v2, 0x7

    .line 86
    const/16 v17, 0x1

    .line 87
    .line 88
    const-string v4, "UNSUPPORTED_TYPE_SCOPE"

    .line 89
    .line 90
    invoke-direct {v13, v2, v4, v15}, Lue/h;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    new-instance v4, Lue/h;

    .line 94
    .line 95
    const-string v15, "Error scope for class %s with arguments: %s"

    .line 96
    .line 97
    const/16 v18, 0x7

    .line 98
    .line 99
    const/16 v2, 0x8

    .line 100
    .line 101
    const/16 v19, 0x2

    .line 102
    .line 103
    const-string v6, "SCOPE_FOR_ERROR_CLASS"

    .line 104
    .line 105
    invoke-direct {v4, v2, v6, v15}, Lue/h;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    sput-object v4, Lue/h;->f:Lue/h;

    .line 109
    .line 110
    new-instance v6, Lue/h;

    .line 111
    .line 112
    const-string v15, "Error resolution candidate for call %s"

    .line 113
    .line 114
    const/16 v20, 0x8

    .line 115
    .line 116
    const/16 v2, 0x9

    .line 117
    .line 118
    const/16 v21, 0x3

    .line 119
    .line 120
    const-string v8, "SCOPE_FOR_ERROR_RESOLUTION_CANDIDATE"

    .line 121
    .line 122
    invoke-direct {v6, v2, v8, v15}, Lue/h;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    const/16 v8, 0xa

    .line 126
    .line 127
    new-array v8, v8, [Lue/h;

    .line 128
    .line 129
    aput-object v0, v8, v16

    .line 130
    .line 131
    aput-object v1, v8, v17

    .line 132
    .line 133
    aput-object v3, v8, v19

    .line 134
    .line 135
    aput-object v5, v8, v21

    .line 136
    .line 137
    aput-object v7, v8, v10

    .line 138
    .line 139
    aput-object v9, v8, v12

    .line 140
    .line 141
    aput-object v11, v8, v14

    .line 142
    .line 143
    aput-object v13, v8, v18

    .line 144
    .line 145
    aput-object v4, v8, v20

    .line 146
    .line 147
    aput-object v6, v8, v2

    .line 148
    .line 149
    sput-object v8, Lue/h;->g:[Lue/h;

    .line 150
    .line 151
    return-void
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

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lue/h;->a:Ljava/lang/String;

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

.method public static valueOf(Ljava/lang/String;)Lue/h;
    .locals 1

    .line 1
    const-class v0, Lue/h;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lue/h;

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

.method public static values()[Lue/h;
    .locals 1

    .line 1
    sget-object v0, Lue/h;->g:[Lue/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lue/h;

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
