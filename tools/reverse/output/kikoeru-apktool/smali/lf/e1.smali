.class public final Llf/e1;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Llf/g;


# instance fields
.field public final a:Llf/g;

.field public final b:Lb0/x;


# direct methods
.method public constructor <init>(Llf/g;Lb0/x;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Llf/e1;->a:Llf/g;

    .line 5
    .line 6
    iput-object p2, p0, Llf/e1;->b:Lb0/x;

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
.method public final a(Lac/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p1, Llf/d1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Llf/d1;

    .line 7
    .line 8
    iget v1, v0, Llf/d1;->h:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Llf/d1;->h:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Llf/d1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Llf/d1;-><init>(Llf/e1;Lac/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Llf/d1;->f:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Llf/d1;->h:I

    .line 28
    .line 29
    sget-object v2, Lub/a0;->a:Lub/a0;

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    sget-object v5, Lzb/a;->a:Lzb/a;

    .line 34
    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    if-eq v1, v4, :cond_2

    .line 38
    .line 39
    if-ne v1, v3, :cond_1

    .line 40
    .line 41
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    return-object v2

    .line 45
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_2
    iget-object v1, v0, Llf/d1;->e:Lmf/p;

    .line 54
    .line 55
    iget-object v4, v0, Llf/d1;->d:Llf/e1;

    .line 56
    .line 57
    :try_start_0
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :catchall_0
    move-exception p1

    .line 62
    goto :goto_3

    .line 63
    :cond_3
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    new-instance v1, Lmf/p;

    .line 67
    .line 68
    iget-object p1, v0, Lac/c;->b:Lyb/h;

    .line 69
    .line 70
    invoke-static {p1}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    iget-object v6, p0, Llf/e1;->a:Llf/g;

    .line 74
    .line 75
    invoke-direct {v1, v6, p1}, Lmf/p;-><init>(Llf/g;Lyb/h;)V

    .line 76
    .line 77
    .line 78
    :try_start_1
    iget-object p1, p0, Llf/e1;->b:Lb0/x;

    .line 79
    .line 80
    iput-object p0, v0, Llf/d1;->d:Llf/e1;

    .line 81
    .line 82
    iput-object v1, v0, Llf/d1;->e:Lmf/p;

    .line 83
    .line 84
    iput v4, v0, Llf/d1;->h:I

    .line 85
    .line 86
    invoke-virtual {p1, v1, v0}, Lb0/x;->q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 90
    if-ne p1, v5, :cond_4

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_4
    move-object v4, p0

    .line 94
    :goto_1
    invoke-virtual {v1}, Lac/c;->w()V

    .line 95
    .line 96
    .line 97
    iget-object p1, v4, Llf/e1;->a:Llf/g;

    .line 98
    .line 99
    instance-of v1, p1, Llf/e1;

    .line 100
    .line 101
    if-eqz v1, :cond_5

    .line 102
    .line 103
    check-cast p1, Llf/e1;

    .line 104
    .line 105
    const/4 v1, 0x0

    .line 106
    iput-object v1, v0, Llf/d1;->d:Llf/e1;

    .line 107
    .line 108
    iput-object v1, v0, Llf/d1;->e:Lmf/p;

    .line 109
    .line 110
    iput v3, v0, Llf/d1;->h:I

    .line 111
    .line 112
    invoke-virtual {p1, v0}, Llf/e1;->a(Lac/c;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    if-ne p1, v5, :cond_5

    .line 117
    .line 118
    :goto_2
    return-object v5

    .line 119
    :cond_5
    return-object v2

    .line 120
    :goto_3
    invoke-virtual {v1}, Lac/c;->w()V

    .line 121
    .line 122
    .line 123
    throw p1
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

.method public final n(Ljava/lang/Object;Lyb/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Llf/e1;->a:Llf/g;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Llf/g;->n(Ljava/lang/Object;Lyb/c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
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
.end method
