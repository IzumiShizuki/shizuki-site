.class public final Lj7/b;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final a:Llf/f;

.field public final b:Lj7/a;

.field public final c:Lx0/e1;

.field public final d:Lx0/e1;


# direct methods
.method public constructor <init>(Llf/f;)V
    .locals 6

    .line 1
    const-string v0, "flow"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lj7/b;->a:Llf/f;

    .line 10
    .line 11
    sget-object v0, Lj2/t0;->m:Lub/p;

    .line 12
    .line 13
    invoke-virtual {v0}, Lub/p;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lyb/h;

    .line 18
    .line 19
    instance-of v1, p1, Llf/l0;

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    check-cast p1, Llf/l0;

    .line 24
    .line 25
    invoke-interface {p1}, Llf/l0;->a()Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {p1}, Lvb/m;->a0(Ljava/util/List;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, Li7/l1;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 p1, 0x0

    .line 37
    :goto_0
    new-instance v1, Lj7/a;

    .line 38
    .line 39
    invoke-direct {v1, p0, v0, p1}, Lj7/a;-><init>(Lj7/b;Lyb/h;Li7/l1;)V

    .line 40
    .line 41
    .line 42
    iput-object v1, p0, Lj7/b;->b:Lj7/a;

    .line 43
    .line 44
    invoke-virtual {v1}, Lj7/a;->b()Li7/x;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-static {p1}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iput-object p1, p0, Lj7/b;->c:Lx0/e1;

    .line 53
    .line 54
    iget-object p1, v1, Lj7/a;->k:Llf/k0;

    .line 55
    .line 56
    iget-object p1, p1, Llf/k0;->a:Llf/b1;

    .line 57
    .line 58
    invoke-virtual {p1}, Llf/b1;->getValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    check-cast p1, Li7/l;

    .line 63
    .line 64
    if-nez p1, :cond_1

    .line 65
    .line 66
    new-instance v0, Li7/l;

    .line 67
    .line 68
    sget-object v4, Lj7/d;->a:Li7/c0;

    .line 69
    .line 70
    iget-object v1, v4, Li7/c0;->a:Li7/b0;

    .line 71
    .line 72
    iget-object v2, v4, Li7/c0;->b:Li7/b0;

    .line 73
    .line 74
    iget-object v3, v4, Li7/c0;->c:Li7/b0;

    .line 75
    .line 76
    const/4 v5, 0x0

    .line 77
    invoke-direct/range {v0 .. v5}, Li7/l;-><init>(Li7/b0;Li7/b0;Li7/b0;Li7/c0;Li7/c0;)V

    .line 78
    .line 79
    .line 80
    move-object p1, v0

    .line 81
    :cond_1
    invoke-static {p1}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    iput-object p1, p0, Lj7/b;->d:Lx0/e1;

    .line 86
    .line 87
    return-void
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
.method public final a(Lac/i;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lj7/b;->b:Lj7/a;

    .line 2
    .line 3
    iget-object v0, v0, Lj7/a;->k:Llf/k0;

    .line 4
    .line 5
    new-instance v1, Li7/e;

    .line 6
    .line 7
    const/4 v2, 0x6

    .line 8
    invoke-direct {v1, v2, p0}, Li7/e;-><init>(ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    new-instance v2, Li7/g;

    .line 12
    .line 13
    const/4 v3, 0x4

    .line 14
    invoke-direct {v2, v1, v3}, Li7/g;-><init>(Llf/g;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v2, p1}, Llf/k0;->b(Llf/g;Lyb/c;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    sget-object p1, Lzb/a;->a:Lzb/a;

    .line 21
    .line 22
    return-object p1
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

.method public final b(I)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lj7/b;->b:Lj7/a;

    .line 2
    .line 3
    iget-object v1, v0, Lj7/a;->j:Llf/b1;

    .line 4
    .line 5
    :cond_0
    invoke-virtual {v1}, Llf/b1;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    move-object v3, v2

    .line 10
    check-cast v3, Ljava/lang/Boolean;

    .line 11
    .line 12
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 16
    .line 17
    invoke-virtual {v1, v2, v3}, Llf/b1;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    iput-boolean v1, v0, Lj7/a;->h:Z

    .line 25
    .line 26
    iput p1, v0, Lj7/a;->i:I

    .line 27
    .line 28
    sget-object v1, Landroid/os/Build;->ID:Ljava/lang/String;

    .line 29
    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    const-string v1, "Paging"

    .line 33
    .line 34
    const/4 v2, 0x2

    .line 35
    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    new-instance v2, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    const-string v3, "Accessing item index["

    .line 44
    .line 45
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const/16 v3, 0x5d

    .line 52
    .line 53
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    const-string v3, "message"

    .line 61
    .line 62
    invoke-static {v2, v3}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    const/4 v3, 0x0

    .line 66
    invoke-static {v1, v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 67
    .line 68
    .line 69
    :cond_1
    iget-object v1, v0, Lj7/a;->b:Lb0/c1;

    .line 70
    .line 71
    if-eqz v1, :cond_2

    .line 72
    .line 73
    iget-object v2, v0, Lj7/a;->d:Li7/h1;

    .line 74
    .line 75
    invoke-virtual {v2, p1}, Li7/h1;->a(I)Li7/s2;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-virtual {v1, v2}, Lb0/c1;->d(Li7/u2;)V

    .line 80
    .line 81
    .line 82
    :cond_2
    iget-object v1, v0, Lj7/a;->d:Li7/h1;

    .line 83
    .line 84
    if-ltz p1, :cond_6

    .line 85
    .line 86
    invoke-virtual {v1}, Li7/h1;->d()I

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-ge p1, v2, :cond_7

    .line 91
    .line 92
    iget v2, v1, Li7/h1;->c:I

    .line 93
    .line 94
    sub-int v2, p1, v2

    .line 95
    .line 96
    if-ltz v2, :cond_4

    .line 97
    .line 98
    iget v3, v1, Li7/h1;->b:I

    .line 99
    .line 100
    if-lt v2, v3, :cond_3

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_3
    invoke-virtual {v1, v2}, Li7/h1;->b(I)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    :cond_4
    :goto_0
    iget-object v0, v0, Lj7/a;->j:Llf/b1;

    .line 107
    .line 108
    :cond_5
    invoke-virtual {v0}, Llf/b1;->getValue()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    move-object v2, v1

    .line 113
    check-cast v2, Ljava/lang/Boolean;

    .line 114
    .line 115
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 119
    .line 120
    invoke-virtual {v0, v1, v2}, Llf/b1;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    if-eqz v1, :cond_5

    .line 125
    .line 126
    iget-object v0, p0, Lj7/b;->c:Lx0/e1;

    .line 127
    .line 128
    invoke-virtual {v0}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    check-cast v0, Li7/x;

    .line 133
    .line 134
    invoke-virtual {v0, p1}, Li7/x;->get(I)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    return-object p1

    .line 139
    :cond_6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    :cond_7
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 143
    .line 144
    const-string v2, "Index: "

    .line 145
    .line 146
    const-string v3, ", Size: "

    .line 147
    .line 148
    invoke-static {p1, v2, v3}, Lj2/h0;->o(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    invoke-virtual {v1}, Li7/h1;->d()I

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    throw v0
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

.method public final c()I
    .locals 1

    .line 1
    iget-object v0, p0, Lj7/b;->c:Lx0/e1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Li7/x;

    .line 8
    .line 9
    invoke-virtual {v0}, Li7/x;->a()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
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

.method public final d()V
    .locals 4

    .line 1
    iget-object v0, p0, Lj7/b;->b:Lj7/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v1, Landroid/os/Build;->ID:Ljava/lang/String;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    const-string v1, "Paging"

    .line 11
    .line 12
    const/4 v2, 0x3

    .line 13
    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    const-string v2, "Retry signal received"

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-static {v1, v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object v0, v0, Lj7/a;->c:Li7/r2;

    .line 26
    .line 27
    invoke-interface {v0}, Li7/r2;->b()V

    .line 28
    .line 29
    .line 30
    return-void
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
.end method
