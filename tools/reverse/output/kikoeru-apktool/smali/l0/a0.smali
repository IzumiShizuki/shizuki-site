.class public final Ll0/a0;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Lub/e;


# direct methods
.method public constructor <init>(Lj1/q;Ll0/r;Lic/k;Lf1/f;I)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ll0/a0;->b:I

    .line 1
    iput-object p1, p0, Ll0/a0;->c:Ljava/lang/Object;

    iput-object p2, p0, Ll0/a0;->e:Ljava/lang/Object;

    iput-object p3, p0, Ll0/a0;->f:Ljava/lang/Object;

    iput-object p4, p0, Ll0/a0;->g:Lub/e;

    iput p5, p0, Ll0/a0;->d:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lj3/x;Lic/a;Lt/c;Lic/k;I)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Ll0/a0;->b:I

    .line 2
    iput-object p1, p0, Ll0/a0;->c:Ljava/lang/Object;

    iput-object p2, p0, Ll0/a0;->e:Ljava/lang/Object;

    iput-object p3, p0, Ll0/a0;->f:Ljava/lang/Object;

    check-cast p4, Ljc/m;

    iput-object p4, p0, Ll0/a0;->g:Lub/e;

    iput p5, p0, Ll0/a0;->d:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lt/l;Lic/a;Lj1/q;Lic/k;I)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ll0/a0;->b:I

    .line 3
    iput-object p1, p0, Ll0/a0;->e:Ljava/lang/Object;

    iput-object p2, p0, Ll0/a0;->f:Ljava/lang/Object;

    iput-object p3, p0, Ll0/a0;->c:Ljava/lang/Object;

    check-cast p4, Ljc/m;

    iput-object p4, p0, Ll0/a0;->g:Lub/e;

    iput p5, p0, Ll0/a0;->d:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Ll0/a0;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v5, p1

    .line 7
    check-cast v5, Lx0/o;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Ll0/a0;->c:Ljava/lang/Object;

    .line 15
    .line 16
    move-object v1, p1

    .line 17
    check-cast v1, Lj3/x;

    .line 18
    .line 19
    iget-object p1, p0, Ll0/a0;->e:Ljava/lang/Object;

    .line 20
    .line 21
    move-object v2, p1

    .line 22
    check-cast v2, Lic/a;

    .line 23
    .line 24
    iget-object p1, p0, Ll0/a0;->f:Ljava/lang/Object;

    .line 25
    .line 26
    move-object v3, p1

    .line 27
    check-cast v3, Lt/c;

    .line 28
    .line 29
    iget-object p1, p0, Ll0/a0;->g:Lub/e;

    .line 30
    .line 31
    move-object v4, p1

    .line 32
    check-cast v4, Ljc/m;

    .line 33
    .line 34
    iget p1, p0, Ll0/a0;->d:I

    .line 35
    .line 36
    or-int/lit8 p1, p1, 0x1

    .line 37
    .line 38
    invoke-static {p1}, Lx0/v;->D(I)I

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    invoke-static/range {v1 .. v6}, Lt/m;->d(Lj3/x;Lic/a;Lt/c;Lic/k;Lx0/o;I)V

    .line 43
    .line 44
    .line 45
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 46
    .line 47
    return-object p1

    .line 48
    :pswitch_0
    move-object v4, p1

    .line 49
    check-cast v4, Lx0/o;

    .line 50
    .line 51
    check-cast p2, Ljava/lang/Number;

    .line 52
    .line 53
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, Ll0/a0;->e:Ljava/lang/Object;

    .line 57
    .line 58
    move-object v0, p1

    .line 59
    check-cast v0, Lt/l;

    .line 60
    .line 61
    iget-object p1, p0, Ll0/a0;->f:Ljava/lang/Object;

    .line 62
    .line 63
    move-object v1, p1

    .line 64
    check-cast v1, Lic/a;

    .line 65
    .line 66
    iget-object p1, p0, Ll0/a0;->c:Ljava/lang/Object;

    .line 67
    .line 68
    move-object v2, p1

    .line 69
    check-cast v2, Lj1/q;

    .line 70
    .line 71
    iget-object p1, p0, Ll0/a0;->g:Lub/e;

    .line 72
    .line 73
    move-object v3, p1

    .line 74
    check-cast v3, Ljc/m;

    .line 75
    .line 76
    iget p1, p0, Ll0/a0;->d:I

    .line 77
    .line 78
    or-int/lit8 p1, p1, 0x1

    .line 79
    .line 80
    invoke-static {p1}, Lx0/v;->D(I)I

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    invoke-static/range {v0 .. v5}, Ln7/b0;->a(Lt/l;Lic/a;Lj1/q;Lic/k;Lx0/o;I)V

    .line 85
    .line 86
    .line 87
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 88
    .line 89
    return-object p1

    .line 90
    :pswitch_1
    move-object v4, p1

    .line 91
    check-cast v4, Lx0/o;

    .line 92
    .line 93
    check-cast p2, Ljava/lang/Number;

    .line 94
    .line 95
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 96
    .line 97
    .line 98
    iget-object p1, p0, Ll0/a0;->c:Ljava/lang/Object;

    .line 99
    .line 100
    move-object v0, p1

    .line 101
    check-cast v0, Lj1/q;

    .line 102
    .line 103
    iget-object p1, p0, Ll0/a0;->e:Ljava/lang/Object;

    .line 104
    .line 105
    move-object v1, p1

    .line 106
    check-cast v1, Ll0/r;

    .line 107
    .line 108
    iget-object p1, p0, Ll0/a0;->f:Ljava/lang/Object;

    .line 109
    .line 110
    move-object v2, p1

    .line 111
    check-cast v2, Lic/k;

    .line 112
    .line 113
    iget-object p1, p0, Ll0/a0;->g:Lub/e;

    .line 114
    .line 115
    move-object v3, p1

    .line 116
    check-cast v3, Lf1/f;

    .line 117
    .line 118
    iget p1, p0, Ll0/a0;->d:I

    .line 119
    .line 120
    or-int/lit8 p1, p1, 0x1

    .line 121
    .line 122
    invoke-static {p1}, Lx0/v;->D(I)I

    .line 123
    .line 124
    .line 125
    move-result v5

    .line 126
    invoke-static/range {v0 .. v5}, Ll0/u0;->c(Lj1/q;Ll0/r;Lic/k;Lf1/f;Lx0/o;I)V

    .line 127
    .line 128
    .line 129
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 130
    .line 131
    return-object p1

    .line 132
    nop

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
