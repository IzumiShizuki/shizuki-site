.class public final Luh/t;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lj1/q;

.field public final synthetic d:Z

.field public final synthetic e:Lf1/f;

.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La0/d;Luh/y;Ljava/lang/Object;Lj1/q;ZLj1/q;Lf1/f;I)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Luh/t;->b:I

    .line 1
    iput-object p1, p0, Luh/t;->g:Ljava/lang/Object;

    iput-object p2, p0, Luh/t;->h:Ljava/lang/Object;

    iput-object p3, p0, Luh/t;->i:Ljava/lang/Object;

    iput-object p4, p0, Luh/t;->c:Lj1/q;

    iput-boolean p5, p0, Luh/t;->d:Z

    iput-object p6, p0, Luh/t;->j:Ljava/lang/Object;

    iput-object p7, p0, Luh/t;->e:Lf1/f;

    iput p8, p0, Luh/t;->f:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lv0/l0;Lj1/q;ZLv0/a0;Lw/k;Lf1/f;Lf1/f;I)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Luh/t;->b:I

    .line 2
    iput-object p1, p0, Luh/t;->g:Ljava/lang/Object;

    iput-object p2, p0, Luh/t;->c:Lj1/q;

    iput-boolean p3, p0, Luh/t;->d:Z

    iput-object p4, p0, Luh/t;->h:Ljava/lang/Object;

    iput-object p5, p0, Luh/t;->i:Ljava/lang/Object;

    iput-object p6, p0, Luh/t;->e:Lf1/f;

    iput-object p7, p0, Luh/t;->j:Ljava/lang/Object;

    iput p8, p0, Luh/t;->f:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Luh/t;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v8, p1

    .line 7
    check-cast v8, Lx0/o;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Luh/t;->g:Ljava/lang/Object;

    .line 15
    .line 16
    move-object v1, p1

    .line 17
    check-cast v1, Lv0/l0;

    .line 18
    .line 19
    iget-object p1, p0, Luh/t;->h:Ljava/lang/Object;

    .line 20
    .line 21
    move-object v4, p1

    .line 22
    check-cast v4, Lv0/a0;

    .line 23
    .line 24
    iget-object p1, p0, Luh/t;->i:Ljava/lang/Object;

    .line 25
    .line 26
    move-object v5, p1

    .line 27
    check-cast v5, Lw/k;

    .line 28
    .line 29
    iget-object p1, p0, Luh/t;->j:Ljava/lang/Object;

    .line 30
    .line 31
    move-object v7, p1

    .line 32
    check-cast v7, Lf1/f;

    .line 33
    .line 34
    iget p1, p0, Luh/t;->f:I

    .line 35
    .line 36
    or-int/lit8 p1, p1, 0x1

    .line 37
    .line 38
    invoke-static {p1}, Lx0/v;->D(I)I

    .line 39
    .line 40
    .line 41
    move-result v9

    .line 42
    iget-object v2, p0, Luh/t;->c:Lj1/q;

    .line 43
    .line 44
    iget-boolean v3, p0, Luh/t;->d:Z

    .line 45
    .line 46
    iget-object v6, p0, Luh/t;->e:Lf1/f;

    .line 47
    .line 48
    invoke-static/range {v1 .. v9}, Lv0/k0;->c(Lv0/l0;Lj1/q;ZLv0/a0;Lw/k;Lf1/f;Lf1/f;Lx0/o;I)V

    .line 49
    .line 50
    .line 51
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 52
    .line 53
    return-object p1

    .line 54
    :pswitch_0
    move-object v7, p1

    .line 55
    check-cast v7, Lx0/o;

    .line 56
    .line 57
    check-cast p2, Ljava/lang/Number;

    .line 58
    .line 59
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 60
    .line 61
    .line 62
    iget-object p1, p0, Luh/t;->g:Ljava/lang/Object;

    .line 63
    .line 64
    move-object v0, p1

    .line 65
    check-cast v0, La0/d;

    .line 66
    .line 67
    iget-object p1, p0, Luh/t;->h:Ljava/lang/Object;

    .line 68
    .line 69
    move-object v1, p1

    .line 70
    check-cast v1, Luh/y;

    .line 71
    .line 72
    iget-object p1, p0, Luh/t;->j:Ljava/lang/Object;

    .line 73
    .line 74
    move-object v5, p1

    .line 75
    check-cast v5, Lj1/q;

    .line 76
    .line 77
    iget p1, p0, Luh/t;->f:I

    .line 78
    .line 79
    or-int/lit8 p1, p1, 0x1

    .line 80
    .line 81
    invoke-static {p1}, Lx0/v;->D(I)I

    .line 82
    .line 83
    .line 84
    move-result v8

    .line 85
    iget-object v2, p0, Luh/t;->i:Ljava/lang/Object;

    .line 86
    .line 87
    iget-object v3, p0, Luh/t;->c:Lj1/q;

    .line 88
    .line 89
    iget-boolean v4, p0, Luh/t;->d:Z

    .line 90
    .line 91
    iget-object v6, p0, Luh/t;->e:Lf1/f;

    .line 92
    .line 93
    invoke-static/range {v0 .. v8}, Lua/j;->b(La0/d;Luh/y;Ljava/lang/Object;Lj1/q;ZLj1/q;Lf1/f;Lx0/o;I)V

    .line 94
    .line 95
    .line 96
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 97
    .line 98
    return-object p1

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
