.class public Lk5/d;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final synthetic a:I

.field public b:Z

.field public c:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lk5/d;->a:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance v0, Landroid/util/SparseBooleanArray;

    invoke-direct {v0}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object v0, p0, Lk5/d;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lk5/d;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lb7/m;)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, Lk5/d;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk5/d;->c:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lk5/d;->b:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ZI)V
    .locals 0

    .line 2
    iput p3, p0, Lk5/d;->a:I

    iput-object p1, p0, Lk5/d;->c:Ljava/lang/Object;

    iput-boolean p2, p0, Lk5/d;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lk5/d;->a:I

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, Lk5/d;->b:Z

    iput-object p1, p0, Lk5/d;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lk5/d;->b:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    xor-int/2addr v0, v1

    .line 5
    invoke-static {v0}, Lp4/c;->i(Z)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lk5/d;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Landroid/util/SparseBooleanArray;

    .line 11
    .line 12
    invoke-virtual {v0, p1, v1}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 13
    .line 14
    .line 15
    return-void
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

.method public b(Lm4/o;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p1, Lm4/o;->a:Landroid/util/SparseBooleanArray;

    .line 3
    .line 4
    invoke-virtual {v1}, Landroid/util/SparseBooleanArray;->size()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-ge v0, v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lm4/o;->b(I)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-virtual {p0, v1}, Lk5/d;->a(I)V

    .line 15
    .line 16
    .line 17
    add-int/lit8 v0, v0, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    return-void
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

.method public varargs c([I)V
    .locals 3

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    if-ge v1, v0, :cond_0

    .line 4
    .line 5
    aget v2, p1, v1

    .line 6
    .line 7
    invoke-virtual {p0, v2}, Lk5/d;->a(I)V

    .line 8
    .line 9
    .line 10
    add-int/lit8 v1, v1, 0x1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    return-void
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

.method public d()Lm4/o;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lk5/d;->b:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    xor-int/2addr v0, v1

    .line 5
    invoke-static {v0}, Lp4/c;->i(Z)V

    .line 6
    .line 7
    .line 8
    iput-boolean v1, p0, Lk5/d;->b:Z

    .line 9
    .line 10
    new-instance v0, Lm4/o;

    .line 11
    .line 12
    iget-object v1, p0, Lk5/d;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Landroid/util/SparseBooleanArray;

    .line 15
    .line 16
    invoke-direct {v0, v1}, Lm4/o;-><init>(Landroid/util/SparseBooleanArray;)V

    .line 17
    .line 18
    .line 19
    return-object v0
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

.method public e()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lk5/d;->b:Z

    .line 3
    .line 4
    return-void
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

.method public f(B)V
    .locals 3

    .line 1
    iget-object v0, p0, Lk5/d;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lb7/m;

    .line 4
    .line 5
    int-to-long v1, p1

    .line 6
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {v0, p1}, Lb7/m;->w(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
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

.method public g(C)V
    .locals 4

    .line 1
    iget-object v0, p0, Lk5/d;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lb7/m;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    iget v2, v0, Lb7/m;->b:I

    .line 7
    .line 8
    invoke-virtual {v0, v2, v1}, Lb7/m;->n(II)V

    .line 9
    .line 10
    .line 11
    iget-object v1, v0, Lb7/m;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, [C

    .line 14
    .line 15
    iget v2, v0, Lb7/m;->b:I

    .line 16
    .line 17
    add-int/lit8 v3, v2, 0x1

    .line 18
    .line 19
    iput v3, v0, Lb7/m;->b:I

    .line 20
    .line 21
    aput-char p1, v1, v2

    .line 22
    .line 23
    return-void
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

.method public h(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lk5/d;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lb7/m;

    .line 4
    .line 5
    int-to-long v1, p1

    .line 6
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {v0, p1}, Lb7/m;->w(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
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

.method public i(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/d;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lb7/m;

    .line 4
    .line 5
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {v0, p1}, Lb7/m;->w(Ljava/lang/String;)V

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
.end method

.method public j(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "v"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lk5/d;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lb7/m;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lb7/m;->w(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
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

.method public k(S)V
    .locals 3

    .line 1
    iget-object v0, p0, Lk5/d;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lb7/m;

    .line 4
    .line 5
    int-to-long v1, p1

    .line 6
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {v0, p1}, Lb7/m;->w(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
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

.method public l(Ljava/lang/String;)V
    .locals 11

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lk5/d;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lb7/m;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x2

    .line 15
    add-int/2addr v1, v2

    .line 16
    iget v3, v0, Lb7/m;->b:I

    .line 17
    .line 18
    invoke-virtual {v0, v3, v1}, Lb7/m;->n(II)V

    .line 19
    .line 20
    .line 21
    iget-object v1, v0, Lb7/m;->c:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, [C

    .line 24
    .line 25
    iget v3, v0, Lb7/m;->b:I

    .line 26
    .line 27
    add-int/lit8 v4, v3, 0x1

    .line 28
    .line 29
    const/16 v5, 0x22

    .line 30
    .line 31
    aput-char v5, v1, v3

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    const/4 v6, 0x0

    .line 38
    invoke-virtual {p1, v6, v3, v1, v4}, Ljava/lang/String;->getChars(II[CI)V

    .line 39
    .line 40
    .line 41
    add-int/2addr v3, v4

    .line 42
    move v7, v4

    .line 43
    :goto_0
    if-ge v7, v3, :cond_5

    .line 44
    .line 45
    aget-char v8, v1, v7

    .line 46
    .line 47
    sget-object v9, Lyf/v;->b:[B

    .line 48
    .line 49
    array-length v10, v9

    .line 50
    if-ge v8, v10, :cond_4

    .line 51
    .line 52
    aget-byte v8, v9, v8

    .line 53
    .line 54
    if-eqz v8, :cond_4

    .line 55
    .line 56
    sub-int v1, v7, v4

    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    :goto_1
    const/4 v4, 0x1

    .line 63
    if-ge v1, v3, :cond_3

    .line 64
    .line 65
    invoke-virtual {v0, v7, v2}, Lb7/m;->n(II)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 69
    .line 70
    .line 71
    move-result v8

    .line 72
    sget-object v9, Lyf/v;->b:[B

    .line 73
    .line 74
    array-length v10, v9

    .line 75
    if-ge v8, v10, :cond_2

    .line 76
    .line 77
    aget-byte v9, v9, v8

    .line 78
    .line 79
    if-nez v9, :cond_0

    .line 80
    .line 81
    iget-object v4, v0, Lb7/m;->c:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v4, [C

    .line 84
    .line 85
    add-int/lit8 v9, v7, 0x1

    .line 86
    .line 87
    int-to-char v8, v8

    .line 88
    aput-char v8, v4, v7

    .line 89
    .line 90
    :goto_2
    move v7, v9

    .line 91
    goto :goto_3

    .line 92
    :cond_0
    if-ne v9, v4, :cond_1

    .line 93
    .line 94
    sget-object v4, Lyf/v;->a:[Ljava/lang/String;

    .line 95
    .line 96
    aget-object v4, v4, v8

    .line 97
    .line 98
    invoke-static {v4}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 102
    .line 103
    .line 104
    move-result v8

    .line 105
    invoke-virtual {v0, v7, v8}, Lb7/m;->n(II)V

    .line 106
    .line 107
    .line 108
    iget-object v8, v0, Lb7/m;->c:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v8, [C

    .line 111
    .line 112
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 113
    .line 114
    .line 115
    move-result v9

    .line 116
    invoke-virtual {v4, v6, v9, v8, v7}, Ljava/lang/String;->getChars(II[CI)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    add-int/2addr v4, v7

    .line 124
    iput v4, v0, Lb7/m;->b:I

    .line 125
    .line 126
    move v7, v4

    .line 127
    goto :goto_3

    .line 128
    :cond_1
    iget-object v4, v0, Lb7/m;->c:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v4, [C

    .line 131
    .line 132
    const/16 v8, 0x5c

    .line 133
    .line 134
    aput-char v8, v4, v7

    .line 135
    .line 136
    add-int/lit8 v8, v7, 0x1

    .line 137
    .line 138
    int-to-char v9, v9

    .line 139
    aput-char v9, v4, v8

    .line 140
    .line 141
    add-int/lit8 v7, v7, 0x2

    .line 142
    .line 143
    iput v7, v0, Lb7/m;->b:I

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_2
    iget-object v4, v0, Lb7/m;->c:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v4, [C

    .line 149
    .line 150
    add-int/lit8 v9, v7, 0x1

    .line 151
    .line 152
    int-to-char v8, v8

    .line 153
    aput-char v8, v4, v7

    .line 154
    .line 155
    goto :goto_2

    .line 156
    :goto_3
    add-int/lit8 v1, v1, 0x1

    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_3
    invoke-virtual {v0, v7, v4}, Lb7/m;->n(II)V

    .line 160
    .line 161
    .line 162
    iget-object p1, v0, Lb7/m;->c:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast p1, [C

    .line 165
    .line 166
    add-int/lit8 v1, v7, 0x1

    .line 167
    .line 168
    aput-char v5, p1, v7

    .line 169
    .line 170
    iput v1, v0, Lb7/m;->b:I

    .line 171
    .line 172
    return-void

    .line 173
    :cond_4
    add-int/lit8 v7, v7, 0x1

    .line 174
    .line 175
    goto/16 :goto_0

    .line 176
    .line 177
    :cond_5
    add-int/lit8 p1, v3, 0x1

    .line 178
    .line 179
    aput-char v5, v1, v3

    .line 180
    .line 181
    iput p1, v0, Lb7/m;->b:I

    .line 182
    .line 183
    return-void
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

.method public m()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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

.method public n()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Lk5/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    iget-boolean v0, p0, Lk5/d;->b:Z

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const-string v0, "FALL_THROUGH"

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v0, p0, Lk5/d;->c:Ljava/lang/Object;

    .line 19
    .line 20
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :goto_0
    return-object v0

    .line 25
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_0
    .end packed-switch
    .line 26
    .line 27
    .line 28
    .line 29
.end method
