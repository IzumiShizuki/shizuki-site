.class public final Ln7/k;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final a:Lcom/cnl/kikoeru/data/db/AppDatabase_Impl;

.field public final b:Ln7/m0;

.field public final c:Ljava/util/LinkedHashMap;

.field public final d:Ljava/util/concurrent/locks/ReentrantLock;

.field public final e:Li9/f;

.field public final f:Ln7/i;

.field public final g:Ljava/lang/Object;


# direct methods
.method public varargs constructor <init>(Lcom/cnl/kikoeru/data/db/AppDatabase_Impl;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;[Ljava/lang/String;)V
    .locals 11

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ln7/k;->a:Lcom/cnl/kikoeru/data/db/AppDatabase_Impl;

    .line 5
    .line 6
    new-instance v9, Ln7/m0;

    .line 7
    .line 8
    iget-boolean v10, p1, Ln7/v;->k:Z

    .line 9
    .line 10
    new-instance v0, Lde/h;

    .line 11
    .line 12
    const/4 v7, 0x0

    .line 13
    const/4 v8, 0x3

    .line 14
    const/4 v1, 0x1

    .line 15
    const-class v3, Ln7/k;

    .line 16
    .line 17
    const-string v4, "notifyInvalidatedObservers"

    .line 18
    .line 19
    const-string v5, "notifyInvalidatedObservers(Ljava/util/Set;)V"

    .line 20
    .line 21
    const/4 v6, 0x0

    .line 22
    move-object v2, p0

    .line 23
    invoke-direct/range {v0 .. v8}, Lde/h;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 24
    .line 25
    .line 26
    move-object v1, p1

    .line 27
    move-object v2, p2

    .line 28
    move-object v3, p3

    .line 29
    move-object v4, p4

    .line 30
    move-object v6, v0

    .line 31
    move-object v0, v9

    .line 32
    move v5, v10

    .line 33
    invoke-direct/range {v0 .. v6}, Ln7/m0;-><init>(Lcom/cnl/kikoeru/data/db/AppDatabase_Impl;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;[Ljava/lang/String;ZLde/h;)V

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, Ln7/k;->b:Ln7/m0;

    .line 37
    .line 38
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 39
    .line 40
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object v1, p0, Ln7/k;->c:Ljava/util/LinkedHashMap;

    .line 44
    .line 45
    new-instance v1, Ljava/util/concurrent/locks/ReentrantLock;

    .line 46
    .line 47
    invoke-direct {v1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 48
    .line 49
    .line 50
    iput-object v1, p0, Ln7/k;->d:Ljava/util/concurrent/locks/ReentrantLock;

    .line 51
    .line 52
    new-instance v1, Li9/f;

    .line 53
    .line 54
    invoke-direct {v1, p0}, Li9/f;-><init>(Ln7/k;)V

    .line 55
    .line 56
    .line 57
    iput-object v1, p0, Ln7/k;->e:Li9/f;

    .line 58
    .line 59
    new-instance v1, Ln7/i;

    .line 60
    .line 61
    const/4 v2, 0x0

    .line 62
    invoke-direct {v1, p0, v2}, Ln7/i;-><init>(Ln7/k;I)V

    .line 63
    .line 64
    .line 65
    iput-object v1, p0, Ln7/k;->f:Ln7/i;

    .line 66
    .line 67
    new-instance v1, Ljava/util/IdentityHashMap;

    .line 68
    .line 69
    invoke-direct {v1}, Ljava/util/IdentityHashMap;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-static {v1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    const-string v2, "newSetFromMap(...)"

    .line 77
    .line 78
    invoke-static {v1, v2}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    new-instance v1, Ljava/lang/Object;

    .line 82
    .line 83
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 84
    .line 85
    .line 86
    iput-object v1, p0, Ln7/k;->g:Ljava/lang/Object;

    .line 87
    .line 88
    new-instance v1, Ln7/i;

    .line 89
    .line 90
    const/4 v2, 0x1

    .line 91
    invoke-direct {v1, p0, v2}, Ln7/i;-><init>(Ln7/k;I)V

    .line 92
    .line 93
    .line 94
    iput-object v1, v0, Ln7/m0;->k:Lic/a;

    .line 95
    .line 96
    return-void
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
.end method


# virtual methods
.method public final a([Ljava/lang/String;Z)Llf/f;
    .locals 7

    .line 1
    const-string v0, "tables"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v2, p0, Ln7/k;->b:Ln7/m0;

    .line 7
    .line 8
    invoke-virtual {v2, p1}, Ln7/m0;->h([Ljava/lang/String;)Lub/k;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object v0, p1, Lub/k;->a:Ljava/lang/Object;

    .line 13
    .line 14
    move-object v5, v0

    .line 15
    check-cast v5, [Ljava/lang/String;

    .line 16
    .line 17
    iget-object p1, p1, Lub/k;->b:Ljava/lang/Object;

    .line 18
    .line 19
    move-object v3, p1

    .line 20
    check-cast v3, [I

    .line 21
    .line 22
    const-string p1, "resolvedTableNames"

    .line 23
    .line 24
    invoke-static {v5, p1}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const-string p1, "tableIds"

    .line 28
    .line 29
    invoke-static {v3, p1}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    new-instance v1, Lb9/e;

    .line 33
    .line 34
    const/4 v6, 0x0

    .line 35
    move v4, p2

    .line 36
    invoke-direct/range {v1 .. v6}, Lb9/e;-><init>(Ln7/m0;[IZ[Ljava/lang/String;Lyb/c;)V

    .line 37
    .line 38
    .line 39
    new-instance p1, Li7/n;

    .line 40
    .line 41
    invoke-direct {p1, v1}, Li7/n;-><init>(Lic/n;)V

    .line 42
    .line 43
    .line 44
    return-object p1
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

.method public final b(Lac/i;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Ln7/k;->a:Lcom/cnl/kikoeru/data/db/AppDatabase_Impl;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln7/v;->j()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Ln7/v;->m()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v0, p0, Ln7/k;->b:Ln7/m0;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ln7/m0;->g(Lac/c;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    sget-object v0, Lzb/a;->a:Lzb/a;

    .line 23
    .line 24
    if-ne p1, v0, :cond_1

    .line 25
    .line 26
    return-object p1

    .line 27
    :cond_1
    :goto_0
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 28
    .line 29
    return-object p1
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method
